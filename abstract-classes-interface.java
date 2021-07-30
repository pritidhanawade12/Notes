//ABSTRACT CLASSES::*************************************************************************************************
an abstract class is mainly used to define default behavior for subclasses, it means that all child classes should have performed the same functionality.



1]In Java, a separate keyword abstract is used to make a class abstract. 
// An example abstract class in Java 
abstract class Shape { 
    int color; 
  
    // An abstract function (like a pure virtual function in C++) 
    abstract void draw();  
} 
_____________________________________________________________________________________________________________________
2]An instance of an abstract class cannot be created, we can have references of abstract class type though.
For any abstract java class we are not allowed to create an object i.e., for abstract class instantiation is not possible.
abstract class Base { 
    abstract void fun(); 
} 
class Derived extends Base { 
    void fun() { System.out.println("Derived fun() called"); } 
} 
class Main { 
    public static void main(String args[]) {  
      
        // Uncommenting the following line will cause compiler error as the  
        // line tries to create an instance of abstract class. 

        //Base b = new Base(); 
  
        // We can have references of Base type. 
        Base b = new Derived(); 
        b.fun();  
    } 
}
____________________________________________________________________________________________________________________
3] Like C++, an abstract class can contain constructors in Java. And a constructor of abstract class is called when an instance of a inherited class is created. For example, the following is a valid Java program.

// An abstract class with constructor 
abstract class Base { 
    Base() { System.out.println("Base Constructor Called"); } 
    abstract void fun(); 
} 
class Derived extends Base { 
    Derived() { System.out.println("Derived Constructor Called"); } 
    void fun() { System.out.println("Derived fun() called"); } 
} 
class Main { 
    public static void main(String args[]) {  
       Derived d = new Derived(); 
    } 
} 

Output:

Base Constructor Called
Derived Constructor Called
_____________________________________________________________________________________________________________________
4]Abstract methods do not contain a body.

//Example...
abstract class Derived extends Base {

	@Override
	abstract void fun();
	
}
____________________________________________________________________________________________________________________
5]In Java, we can have an abstract class without any abstract method. This allows us to create classes that cannot be instantiated, but can only be inherited.
___________________________________________________________________________________________________________________
6]Abstract classes can also have final methods (methods that cannot be overridden)
 
____________________________________________________________________________________________________________________
7]We cannot have abstract methods in final class.In order to have abstract methods , class must be of abstract type only.
//following code will give an error.
final class Base { 
    abstract void fun(); 
} 

   
class Program { 
    public static void main(String args[]) {  
       Base b = new Base(); 
      
    } 
} 
___________________________________________________________________________________________________________________
8]//a static method cannot be abstract...
When a method is described as abstract by using the abstract type modifier, it becomes responsibility of the subclass to implement it because they have no specified implementation in the super-class. Thus, a subclass must override them to provide method definition.
when a method is described as static, it makes it clear that this static method cannot be overridden by any subclass (It makes the static method hidden) as static members are compile-time elements and overriding them will make it runtime elements (Runtime Polymorphism).
___________________________________________________________________________________________________________________
9]A static method cannot be abstract but it can be final.i.e.Abstract method cannot be static ,final and private because abstract methods need to override and static,final and private methods we cannot override.
____________________________________________________________________________________________________________________
---------------------------------------------------------------------------------------------------------------------
//Difference between Final and Abstract in Java**********************************************************************
---------------------------------------------------------------------------------------------------------------------
1]//Final Class: 
A class which is declared with the “Final” keyword is known as the final class. The final keyword is used to finalize the implementations of the classes, the methods and the variables used in this class. The main purpose of using a final class is to prevent the class from being inherited (i.e.) if a class is marked as final, then no other class can inherit any properties or methods from the final class. If the final class is extended, Java gives a compile-time error.

//Abstract Class:
 A class that is declared using the “abstract” keyword is known as an abstract class. The main idea behind an abstract class is to implement the concept of Abstraction. An abstract class can have both abstract methods(methods without body) as well as the concrete methods(regular methods with the body). However, a normal class(non-abstract class) cannot have abstract methods.

