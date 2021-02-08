package ru.stqa.pft.sandbox;

public class MySecondProgram {

  public static void main(String[] args) {
    Point p1 = new Point(2, 0);
    Point p2 = new Point(10,0);
    System.out.println("Distance between two points is " + Point.distance(p1,p2));

    System.out.println("Pass arguments via method and calculate distance " +
            Point.distance(new Point(5,8), new Point(6,6)) );
  }
}
