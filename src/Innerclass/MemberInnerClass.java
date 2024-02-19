package Innerclass;
 class University {
     private String name;

     public University(String name) {
         this.name = name;
     }

     // Member Inner Class
     public class Student {
         private String name;
         private int age;
         private String studentID;

         public Student(String name, int age, String studentID) {
             this.name = name;
             this.age = age;
             this.studentID = studentID;
         }

//         public void displayInfo() {
//             System.out.println("University: " + University.this.name); // Accessing outer class variable
//             System.out.println("Student Name: " + name);
//             System.out.println("Age: " + age);
//             System.out.println("Student ID: " + studentID);
//         }

         @Override
         public String toString() {
             return University.this.name + " : " + name + " : "+ age + " : " + studentID;
         }
     }
 }
     public class MemberInnerClass {
         public static void main(String[] args) {
             University myUniversity = new University("Pune University");

             // Creating student objects
             University.Student student1 = myUniversity.new Student("Raj", 26, "101");
             University.Student student2 = myUniversity.new Student("Kartik", 25, "102");

//             // Displaying student information
//             System.out.println("Student 1 Information:");
//             student1.displayInfo();

//
             System.out.println("Student 1 Information:\n" +student1 );
             System.out.println("Student 2 Information:\n" +student2 );


         }
     }
