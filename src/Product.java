/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author maclee
 */
public class Product {
    @SerializedName("productId")
    @Expose
    private int productId;
    @SerializedName("productName")
    @Expose
    private String productName;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("expiryDate")
    @Expose
    private String expiryDate;

    public Product(){
    }
    public Product(int productId, String productName, String description, String expiryDate) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.expiryDate = expiryDate;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productName=" + productName + ", description=" + description + ", expiryDate=" + expiryDate + '}';
    }

}
