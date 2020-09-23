package controller;

import javax.swing.JOptionPane;

public class Aluno {
	
	public int ra ; 
	public String nome;
	public String turma;
	public String semestre;
	private NO inicio;

	public Aluno(int ra, String nome , String turma , String semestre ){
		this.ra = ra ;
		this.nome = nome ;
		this.turma = turma ; 
		this.semestre = semestre;
		inicio = null;
	}

	public void AlunoFinal(int e){
		if (inicio == null){
			if (e != 0 ){
				NO n = new NO(e);
				inicio = n ;
			}
		}
		
		else{
			NO aux = inicio;
			while(aux.prox != null){
				aux = aux.prox;
			}
			NO n = new NO(e);
			aux.prox = n;
		}
	}

	public void TempInicio(int e){
		NO n = new NO(e);
		n.prox = inicio;
		inicio = n;
	}

	public int RemoveFinal(){
		int r =- 1;
		if (inicio == null){
			System.out.println("Lista Vázia");
		}
		else{
			if (inicio.prox == null){
				r = inicio.aluno;
				inicio = null;
			}
			else{
				NO aux1 = inicio;
				NO aux2 = inicio;

				while(aux1.prox != null){
					aux2 = aux1;
					aux1 = aux1.prox;
				}

				r = aux1.aluno;
				aux2.prox = null;
			}
		}
		return r;
	}
	
	   public void EscolhePosicao(int e, int pos){
	        NO novo= new NO(e);

	        if(pos == 1){           
	            TempInicio(e);
	        }
	        else{       
	            NO aux = inicio;
	            int count = 1;
	            
	            while(aux.prox != null && count<pos-1){
	                aux = aux.prox;
	                count++;
	            }
	            
	            if(count == pos-1){  
	                novo.prox = aux.prox;
	                aux.prox = novo;
	            }
	            else{
	            	
	                System.out.println("Posição Inválida!");
	            }            
	        }
	    }
	   
	   
	    public int escolheRemove(int pos){
	        int e =- 1;
	        int i = 1;
	        NO aux = inicio;
	        	         
	        if(inicio == null){
	            System.out.println("Lista Vazia!");
	            return e;
	        }  
	        // TODA VEZ QUE A POS FOR 1, O ITEM REMOVIDO SERÁ O PRIMEIRO
	        if(pos == 1){
	            e = RemoveInicio();
	            return e;
	        }
	        else{           
	            while(aux.prox!=null){
	                aux=aux.prox;
	                i++;
	            }
	            if(pos>i || pos == 0){
	                System.out.println("Posição Invalida!");
	                return e;
	            }
	            else if(pos==i){
	                e = RemoveFinal();
	                return e;
	            }
	            else{
	                aux = inicio;
	                NO aux2 = aux;
	                
	                while(pos>1){
	                    aux2 = aux;
	                    aux = aux.prox;
	                    pos--;
	                }
	                e = aux.aluno;
	                aux2.prox = aux.prox;
	                return e;
	            }
	        }        
	    }
	 

	public int RemoveInicio(){
		int r =- 1;
		if (inicio == null){
			JOptionPane.showMessageDialog(null,"Lista Vázia");
		}
		else{
			r = inicio.aluno;
			inicio = inicio.prox;
		}
		return r;
	}

	public String percorre(){
		NO aux = inicio;
		String r = " ";
		while(aux != null){
			r = r+"\n"+aux.aluno;
				aux = aux.prox;
			}
			return r;
		}
	}


