/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tcu.coletadeprecos.model;

/**
 *
 * @author x05930906912
 */
public class Empresa {
    
    private String nome;
    private String descricao;
    private double valorUnitario;
    private double valorTotalParcial;
    private int item = 1;
    private int qtd;
    
    public Empresa(){
        
    }
    
    public Empresa(String nome, String descricao, double valorUnitario, double valorTotalParcial, int item, int qtd ){
        this.nome = nome;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.valorTotalParcial = valorTotalParcial;
        this.item = item;
        this.qtd = qtd;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the valorUnitario
     */
    public double getValorUnitario() {
        return valorUnitario;
    }

    /**
     * @param valorUnitario the valorUnitario to set
     */
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    /**
     * @return the valorTotalParcial
     */
    public double getValorTotalParcial() {
        return valorTotalParcial;
    }

    /**
     * @param valorTotalParcial the valorTotalParcial to set
     */
    public void setValorTotalParcial(double valorTotalParcial) {
        this.valorTotalParcial = valorTotalParcial;
    }

    /**
     * @return the item
     */
    public int getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(int item) {
        this.item = item;
    }

    /**
     * @return the qtd
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    
}
