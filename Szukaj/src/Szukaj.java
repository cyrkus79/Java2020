import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;


public class Szukaj 
{

	public static void main(String[] args) throws java.io.IOException
	{
		// TODO Auto-generated method stub
		
		
		System.out.println("Podaj wyra¿enie które chcesz wyszukaæ: ");
		Scanner sc = new Scanner (System.in);
		String slowo = sc.next();
		szukaj("plik.txt", "ma.txt", slowo);
		
		sc.close();

	}
    
	public static void szukaj (String nazwaPlikWe, String nazwaPlikWy, String s³owo) throws java.io.IOException
    {
        File plikWe = new File(nazwaPlikWe);
        File plikWy = new File(nazwaPlikWy);
        if(!plikWe.canRead())
            return;
        
        PrintWriter wypisz = new PrintWriter(plikWy);
        if(!plikWy.canWrite())
            return;
            
        Scanner sc = new Scanner(plikWe);
        while(sc.hasNext())
        {
            String line = sc.nextLine();
            if(line.contains(s³owo))
                wypisz.println(line);
        }
        wypisz.close();
    }

}


