public class Student{
 //construdctor 
 private String name;
 private int gradeYear;
 private double aveGrade;
 private boolean permissionSlip; 

 //variable 
 public Student(String studentName, int studentYear, double studentGrade,boolean permission){
   name = studentName;
   gradeYear = studentYear;
   aveGrade = studentGrade;
   permissionSlip = permission;
 }

 //method 
 public void fieldTrip(){
   if(gradeYear >= 10 && aveGrade > 70.0 && permissionSlip)
   {
     System.out.println("Yay you get to go on a field trip, " + name);
   }else{
     System.out.println("Sorry, maybe next year.");
   }
 }
 public void Dance(){
  if (gradeYear >= 9 && aveGrade > 70.0 && permissionSlip) 
{
     System.out.println("Yay you get to go to the dance, " + name);
   }else{
     System.out.println("Sorry, maybe next year."); 
 }
   }

 } 
