//Abstraction::
//*****************************************************************************************************************
Data Abstraction is the property by virtue of which only the essential details are displayed to the user.The trivial or the non-essentials units are not displayed to the user. Ex: A car is viewed as a car rather than its individual components.

Data Abstraction may also be defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details.

Consider a real-life example of a man driving a car. The man only knows that pressing the accelerators will increase the speed of car or applying brakes will stop the car but he does not know about how on pressing the accelerator the speed is actually increasing, he does not know about the inner mechanism of the car or the implementation of accelerator, brakes etc in the car. This is what abstraction is.

If the one user can send the message to another user message is sent successfully,but we dont’t know the internal mechanism to send the message from source to destination,here the internal detail are hidden by the user.

It helps in reducing programming complexity and efforts. Humans manage complexity through abstraction. For example, people do not think of a car as a set of tens of thousands of individual parts.
In java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using
 interfaces.

//How abstraction is achieved using interfaces in Java?
Abstraction is a process of hiding the implementation details from the user, only the functionality will be provided to the user. In other words, the user will have the information on what the object does instead of how it does it.
Since all the methods of the interface are abstract and the user doesn’t know how a method is written except the method signature/prototype. Using interfaces, you can achieve (complete) abstraction.
*Abstraction in interfaces
An interface in Java is a specification of method prototypes. Whenever you need to guide the programmer or, make a contract specifying how the methods and fields of a type should be you can define an interface.
To create an object of this type you need to implement this interface, provide a body for all the abstract methods of the interface and obtain the object of the implementing class.
The user who want to use the methods of the interface, he only knows the classes that implement this interface and their methods, information about the implementation is completely hidden from the user, thus achieving 100% abstraction.

Example:
Assume that you have TV and a Remote. By Remote, you can operate with TV.
Remote had On and Off buttons. When you click on On button, TV will switch on. But you don't know internals of On button implementation . Same is the case with Off button, which switches off TV.
Now Remote is an interface and TV is an implementation object. Map same concepts in java programming language and you will get more clarity.
Remote is interface with On and Off methods. TV implements Remote interface.
Abstraction is hiding details and TV has achieved it. Even in absence of Remote interface, TV can have On and Off buttons and hides the details.
Interface with abstract methods is not necessary to define abstraction. But interface is pure abstract and hides the details of implementation. It exposes contract by hiding internal implementation of implementor.




// Java program to illustrate the concept of Abstraction 

abstract class Shape { 
	String color; 

	// these are abstract methods 
	abstract double area(); 
	public abstract String toString(); 

	// abstract class can have a constructor 
	public Shape(String color) 
	{ 
		System.out.println("Shape constructor called"); 
		this.color = color; 
	} 

	// this is a concrete method 
	public String getColor() 
	{ 
		return color; 
	} 
} 
class Circle extends Shape { 
	double radius; 

	public Circle(String color, double radius) 
	{ 

		// calling Shape constructor 
		super(color); 
		System.out.println("Circle constructor called"); 
		this.radius = radius; 
	} 

	@Override
	double area() 
	{ 
		return Math.PI * Math.pow(radius, 2); 
	} 

	@Override
	public String toString() 
	{ 
		return "Circle color is "
			+ super.color 
			+ "and area is : "
			+ area(); 
	} 
} 

class Rectangle extends Shape { 

	double length; 
	double width; 

	public Rectangle(String color, 
					double length, 
					double width) 
	{ 

		// calling Shape constructor 
		super(color); 
		System.out.println("Rectangle constructor called"); 
		this.length = length; 
		this.width = width; 
	} 

	@Override
	double area() 
	{ 
		return length * width; 
	} 

	@Override
	public String toString() 
	{ 
		return "Rectangle color is "
			+ super.color 
			+ "and area is : "
			+ area(); 
	} 
} 

public class Test { 
	public static void main(String[] args) 
	{ 
		Shape s1 = new Circle("Red", 2.2); 
		Shape s2 = new Rectangle("Yellow", 2, 4); 

		System.out.println(s1.toString()); 
		System.out.println(s2.toString()); 
	} 
} 




