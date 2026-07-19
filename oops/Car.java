package oops;
public class Car {
  int speed;
  String color;
  //if i do private String color =  something then it will not be accessible outside the class and will give an errir in the test.java file because it is private and can only be accessed within the class. If i do the public string color = something then it will be accessible outside the class and will not give an error in the test.java file because it is public and can be accessed from anywhere.
  
  void drive(){
    System.out.println("car is driving "+speed+" km/h and color is "+color );
  }
}
