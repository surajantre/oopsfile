                                         // CLASS AND OBJECT 
// class pen {
//     String colour;
//     String type;//bollpoint; gel

//     /*public void write(){
//         System.out.println("writing something");
//     }*/

//      public void printColour(){
//     System.out.println(this.colour);
//     }
// }


// public class oops{
//     public static void main(String args[]){
//         pen pen1 = new pen();
//         pen1.colour = "blue";
//         pen1.type = "gel";


//         pen pen2 = new pen();
//         pen2.colour = "black";
//         pen2.type = "ballpoint";
        
//         pen1.printColour();
//         pen2.printColour();     
//        // pen1.write();
//     }

// }





// class Student{
//     String name;
//     int age;

//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);

//     }
// }
// public class oops{
//     public static void main (String args[]){
//     Student s1 = new Student();
//     s1.name = "Suraj";
//     s1.age = 22;

//     s1.printInfo();
// }
// }







                                                                             // POLYMORPHISAM

                             
// class Student {
//     String name;
//     int age;

//     public void printInfo(String name){
//         System.out.println(name);
//     }

//     public void printInfo(int age){
//         System.out.println(age);

//     }

//     public void printInfo(String name,int age){
//         System.out.println(name+" "+age);
        
//     }
// }
//     public class oops{
//         public static void main(String[] args){
//             Student s1 = new Student();
//             s1.name = "suraj";
//             s1.age = 21;

//             s1.printInfo(s1.name,s1.age);
            

//         }
//     }








                                        // Inheritance  



/*class shape{
    public void area(){
        System.out.println("disply area");

    }
}
class Triangle extends shape {
    public void area(int l, int h){
        System.out.println(1/2*l*h);

    }

}

class EquilateralTriangle extends Triangle {
    public void area (int l,int h){
        System.out.println(1/2*l*h);
    }
}


class Circle extends shape{
    public void area (int r){
        System.out.println(1/2*r*r);
    }

}

public class oops{

    public static void main(String[] args){

    }
}                                        */





//                                                                              Encapsulation - packages     acces modifayer - public,protected,privet,defoult 
//                                                                                                                               they aree four access modifayer





// PACKAGE INFO


// package bank;

// class Account {
//     public String name;
//     protected String email;
//     private String password;


//     // getters & setter method


// public String getPassword(){
//     return this.password;
// }

//  /*private (for dony set password for user)*/public  void setPassword(String pass){
//     this.password = pass;
// }
// }


// public class bank {
//     public static void main(String args[]){
//         Account account1 = new Account();
//         account1.name= "Apna College";
//         account1.email="apna college@gmail.com";
//         account1.setPassword("abcd") ;
//         System.out.println(account1.getPassword());

//     }
// }









//                                                                                       ABSTRACTION





// abstract class Animal{
//     abstract void walk();
//   /*animal are a constreacter */  Animal() {
//         System.out.println("you are created a new Animal");
//     }
// }

// class Horse extends Animal{
//     /* Hourse are a constracter of House class*/ Horse(){
//         System.out.println("Created a Horse");
//     }
//     public void walk() {
//         System.out.println("walks on 4 legs");

//     }
// }

// class chicken extends Animal{
//     public void walk(){
//         System.out.println("walks on 2 legs");
//     }
// }
// public class oops{
//     public static void main(String args[]){
//         Horse horse = new Horse();
//        /*  horse.walk();
//         chicken c1=new chicken();
//         c1.walk();*/
         
//     }
// }









   //                                                                       Interfaces



//    interface Animal{
//     int eyes = 2;
//     void walk();

//    }
// interface Herbivore{

//    }
//    class Horse implements Animal,Herbivore{
//     public void walk() {
//         System.out.println("walk on 4 legs");
//     }
//    }

//    public class oops{
//     public static void main(String args[]){
//         Horse horse = new Horse();
//         horse.walk();
//     }
//    }






//                                      static keyword- commen



// class Student {
//     String name ;
//     static String school;

//     public static void changeSchool(){
//         school = "newsschool";

//     }
// }

// public class oops{
//     public static void main (String args[]){
//         Student.school="ABC";
//         Student student1 = new Student();
//         student1.name="suraj";
//         System.out.println(student1.school);

//     }
// }

