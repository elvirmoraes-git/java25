/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundachamada;

/**
 *
 * @author D88P
 */
public final class Endereco {
    private int num = 0;
    String rua = "";

    public int getNum() {
        return num;
    }

    public String getRua() {
        return rua;
    }
    
    /**
     * 
     * 
     * @param num
     * @throws NumException 
     */
    public void setNum( int num ) throws NumException {
        this.num = num;
        if( num > 1000 ){
            throw new NumException();
        }
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
