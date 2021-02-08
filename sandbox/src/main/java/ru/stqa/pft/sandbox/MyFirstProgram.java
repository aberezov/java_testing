package ru.stqa.pft.sandbox;


public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("wolf");
    hello("woker");

    Square s = new Square(5);
    System.out.println("Square with side " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);
    System.out.println("Square with side " + r.a + " and " + r.b + " = " + r.area());
/*
Домашнее задание ь> Задание №2: Потренироваться использовать функции, классы, объекты и методы
 */
    Point p1 = new Point(2, 0);
    Point p2 = new Point(10,0);
    System.out.println("Distance between two points is " + Point.distance(p1,p2));

    System.out.println("Pass arguments via method and calculate distance " +
            Point.distance(new Point(5,8), new Point(6,6)) );
  }

  public static void hello(String somebody){

    System.out.println("Hello, " + somebody + "!");
  }

}
