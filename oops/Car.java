package oops;

public class Car {
  int speed;
  private String color;

  public Car(String color) {
    this.color = color;
  }

  public void drive() {
    System.out.println("car is driving " + speed + " km/h and color is " + color);
  }
}
