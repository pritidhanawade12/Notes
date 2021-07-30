//Multithreading in Java
Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU. Each part of such program is called a thread. So, threads are light-weight processes within a process.

//Threads can be created by using two mechanisms :
1. Extending the Thread class
2. Implementing the Runnable Interface

//Thread creation by extending the Thread class

We create a class that extends the java.lang.Thread class. This class overrides the run() method available in the Thread class. A thread begins its life inside run() method. We create an object of our new class and call start() method to start the execution of a thread. Start() invokes the run() method on the Thread object.


//Runnable Interface
The other way to create a thread is to declare a class that implements the Runnable interface. That class then implements the run method. An instance of the class can then be allocated, passed as an argument when creating Thread, and started. 



//Thread Class vs Runnable Interface
1. If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple inheritance. But, if we implement the Runnable interface, our class can still extend other base classes.

2. We can achieve basic functionality of a thread by extending Thread class because it provides some inbuilt methods like yield(), interrupt() etc. that are not available in Runnable interface.


//start() and run() difference
Main difference is that when program calls start() method a new Thread is created and code inside run() method is executed in new Thread while if you call run() method directly no new Thread is created and code inside run() will execute on current Thread.
_____________________________________________________________________________________________________________________
1]
// Java code for thread creation by extending 
// the Thread class 
class MultithreadingDemo extends Thread 
{ 
	public void run() 
	{ 
		try
		{ 
			// Displaying the thread that is running 
			System.out.println ("Thread " + 
				Thread.currentThread().getId() + 
				" is running"); 

		} 
		catch (Exception e) 
		{ 
			// Throwing an exception 
			System.out.println ("Exception is caught"); 
		} 
	} 
} 

// Main Class 
public class Multithread 
{ 
	public static void main(String[] args) 
	{ 
		int n = 4; // Number of threads 
		for (int i=0; i<n; i++) 
		{ 
			MultithreadingDemo object = new MultithreadingDemo(); 
			object.start(); 
		} 
	} 
} 


//output:
thread 12is running
thread 10is running
thread 14is running
thread 16is running

_____________________________________________________________________________________________________________________
2]
// Java code for thread creation by implementing 
// the Runnable Interface 
class MultithreadingDemo implements Runnable 
{ 
	public void run() 
	{ 
		try
		{ 
			// Displaying the thread that is running 
			System.out.println ("Thread " + 
								Thread.currentThread().getId() + 
								" is running"); 

		} 
		catch (Exception e) 
		{ 
			// Throwing an exception 
			System.out.println ("Exception is caught"); 
		} 
	} 
} 

// Main Class 
class Multithread 
{ 
	public static void main(String[] args) 
	{ 
		int n = 4; // Number of threads 
		for (int i=0; i<n; i++) 
		{ 
			Thread object = new Thread(new MultithreadingDemo()); 
			object.start(); 
		} 
	} 
} 

//output:
thread 12is running
thread 10is running
thread 14is running
thread 16is running

_____________________________________________________________________________________________________________________
//Refer: /home/sunbeam/Desktop/MyStudy/thread_lifecycle.png

//A thread in Java at any point of time exists in any one of the following states. A thread lies only in one of the shown states at any instant:
New
Runnable
Blocked
Waiting
Timed Waiting
Terminated



//New:
A newly created thread object instance on which the start() method has not yet been invoked is in the new state.When a new thread is created, it is in the new state. The thread has not yet started to run when thread is in this state. When a thread lies in the new state, it’s code is yet to be run and hasn’t started to execute.

//Runnable: 
A thread in new state enters the runnable state when the Thread.start() method is invoked on it. There are 2 important points to note regarding the runnable state –
Although the thread enters the runnable state immediately on invoking the start() method, but it is not necessary that the thread immediately starts executing. A thread runs when the logic it holds in its run() method can be executed by the processor. In case the thread logic needs any resource which is not available then the thread waits for the resource to become available.
Secondly, a thread in runnable state may run for some time and then get blocked for a monitor lock, or enter the waiting/timed_waiting states as it waits for the opportunity/time to enter runnable state again.

A thread that is ready to run is moved to runnable state. In this state, a thread might actually be running or it might be ready run at any instant of time. It is the responsibility of the thread scheduler to give the thread, time to run.
A multi-threaded program allocates a fixed amount of time to each individual thread. Each and every thread runs for a short while and then pauses and relinquishes the CPU to another thread, so that other threads can get a chance to run. When this happens, all such threads that are ready to run, waiting for the CPU and the currently running thread lies in runnable state.

//Blocked OR Waiting state:
When a thread is temporarily inactive, then it’s in one of the following states:
Blocked
Waiting
For example, when a thread is waiting for I/O to complete, it lies in the blocked state. It’s the responsibility of the thread scheduler to reactivate and schedule a blocked/waiting thread. A thread in this state cannot continue its execution any further until it is moved to runnable state. Any thread in these states does not consume any CPU cycle.

If a currently running thread is moved to blocked/waiting state, another thread in the runnable state is scheduled by the thread scheduler to run. It is the responsibility of thread scheduler to determine which thread to run.

