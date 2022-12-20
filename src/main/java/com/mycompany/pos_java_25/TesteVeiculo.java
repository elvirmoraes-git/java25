/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pos_java_25;

import java.util.Scanner;

/**
 *
 * @author Elvir Moraes
 * 
 * b. A classe “Teste” deve ser construída de forma a testar todas as 
 * funcionalidades do programa. 
 * Nesta deverão ser implementadas as entradas de dados e a impressão 
 * destes na tela. 
 * Por meio dela deverá ser possível instanciar 5 veículos.
 * 
 * c. Perceba que, de acordo com as associações descritas no diagrama de 
 * classes e suas cardinalidades, a classe “Teste” irá conter apenas objetos 
 * do tipo “Veiculo”. Em momento nenhum deverá conter objetos do tipo Motor. 
 * No entanto deverá, por meio de um objeto do tipo Veiculo, instanciar os 
 * atributos do objeto atributo motor, contido na classe Veiculo, 
 * que é do tipo Motor.
 * d. Perceba que a classe Veículo POSSUI um atributo do tipo Motor.
 *  
 * 
 * 
 */
public class TesteVeiculo {

    static Scanner   sc       = new Scanner(System.in);
    static Veiculo[] veiculos = new Veiculo[3];
    static Veiculo   veiculo;
    
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println( "Gestão de Veículos"              );
        System.out.println( "1- Cadastro de Veículos"         );
        System.out.println( "2- Imprimir Veículos cadastrados");
        System.out.println( "Escolha opção"                   );
        
        int x = Integer.parseInt( sc.next( ) );
        
        if( x == 1){
            veiculo = new Veiculo();
            cadastrar( veiculo );
        }else if( x == 2 ){
            imprimir();
        }else{
            menu();
        }
        
    }

    private static void cadastrar( Veiculo veiculo  ) {
        
        for( int i = 0; i < veiculos.length; i++ ){

            System.out.println( "Informe a placa: "  );
            veiculo.setPlaca( sc.next( ) );
            System.out.println( "Informe a marca: "  );
            veiculo.setMarca( sc.next( ) );
            System.out.println( "Informe o modelo: " );
            veiculo.setModelo( sc.next( ) );
            System.out.println( "Informe a cor: "    );
            veiculo.setCor( sc.next( ) );
            System.out.println( "Informe a Velocidade Maxima: " );
            veiculo.setVelocMax( sc.nextFloat( ) );
            System.out.println( "Informe quantidade de rodas: " );
            veiculo.setQtdRodas( sc.nextInt( ) );
            System.out.println( "Informe quantidade Pistão: "   );
            veiculo.setQtdPist( sc.nextInt( ) );
            System.out.println( "Informe a Pontência: "         );
            veiculo.setPotencia( sc.nextInt( ) );
            veiculos[i] = veiculo;
            menu();
        }
                
    }
    
    private static void imprimir() {
        
        for( int i=0; i <= veiculos.length; i++ ){
            veiculo = veiculos[i];
            System.out.println( "Placa: "                + veiculo.getPlaca()   );
            System.out.println( "Marca: "                + veiculo.getMarca()   );
            System.out.println( "Modelo: "               + veiculo.getModelo()  );
            System.out.println( "Cor: "                  + veiculo.getCor()     );
            System.out.println( "Velocidade Máxima: "    + veiculo.getVelocMax());
            System.out.println( "Quantidade de Rodas: "  + veiculo.getQtdRodas());
            System.out.println( "Quantidade de Pistão: " + veiculo.getQtdPist() );
            System.out.println( "Potência: "             + veiculo.getPotencia());
        }
        menu();
    }
}
