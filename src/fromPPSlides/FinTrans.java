package fromPPSlides;
class FinTrans
{
   public static String transName;
   public static double amount;
}
class TransThread extends Thread
{
   private FinTrans ft;
   TransThread (FinTrans ft, String name)
   {
      super (name); 
      this.ft = ft; // Save reference to financial transaction object
   }
   public void run () {
	   for (int count = 1, row = 1; row < 20; row++, count++)
	      {
	           for (int i = 0; i < count; i++)
	                System.out.print ('*');
	           System.out.print ('\n');
	      }
	   }  
   }
   
