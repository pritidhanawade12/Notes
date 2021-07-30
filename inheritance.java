class Person
{
	String name = "Abc";
	int age = 23;

	public Person()
	{
		System.out.println("Person Constructor");
	}
	
    public void show() {
        System.out.println("Person::show() called");
     }
}

class Employee extends Person
{
	int empid = 6152;
	float salary = 45000.50f;

	public Employee()
	{
		System.out.println("Employee Constructor");
	}
	
    public void show() {
        System.out.println("Employee::show() called");
     }
}
*********************************************************************************************************************
1]
If we create object like ---->Employee emp = new Employee()
then 1st base class(Person)constructor will be called and then derived class(Employee)constructor will be called.

If both class Person and class Employee have parameterized constructor and if we create object like 
Employee emp = new Employee(1001,15000.50f) then 1st default(parameterless) constructor of the base(Person) will be called and then Employee class parameterized constructor will be called.
In order to call parameterized constructor of the base class we need to use super("priti",24) in parameterized constructor of Employee.

	public Employee(int empid,float salary)
	{
		super("priti",24)
		this.empid = empid;
		this.salary = salary;
	}
	
 
 
conclusion::

Employee emp = new Employee() ---->1st base(Person) then derived(Employee)
Person emp = new Person(); ---->only base(Person)
Person emp = new Employee(); ---->1st base(Person) then derived(Employee)

Employee emp = new Person(); //cannot convert directly
//after casting
Employee emp = (Employee) new Person();  ----->base(person) followed by //ClasscastException

______________________________________________________________________________________________________________
2]
If both base class(Person) and derived class(Employee) have same methond ...eg.Show()
and if we create object like ----> Person p = new Employee();	//UpCasting
then derived class show() method will be called.(If not present then base class show() method will be called)
But while accessing members of classes,only base class members will be called.

public static void main(String[] args) 
{
		Person p = new Employee();	//UpCasting
		p.show();  //Employee class show() method
		System.out.println(p.name);	//OK
		System.out.println(p.age);	//OK
		System.out.println(p.salary); // NOt OK
		System.out.println(p.empid); // NOt OK
	


		Employee emp = (Employee) p;	//Downcasting
		System.out.println(emp.empid);	// Ok
		System.out.println(emp.salary);	// OK

}
___________________________________________________________________________________________________________________

3]
If both base class(Person) and derived class(Employee) have same methond ...eg.Show()
and if we create object like ----> Person p = new Person();	//UpCasting
then base class show() method will be called.
But while accessing members of classes,only base class members will be called.

	public static void main(String[] args) 
	{
		Person p = new Person();	
		p.show(); //Person class show() method
		System.out.println(p.name);	//OK
		System.out.println(p.age);	//OK
	//	System.out.println(p.salary); //Not ok
	//	System.out.println(p.empid); //not ok
		
	}

____________________________________________________________________________________________________________________

4]
If both base class(Person) and derived class(Employee) have same methond ...eg.Show()
and if we create object like ----> Employee emp = new Employee();	//UpCasting
then derived class show() method will be called.(If not present then base class show() method will be called)
But while accessing members of classes,both base and derived class members will be called


	public static void main(String[] args) 
	{
		Employee emp = new Employee();	
		emp.show(); //Employee class show() method
		System.out.println(emp.name);	//OK
		System.out.println(emp.age);	//OK
		System.out.println(emp.salary); //ok
		System.out.println(emp.empid); //ok
		
	}

____________________________________________________________________________________________________________________
5]

	public static void main(String[] args) 
	{
		Employee emp = (Employee) new Person();	
		emp.show(); 
		System.out.println(emp.name);	
		System.out.println(emp.age);	
		System.out.println(emp.salary); 
		System.out.println(emp.empid);  		
	}  
		//ClasscastException

__________________________________________________________________________________________________________________

6]here show() method is static....

class Person
{
	String name = "Abc";
	int age = 23;

	public Person()
	{
		System.out.println("Person Constructor");
	}
	
    public static void show() {
        System.out.println("Person::show() called");
     }
}

class Employee extends Person
{
	int empid = 6152;
	float salary = 45000.50f;

	public Employee()
	{
		System.out.println("Employee Constructor");
	}
	
    public static void show() {
        System.out.println("Employee::show() called");
     }
}


If both base class(Person) and derived class(Employee) have same methond(static)...eg.Show()
and if we create object like ----> Person p = new Employee();	//UpCasting
then base class show() method will be called.
But while accessing members of classes,only base class members will be called.

public static void main(String[] args) 
{
		Person p = new Employee();	//UpCasting
		p.show();//Person class show() method(in case of static, the call is made according to the 				reference(p),not according to the type of referred object(Employee))i.e compile time bonding
		System.out.println(p.name);	//OK
		System.out.println(p.age);	//OK
		System.out.println(p.salary); // NOt OK
		System.out.println(p.empid); // NOt OK
	


		Employee emp = (Employee) p;	//Downcasting
		System.out.println(emp.empid);	// Ok
		System.out.println(emp.salary);	// OK

}
Explanation:
Like C++, when a function is static, runtime polymorphism doesn't happen.
______________________________________________________________________________________________________________

7]//Some points to remember......

