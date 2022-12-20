/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundachamada;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *A classe Point é uma classe abstrata e contém, entre outros 
 * (descritos no diagrama de classes), o método abstrato calcVal(). 
 * Este calculará o valor lançado para o atributo valConta. 
 * Isto ocorrerá apenas para efeito de exibição, não alterando 
 * o valor do atributo. Sendo que
 * 
 * B.1) Na classe Lanche verificará se o valor lançado é ímpar. Caso seja, 
 * deverá imprimir na tela: “Valor ímpar!” se não, imprima “Valor par!” 
 * 
 * B.2) Na classe Cine acrescerá R$ 10,00 ao valor de valConta, 
 * logo depois deve imprimi-lo;
 * 
 * @author D88P
 */
public abstract class Point {
    private String nome     = "";
    private int    valConta = 0;
    Endereco ender = new Endereco( );

    /**
     * Este calculará o valor lançado para o atributo valConta. 
     * Isto ocorrerá apenas para efeito de exibição, não alterando 
     * o valor do atributo. 
     */
    public abstract void calcVal();
    
    ////////////////////////////////////////////////////////////////////////
    
    public String getNome() {
        return nome;
    }

    public int getValConta() {
        return valConta;
    }

    public Endereco getEnder() {
        return ender;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValConta(int valConta) {
        this.valConta = valConta;
    }

    public void setEnder( int num, String rua ) throws NumException {
        try {
            this.ender.setNum( num );
            this.ender.setRua( rua );
        } catch ( NumException ex ) {
            
        }
    }
    
    
}