//Blocked:
A thread is in the blocked state when it tries to access a protected section of code that is currently locked by some other thread. When the protected section is unlocked, the schedule picks one of the thread which is blocked for that section and moves it to the runnable state.
A running thread may enter the blocked state as it waits for a monitor lock to be freed. It may also be blocked as it waits to reenter a monitor lock after being asked to wait using the Thread.wait() method.

//Waiting :
A thread is in the waiting state when it waits for another thread on a condition. When this condition is fulfilled, the scheduler is notified and the waiting thread is moved to runnable state.
A thread enters the waiting state when it is made to wait for a go-ahead signal to proceed. The go-ahead in this case is given by another thread and can be given in the following 3 scenarios –
1]//Thread waiting due to Thread.wait() method being called on it: 
The other thread can use Thread.notify() or Thread.notifyAll() to give the go-ahead to the waiting thread.
2]//Thread waiting as it itself has asked for joining another thread using Thread.join(): 
The waiting thread gets a go-ahead when the thread its waiting for ends.
3]//Thread waiting due to LockSupport.park()method being invoked on it: 
The waiting thread resumes when LockSupport.unPark() is called with the parked thread object as the parameter.




//Terminated State: 
A thread enters its ‘final resting’ state or terminated state when it has finished executing the logic specified in its run() method.
A thread terminates because of either of the following reasons:
1]Because it exists normally. This happens when the code of thread has entirely executed by the program.
2]Because there occurred some unusual erroneous event, like segmentation fault or an unhandled exception.
A thread that lies in a terminated state does no longer consumes any cycles of CPU.

//Timed Waiting: 
A thread lies in timed waiting state when it calls a method with a time out parameter. A thread lies in this state until the timeout is completed or until a notification is received. For example, when a thread calls sleep or a conditional wait, it is moved to a timed waiting state.

_____________________________________________________________________________________________________________________

// Java program to demonstrate thread states 
class thread implements Runnable 
{ 
	public void run() 
	{ 
		// moving thread2 to timed waiting state 
		try
		{ 
			Thread.sleep(1500); 
		} 
		catch (InterruptedException e) 
		{ 
			e.printStackTrace(); 
		} 
		
		System.out.println("State of thread1 while it called join() method on thread2 -"+ 
			Test.thread1.getState()); 
		try
		{ 
			Thread.sleep(200); 
		} 
		catch (InterruptedException e) 
		{ 
			e.printStackTrace(); 
		}	 
	} 
} 

public class Test implements Runnable 
{ 
	public static Thread thread1; 
	public static Test obj; 
	
	public static void main(String[] args) 
	{ 
		obj = new Test(); 
		thread1 = new Thread(obj); 
		
		// thread1 created and is currently in the NEW state. 
		System.out.println("State of thread1 after creating it - " + thread1.getState()); 
		thread1.start(); 
		
		// thread1 moved to Runnable state 
		System.out.println("State of thread1 after calling .start() method on it - " + 
			thread1.getState()); 
	} 
	
	public void run() 
	{ 
		thread myThread = new thread(); 
		Thread thread2 = new Thread(myThread); 
		
		// thread1 created and is currently in the NEW state. 
		System.out.println("State of thread2 after creating it - "+ thread2.getState()); 
		thread2.start(); 
		
		// thread2 moved to Runnable state 
		System.out.println("State of thread2 after calling .start() method on it - " + 
			thread2.getState()); 
		
		// moving thread1 to timed waiting state 
		try
		{ 
			//moving thread1 to timed waiting state 
			Thread.sleep(200); 
		} 
		catch (InterruptedException e) 
		{ 
			e.printStackTrace(); 
		} 
		System.out.println("State of thread2 after calling .sleep() method on it - "+ 
			thread2.getState() ); 
		
		
		try
		{ 
			// waiting for thread2 to die 
			thread2.join(); 
		} 
		catch (InterruptedException e) 
		{ 
			e.printStackTrace(); 
		} 
		System.out.println("State of thread2 when it has finished it's execution - " + 
			thread2.getState()); 
	} 
	
} 

//output:
State of thread1 after creating it - NEW
State of thread1 after calling .start() method on it - RUNNABLE
State of thread2 after creating it - NEW
State of thread2 after calling .start() method on it - RUNNABLE
State of thread2 after calling .sleep() method on it - TIMED_WAITING
State of thread1 while it called join() method on thread2 -WAITING
State of thread2 when it has finished it's execution - TERMINATED

//Explanation: 
When a new thread is created, the thread is in the NEW state. When .start() method is called on a thread, the thread scheduler moves it to Runnable state. Whenever join() method is called on a thread instance, the current thread executing that statement will wait for this thread to move to Terminated state. So, before the final statement is printed on the console, the program calls join() on thread2 making the thread1 wait while thread2 completes its execution and is moved to Terminated state. thread1 goes to Waiting state because it is waiting for thread2 to complete it’s execution as it has called join on thread2.
_____________________________________________________________________________________________________________________

