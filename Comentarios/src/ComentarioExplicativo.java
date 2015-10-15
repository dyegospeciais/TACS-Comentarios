import javax.swing.JOptionPane;



public class ComentarioExplicativo {
	public static void main(String[] args) {

		
		//cria variável n
		int n;

		//recebe valor da variável n 
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero"));

		/*
		 * O laço a seguir executa a tabuada
		 * para a variável n 
		 *  
		 */
		
		for (int i = 1; i <= 10; i++) {
			
			// Imprime no console a tabuada do inteiro n
			System.out.println(n + " x " + i + " = " + n * i);
		}
	}

}