// in�cio do programa

// importa o JOptionPane
import javax.swing.JOptionPane;

//Come�a a classe
public class ComentarioRuidoso {

	// Come�a o m�todo
	public static void main(String[] args) {

		// cria um inteiro com o nome de n (n de n�mero)
		int n;

		

		/*
		 * 
		 * 
		 * Na linha seguinte, a vari�vel que criamos anteriormente ir� receber
		 * um n�mero inteiro resultado de um m�todo que estamos chamando dentro
		 * do par�nteses. Esse m�todo faz com que apare�a uma janela onde o usu�rio deve digitar
		 * o n�mero que ele quer atribuir ao n.
		 * 
		 * 
		 * 
		 * 
		 */
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero"));

		/*
		 * O la�o a seguir executa a tabuada para a vari�vel n 
		 * 
		 */

		for (int i = 1; i <= 10; i++) {

			// A linha seguinte exibe a tabuada do inteiro que o usu�rio digitou
			System.out.println(n + " x " + i + " = " + n * i);

		} // fecha o la�o for
	} // termina o m�todo

}// termina a classe

// fim do programa