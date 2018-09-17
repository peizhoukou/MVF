import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Write a description of class AccessUserData here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AccessUserData
{
    private UserList userList;
    //get url of current dir
    private final String URL = System.getProperty("user.dir");

    public void viewUsers() {
        if (userList != null) {
            for (User user : userList.getUserList()) {
                if(user != null)
                    System.out.println(user.getUserName());
            }
        }
    }

    public void register(User user) {
        userList.getUserList().add(user);
        writeUser();
        viewUsers();
    }
    
    public void editUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please chose the user who you want to edit");
        int theUserId = scanner.nextInt();
        for (User user : userList.getUserList()) {
            if (user.getUserId() == theUserId) {
                user.setUserName(scanner.nextLine());
                user.setUserAddress(scanner.nextLine());
                user.setUserPassword(scanner.nextLine());
                user.setUserPhone(scanner.nextLine());
                user.setUserEmail(scanner.nextLine());
                System.out.println("change successfuly");
            }
        }
        writeUser();
        viewUsers();
    }

    public void removeUser(int userId) {
        User elementToRemove = null;
        for (User user : userList.getUserList()) {
            if (user.getUserId() == userId) {
                elementToRemove = user;
            }
        }
        userList.getUserList().remove(elementToRemove);
        writeUser();
        viewUsers();

    }

    public void writeUser() {
        Gson gson = new Gson();
        gson = new GsonBuilder().setPrettyPrinting().create();
        String strJson = gson.toJson(userList);
        FileWriter writer = null;
        try {
            writer = new FileWriter(URL + "/USER_DATA.json");
            writer.write(strJson);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public UserList readUser() {
        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            System.out.println("Reading User JSON from a file");
            System.out.println("----------------------------");
            br = new BufferedReader(
                new FileReader(URL + "/USER_DATA.json"));
            userList = gson.fromJson(br, UserList.class);
            return userList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        } 
        return null;
    }

}
