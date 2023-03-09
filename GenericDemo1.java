package genericdemos;

public class GenericDemo1 <G>
{
	G g1;

	public static void main(String[] args) 
	{

		GenericDemo1 g1 = new GenericDemo1();
		g1.funA(10);
		g1.funA("JYOTSNA");
		g1.funA(true);
		
		
	}
	void funA(G g1)
	{
		System.out.println(g1);
	}

}
