package assignment;

//Single Inheritance(Animal->Dog)

class Animal1 {

 void eat() {
     System.out.println("Animal eats food");
 }
}

class Dog1 extends Animal1 {

 void bark() {
     System.out.println("Dog barks");
 }
}


//Multilevel Inheritance(Animal->Dog->Puppy)

class Animal2 {

 void eat() {
     System.out.println("Animal eats food");
 }
}

class Dog2 extends Animal2 {

 void bark() {
     System.out.println("Dog barks");
 }
}

class Puppy2 extends Dog2 {

 void play() {
     System.out.println("Puppy plays");
 }
}


//Hierarchial Inheritance(   Animal    )
//                           /    \
//                        Dog      Cat
                       
class Animal3 {

 void eat() {
     System.out.println("Animal eats food");
 }
}

class Dog3 extends Animal3 {

 void bark() {
     System.out.println("Dog barks");
 }
}

class Cat3 extends Animal3 {

 void meow() {
     System.out.println("Cat meows");
 }
}

//Hybrid Inheritance(Multilevel+Hierarchial)
//Hierarchial:Animal->Dog,Animal->Cat
//Multilevel:Animal->Dog->Puppy


class Animal4 {
 void eat() {
     System.out.println("Animal eats food");
 }
}

//First child of Animal
class Dog4 extends Animal4 {

 void bark() {
     System.out.println("Dog barks");
 }
}

//Second child of Animal
class Cat4 extends Animal4 {

 void meow() {
     System.out.println("Cat meows");
 }
}

//Puppy inherits Dog
//Therefore: Animal -> Dog -> Puppy
class Puppy4 extends Dog4 {

 void play() {
     System.out.println("Puppy plays");
 }
}


//Main Class

public class TypesOfInheritance {

 public static void main(String[] args) {

    

	 System.out.println("Single Inheritance");

     Dog1 d1 = new Dog1();

     d1.eat();
     d1.bark();


     

     System.out.println("Multilevel Inhertitance");

     Puppy2 p2 = new Puppy2();

     p2.eat();
     p2.bark();
     p2.play();


    

     System.out.println("Hierarchial Inheritance");

     Dog3 d3 = new Dog3();

     d3.eat();
     d3.bark();

     Cat3 c3 = new Cat3();

     c3.eat();
     c3.meow();


     

     System.out.println("Hybrid Inheritance");

     // Dog object
     Dog4 d4 = new Dog4();

     d4.eat();
     d4.bark();

     // Cat object
     Cat4 c4 = new Cat4();

     c4.eat();
     c4.meow();

     // Puppy object
     Puppy4 p4 = new Puppy4();

     p4.eat();
     p4.bark();
     p4.play();
 }
}



//Output:

//Single Inheritance: Parent method:Animal eats

//Single Inheritance: Child method:Dog barks


//Multilevel Inheritance: Grandparent method:Animal eats

//Multilevel Inheritance: Parent method:Dog barks

//Multilevel Inheritance: Child method:Puppy plays


//Hierarchical Inheritance: Parent method:Animal eats

//Hierarchical Inheritance: Child1 method:Dog barks

//Hierarchical Inheritance: Parent method:Animal eats

//Hierarchical Inheritance: Child2 method:Cat meows


//Hybrid Inheritance:Animal eats

//Hybrid Inheritance:Dog barks

//Hybrid Inheritance:Puppy plays

//Hybrid Inheritance:Animal eats

//Hybrid Inheritance:Cat meows