//Advantages of Abstraction
It reduces the complexity of viewing the things.
Avoids code duplication and increases reusability.
Helps to increase security of an application or program as only important details are provided to the user.
__________________________________________________________________________________________________________________
//****************************************************************************************************************
//Encapsulation::

Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates. Another way to think about encapsulation is, it is a protective shield that prevents the data from being accessed by the code outside this shield.

Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of own class in which they are declared.
As in encapsulation, the data in a class is hidden from other classes, so it is also known as data-hiding.
Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables

Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

To achieve encapsulation in Java −
Declare the variables of a class as private.
Provide public setter and getter methods to modify and view the variables values.

Benefits of Encapsulation
The fields of a class can be made read-only or write-only.
A class can have total control over what is stored in its fields.

// Java program to demonstrate encapsulation 

public class Encapsulate { 

	// private variables declared 
	// these can only be accessed by 
	// public methods of class 
	private String geekName; 
	private int geekRoll; 
	private int geekAge; 

	// get method for age to access 
	// private variable geekAge 
	public int getAge() 
	{ 
		return geekAge; 
	} 

	// get method for name to access 
	// private variable geekName 
	public String getName() 
	{ 
		return geekName; 
	} 

	// get method for roll to access 
	// private variable geekRoll 
	public int getRoll() 
	{ 
		return geekRoll; 
	} 

	// set method for age to access 
	// private variable geekage 
	public void setAge(int newAge) 
	{ 
		geekAge = newAge; 
	} 

	// set method for name to access 
	// private variable geekName 
	public void setName(String newName) 
	{ 
		geekName = newName; 
	} 

	// set method for roll to access 
	// private variable geekRoll 
	public void setRoll(int newRoll) 
	{ 
		geekRoll = newRoll; 
	} 
} 

// Class to access variables 
// of the class Encapsulate 
class TestEncapsulation { 
	public static void main(String[] args) 
	{ 
		Encapsulate obj = new Encapsulate(); 

		// setting values of the variables 
		obj.setName("Harsh"); 
		obj.setAge(19); 
		obj.setRoll(51); 

		// Displaying values of the variables 
		System.out.println("Geek's name: " + obj.getName()); 
		System.out.println("Geek's age: " + obj.getAge()); 
		System.out.println("Geek's roll: " + obj.getRoll()); 

		// Direct access of geekRoll is not possible 
		// due to encapsulation 
		// System.out.println("Geek's roll: " + obj.geekName); 
	} 
} 


On the other hand, Encapsulation is all about implementation. Its sole purpose is to hide the internal working of objects from the outside world so that you can change it later without impacting outside clients.

For example, we have a HashMap which allows you to store the object using the put() method and retrieve the object using the get() method. How HashMap implements this method is an internal detail of HashMap, the client only cares that put stores the object and get return it back, they are not concerned whether HashMap is using an array, how it is resolving the collision, whether it is using linked list or binary tree to store object landing on the same bucket, etc.

Because of Encapsulation, you can change the internal implementation of HashMap with ease without impacting clients who are using HashMap. For example, in Java 8, the java.util.HashMap changes its implementation to use a binary tree instead of LinkedList to store objects in the same bucket after a certain threshold.

_____________________________________________________________________________________________________________________
//Encapsulation vs Data Abstraction

Encapsulation is data hiding(information hiding) while Abstraction is detail hiding(implementation hiding).
While encapsulation groups together data and methods that act upon the data, data abstraction deals with exposing the interface to the user and hiding the details of implementation.
Abstraction is the method of hiding the unwanted information.Whereas encapsulation is a method to hide the data in a single entity or unit along with a method to protect information from outside.
We can implement abstraction using abstract class and interfaces.Whereas encapsulation can be implemented using by access modifier i.e. private, protected and public.
In abstraction, implementation complexities are hidden using abstract classes and interfaces.While in encapsulation, the data is hidden using methods of getters and setters.
Abstraction, OOP concept which focuses on relevant information by hiding unnecessary detail, and when you ask about Encapsulation, many will tell that it's another OOP concept which hides data from the outside world. The definitions are not wrong as both Abstraction and Encapsulation does hide something, but the key difference is on intent.
Abstraction hides complexity by giving you a more abstract picture, a sort of 10,000 feet view, while Encapsulation hides internal working so that you can change it later. In other words, Abstraction hides details at the design level, while Encapsulation hides details at the implementation level.

