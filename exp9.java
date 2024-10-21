abstract class Dog {
    void walk() {
        System.out.println("dog walking...");
    }

    void sleep() {
        System.out.println("dog sleeping...");
    }

     void bark() {
         System.out.println("dog barking...");
     }

     abstract void eat();
 }

 class AmericanDog extends Dog {
     void eat() {
         System.out.println("American dog eating...");
     }
 }

 class ChineseDog extends Dog {
     void eat() {
         System.out.println("Chinese dog eating...");
     }
 }

 class AustralianDog extends Dog {
     void eat() {
         System.out.println("Australian dog eating...");
     }
 }

 class CanadianDog extends Dog {
     void eat() {
         System.out.println("Canadian dog eating...");
     }
 }

 class IndianDog extends Dog {
     void eat() {
         System.out.println("Indian dog eating...");
     }
 }

 class HungarianDog extends Dog {
     void eat() {
         System.out.println("Hungarian dog eating...");
     }
 }

 class exp9 {
     public static void main(String[] args) {
         Dog d = new AmericanDog();
         d.eat();

         d = new ChineseDog();
         d.eat();

         d = new AustralianDog();
         d.eat();

         d = new CanadianDog();
         d.eat();

         d = new IndianDog();
         d.eat();

         d = new HungarianDog();
         d.eat();

         d.walk();
         d.bark();
         d.sleep();
     }
 }
