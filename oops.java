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



// class shape{
//     public void area(){
//         System.out.println("disply area");

//     }
// }
// class Triangle extends shape {
//     public void area(int l, int h){
//         System.out.println(1/2*l*h);

//     }

// }

// class EquilateralTriangle extends Triangle {
//     public void area (int l,int h){
//         System.out.println(1/2*l*h);
//     }
// }


// class Circle extends shape{
//     public void area (int r){
//         System.out.println(1/2*r*r);
//     }

// }

// public class oops{

//     public static void main(String[] args){

//     }
// }                                        











//                                                      INCPSULATION CODE
 






// public class oops{

//     public static void selection(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             int minPos= i;

//             for(int j=i+1;j<arr.length;j++) {
//                 if(arr [minPos] < arr[j]){
//                     minPos = j;
//                 }

//             }
//             int temp = arr  [minPos];
//             arr [minPos] = arr [i];
//             arr[i] = temp;
// }
//     }
//     public static void main (String[] args) {
//         int arr[]={1,3,5,7,9,2};
//         selection(arr);
        
//     }

// }




// public class oops{
//     public static void selectionSort(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             int minpos = i;


//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j]>arr[minpos]){
//                     minpos = j;
//                 }
//             }
//             int temo = arr[minpos];
//             arr[minpos] = arr[i];
//             arr[i] = temo;

//         }
//     }
//     public static void main(String[] args) {
//         int arr[]={1,3,5,7,9,2};
//         selectionSort(arr);
//     }
// }



//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j]>arr[minpos]){
//                     minpos = j;
//                 }
//             }
//             int temo = arr[minpos];
//             arr[minpos] = arr[i];
//             arr[i] = temo;

//         }
//     }
//     public static void main(String[] args) {
//         int