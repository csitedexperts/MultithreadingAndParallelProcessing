package fromPPSlides;
class ThreadDemo
{
   public static void main (String [] args)
   {
      MyThread mt = new MyThread ();
      mt.start ();
      for (int i = 0; i < 5; i++)
           System.out.println ("i = " + i + ", i * i = " + i * i);
   }
}