*we cannot override final methods.
*We cannot override private methods.(they are final).private methods are bonded during compile time.the call is made according to the reference,not according to the type of referred object.(unlike cpp)
*We can override protected methods in derived class.(they are not final).
*We can override abstract methods.(infact its compulsory to override abstract methods in sub class , otherwise sub-class also need to make an abstract).
*we cannot override static methods.(they are final).static methods are bonded during compile time.the call is made according to the reference,not according to the type of referred object.When you define a static method with same signature as a static method in base class, it is known as method hiding.
 ______________________________________________________________________________________________________________________
                         |   SUPERCLASS INSTANCE METHOD	    |  SUPERCLASS STATIC METHOD
______________________________________________________________________________________________________________________
SUBCLASS INSTANCE METHOD |	   Overrides	            |  Generates a compile-time error
______________________________________________________________________________________________________________________
SUBCLASS STATIC METHOD	 |  Generates a compile-time error  |	        Hides
______________________________________________________________________________________________________________________

*The access modifier for an overriding method can allow more, but not less, access than the overridden method. For example, a protected instance method in the super-class can be made public, but not private, in the subclass. Doing so, will generate compile-time error.
*The overriding method must have same return type (or subtype) : From Java 5.0 onwards it is possible to have different return type for a overriding method in child class, but child’s return type should be sub-type of parent’s return type. This phenomena is known as covariant return type.
*We can call parent class method in overriding method using super keyword.
The super keyword refers to superclass (parent) objects.
It is used to call superclass methods, and to access the superclass constructor.
The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.
Call to super() must be first statement in Derived Class constructor.

//variable
class Car extends Vehicle 
{ 
    int maxSpeed = 180; 
  
    void display() 
    { 
        
        System.out.println("Maximum Speed: " + super.maxSpeed); 
    } 
}

//method

  void display() 
    {
        message(); 
        super.message(); 
    } 

//constructor
public Employee(int empid,float salary)
	{
		super("priti",24)
		this.empid = empid;
		this.salary = salary;
	}
	
*If base does not contain any constructor then it is okay but if base contain only parameterized constructor and if a subclass constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass. If the superclass does not have a no-argument constructor, you will get a compile-time error. Object class does have such a constructor, so if Object is the only superclass, there is no problem


*Protected members are accessible within a package and inherited classes outside the package.
*inner Class is allowed to access private data members of outer class.(like cpp).
* Unlike C++, Java doesn’t provide an inheritance specifier like public, protected or private. Therefore, we cannot change the protection level of members of base class in Java, if some data member is public or protected in base class then it remains public or protected in derived class.
*Like C++, private members of base class are not accessible in derived class.
*Java does not support multiple inheritance with classes. A class cannot inherit from more than one class. However, A class can implement multiple interfaces. In java, we can achieve multiple inheritance only through Interfaces.
In java, we can achieve hybrid inheritance only through Interfaces.
*Like C++, default constructor of the parent class is automatically called in Java, but if we want to call parametrized constructor then we must use super to call the parent constructor.
*In Java, it is not allowed to do super.super. A class cannot directly access the grandparent’s members. We can only access Grandparent’s members using Parent.
* The default toString() method in Object prints “class name @ hash code”. We can override toString() method in our class to print proper output.
*when an object of sub class is created, a copy of the all methods and fields of the superclass acquire memory in this object. That is why, by using the object of the subclass we can also access the members of a superclass.
*A subclass inherits all the members (fields, methods, and nested classes) from its superclass. Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.//(using super)
*A subclass does not inherit the private members of its parent class. However, if the superclass has public or protected methods(like getters and setters) for accessing its private fields, these can also be used by the subclass.
*
//In sub-classes we can inherit members as it is, replace them, hide them, or supplement them with new members:
The inherited fields can be used directly, just like any other fields.
We can declare new fields in the subclass that are not in the superclass.
The inherited methods can be used directly as they are.
We can write a new instance method in the subclass that has the same signature as the one in the superclass, thus overriding it (as in example above, toString() method is overridden).
We can write a new static method in the subclass that has the same signature as the one in the superclass, thus hiding it.
We can declare new methods in the subclass that are not in the superclass.
We can write a subclass constructor that invokes the constructor of the superclass, either implicitly or by using the keyword super.
*
//Overriding and Exception-Handling : Below are two rules to note when overriding methods related to exception-handling.
Rule#1 : If the super-class overridden method does not throw an exception, subclass overriding method can only throws the unchecked exception, throwing checked exception will lead to compile-time error.
Rule#2 : If the super-class overridden method does throws an exception, subclass overriding method can only throw same, subclass exception. Throwing parent exception in Exception hierarchy will lead to compile time error.Also there is no issue if subclass overridden method is not throwing any exception.
*Abstract methods in an interface or abstract class are meant to be overridden in derived concrete classes otherwise a compile-time error will be thrown.
*The presence of synchronized/strictfp modifier with method have no effect on the rules of overriding, i.e. it’s possible that a synchronized/strictfp method can override a non synchronized/strictfp one and vice-versa.
*In C++, we need virtual keyword to achieve overriding or Run Time Polymorphism. In Java, methods are virtual by default.
*We can have multilevel method-overriding.
______________________________________________________________________________________________________________________






