import javax.swing.JOptionPane;



public class ComentarioLongo{
	
	public static void main(String[] args) {

		
		/*
		 *  Boa noite,
		 *  
		 *  
		 *  
		 *  o espaço destinado a comentários deve ser utilizado para 
		 *  anotações referentes ao código que segue, ou pelo menos 
		 *  referente a códigos. Muitas vezes são esses espaços são utilizados para
		 *  logs e manter controle do histórico de alterações, o que aumenta bastante
		 *  as linhas da classe sem acrescentar
		 *  em nada ao programa.
		 *  Outra boa
		 *  prática seria
		 *  aproveitar o espaço
		 *  das linhas para
		 *  dizer o que deve
		 *  ser dito em vez
		 *  de ocupar várias
		 *  linhas para não
		 *  dizer nada.
		 * 
		 * 
		 * Obrigado.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		int n;

		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero"));

		
		for (int i = 1; i <= 10; i++) {
			
		
			System.out.println(n + " x " + i + " = " + n * i);
		}
	}

}