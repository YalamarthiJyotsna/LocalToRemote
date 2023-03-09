package wrapperdemo2;

public class WrapperDemo1 
    {

	public static void main(String[] args)
	{
    int a= 10;
    Integer i1 = new Integer(a); //BOXING
    int b = i1.intValue(); //UnBoxing
    System.out.println(b);
    Integer i2 = 20; //new Integer(20);//Auto boxing
    int c =i2;      // i2.intValue (); //Auto Unboxing
    System.out.println(c);
    boolean b1 = true; // new boolean(true);
   
    boolean b2 = b1; //b1.booleanValue();
    System.out.println(b2);
    
    
	}

}
