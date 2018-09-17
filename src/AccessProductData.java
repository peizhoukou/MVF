/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author maclee
 */
public class AccessProductData {
    
    private ProductList productList;
    //get url of current dir
    private final String URL = System.getProperty("user.dir");

    public void viewProduct() {
        if (productList != null) {
            for (Product p : productList.getProductList()) {
                if(p != null)
                System.out.println(p.getProductId() + " - " + p.getProductName() + " - " + p.getDescription() + " - " + p.getExpiryDate());
            }
        }
    }

    public void addProduct(Product product) {
        //Product product = new Product(51, "apple", "fruit", "12/9/2018");
        productList.getProductList().add(product);
        writeProduct();
        viewProduct();

    }

    public void editProduct(Product product) {
        int productId = 50;
        for (Product p : productList.getProductList()) {
            if (p.getProductId() == productId) {
                p.setProductName("APPLE");
            }
        }
        writeProduct();
        viewProduct();
    }

    public void removeProduct(int productId) {
        Product elementToRemove = null;
        for (Product p : productList.getProductList()) {
            if (p.getProductId() == productId) {
                elementToRemove = p;//这里写反了吧
                
            }
        }
        productList.getProductList().remove(elementToRemove);
        writeProduct();
        viewProduct();

    }

    public void writeProduct() {
        Gson gson = new Gson();
        gson = new GsonBuilder().setPrettyPrinting().create();
        String strJson = gson.toJson(productList);
        FileWriter writer = null;
        try {
            writer = new FileWriter(URL + "/PRODUCT_DATA.json");
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

    public ProductList readProduct() {
        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            System.out.println("Reading JSON from a file");
            System.out.println("----------------------------");
            br = new BufferedReader(
                    new FileReader(URL + "/PRODUCT_DATA.json"));
          
            //convert the json string back to object
            productList = gson.fromJson(br, ProductList.class);
            return productList;
            //viewProduct(productObj);
            //addProduct(productObj);
            //removeProduct(productObj);
            //editProduct(productObj);

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
