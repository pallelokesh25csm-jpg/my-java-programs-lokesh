package task;
class Book {
    private int bookId;
    private String bookName;
    private String author;
    private double price;
    Book(int id, String name, String auth, double pr) {
        bookId = id;
        bookName = name;
        author = auth;
        price = pr;
    }
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int id) {
        bookId = id;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String name) {
        bookName = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String auth) {
        author = auth;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double pr) {
        price = pr;
    }
    public void display() {
        System.out.println("Book ID   : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author    : " + author);
        System.out.println("Price     : " + price);
    }
}
// Part C: Inheritance
class Person {
    String name;
    int age;
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}
class Student extends Person {
    String course;
    void display() {
        super.display();
        System.out.println("Course : " + course);
    }
}
class Faculty extends Person {
    String department;
    void display() {
        super.display();
        System.out.println("Department : " + department);
    }
}
// Part D: Method Overloading
class Area {
    void areacircle(double radius) {
        System.out.println("Circle Area = " + (3.14 * radius * radius));
    }
    void arearectangle(int length, int breadth) {
        System.out.println("Rectangle Area = " + (length * breadth));
    }
}
// Part D: Method Overriding
class Vehicle {
    void display() {
        System.out.println("This is a vehicle.");
    }
}
class Car extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a car.");
    }
}
class Bike extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a bike.");
    }
}
// Part E: Abstraction
abstract class Shape {
    abstract void draw();
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
// Part E: Interface
interface Printable {
    void print();
}
class Report implements Printable {
    @Override
    public void print() {
        System.out.println("Printing Report...");
    }
}
public class Library {
    public static void main(String[] args) {
        System.out.println(" BOOK DETAILS");
        Book b = new Book(101,"Java Programming","James Gosling",500);
        b.display();
        System.out.println("\n INHERITANCE");
        Student s = new Student();
        s.name = "Bob";
        s.age = 25;
        s.course = "Engineering";
        s.display();
        System.out.println("\n faculty");
        Faculty f = new Faculty();
        f.name = "Dr. Bob";
        f.age = 45;
        f.department = "Engineering";
        f.display();
        System.out.println("\n METHOD OVERLOADING");
        Area a = new Area();
        a.areacircle(5.0);       
        a.arearectangle(10, 20);    
        System.out.println("\n METHOD OVERRIDING");
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.display();
        v2.display();
        System.out.println("\n ABSTRACTION ");
        Shape sh1 = new Circle();
        Shape sh2 = new Rectangle();
        sh1.draw();
        sh2.draw();
        System.out.println("\n INTERFACE ");
        Printable p = new Report();
        p.print();
    }
}
