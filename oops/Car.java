package oops;

public class Car {
  int speed;
  private String color;

  public Car(String color) {
    this.color = color;
  }

  //getter method for speed , it is and example of encapsulation
  public void setSpeed(int speed){
    if(speed<0){
      System.out.println("Speed cannot be negative");
    }
    else{
      this.speed = speed;
    }
     
  }

  public void drive() {
    System.out.println("car is driving " + speed + " km/h and color is " + color);
  }
}