___________________________________________________________________________________________________________________
//*******************************************************************************************************************
//Polymorphism 

The word polymorphism means having many forms. In simple words, we can define polymorphism as the ability of a message to be displayed in more than one form.
//Real life example of polymorphism:
 A person at the same time can have different characteristic. Like a man at the same time is a father, a husband, an employee. So the same person posses different behaviour in different situations. This is called polymorphism.

Polymorphism is considered as one of the important features of Object Oriented Programming. Polymorphism allows us to perform a single action in different ways. In other words, polymorphism allows you to define one interface and have multiple implementations. The word “poly” means many and “morphs” means forms, So it means many forms.

//In Java polymorphism is mainly divided into two types:
Compile time Polymorphism
Runtime Polymorphism

1]Compile time polymorphism:This type of polymorphism is achieved by function overloading or operator overloading.
It is also called as static polymorphism, false polymorphism, early binding.
When call to functions is resolved at compile time it is called compile time polymorphism.
//Method Overloading:
When there are multiple functions with same name but different parameters then these functions are said to be overloaded. Functions can be overloaded by change in number of arguments or/and change in type of arguments.
// Java program for Method overloading 

class MultiplyFun { 

	// Method with 2 parameter 
	static int Multiply(int a, int b) 
	{ 
		return a * b; 
	} 

	// Method with the same name but 2 double parameter 
	static double Multiply(double a, double b) 
	{ 
		return a * b; 
	} 
} 

class Main { 
	public static void main(String[] args) 
	{ 

		System.out.println(MultiplyFun.Multiply(2, 4)); 

		System.out.println(MultiplyFun.Multiply(5.5, 6.3)); 
	} 
} 

//Operator Overloading: 
Java does not support operator overloading
Java also provide option to overload operators. For example, we can make the operator (‘+’) for string class to concatenate two strings. We know that this is the addition operator whose task is to add two operands. So a single operator ‘+’ when placed between integer operands, adds them and when placed between string operands, concatenates them.
In java, Only “+” operator can be overloaded:
To add integers
To concatenate strings

// Java program for Operator overloading 

class OperatorOVERDDN { 

	void operator(String str1, String str2) 
	{ 
		String s = str1 + str2; 
		System.out.println("Concatinated String - "
						+ s); 
	} 

	void operator(int a, int b) 
	{ 
		int c = a + b; 
		System.out.println("Sum = " + c); 
	} 
} 

class Main { 
	public static void main(String[] args) 
	{ 
		OperatorOVERDDN obj = new OperatorOVERDDN(); 
		obj.operator(2, 3); 
		obj.operator("joe", "now"); 
	} 
} 




2]Runtime polymorphism:It is also known as Dynamic Method Dispatch. It is a process in which a function call to the overridden method is resolved at Runtime. This type of polymorphism is achieved by Method Overriding.
It is also called as dynamic polymorphism, true polymorphism or late binding.
When call to the function resolved at run time, it is called run time polymorphism

*Method overriding:
 on the other hand, occurs when a derived class has a definition for one of the member functions of the base class. That base function is said to be overridden.

// Java program for Method overridding 

class Parent { 

	void Print() 
	{ 
		System.out.println("parent class"); 
	} 
} 

class subclass1 extends Parent { 

	void Print() 
	{ 
		System.out.println("subclass1"); 
	} 
} 

class subclass2 extends Parent { 

	void Print() 
	{ 
		System.out.println("subclass2"); 
	} 
} 