2]For the abstract classes, we need to create a child class to provide the implementation whereas for final class we can’t create child class. therefore, a final abstract combination is illegal for classes. 

3]All the abstract methods should be overridden in the child class to provide the implementation. However, from the definition, a final method can’t be overridden. Therefore, an abstract final combination is illegal for the methods.

4]static final is allowed, static abstract is not allowed.

5]Abstract class can have final methods(This final method is treated like a normal method with a body which cannot be overridden.) but final class cannot have abstract methods.(As a final class cannot be inherited.)



S.NO.	ABSTRACT CLASS	                                     FINAL CLASS
---------------------------------------------------------------------------------------------------------------------
1.	Uses the “abstract” key word.	                     Uses the “final” key word.
2.	This helps to achieve abstraction.	             This helps to restrict other classes from accessing     
                                                             its properties and methods.(finalizing implementation)
3.	For later use, all the abstract methods should 	     Overriding concept does not arise
        be overridden                                        as finalclass cannot be inherited
4.	A few methods can be implemented and a few cannot    All methods should have implementation
5.	Cannot create immutable objects (infact, no objects  Immutable objects can be created 
        can be created)(eg.String class)                                      
6.	Abstract class methods functionality can be altered  Final class methods should be used as it is by 
        in subclass                                          other classes
7.	Can be inherited	                             Cannot be inherited
8.	Cannot be instantiated	                             Can be instantiated
9.	Can contain abstract methods                            Cannot contain abstract methods.
10.	Child class needs to create to provide imple-        Child class cannot be create 
        mentation

---------------------------------------------------------------------------------------------------------------------
//Interface::********************************************************************************************************
1]
*Like a class, an interface can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, no body). 
*Interfaces specify what a class must do and not how. It is the blueprint of the class.
*An Interface is about capabilities like a Player may be an interface and any class implementing Player must be able to (or must implement) move(). So it specifies a set of methods that the class has to implement.
*If a class implements an interface and does not provide method bodies for all functions specified in the interface, then the class must be declared abstract.
interface <interface_name> {
    
    // declare constant fields
    // declare methods that abstract 
    // by default.
}
*To declare an interface, use interface keyword. It is used to provide total abstraction. That means all the methods in an interface are declared with an empty body and are public and all fields are public, static and final by default. A class that implements an interface must implement all the methods declared in the interface. To implement interface use implements keyword.
_____________________________________________________________________________________________________________________
2]
//Why do we use interface ?
It is used to achieve total abstraction.
Since java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance .
It is also used to achieve loose coupling.
Interfaces are used to implement abstraction. //So the question arises why use interfaces when we have abstract classes?
The reason is, abstract classes may contain non-final variables, whereas variables in interface are final, public and static.

// A simple interface 
interface Player 
{ 
    final int id = 10; 
    int move(); 
} 
_____________________________________________________________________________________________________________________
3]//New features added in interfaces in JDK 8

*Prior to JDK 8, interface could not define implementation. We can now add default implementation for interface methods. This default implementation has special use and does not affect the intention behind interfaces.
Suppose we need to add a new function in an existing interface. Obviously the old code will not work as the classes have not implemented those new functions. So with the help of default implementation, we will give a default body for the newly added functions. Then the old codes will still work.If class doesnt override that default method, then interface method will be called using class object , otherwise new implementation of class method will be called.

// An example to show that interfaces can 
// have methods from JDK 1.8 onwards 
interface In1 
{ 
    final int a = 10; 
    default void display() 
    { 
        System.out.println("hello"); 
    } 
} 
  
// A class that implements the interface. 
class TestClass implements In1 
{ 
    // Driver Code 
    public static void main (String[] args) 
    { 
        TestClass t = new TestClass(); 
        t.display(); 
    } 
} 
Output :

