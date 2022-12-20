/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade07_collections;

import static com.mycompany.atividade07_collections.TstCollect.leitura;

/**
 *
 * @author D88P
 */
public class MenuVeiculos {
    
    private TstCollect veiculos = new TstCollect();
    
    
    public void menu( ) throws VelocException {
        // TODO Menu do Sistema.
        int     opcao    = 0;
        boolean continua = true;
        
        while( continua ){
            
            System.out.println( "\n--------------------------------------------" );
            System.out.println( "Gestão de Veículos - Menu Inicial" + "\n"       );
            System.out.println( "1. Cadastrar Veículo de Passeio."               );
            System.out.println( "2. Cadastrar Veículo de Carga."                 );
            System.out.println( "3. Imprimir Todos os Veículos de Passeio."      );
            System.out.println( "4. Imprimir Todos os Veículos de Carga."        );
            System.out.println( "5. Imprimir Veículo de Passeio pela Placa"      );
            System.out.println( "6. Imprimir Veículo de Carga pela Placa."       );
            System.out.println( "7. Sair do Sistema"                             );
            System.out.println( "--------------------------------------------"   );
            
            try {
                opcao = Integer.parseInt( leitura.teclado( "Escolha uma opção: " ) );
                
            } catch ( NumberFormatException nfe ) {
                // TODO O menu aparece na tela.
                leitura.teclado("Deve ser um valor inteiro. Pressione <Enter> para continuar.");
                // Caractere digitado.
                //System.out.println( nfe.getMessage( ) );
                continue;
                
            }
            
            switch ( opcao ) {
                // 1. Cadastrar Veículo de Passeio.
                case 1:
                    veiculos.cadastrarPasseio( );
                    break;
                    // 2. Cadastrar Veículo de Carga
                case 2:
                    veiculos.cadastrarCarga();
                    break;
                    // 3. Imprimir Todos os Veículos de Passeio
                case 3:
                    veiculos.imprimirTodosPasseio( );
                    break;
                    // 4. Imprimir Todos os Veículos de Carga
                case 4:
                    veiculos.imprimirTodosCarga();
                    break;
                    // 5. Imprimir Veículo de Passeio pela Placa
                case 5:
                    veiculos.imprimirPasseioPelaPlaca( );
                    break;
                    // 6. Imprimir Veículo de Carga pela Placa.
                case 6:
                    veiculos.imprimirCargaPelaPlaca( );
                    break;
                    // 7. Sair do Sistema.
                case 7:
                    leitura.teclado( "A opção deve estar entre 01 e 07." );
                    continua = false;
                    //System.exit( 0 );
                    break;
            }
        }
        
    }
    
    
}
