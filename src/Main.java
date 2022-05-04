
public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		Lampe l1=new Lampe("Lampe1");
		t.ajouterAppareil(l1);
		Hifi h1 = new Hifi();
		t.ajouterAppareil(h1);
		ManipuleChemineeAttribut c1 = new ManipuleChemineeAttribut(new Cheminee());
		t.ajouterAppareil(c1);

		/****** A COMPLETER ******/
		// TODO
		
		TelecommandeGraphique tg=new TelecommandeGraphique(t);

		
	}
	
}
