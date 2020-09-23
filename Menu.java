package view;

import javax.swing.JOptionPane;

import controller.Aluno;

public class Menu {

		public static void main(String[]args){
			String nome , turma,semestre;
			int ra ; 
			
				
			int op=0,pos=0, dado=0;

			while(op!=9){
				op=Integer.parseInt(JOptionPane.showInputDialog("1-Adiciona Temperatura ao Final\n2-Adiciona temperatura ao Início\n3-Adicionar Posição onde sera adicionado temperatura \n4-Remove temperatura Final\n5-Remove temperatura Início\n6-Remove temperatura na Posição desejada \n7-Exibir lista de temperatura \n9-Sair"));
				switch(op){
				case 1:
					
					ra = Integer.parseInt(JOptionPane.showInputDialog("digite o RA"));
					nome = JOptionPane.showInputDialog("Digite Nome do Aluno");
					turma = JOptionPane.showInputDialog("Digite Nome da turma");
					semestre = JOptionPane.showInputDialog("Digite o semestre");
					Aluno aluno = new Aluno(ra , nome , turma,semestre);
					System.out.println(aluno.nome + aluno.ra);
					aluno.AlunoFinal(aluno.ra);
					
					break;
//				case 2:
//					dado=Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
//					tem.TempInicio(dado);
//					break;
//				case 3:
//					dado=Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
//					pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição"));
//					tem.EscolhePosicao(dado, pos);
//					break;
//				case 4:
//					JOptionPane.showMessageDialog(null,"O elemento removido foi:"+tem.RemoveFinal());
//					break;
//				case 5:
//					JOptionPane.showMessageDialog(null,"O elemento removido foi:"+tem.RemoveInicio());
//					break;
//				case 6:
//					pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição"));
//					JOptionPane.showMessageDialog(null, "O elemento removido foi:"+tem.escolheRemove(pos));
//					break;
				//case 7:
				//	JOptionPane.showMessageDialog(null," Lista: " + aluno.percorre() );
				//	break;
				case 9:
					JOptionPane.showMessageDialog(null,"Saindo");
					break;
				default:
					JOptionPane.showMessageDialog(null,"Valor inválido");
				}
			}

		}
	}
	


