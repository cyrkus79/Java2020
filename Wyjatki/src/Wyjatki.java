
public class Wyjatki {

	public static void main(String[] args) throws Exception
	{
		try 
		{
			Wyjatki n = new Wyjatki();
			n.wypisz(null);
		} 
		catch (NullPointerException e) 
		{
			throw new Exception(e);
		}
	}

	
	void wypisz (String s)
	{
		System.out.println(s.length());
	}
}
