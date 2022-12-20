/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundachamada;

/**
 *
 * @author D88P
 */
public final class Lanche extends Point implements Verifica {
    
    private String prato    = "";
    private int qtdLanche   = 0;
    private int precoLanche = 0;

    public void setPrecoLanche(int precoLanche) {
        this.precoLanche = precoLanche;
    }

    public int getPrecoLanche() {
        return precoLanche;
    }
    
    public void setQtdLanche(int qtdLanche) {
        this.qtdLanche = qtdLanche;
    }

    public int getQtdLanche() {
        return qtdLanche;
    }
    
    
    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }
    
 /**
 * A classe Point é uma classe abstrata e contém, entre outros 
 * (descritos no diagrama de classes), o método abstrato calcVal(). 
 * Este calculará o valor lançado para o atributo valConta. 
 * Isto ocorrerá apenas para efeito de exibição, não alterando 
 * o valor do atributo. Sendo que
 * 
 * B.1) Na classe Lanche verificará se o valor lançado é ímpar. Caso seja, 
 * deverá imprimir na tela: “Valor ímpar!” se não, imprima “Valor par!” 
 * 
 * CLASSE LANCHE
 * 
 * @author D88P
 */
    @Override
    public void calcVal() {
        if( this.getValConta( ) % 2 != 0 )
            System.out.println("Valor ímpar!");
        else
            System.out.println("Valor par!");
    }

    /**
     * D) A Interface Verifica contém um método chamado validar(), que:
     * 
     * d.1) E, na classe Lanche, imprimirá a primeira letra da String 
     * que define o prato. 
     * 
     */
    @Override
    public void validar() {
        /**
        System.out.println("D) A Interface Verifica contém um método chamado validar(), que:\n" +
        " \n" +
        " d.1) E, na classe Lanche, imprimirá a primeira letra da String \n" +
        " que define o prato.");
        * 
        **/
        char letra = this.getPrato( ).charAt( 0 );
        System.out.println( "Primeira letra do prato: " +  letra ); 
    }
    
    
    
}
