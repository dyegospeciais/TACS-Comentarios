import javax.swing.JOptionPane;



public class ComentarioExplicativo {
	public static void main(String[] args) {

		
		//cria vari�vel n
		int n;

		//recebe valor da vari�vel n 
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero"));

		/*
		 * O la�o a seguir executa a tabuada
		 * para a vari�vel n 
		 *  
		 */
		
		for (int i = 1; i <= 10; i++) {
			
			// Imprime no console a tabuada do inteiro n
			System.out.println(n + " x " + i + " = " + n * i);
		}
	}

}