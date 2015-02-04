/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tcu.coletadeprecos.model;

import java.util.ArrayList;

/**
 *
 * @author x05930906912
 */
public class Planilha {
    
    private ArrayList<Empresa> ListaEmpresa = new ArrayList();

    /**
     * @return the ListaEmpresa
     */
    public ArrayList<Empresa> getListaEmpresa() {
        return ListaEmpresa;
    }

    /**
     * @param ListaEmpresa the ListaEmpresa to set
     */
    public void setListaEmpresa(ArrayList<Empresa> ListaEmpresa) {
        this.ListaEmpresa = ListaEmpresa;
    }
            
}
