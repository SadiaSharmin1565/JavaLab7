package com.mycompany.vehicle;

 class Car extends Vehicle{
         private int year;
         public Car(String brand,String model,float price,String color,int year){
         super(brand,model,price,color);
         this.year=year;
         }
            public int getYear(){
                return year;
               }
            public void setYear(int year){
                this.year=year;
               }
         @Override
         public String toString(){
             return super.toString()+",Year :" + year;
         }  


}
    