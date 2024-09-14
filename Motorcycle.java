package com.mycompany.vehicle;
class Motorcycle extends Vehicle{
        private int speed;
         public Motorcycle(String brand,String model,float price,String color,int speed){
         super(brand,model,price,color);
         this.speed=speed;
         }
            public int getSpeed(){
                return speed;
               }
            public void setSpeed(int speed){
                this.speed=speed;
               }
            
            @Override
            public String toString(){
             return super.toString()+",Speed :" + speed + "km";
         }  



}
