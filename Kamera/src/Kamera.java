import java.util.Scanner;
public class Kamera {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Program zwraca ilo�� zdj�� wykonannych kamer� 40x40 na dowolnym prostok�cie");
		System.out.println("Podaj wymiar pierwszego boku prostok�ta");
		int a = input.nextInt();
		System.out.println("Podaj wymiar drugiego boku prostok�ta");
		int b = input.nextInt();
//		Rectangle prostokat = new Rectangle (0, 0, a, b);
		Punkt punkt = new Punkt();
		punkt.ustawX (0);
		punkt.ustawY (0);
		
		int osx=punkt.wspX;
		int osy=punkt.wspY;
		int foto = 0;
		
		while(osy <= a)
		{
			while(osx < b)
			{
				osx+=40;
				foto+=1;
			}
			osy+=40;
			
			if(osy<a)
			{
				while(osx > 0)
				{
					osx -= 40;
					foto+=1;
				}
			}
			osx = 0;
			osy+=40;
		}
		
		System.out.println("Wykonano "+foto+" zdj��");
		
		}
	}