import java.util.Scanner;
public class Teste {

	
	    public static void main(String[] args) {
	    	Clube[] time = new Clube[4];
	    	Scanner n = new Scanner(System.in);
	    	String nome;
	    	
	    	for(int j=0; j<4;j++) {
	    		System.out.println("Adicionar clube:");
	    		nome = n.nextLine();
	    		time[j] = new Clube(nome, 0, 0);
	    	}
	        Campeonato campeonato = new Campeonato(time);
	        campeonato.JogarCampeonato();
	        String[] classificacao = campeonato.getClassificacao();
	        
	        System.out.println("<----Classificação---->");
	        System.out.println(" ");
	        for (int i = 0; i < classificacao.length; i++) {
	            System.out.println("|"+(i + 1) + "º lugar: " + classificacao[i]);
	            System.out.println("-----------------------");
	        }
	        campeonato.getCampeao();
	    }
	
}
