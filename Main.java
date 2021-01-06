import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Student s1 = new Student("Ahmari", 10, 95.0, true);
    Student s2 = new Student("Shabil", 9, 99.0, false);
    Student s3 = new Student("Victor", 10, 88.0, true);

    s1.fieldTrip();
    s2.fieldTrip();
    s3.fieldTrip();

   Scanner scan = new Scanner(System.in);

   System.out.println("What is your name?");
   String name = scan.next();
   System.out.println("What is your grade level?");
   int grade = scan.nextInt();
   System.out.println("What is your avarage grade?");
   double aveGrade = scan.nextDouble();
   System.out.println("Do you have signed permission slip? true/false");
   boolean permissionSlip = scan.nextBoolean(); 

   Student s4 = new Student(name, grade, aveGrade, permissionSlip);
   
  }
}