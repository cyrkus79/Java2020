import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File tekst = new File("plik.txt");
        
        Scanner input = new Scanner(tekst);
        
        int[] wyniki = new int[3];
        char znak;
  
        while (input.hasNext())
        {
            String line = input.nextLine();
            for (int i =0; i<line.length(); i++)
            {
            	++wyniki[0];
            	znak = line.charAt(i);
            	if (Character.isWhitespace(znak))
            	++wyniki[1];
            }
        }
        
        int a = wyniki[1];
        wyniki [2] = a + 1;
            
        System.out.println(Arrays.toString(wyniki));
        
        input.close();
        }
}
