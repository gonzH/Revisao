/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaooo_comercioeletronico;

import java.util.ArrayList;

/**
 *
 * @author 20161bsi0390
 */
public class Pedido {
    private ArrayList<ItemPedido> pedidos;
    private String fPagamento;
    private int numPedido;
    private String pedidoStatus;
    private boolean foiPago = false; //campo de confirmação

    public ArrayList<ItemPedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<ItemPedido> pedidos) {
        this.pedidos = pedidos;
    }

    public String getfPagamento() {
        return fPagamento;
    }

    public void setfPagamento(String fPagamento) {
        this.fPagamento = fPagamento;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public String getPedidoStatus() {
        return pedidoStatus;
    }

    public void setPedidoStatus(String pedidoStatus) {
        this.pedidoStatus = pedidoStatus;
    }

    public boolean isFoiPago() {
        return foiPago;
    }

    public void setFoiPago(boolean foiPago) {
        this.foiPago = foiPago;
    }
    
    
}