class TestPolymorphism3 { 
	public static void main(String[] args) 
	{ 

		Parent a; 

		a = new subclass1(); 
		a.Print(); 

		a = new subclass2(); 
		a.Print(); 
	} 
} 

__________________________________________________________________________________________________________________

//Modularity::
Modularity is the process of decomposing a problem (program) into a set of modules so as to reduce the overall complexity of the problem.
The act of portioning a program into individual components can reduce its complexity to some degree.
Modularity can be physical modularity(e.g. divide program into .h, .cpp, .rc files) or logical modularity(e.g. namespace)
Modularization consists of dividing program into modules that can be compiled seperately, but which are interconnected.
Modularity helps in easier maintenance of a complex software.
_________________________________________________________________________________________________________________
//Hierarchy
Hierarchy is ranking or ordering of abstractions.
Main purpose of hierarchy is to achieve re-usability.

1]inheritance 
2]Association:is relation between two separate classes which establishes through their Objects. Association can be one-to-one, one-to-many, many-to-one, many-to-many.
In Object-Oriented programming, an Object communicates to other Object to use functionality and services provided by that object. Composition and Aggregation are the two forms of association.

*Bank can have many employees, So it is a one-to-many relationship.
// Java program to illustrate the 
// concept of Association 
import java.io.*; 

// class bank 
class Bank 
{ 
	private String name; 
	
	// bank name 
	Bank(String name) 
	{ 
		this.name = name; 
	} 
	
	public String getBankName() 
	{ 
		return this.name; 
	} 
} 

// employee class 
class Employee 
{ 
	private String name; 
	
	// employee name 
	Employee(String name) 
	{ 
		this.name = name; 
	} 
	
	public String getEmployeeName() 
	{ 
		return this.name; 
	} 
} 

// Association between both the 
// classes in main method 
class Association 
{ 
	public static void main (String[] args) 
	{ 
		Bank bank = new Bank("Axis"); 
		Employee emp = new Employee("Neha"); 
		
		System.out.println(emp.getEmployeeName() + 
			" is employee of " + bank.getBankName()); 
	} 
} 



3]Aggregation:
It is a special form of Association.
It represents Has-A relationship.(department has a students)
It is a unidirectional association i.e. a one way relationship. For example, department can have students but vice versa is not possible and thus unidirectional in nature.
In Aggregation, both the entries can survive individually which means ending one entity will not effect the other entity

// Java program to illustrate 
//the concept of Aggregation. 
import java.io.*; 
import java.util.*; 

// student class 
class Student 
{ 
	String name; 
	int id ; 
	String dept; 
	
	Student(String name, int id, String dept) 
	{ 
		
		this.name = name; 
		this.id = id; 
		this.dept = dept; 
		
	} 
} 

/* Department class contains list of student 
Objects. It is associated with student 
class through its Object(s). */
class Department 
{ 
	
	String name; 
	private List<Student> students; 
	Department(String name, List<Student> students) 
	{ 
		
		this.name = name; 
		this.students = students; 
		
	} 
	
	public List<Student> getStudents() 
	{ 
		return students; 
	} 
} 

/* Institute class contains list of Department 
Objects. It is asoociated with Department 
class through its Object(s).*/
class Institute 
{ 
	
	String instituteName; 
	private List<Department> departments; 
	
	Institute(String instituteName, List<Department> departments) 
	{ 
		this.instituteName = instituteName; 
		this.departments = departments; 
	} 
	
	// count total students of all departments 
	// in a given institute 
	public int getTotalStudentsInInstitute() 
	{ 
		int noOfStudents = 0; 
		List<Student> students; 
		for(Department dept : departments) 
		{ 
			students = dept.getStudents(); 
			for(Student s : students) 
			{ 
				noOfStudents++; 
			} 
		} 
		return noOfStudents; 
	} 
	
} 

