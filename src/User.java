/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
  

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Administrator
 */
public class User {
    @SerializedName("userId")
    @Expose
    private int userId;
    @SerializedName("userName")
    @Expose
    private String userName;
    @SerializedName("userAddress")
    @Expose
    private String address;
    @SerializedName("userPassword")
    @Expose
    private String password;
    @SerializedName("userPhone")
    @Expose
    private String phone;
    @SerializedName("userEmail")
    @Expose
    private String email;

    public User(int userId, String userName, String address, String password, String phone, String email) {
        this.userId = userId;
        this.userName = userName;
        this.address = address;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return address;
    }

    public void setUserAddress(String address) {
        this.address = address;
    }

    public String getUserPassword() {
        return password;
    }

    public void setUserPassword(String password) {
        this.password = password;
    }

    public String getUserPhone() {
        return phone;
    }

    public void setUserPhone(String phone) {
        this.phone = phone;
    }

    public String getUserEmail() {
        return email;
    }

    public void setUserEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", userName=" + userName + ", address=" + address + ", password=" + password + ", Phone=" + phone + ", email=" + email + '}';
    }
    
}
