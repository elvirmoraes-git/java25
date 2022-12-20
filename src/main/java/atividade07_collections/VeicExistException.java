package com.mycompany.atividade07_collections;

public class VeicExistException extends Exception {

    
    public static BDVeiculos banco = new BDVeiculos();
    
    static boolean verifica( String placa ) {//throws NullPointerException
        boolean existe = false;
        
        for( int i = 0; i < BDVeiculos.arrayListPasseio.size( ); i++ ){
            if( BDVeiculos.arrayListPasseio.get(i).getPlaca( ).equals( placa ) ) {
                existe = true;
            }
        }
        for( int i = 0; i < BDVeiculos.arrayListCarga.size( ); i++ ){
            if ( BDVeiculos.arrayListCarga.get(i).getPlaca( ).equals( placa ) ) {
                existe = true;
            } 
            
        }
        if( !existe ){
            System.out.println( "Veículo não Cadastrado." );
        }
        return existe;
    }
	
    public VeicExistException() {
        // TODO Auto-generated constructor stub
    }
}
