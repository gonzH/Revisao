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
public class ContaCorrente extends Conta implements ITributavel {
    
    
    public double calculaTributos(double saldo) {
        double resultado = saldo - (saldo*0.1);
        return resultado;
    }
    
    
    
}
