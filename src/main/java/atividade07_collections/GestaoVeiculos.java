package com.mycompany.atividade07_collections;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author D88P
 */
public class GestaoVeiculos {
    
    private static final MenuVeiculos gestao = new MenuVeiculos();
    
    public static void main( String args[] ) {
    // TODO Gestao de automoveis.
        try {
            gestao.menu( );
        } catch ( VelocException e ) {
            // Tudo tratado.
        }
    }  
}
