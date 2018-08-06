/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaooo_contacorrente;

/**
 *
 * @author 20161bsi0390
 */
public class RevisaoOO_ContaCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContaCorrente cCorrente = new ContaCorrente();
        cCorrente.setSaldo(200);
        
        double resultado = cCorrente.calculaTributos(cCorrente.getSaldo());
        System.out.println("Tributo: " + resultado);
        
    }
    
}
