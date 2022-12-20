/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundachamada;

/**
 *
 * @author D88P
 */
public final class NumException extends Exception {
    
    public NumException(){
        impMsg();
    }
    
    public void impMsg(){
        System.out.println("Valor maior que 1000!");
    }
}
