
public class UczenKlasy extends UczenSzkoly
{
	int klasa;
	
	public void UstawKlase (int klasa)
	{
		this.klasa = klasa;
	}
	
	public String toString() 
	{ 
	    return String.format(Imie + " " + Nazwisko + " (" + Pesel + "), klasa " + klasa);
	}
}