hello
---------------------------------------------------------------------------------------------------------------------
*Another feature that was added in JDK 8 is that we can now define static methods in interfaces which can be called independently without an object. Note: these methods are not inherited.

// An example to show that interfaces can 
// have methods from JDK 1.8 onwards 
interface In1 
{ 
    final int a = 10; 
    static void display() 
    { 
        System.out.println("hello"); 
    } 
} 
  
// A class that implements the interface. 
class TestClass implements In1 
{ 
    // Driver Code 
    public static void main (String[] args) 
    { 
        In1.display(); 
    } 
} 
Output :

hello
_____________________________________________________________________________________________________________________
4]//Important points about interface or summary of article:
*We can’t create instance(interface can’t be instantiated) of interface but we can make reference of it that refers to the Object of its implementing class.
*A class can implement more than one interface.
*An interface can extends another interface or interfaces (more than one interface) .
*A class that implements interface must implements all the methods in interface.
*All the methods are public and abstract. And all the fields are public, static, and final.
*It is used to achieve multiple inheritance.
*It is used to achieve loose coupling.
_____________________________________________________________________________________________________________________
5]//New features added in interfaces in JDK 9
//From Java 9 onwards, interfaces can contain following also:

Static methods
Private methods
Private Static methods
_____________________________________________________________________________________________________________________
6]//Access specifier of methods in interfaces:
In Java, all methods in an interface are public even if we do not specify public with method names and also abstract. Also, data fields are public static final even if we do not mention it with fields names. Therefore, data fields must be initialized.
Consider the following example, x is by default public static final and foo() is public even if there are no specifiers.

interface Test { 
  int x = 10;  // x is public static final and must be initialized here 
  void foo();  // foo() is public 
} 
_____________________________________________________________________________________________________________________
7]
*In Java, methods and data members of a class/interface can have one of the following four access specifiers. The access specifiers are listed according to their restrictiveness order.
1) private (accessible within the class where defined)
2) default or package private (when no access specifier is specified)
3) protected
4) public (accessible from any class)

*But, the classes and interfaces themselves can have only two access specifiers when declared outside any other class.
1) public
2) default (when no access specifier is specified)
*Nested interfaces and classes can have all access specifiers.
_____________________________________________________________________________________________________________________
8]//Difference between Abstract Class and Interface in Java**********************************************************
---------------------------------------------------------------------------------------------------------------------
Abstraction: Hiding the internal implementation of the feature and only showing the functionality to the users. i.e. what it works (showing), how it works (hiding). Both abstract class and interface are used for abstraction.

1]Type of methods: Interface can have only abstract methods.(From Java 8, it can have default and static methods also.) Abstract class can have abstract and non-abstract methods(final also). 
2]Final Variables: Variables declared in a Java interface are by default final. An abstract class may contain non-final variables.
3]Type of variables: Abstract class can have final, non-final, static and non-static variables. Interface has only static and final variables.
4]Implementation: Abstract class can provide the implementation of interface. Interface can’t provide the implementation of abstract class.
5]heritance vs Abstraction:A Java interface can be implemented using keyword “implements” and abstract class can be extended using keyword “extends”.
6]Multiple implementation: An interface can extend another Java interface only, an abstract class can extend another Java class and implement multiple Java interfaces.
7]Accessibility of Data Members: Members of a Java interface are public by default. A Java abstract class can have class members like private, protected, etc.
8]Abstract classes does contain constructor while interfaces does not contain constructor.
9]A class may implement several interfaces.A class may extend only one abstract class.
10]Abstract classes should be used primarily for objects that are closely related, whereas interfaces are best suited for providing a common functionality to unrelated classes.
_____________________________________________________________________________________________________________________
9]//Why interface does not contain constrcutor 
In order to call any method we need an object since there is no need to have object of interface, there is no need of having constructor in interface (Constructor is being called during creation of object).
An Interface in Java doesn't have a constructor because all data members in interfaces are public static final by default, they are constants (assign the values at the time of declaration). There are no data members in an interface to initialize them through the constructor.
____________________________________________________________________________________________________________________
10]//Why do we need constructors inside abstract class?
1) Abstract classes have constructors and those constructors are always invoked when a concrete subclass is instantiated
2.) We know constructor are also used to initialize fields of a class. We also know that abstract classes may contain fields and sometimes they need to be initialized somehow by using constructor
_____________________________________________________________________________________________________________________
11]//Can constructor be made final?
No, a constructor can't be made final. A final method cannot be overridden by any subclasses. As mentioned previously, the final modifier prevents a method from being modified in a subclass. ... In other words, constructors cannot be inherited in Java therefore, there is no need to write final before constructors.
____________________________________________________________________________________________________________________
12]//Can constructor be made static ?
When you set a method as static it means: "This method belongs to the class, not a particular object." But the constructor is implicitly called to initialize an object, so there is no purpose in having a static constructor.
_____________________________________________________________________________________________________________________
13]//Can constructor be abstract?
You can't have an abstract constructor, as abstract means you need to provide the implementation for that at some point of time in your subclass. But you cannot override constructor. There will be no point in having an abstract constructor : Since the constructor needs to be of the same name as of class
____________________________________________________________________________________________________________________
14]///Can we overload constructor?

