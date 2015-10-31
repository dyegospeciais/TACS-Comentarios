/**Classe para objetos do tipo Funcion�rios, onde ser�o contidos, valores e m�todos para o mesmo.

 * @version 1.05

 * @since Release 02 da aplica��o

 */

 

public class ExemploJavaDoc {

    private String matricula;

    private Double salario;

   

    /** M�todo para retorno da matr�cula do funcion�rio

     *   @return String - Nr da Matr�cula*/

   

    public String getMatricula(){

        return this.matricula;

    }

    

 

    /** M�todo para retorno do sal�rio do funcion�rio

     *   @return Double  - Valor do Sal�rio */

 

    public Double getSalario(){

        return this.salario;

    }

   

    /**M�todo para calculo da di�ria com base no sal�rio do

     * funcion�rio dividido pelo m�s comercial de 30 dias para efeito * de c�lculo de ajuda de custo para viagem.


     * @param  diasViagem int - Valor total das vendas do m�s.

     * @param  valorDeslocamento Double - Valor pago em cada di�ria  despesas b�sicas de deslocamento.

     * @return Double - Valor da diaria

     */

    public Double calculaAjudaCusto(int diasViagem, Double valorDeslocamento) throws ArithmeticException {

        try{

            return (this.salario / 30)*diasViagem+valorDeslocamento;

        }catch (ArithmeticException ae){

            return 0.0;

        }

    }

   

    /**M�todo para calculo do valor da bonifica��o baseada na

     * seguinte faixa de valores: Para vendas menores de

     * 25.000,00, o percentual de comiss�o aplicado ser� de 5%, e * para valores iguais ou maiores de 25.000,00, o percentual

     * ser� de 10%
     
     * @param  valorVendas - Valor total das vendas do m�s

     * @return Double - Valor do resultado do c�lculo conforme a faixa de comiss�es.

     */

    public Double calculaBonificacao(Double valorVendas) {

        if (valorVendas <25000.00 ){

            return this.salario * 0.05;

        } else {

            return this.salario * 0.10;

        }

    }

   

}