//Child_Priority.java
import java.util.*;
import java.lang.*; 
  
class Child_Priority extends Thread 
{ 
    public void run() 
    { 
        System.out.println("Inside run method of "+this.getName()); 
    } 
  
    public static void main(String[]args) 
    { 
        // main thread priority is 6 now 
        Thread.currentThread().setPriority(6); 
  
        System.out.println("main thread priority : " + 
                   Thread.currentThread().getPriority()); 
  
        Child_Priority t1 = new  Child_Priority(); 
  
        
        System.out.println("t1 thread priority : "
                                  + t1.getPriority()); 
        t1.setPriority(MAX_PRIORITY);
        System.out.println("t1 thread priority : "
                                  + t1.getPriority());
    } 
}   