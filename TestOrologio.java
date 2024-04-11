
public class TestOrologio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Orologio mioOrologio = new Orologio();
		System.out.println(mioOrologio);
		
		boolean risultato = mioOrologio.setMinuti(52);
		if(risultato)
			System.out.println(" Minuti impostati con successo! ");
		
		
		if(mioOrologio.setOra(12))
			System.out.println(" Orario impostato con successo! ");
		else
			System.out.println(" Orario inserito NON correttamente! ");
		
		
		if(mioOrologio.setMinuti(70))
			System.out.println(" Minuti impostati con successo! ");
		else
			System.out.println(" Minuti inseriti NON correttamente! ");
		
		System.out.println(mioOrologio);

	}

}
