package com.example.demo;

public class UserOrder {
    /*
     * Now we are just going to stick to few data like customerId, product, quantity
     * at this moment you can send an order and see what the output is. 
     * example {
     *              "customerId":"7839jfme9eenve8e",
     *              "product":"Samsung", 
     *              "quantity":1
     *          }
     * Everthing is null right???
     * nice that was an expected response.
     * 
     * Now why are all our data null and 0??? despite getting a data from our users?? 
     * with our basic understanding of java we can we all Know that this filled we initialized are private filled.
     * and we dont have acces to private filleds outside the class. 
     * But can we make them public??? well give a try and see the outcome. but using public is not the ideal approach.
     * Now the solution here is we implement getters and setters to our class to acces the private data.
     * Now send a request a the post endpoints in the HomeController and you will get your outputs.
     */
    private String customerId;
    private String product;
    private int quantity;

    

    public String getCustomerId() {
        return customerId;
    }



    public String getProduct() {
        return product;
    }



    public int getQuantity() {
        return quantity;
    }



    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }



    public void setProduct(String product) {
        this.product = product;
    }



    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    @Override
    public String toString() {
        return "UserOrder [customerId=" + customerId + ", product=" + product + ", quantity=" + quantity + "]";
    }
    
}