Yes! Java supports constructor overloading. In constructor loading, we create multiple constructors with the same name but with different parameters types or with different no of parameters.
______________________________________________________________________________________________________________________
15]//Can we create an instance of interface
No, you cannot create an instance of an interface.
___________________________________________________________________________________________________________________
16]//When to use abstract class and when to use interface?

*If there are some related classes that need to share some lines of code then you can put these lines of code within abstract class and this abstract class should be extended by all these related classes.,whereas interfaces are best suited for providing a common functionality to unrelated classes.
*If we want to provide common, implemented functionality among all implementations of our component, use an abstract class. Abstract classes allow us to partially implement our class, whereas interfaces contain no implementation for any members.
*An abstract class is also good if we want to declare non-public members. In an interface, all methods must be public.If we want to add new methods in the future, then an abstract class is a better choice. Because if we add new methods to an interface, then all of the classes that already implemented that interface will have to be changed to implement the new methods.
*Interfaces are a good choice when we think that the API will not change for a while.
*An abstract class is a good choice if we are using the inheritance concept since it provides a common base class implementation to derived classes.
*Interfaces are also good when we want to have something similar to multiple inheritances since we can implement multiple interfaces.
If we want to create multiple versions of our component, create an abstract class. Abstract classes provide a simple and easy way to version our components. By updating the base class, all inheriting classes are automatically updated with the change. Interfaces, on the other hand, cannot be changed once created. If a new version of an interface is required, we must create a whole new interface.
*Abstract classes have the advantage of allowing better forward compatibility. Once clients use an interface, we cannot change it; if they use an abstract class, we can still add behavior without breaking the existing code.
*If we are designing small, concise bits of functionality, use interfaces. If we are designing large functional units, use an abstract class.
*An interface can extend another Java interface only, an abstract class can extend another Java class and implement multiple Java interfaces.
*If subclass extend abstract class then it cannot extend any other class(as java does not provide multiple inheritance through classes) but can implement interfaces.but if subclass implement interfaces it can also extend any other class or multiple interfaces.So to achive multiple interitance we can use interface.
*If we use interface then class implementing that interface must override all the methods(interface methods are public abstract) while if we use abstarct class then subclass needs to provide implementation to the abstract methods only , concrete methods can be used if necessary.
*every method in the interface must be public. You might not want to expose everything.
*iterface fields are public static and final.Use Abstarct class for non-public,non-static and non-final variable.
*You can't force anyone to override anything when extending an ordinary class. With an abstract class, you can.
*Use an interface when you don't need to provide any default implementations
*You can offer the best of both worlds, an interface and an abstract class. Implementors can ignore your abstract class if they choose. The only drawback of doing that is calling methods via their interface name is slightly slower than calling them via their abstract class name.

_____________________________________________________________________________________________________________________


