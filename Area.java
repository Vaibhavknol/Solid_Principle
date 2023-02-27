import java.util.Scanner;

abstract class Polygon {
  public abstract int getArea();
}

class Rectangle extends Polygon {
  int m_width;
  int m_height;
 
  public Rectangle(int width, int height) {
    m_width = width;
    m_height = height;
  }
 
  public void setWidth(int width) {
    m_width = width;
  }
 
  public void setHeight(int height) {
    m_height = height;
  }
 
  public int getWidth() {
    return m_width;
  }
 
  public int getHeight() {
    return m_height;
  }
 
  public int getArea() {
    return m_width * m_height;
  }
}

class Square extends Polygon {
  int m_side;

  public Square(int side) {
    m_side = side;
  }

  public void setSide(int side) {
    m_side = side;
  }

  public int getSide() {
    return m_side;
  }

  public int getArea() {
    return m_side * m_side;
  }
}

public class Area {
  public static void main(String[] args) {
    System.out.println("Choose 1 to find the area of rectangle: ");
    System.out.println("Choose 2 to find the area of square: ");
    System.out.println("Enter a choice");

    Scanner input = new Scanner(System.in);
    int choice = input.nextInt();
    Polygon shape = null;

    switch (choice) {
      case 1:
        System.out.println("Enter length of Rectangle: ");  
        Scanner rectangleLength = new Scanner(System.in);
        int length = rectangleLength.nextInt();
        System.out.println("Enter breadth of Rectangle: ");
        Scanner rectangleBreadth = new Scanner(System.in);
        int breadth = rectangleBreadth.nextInt();
        shape = new Rectangle(length, breadth);
        break;
        
      case 2:
        System.out.println("Enter length of side of Square: ");
        Scanner squareEdge = new Scanner(System.in);
        int side = squareEdge.nextInt();
        shape = new Square(side);
        break;
      
      default:
        System.out.println("!!! Please choose either 1 or 2 !!!");
        break;
    }

    if (shape != null) {
      System.out.println("Area = " + shape.getArea());
    }
  }
}
