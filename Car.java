class Car{

    String companyName;
    String modelName;
    // String fuelType;
    String color;
    int sittingCap;
    int maxSpeed;

    public void start(){
            System.out.println("Car started...");
    }
    public void drive(){
            System.out.println("Car DRIVE......");

    }
    public void breaks(){
            System.out.println("break Applied......");
            
    }
    public void stop(){
            System.out.println("Car stopped......");
            
    }

    Car(String companyName, String modelName, String color, int sittingCap, int maxSpeed){

        this.companyName=companyName;           //this is correct form
        modelName =this.modelName;              //this is incorrect but why ..?
        color= this.color;
        sittingCap =this.sittingCap;
        maxSpeed =this.maxSpeed;
    }

    public static void main(String arg[]){

        Car mycar1= new Car("Tata", "nano", "Blue", 5, 200 );

       
        mycar1.start();
        mycar1.drive();
        mycar1.breaks();
        mycar1.stop();
        System.out.println(mycar1.companyName);
}

}



