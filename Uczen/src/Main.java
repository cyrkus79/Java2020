
public class Main {

	public static void main(String[] args) 
	{
        UczenKlasy uczen = new UczenKlasy();
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Podaj imiê ucznia:");
        uczen.UstawImie(sc.nextLine());
        System.out.println("Podaj nazwisko ucznia:");
        uczen.UstawNazwisko(sc.nextLine());
        System.out.println("Podaj PESEL ucznia:");
        uczen.UstawPesel(sc.nextLine());
        System.out.println("Podaj klasê ucznia:");
        uczen.UstawKlase(sc.nextInt());
        
        System.out.println(uczen);
        sc.close();

	}

}
