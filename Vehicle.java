package com.mycompany.vehicle;

public class Vehicle {
    private String brand;
    private String model;
    private float price;
    private String color;
    
     public Vehicle(String brand,String model,float price,String color){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.color=color;
    }
    
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public float getPrice(){
        return price;
    }
    public void setPrice(float price){
        this.price=price;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    @Override
    public String toString(){
        return "Brand :" + brand + ", Model :" + model + " , Price : " + price + " , Color : " + color;
    }
    
    
    
}
