package datatyoes;

public class Student {
  public String name;
  public String address;
  public int standard;
  public int rollNumber;

  public static void main(String[] args) {
    Student student = new Student();
    student.name = "abhay";
    student.address = "delhi";
    student.standard = 10;
    student.rollNumber = 123;
    System.out.println("name is: " + student.name);
    System.out.println("address is: " + student.address);
    System.out.println("standard is: " + student.standard);
    System.out.println("rollNumber is: " + student.rollNumber);
  }
}
