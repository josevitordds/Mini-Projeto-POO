import java.util.Random;
public class Campeonato {
	  Clube[] clubes;
	  
	  Campeonato(Clube[] time){
			  this.clubes = time;
	  }
	     
	  public  void JogarCampeonato(){
	    	for(int i=0; i<clubes.length;i++) {
	    		for(int j=0; j<clubes.length;j++ ) {
	    		   if(i!=j) {
	    			  jogarPartida(clubes[i], clubes[j]);
	    			
	    	    		
	    		   }
	    		}
	    	}
	    }
	    
	   public void  jogarPartida(Clube time1, Clube time2) {
	    	Random random = new Random();
	    	int gol1 = random.nextInt(6);
	    	int gol2 =  random.nextInt(6);
	    
	    	 System.out.println(time1.nome + " " +" vs "+" "+time2.nome);
	    	if(gol1>gol2) {
	    		
	    		System.out.println( time1.nome +": " + " " + (gol1)+ " "+ "gols" );
	    		System.out.println( time2.nome +": " + " " + (gol2)+ " "+ "gols");
	    		System.out.println( time1.nome+ " " +"Venceu!" );
	    		System.out.println("--------------------------");
				time1.ganhar(gol1-gol2);
				time2.perder(gol2-gol1);
				
			}else if(gol2>gol1){
				
				System.out.println( time1.nome +": " + " " + (gol1)+ " "+ "gols");
	    		System.out.println( time2.nome +": " + " " + (gol2)+ " "+ "gols");
	    		System.out.println(time2.nome+ " " +"Venceu!" );
	    		System.out.println("--------------------------");
				time1.perder(gol1-gol2);
				time2.ganhar(gol2-gol1);
			}else {
				
				System.out.println(time1.nome +": " +  " " + (gol1)+ " "+ "gols");
	    		System.out.println( time2.nome +": " +  " " + (gol2)+ " "+ "gols");
	    		System.out.println("Empate!" );
	    		System.out.println("--------------------------");
				time1.empatar();
				time1.empatar();
				
			}
	    	 System.out.println(" ");
	    
	    }
	
	   public String[] getClassificacao() {
	        String[] classif = new String[4];
	        for (int i = 0; i < clubes.length - 1; i++) {
	            for (int j = 0; j < clubes.length - 1 - i; j++) {
	                if (clubes[j].pontos < clubes[j + 1].pontos) {
	               
	                    Clube temporario = clubes[j];
	                    clubes[j] = clubes[j + 1];
	                    clubes[j + 1] = temporario;
	                } else if (clubes[j].pontos == clubes[j + 1].pontos) {
	                    if (clubes[j].saldoGols < clubes[j + 1].saldoGols) {
	                 
	                        Clube temporario = clubes[j];
	                        clubes[j] = clubes[j + 1];
	                        clubes[j + 1] = temporario;
	                    }
	                }
	            }
	        }
	        for (int i = 0; i < clubes.length; i++) {
	            classif[i]= clubes[i].nome + "- " + "Pontos:" + clubes[i].pontos+ " "  + "Saldo de Gols:" + clubes[i].saldoGols ;
	        }
	        
        return classif;

	    }
	    public void getCampeao() {
	    	 System.out.println("O campeão é " + clubes[0].nome);
	    }
	    
}


