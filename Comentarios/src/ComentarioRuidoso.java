// início do programa

// importa o JOptionPane
import javax.swing.JOptionPane;

//Começa a classe
public class ComentarioRuidoso {

	// Começa o método
	public static void main(String[] args) {

		// cria um inteiro com o nome de n (n de número)
		int n;

		

		/*
		 * 
		 * 
		 * Na linha seguinte, a variável que criamos anteriormente irá receber
		 * um número inteiro resultado de um método que estamos chamando dentro
		 * do parênteses. Esse método faz com que apareça uma janela onde o usuário deve digitar
		 * o número que ele quer atribuir ao n.
		 * 
		 * 
		 * 
		 * 
		 */
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero"));

		/*
		 * O laço a seguir executa a tabuada para a variável n 
		 * 
		 */

		for (int i = 1; i <= 10; i++) {

			// A linha seguinte exibe a tabuada do inteiro que o usuário digitou
			System.out.println(n + " x " + i + " = " + n * i);

		} // fecha o laço for
	} // termina o método

}// termina a classe

// fim do programa