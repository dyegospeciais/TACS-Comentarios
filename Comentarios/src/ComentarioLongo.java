import javax.swing.JOptionPane;



public class ComentarioLongo{
	
	public static void main(String[] args) {

		
		/*
		 *  Boa noite,
		 *  
		 *  
		 *  
		 *  o espa�o destinado a coment�rios deve ser utilizado para 
		 *  anota��es referentes ao c�digo que segue, ou pelo menos 
		 *  referente a c�digos. Muitas vezes s�o esses espa�os s�o utilizados para
		 *  logs e manter controle do hist�rico de altera��es, o que aumenta bastante
		 *  as linhas da classe sem acrescentar
		 *  em nada ao programa.
		 *  Outra boa
		 *  pr�tica seria
		 *  aproveitar o espa�o
		 *  das linhas para
		 *  dizer o que deve
		 *  ser dito em vez
		 *  de ocupar v�rias
		 *  linhas para n�o
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