package com.mycompany.atividade07_collections;

import java.util.ArrayList;
import java.util.List;

public class BDVeiculos {
	public static List<Passeio> arrayListPasseio = new ArrayList();
	public static List<Carga>   arrayListCarga  = new ArrayList();
	
        public BDVeiculos( ) {
		// TODO Collections Posso trabalhar com valores nulos.
	}

        public static void cadastrarPasseio( ){
            System.out.println( "Cadastro de Veículos de Passeio." );
            Passeio passeio = new Passeio( );
            arrayListPasseio.add( passeio );
        }
        public static void consultarPasseio( Passeio consulta ){
            System.out.println( "Consultar Veículo de Passeio." );
            for ( Passeio passeio : arrayListPasseio ) {
                if ( passeio.getPlaca( ).equals( consulta.getPlaca( ) ) ) {
                    System.out.println( "Veículo Cadastrado." );
                }else{
                    System.out.println( "Veículo Não Cadastrado." );
                }
            }
        }
        public static void atualizar( Passeio atualiza ){
            System.out.println( "Atualizar Veículo de Passeio." );
            int index = 0;
            for ( Passeio passeio : arrayListPasseio ) {
                if ( passeio.getPlaca( ).equals( atualiza.getPlaca( ) ) ){
                    int novo = Integer.parseInt ( arrayListPasseio.get( index ).toString( ) );
                    
                    
                    arrayListPasseio.add( novo, passeio );
                    System.out.println( "Veículo de Passeio Atualizado com Sucesso." );
                }
                index ++;
            }
            
        }
        public static void excluir(){
            
            
            
        }
}
