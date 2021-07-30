//method overriding...
Declaring a method in sub class which is already present in parent class is known as method overriding.
*Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
*Overriding is about same method, same signature(same or subtype of return type) but different classes connected through inheritance. runtime polymorphism cannot be achieved by data members.
*overriding is an example of run time polymorphism.
_____________________________________________________________________________________________________________________
//Why Method Overriding ?
*overridden methods allow Java to support run-time polymorphism. Polymorphism is essential to object-oriented programming for one reason: it allows a general class to specify methods that will be common to all of its derivatives while allowing subclasses to define the specific implementation of some or all of those methods. Overridden methods are another way that Java implements the “one interface, multiple methods” aspect of polymorphism.
* Overriding is done so that a child class can give its own implementation to a method which is already provided by the parent class.
___________________________________________________________________________________________________________________
//When to apply overriding?
If there is need where sub class uses method of super class as it is or to define a behavior that's specific to the subclass type, which means a subclass can implement a parent class method based on its requirement.
____________________________________________________________________________________________________________________
//Dynamic method dispatch OR Run-time polymorphism...
*Method overriding is one of the ways in which Java supports Runtime Polymorphism. Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time, rather than compile time.
*When an overridden method is called through a superclass reference, Java determines which version(superclass/subclasses) of that method is to be executed based upon the type of the object being referred to at the time the call occurs. Thus, this determination is made at run time.
*At run-time, it depends on the type of the object being referred to (not the type of the reference variable) that determines which version of an overridden method will be executed.
*A superclass reference variable can refer to a subclass object. This is also known as upcasting. Java uses this fact to resolve calls to overridden methods at run time.
*Therefore, if a superclass contains a method that is overridden by a subclass, then when different types of objects are referred to through a superclass reference variable, different versions of the method are executed. 

//Example:
	// object of type A
   	A a = new A();    
  
        // object of type B 
        A b = new B(); 
  
        // object of type C
        A c = new C();          ...//where a, b, c are super-class(A)reference variables and A(),B(),c()are class A, 				             class B , class C objects respectively which are called reffered objects.
_____________________________________________________________________________________________________________________
//Advantages of Dynamic Method Dispatch

*Dynamic method dispatch allow Java to support overriding of methods which is central for run-time polymorphism.
*It allows a class to specify methods that will be common to all of its derivatives, while allowing subclasses to define the specific implementation of some or all of those methods.
*It also allow subclasses to add its specific methods subclasses to define the specific implementation of some.
_____________________________________________________________________________________________________________________
//Static vs Dynamic binding
*Static binding is done during compile-time while dynamic binding is done during run-time.
*private, final and static methods and variables uses static binding and bonded by compiler while overridden methods are bonded during runtime based upon type of runtime object.
*********************************************************************************************************************
//method overloading...
*Overloading is about same method have different signatures. Overloading is an example of compiler-time polymorphism.
Overloading allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters or both. Overloading is related to compile-time (or static) polymorphism.
//Method overloading can be done by changing:
The number of parameters in two methods.
The data types of the parameters of methods.
The Order of the parameters of methods.

  public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
  
    // Overloaded sum(). This sum takes three int parameters 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
  
    // Overloaded sum(). This sum takes two double parameters 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
_____________________________________________________________________________________________________________________
//What if the exact prototype does not match with arguments.
Ans.
Priority wise, compiler take these steps:

Type Conversion but to higher type(in terms of range) in same family.
Type conversion to next higher family(suppose if there is no long data type available for an int data type, then it will search for the float data type).
_____________________________________________________________________________________________________________________
//What is the advantage?
We don’t have to create and remember different names for functions doing the same thing. For example, in our code, if overloading was not supported by Java, we would have to create method names like sum1, sum2, … or sum2Int, sum3Int, … etc.
If we need to do same kind of the operation with different ways i.e. for different inputs it is hard to find many different meaningful names for single action.
_____________________________________________________________________________________________________________________
//Can we overload methods on return type?
We cannot overload by return type.The compiler does not consider the return type while differentiating the overloaded method. But you cannot declare two methods with the same signature and different return type. It will throw a compile time error.

public class Main { 
    public int foo() { return 10; } 
  
    // compiler error: foo() is already defined 
    public char foo() { return 'a'; } 
  
    public static void main(String args[]) 
    { 
    } 
} 
However, Overloading methods on return type are possible in cases where the data type of the function being called is explicitly specified. Look at the examples below :

// Java program to demonstrate the working of method 
// overloading in static methods 
public class Main { 
  
    public static int foo(int a) { return 10; } 
    public static char foo(int a, int b) { return 'a'; } 
  
    public static void main(String args[]) 
    { 
        System.out.println(foo(1)); 
        System.out.println(foo(1, 2)); 
    } 
} 
Output:

10
a

___________________________________________________________________________________________________________________
//Can we overload static methods?
The answer is ‘Yes’. We can have two ore more static methods with same name, but differences in input parameters.
//Can we overload methods that differ only by static keyword?
We cannot overload two methods in Java if they differ only by static keyword (number of parameters and types of parameters is same)
//Can we overload main() in Java?
Like other static methods, we can overload main() in Java. 
public class Test 
{ 
    public static void main(String[] args) 
    { 
        System.out.println("Hi Geek (from main)"); 
        Test.main("Geek"); 
    } 
    public static void main(String arg1) 
    { 
        System.out.println("Hi, " + arg1); 
        Test.main("Dear Geek", "My Geek"); 
    } 
    public static void main(String arg1, String arg2) 
    { 
        System.out.println("Hi, " + arg1 + ", " + arg2); 
    } 
} 
//Does Java support Operator Overloading?
Unlike C++, Java doesn’t allow user-defined overloaded operators. Internally Java overloads operators, for example, + is overloaded for concatenation.
//What is the difference between Overloading and Overriding?
*Overloading is about same function have different signatures. Overriding is about same function, same signature but different classes connected through inheritance.
*Overloading is an example of compiler time polymorphism and overriding is an example of run time polymorphism.