// main method 
class GFG 
{ 
	public static void main (String[] args) 
	{ 
		Student s1 = new Student("Mia", 1, "CSE"); 
		Student s2 = new Student("Priya", 2, "CSE"); 
		Student s3 = new Student("John", 1, "EE"); 
		Student s4 = new Student("Rahul", 2, "EE"); 
	
		// making a List of 
		// CSE Students. 
		List <Student> cse_students = new ArrayList<Student>(); 
		cse_students.add(s1); 
		cse_students.add(s2); 
		
		// making a List of 
		// EE Students 
		List <Student> ee_students = new ArrayList<Student>(); 
		ee_students.add(s3); 
		ee_students.add(s4); 
		
		Department CSE = new Department("CSE", cse_students); 
		Department EE = new Department("EE", ee_students); 
		
		List <Department> departments = new ArrayList<Department>(); 
		departments.add(CSE); 
		departments.add(EE); 
		
		// creating an instance of Institute. 
		Institute institute = new Institute("BITS", departments); 
		
		System.out.print("Total students in institute: "); 
		System.out.print(institute.getTotalStudentsInInstitute()); 
	} 
} 

In this example, there is an Institute which has no. of departments like CSE, EE. Every department has no. of students. So, we make a Institute class which has a reference to Object or no. of Objects (i.e. List of Objects) of the Department class. That means Institute class is associated with Department class through its Object(s). And Department class has also a reference to Object or Objects (i.e. List of Objects) of Student class means it is associated with Student class through its Object(s).
It represents a Has-A relationship.

4]Composition:
Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.
It represents part-of relationship.(heart is a part of a human)
In composition, both the entities are dependent on each other.
When there is a composition between two entities, the composed object cannot exist without the other entity.
Lets take example of Library.

// Java program to illustrate 
// the concept of Composition 
import java.io.*; 
import java.util.*; 

// class book 
class Book 
{ 

	public String title; 
	public String author; 
	
	Book(String title, String author) 
	{ 
		
		this.title = title; 
		this.author = author; 
	} 
} 

// Libary class contains 
// list of books. 
class Library 
{ 

	// reference to refer to list of books. 
	private final List<Book> books; 
	
	Library (List<Book> books) 
	{ 
		this.books = books; 
	} 
	
	public List<Book> getTotalBooksInLibrary(){ 
		
	return books; 
	} 
	
} 

// main method 
class GFG 
{ 
	public static void main (String[] args) 
	{ 
		
		// Creating the Objects of Book class. 
		Book b1 = new Book("EffectiveJ Java", "Joshua Bloch"); 
		Book b2 = new Book("Thinking in Java", "Bruce Eckel"); 
		Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt"); 
		
		// Creating the list which contains the 
		// no. of books. 
		List<Book> books = new ArrayList<Book>(); 
		books.add(b1); 
		books.add(b2); 
		books.add(b3); 
		
		Library library = new Library(books); 
		
		List<Book> bks = library.getTotalBooksInLibrary(); 
		for(Book bk : bks){ 
			
			System.out.println("Title : " + bk.title + " and "
			+" Author : " + bk.author); 
		} 
	} 
} 

In above example a library can have no. of books on same or different subjects. So, If Library gets destroyed then All books within that particular library will be destroyed. i.e. book can not exist without library. That’s why it is composition.

__________________________________________________________________________________________________________________
//Aggregation vs Composition

1]Dependency: Aggregation implies a relationship where the child can exist independently of the parent. For example, Bank and Employee, delete the Bank and the Employee still exist. whereas Composition implies a relationship where the child cannot exist independent of the parent. Example: Human and heart, heart don’t exist separate to a Human
2]Type of Relationship: Aggregation relation is “has-a” and composition is “part-of” relation.
3]Type of association: Composition is a strong Association whereas Aggregation is a weak Association.


____________________________________________________________________________________________________________________
//Persistence

An object occupies a memory space and exists for a particular period of time. In traditional programming, the lifespan of an object was typically the lifespan of the execution of the program that created it. In files or databases, the object lifespan is longer than the duration of the process creating the object. This property by which an object continues to exist even after its creator ceases to exist is known as persistence
