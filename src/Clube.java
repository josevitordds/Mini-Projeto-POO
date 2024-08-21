
public class Clube {

	
	    String nome;
	    int pontos;
	    int saldoGols;
	    
	    Clube(String nome, int pontos, int saldoGols) {
	        this.nome = nome;
	        this.pontos = 0;
	        this.saldoGols = 0;
	    }
	    
	    public void ganhar(int saldoGol) {
	        pontos += 3;
	        saldoGols += saldoGol;
	    }
	    
	    public void empatar() {
	        pontos += 1;
	    }
	    
	    public void perder(int saldoGol) {
	        saldoGols += saldoGol;
	    }
	}
	





