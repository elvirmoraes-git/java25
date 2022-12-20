/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pos_java_25;

/**
 *
 * @author Elvir Moraes
 */
public class Motor {
    int qtdPist;
    int potencia;

    /**
     * a. Todos os métodos construtores default (que não possuem parâmetros 
     * formais em sua assinatura) deverão iniciar com 0 (zeros) atributos que 
     * sejam de tipos numerais (int, double, float, etc.) e com espaço em 
     * branco (“ “), aqueles que forem de tipo literais (char, String e etc).
     */
    public Motor() {
    }

    public int getQtdPist() {
        return qtdPist;
    }

    public void setQtdPist(int qtdPist) {
        this.qtdPist = qtdPist;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
}
