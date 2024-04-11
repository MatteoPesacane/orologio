
public class Orologio {
	
	private int ore;
	private int minuti;
	
	
	public int getOre() {
		return this.ore; 
	}
	
	public int getMinuti() {
		return this.minuti;
	}
	
	public String toString() {
		return this.ore + ":" + this.minuti;
	}

	public boolean setOra(int ora) {
		if(ora >= 0 && ora < 24) {
			this.ore = ora;
			return true;
		}
		return false;
	}
	
	public boolean setMinuti(int minuto) {
		if(minuto >= 0 && minuto <= 59) {
			this.minuti = minuto;
			return true;
		}
		return false;
	}
	
}
