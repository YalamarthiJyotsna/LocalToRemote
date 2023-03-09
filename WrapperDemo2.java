package wrapperdemo2;

public class WrapperDemo2
{
	  
	
	public static void main(String[] args)
	{
		
		  
		String  ticketCharge ="$5000";
		int charge = Integer.parseInt(ticketCharge);
		System.out.println(charge);

		int ccBalance = 4000; 
	//	ticketCharge.replace('$', ' ');
  //    if(ccBalance >= ticketcharge)
  
    	  
          if(ccBalance >=charge)
          {
    	System.out.println("Book the ticket");
          }
    	
      
          else 
          {
          	System.out.println("Insufficient funds");
  
          }
		
		 
		
	}

}
