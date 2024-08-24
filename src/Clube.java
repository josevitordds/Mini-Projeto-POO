
public class Clube {

	
	    String nome;
	    int pontos;
	    int saldoGols;
	    
	    Clube(String nome, int pontos, int saldoGols) {
	        this.nome = nome;
	        this.pontos = 0;
	        this.saldoGols = 0;
	    }
	    
	    public void ganhar(int saldoGols) {
	        pontos += 3;
	        this.saldoGols += saldoGols;
	    }
	    
	    public void empatar() {
	        pontos += 1;
	    }
	    
	    public void perder(int saldoGols) {
	        this.saldoGols += saldoGols;
	    }
	}
	




