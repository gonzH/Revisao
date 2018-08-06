/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaooo_aeroporto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 20161bsi0390
 */
public class Aeroporto {
    private String codigo;
    private String nome;
    private boolean internacional;
    private ArrayList<Aeroporto> aeroportosIN = new ArrayList<>(); // de onde sai avião
    private ArrayList<Aeroporto> aeroportosOUT = new ArrayList<>(); // pra onde vai avião 
    private ArrayList<Aviao> patio = new ArrayList<>();

    //metodos
    public void ehInter() {
        String votoS = JOptionPane.showInputDialog("1 Para internacional\n 0 Para nacional");
        int voto = Integer.parseInt(votoS);
        if(voto == 1) {
            setInternacional(true);
        }
        else {
            setInternacional(false);
        }
    }
    
    public void verificaInter() {
        if(isInternacional() == true) {
            JOptionPane.showMessageDialog(null, "Aeroporto Internacional");
        }    
        else {
            JOptionPane.showMessageDialog(null, "Aeroporto Nacional");
        }
    }
    
    public boolean equals(Aeroporto aeroporto) {
        boolean resultado = (this.nome+this.codigo).equalsIgnoreCase(aeroporto.nome+aeroporto.codigo);
        return resultado;
    }
    
    public boolean isPousado(String prefixo) {
        for(Aviao aviao : this.patio) {
            
            if(aviao.getPrefixo().equalsIgnoreCase(prefixo)) {
                return true;
            }
        }
        return false;
    }
    
    //gets e sets
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isInternacional() {
        return internacional;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }

    public ArrayList<Aeroporto> getAeroportosIN() {
        return aeroportosIN;
    }

    public void setAeroportosIN(ArrayList<Aeroporto> aeroportosIN) {
        this.aeroportosIN = aeroportosIN;
    }

    public ArrayList<Aeroporto> getAeroportosOUT() {
        return aeroportosOUT;
    }

    public void setAeroportosOUT(ArrayList<Aeroporto> aeroportosOUT) {
        this.aeroportosOUT = aeroportosOUT;
    }

    public ArrayList<Aviao> getPatio() {
        return patio;
    }

    public void setPatio(ArrayList<Aviao> patio) {
        this.patio = patio;
    }
    
    
    
    
}
