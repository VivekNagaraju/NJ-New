/**
 Constructor Inheritance:
 
 Case 1: Non-Parameterized constructor
 - It will be inherited to child class and called by default/ implicitly when an object from child class is created
 - If child class and parent class both have Non-Parameterized constructors then both the constructors are called implicitly
 	when an object from child class is created
 
 Case 2: Parameterized constructor
 - When parent class contains a Parameterized constructor then it is mandatory to have a Parameterized constructor in child 
 class and call parent class constructor with 'super' keyword
 - Child class constructor should have the parameters defined in parent class constructor
 - While calling parent class constructor required parameters should be passed in super function
 - We can define additional parameters in child class constructor
 
 Note: 
 
 When parent class has Non-Parameterized constructor it will be called implicitly even if child class has Parameterized 
 constructor
 */

package oops;

public class ConstructorInheritance {

	public static void main(String[] args) {
		System.out.println("========Parent Class========");
		Parent appa = new Parent();
		appa.parentMethod();
		
		System.out.println("========Child Class=========");
		Children nanu = new Children("nanu", 30, 75665);
		nanu.childrenMethod();
		nanu.parentMethod();

	}

}
 class Parent{
//	 String name;
//	 int age;
//	 Parent(String name, int age){
//		 this.name=name;
//		 this.age=age;
//		 System.out.println(this.name + this.age );
//	 }
	 
	 Parent(){
		 System.out.println("This is Parent class constructor");
	 }
	 public void parentMethod() {
		 System.out.println("This is parent method");
	 }
 }
 
 class Children extends Parent{
	 String name;
	 int age;
	 int adhaarNo;
			 
	 Children(String name, int age, int adhaarNo) {
//		super(name, age);
		 this.name=name;
		 this.age=age;
		 System.out.println(this.name + this.age );
		this.adhaarNo=adhaarNo;
		System.out.println(this.adhaarNo);
	}

	public void childrenMethod() {
		 System.out.println("This is child method");
	 }
 }

