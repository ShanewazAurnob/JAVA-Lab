import java.util.Scanner;

interface Vehicle {
    public void changeGear();
    public void speedUp();
    public void speedDown();
    public void pressBreak();
}

 class Bus implements Vehicle {
     public void changeGear() {
         System.out.println("Bus");
         System.out.println("Changing gear...");
     }
     public void speedUp() {
         System.out.println("Bus");
         System.out.println("Speeding up...");
     }
     public void speedDown() {
         System.out.println("Bus");
         System.out.println("Speeding down...");
     }
     public void pressBreak() {
         System.out.println("Bus");
         System.out.println("Pressed Break...");
     }
 }

 class Truck implements Vehicle {
     public void changeGear() {
         System.out.println("Truck");
         System.out.println("Changing gear...");
     }
     public void speedUp() {
         System.out.println("Truck");
         System.out.println("Speeding up...");
     }
     public void speedDown() {
         System.out.println("Truck");
         System.out.println("Speeding down...");
     }
     public void pressBreak() {
         System.out.println("Truck");
         System.out.println("Pressed Break...");
     }
 }

 class Motorcycle implements Vehicle {
     public void changeGear() {
         System.out.println("Motorcycle");
         System.out.println("Changing gear...");
     }
     public void speedUp() {
         System.out.println("Motorcycle");
         System.out.println("Speeding up...");
     }
     public void speedDown() {
         System.out.println("Motorcycle");
         System.out.println("Speeding down...");
     }
     public void pressBreak() {
         System.out.println("Motorcycle");
         System.out.println("Pressed Break...");
     }
 }

 class Microbus implements Vehicle {
     public void changeGear() {
         System.out.println("Microbus");
         System.out.println("Changing gear...");
     }

     public void speedUp() {
         System.out.println("Microbus");
         System.out.println("Speeding up...");
     }
     public void speedDown() {
         System.out.println("Microbus");
         System.out.println("Speeding down...");
     }
     public void pressBreak() {
         System.out.println("Microbus");
         System.out.println("Pressed Break...");
     }
 }

 class CNG implements Vehicle {
     public void changeGear() {
         System.out.println("CNG");
         System.out.println("Changing gear...");
     }

     public void speedUp() {
         System.out.println("CNG");
         System.out.println("Speeding up...");
     }
     public void speedDown() {
         System.out.println("CNG");
         System.out.println("Speeding down...");
     }
     public void pressBreak() {
         System.out.println("CNG");
         System.out.println("Pressed Break...");
     }
 }

 class exp10 {
     public static void main(String[] args) {
         System.out.println("Choose an option:\n1. Bus\n2. Truck\n3. Motorcycle\n4. Microbus\n5. CNG");
         Scanner sc = new Scanner(System.in);
         int option = sc.nextInt();
         Vehicle vehicle = new Bus();
         switch (option) {
             case 1:
                 vehicle = new Bus();
                 break;
             case 2:
                 vehicle = new Truck();
                 break;
             case 3:
                 vehicle = new Motorcycle();
                 break;
             case 4:
                 vehicle = new Microbus();
                 break;
             case 5:
                 vehicle = new CNG();
                 break;
             default:
                 System.out.println("Wrong Option!\n");
                 System.exit(-1);
         }

         vehicle.changeGear();
         vehicle.speedUp();
         vehicle.speedDown();
         vehicle.pressBreak();

         sc.close();
     }
 }
