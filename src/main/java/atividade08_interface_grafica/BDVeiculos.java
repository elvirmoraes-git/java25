package com.mycompany.atividade08_interface_grafica;

import java.util.ArrayList;
import java.util.List;

public class BDVeiculos {

    public static List<Veiculo> listaDeVeiculos = new ArrayList( );

    public static List<Veiculo> getListaDeVeiculos( ){
        
        return listaDeVeiculos;
    }
    
    public BDVeiculos( ) {
    // TODO Collections Posso trabalhar com valores nulos.
        
    }
    
    public static boolean remover( String placa ){
        
        if( !placa.isBlank( ) && !placa.isEmpty( ) && placa != null ){
            for ( Veiculo veiculo : listaDeVeiculos ) {
                if( veiculo.getPlaca( ).equals(placa) ){
                    listaDeVeiculos.remove( veiculo );
                }
            }
        
        }
    
        return true;
    }
}
