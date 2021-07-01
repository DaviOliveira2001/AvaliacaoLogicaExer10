/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaologicaexer10;

/**
 *
 * @author odavi
 */
public class AvaliacaoLogicaExer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, cont, par;
        cont = 0; par = 0;
        
        for(numero = 100; numero >= 1;){
            System.out.println(numero);
            cont+=numero;
            numero--;
            if(numero % 2 == 0){
                par+=1;
            }
        }System.out.println("Houveram "+par+" pares nesta sequência.\nA soma dos números é "+cont);
  }
}
