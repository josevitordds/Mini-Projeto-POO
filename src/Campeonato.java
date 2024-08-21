import java.util.Random;
public class Campeonato {
	  Clube[] time;
	  
	  Campeonato(Clube[] time){
			  this.time = time;
	  }
	     
	  public  void JogarCampeonato(){
	    	for(int i=0; i<time.length;i++) {
	    		for(int j=0; j<time.length;j++ ) {
	    		   if(i!=j) {
	    			  jogarPartida(time[i], time[j]);
	    			
	    	    		
	    		   }
	    		}
	    	}
	    }
	    
	   public void  jogarPartida(Clube tim1, Clube tim2) {
	    	Random random = new Random();
	    	int gol1 = random.nextInt(6);
	    	int gol2 =  random.nextInt(6);
	    
	    	 System.out.println(tim1.nome + " " +" vs "+" "+tim2.nome);
	    	if(gol1>gol2) {
	    		
	    		System.out.println( tim1.nome +": " + " " + (gol1)+ " "+ "gols" );
	    		System.out.println( tim2.nome +": " + " " + (gol2)+ " "+ "gols");
	    		System.out.println( tim1.nome+ " " +"Venceu!" );
	    		System.out.println("--------------------------");
				tim1.ganhar(gol1-gol2);
				tim2.perder(gol2-gol1);
				
			}else if(gol2>gol1){
				
				System.out.println( tim1.nome +": " + " " + (gol1)+ " "+ "gols");
	    		System.out.println( tim2.nome +": " + " " + (gol2)+ " "+ "gols");
	    		System.out.println(tim2.nome+ " " +"Venceu!" );
	    		System.out.println("--------------------------");
				tim1.perder(gol1-gol2);
				tim2.ganhar(gol2-gol1);
			}else {
				
				System.out.println(tim1.nome +": " +  " " + (gol1)+ " "+ "gols");
	    		System.out.println( tim2.nome +": " +  " " + (gol2)+ " "+ "gols");
	    		System.out.println("Empate!" );
	    		System.out.println("--------------------------");
				tim1.empatar();
				tim1.empatar();
				
			}
	    	 System.out.println(" ");
	    
	    }
	
	   public String[] getClassificacao() {
	        String[] classif = new String[4];
	        for (int i = 0; i < time.length - 1; i++) {
	            for (int j = 0; j < time.length - 1 - i; j++) {
	                if (time[j].pontos < time[j + 1].pontos) {
	               
	                    Clube temporario = time[j];
	                    time[j] = time[j + 1];
	                    time[j + 1] = temporario;
	                } else if (time[j].pontos == time[j + 1].pontos) {
	                    if (time[j].saldoGols < time[j + 1].saldoGols) {
	                 
	                        Clube temporario = time[j];
	                        time[j] = time[j + 1];
	                        time[j + 1] = temporario;
	                    }
	                }
	            }
	        }
	        for (int i = 0; i < time.length; i++) {
	            classif[i]= time[i].nome + "- " + "Pontos:" + time[i].pontos+ " "  + "Saldo de Gols:" + time[i].saldoGols ;
	        }
	        
        return classif;

	    }
	    public void getCampeao() {
	    	 System.out.println("O campeao é " + time[0].nome);
	    }
	    
}


