/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundachamada;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author D88P
 */
public final class Cine extends Point implements Verifica {
    
    private int qtdCad = 0;
    private final Lanche lanche = new Lanche();
    
    
    public void setQtdCad(int qtdCad) {
        this.qtdCad = qtdCad;
    }

    public int getQtdCad() {
        return qtdCad;
    }

    public void setLanche( int qtdLanche, String prato, int preco ) {
        
        this.lanche.setQtdLanche( qtdLanche ); 
        this.lanche.setNome( prato );
        this.lanche.setPrato( prato );
        this.lanche.setPrecoLanche( preco );
        
    }

    public Lanche getLanche() {
        return lanche;
    }
    
    
    
    /**
     * B.2) Na classe Cine acrescerá R$ 10,00 ao valor de valConta, 
     * logo depois deve imprimi-lo.
     **/
    @Override
    public void calcVal() {
        System.out.println("Lanche: " + this.lanche.getPrato( ));
        System.out.println("Valor: " +  this.getValConta( ) );
        System.out.println( "Calculando valor..." );
        this.setValConta( this.getValConta( ) + 10 );
        System.out.println( "Valor Total " + this.getValConta( ) );
    }

    
    /**
     * D) A Interface Verifica contém um método chamado validar(), que:
     *
     * d.2) Na classe Cine verificará o tamanho (comprimento) da String, 
     * armazenada no atributo rua. Se estiver entre 10 e 35 letras imprimirá 
     * na tela “Nome de rua VALIDO para Cine!”, se não, imprimirá: 
     * “Nome de rua INVALIDO para Cine!”
     * 
     */
    @Override
    public void validar() {
        /**
        System.out.println("D) A Interface Verifica contém um método chamado "
                + "validar(), que:\n" +
                " \n" +
                " d.2) Na classe Cine verificará o tamanho (comprimento) da String, \n" +
                " armazenada no atributo rua. Se estiver entre 10 e 35 letras imprimirá \n" +
                " na tela “Nome de rua VALIDO para Cine!”, se não, imprimirá: \n" +
                " “Nome de rua INVALIDO para Cine!”");
        * 
        **/
        
        int comprimento = this.ender.getRua( ).length(  );
        if( comprimento > 10 && comprimento < 35 )
            System.out.println("Nome de rua VALIDO para Cine!");
        else
            System.out.println("Nome de rua INVALIDO para Cine!");
    }
    
}
