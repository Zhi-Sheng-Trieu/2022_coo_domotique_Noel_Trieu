
public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		Lampe l1=new Lampe("Lampe1");
		t.ajouterAppareil(l1);
		Hifi h1 = new Hifi();
		
		/****** A COMPLETER ******/
		// TODO
		
		TelecommandeGraphique tg=new TelecommandeGraphique(t);

		
	}
	
}
