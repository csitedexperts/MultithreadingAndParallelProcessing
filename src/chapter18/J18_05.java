package chapter18;
/*   J18_05.java   */
/*   Example of Multi-Thread Program */
/*   In implementing Runnable Interface   */
class A05 implements Runnable   // Thread A
{
public void run()
 {
 for(int  i= 1; i<=50; i=i+2)
   {
    System.out.println("Inside Thread A : i = " +i);
   }
  System.out.println("Exit From A.");
  }
}  

class B05 implements Runnable   // Thread B
{
public void run()
 {
  for(int  j= 2; j<=60; j=j+2)
   {
    System.out.println("Inside Thread B : j = " +j);                 
   }
  System.out.println("Exit From B.");
 }
}  

 public class J18_05   // Main Thread
{
 public static void main(String args[])
  {
   A05 ObjA = new A05();  // Creating Object of Thread A
   Thread Th1 = new Thread(ObjA); 

   B05 ObjB = new B05();  // Creating Object of Thread B
   Thread Th2 = new Thread(ObjB); 
   
   System.out.println("Starting Thread A:");
   Th1.start(); //Starting Thread A

   System.out.println("Starting Thread B:");
   Th2.start();  //Starting Thread B
   System.out.println("Exit From Main Thread.");
  }
}  
