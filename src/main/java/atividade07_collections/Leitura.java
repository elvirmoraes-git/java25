package com.mycompany.atividade07_collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Elvir Moraes
 * Ra: 02398150
 * Rio de Janeiro, 21/07/2022
 * UTFPR - Universidade Tecnol�gica Federal do Paran�
 *  
 * Classe de Leitura do teclado.
 *
 */
public class Leitura extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public String teclado( String mensagem ) {
		
		InputStreamReader teclado = new InputStreamReader( System.in );
		BufferedReader    memoria = new BufferedReader   ( teclado   );
		
		String entrada = "";
		
		// S� imprime a mensagem se ela n�o for nula.
		System.out.print( !mensagem.equals( null ) ? mensagem : entrada );
		
		// N�o deixe a digita��o ser um "ENTER" no teclado. 
		try{
			while( entrada.isEmpty( ) ) { entrada = memoria.readLine( ); }
		}
		catch( IOException e ){
			System.out.println( "Erro de entrada, verifique o teclado." );
			System.out.println( e.getMessage( ) );
		}
		catch( NumberFormatException e ) {
			System.out.println( "H� somente n�meros no menu." );
			System.out.println( e.getMessage( ) );
		}
		
		return entrada;
		
	}
}