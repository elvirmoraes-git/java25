/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.segundachamada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author D88P
 */
public class TstPoint {
    
    // Objeto Cine
    private static final Cine cine = new Cine( );
    private static String nomeCine     = "";
    // Cine tem Endereço
    private static int    numeroCine = 0;
    private static String ruaCine    = "";
    
    // Objeto Lanche
    private static String prato          = "";
    private static int    qtdLanche      = 0;
    private static int    precoLanche    = 0;
    
    /**
     * E) A classe TstPoint: será construída de forma a testar 
     * a estrutura do sistema da seguinte forma:
     * E.1) Entradas: os valores serão passados como parâmetros por 
     * meio dos métodos setters apenas para os seguintes atributos: 
     * - nome do cinema; 
     * - rua do cinema; 
     * - numero do prédio do cinema (atributo “num” da classe Endereco)
     * - valConta da lanchonete (que fica dentro do cinema);
     * 
     * Proposta:
     * irAoCinema( ( qualCinema ( ? ) )-> nomeCine )
     * endereçoCine( ruaCine, numerarCine( (numeroCine > 1000 ?)->NumException ) )-> ender
     * comprarIngresso( qtdCad * valContaCine )-> valParcialCine
     * endereçoLanchonete( ruaLanchonete, numeroLanchonete )
     * comprarLanche(  qtdLanche * valLanche )-> valParcialLanche
     * calcularCine( valParcialCine + valParcialLanche )-> valTotal
     * validaCine( endereçoCine )
     * imprimeCinema( nomeCine )
     * imprimeEndereçoCine( ruaCine, numeroCine )
     * imprimeEndereçoLanchonete( ruaLanchonete, numeroLanchonete )
     * imprimeNota( lanche )
     * 
     * @param args 
     * @throws com.mycompany.segundachamada.NumException 
     */
    public static void main( String[] args ) throws NumException {
        // Casos de uso
        while( true ){
            numeroDigitadoMenu = 0;
            System.out.println("");
            System.out.println( "É feriado! Vamos ao Cinema?\n ");
            nomeCine = leitura( "Qual Cinema? " );
            cine.setNome( nomeCine );
            
            System.out.println( "\n1 - Ir ao Cinema" );
            System.out.println( "2 - Vou ficar em casa estudando Java!" );
            System.out.print( "\nLá a gente lancha! bora? " );
            //isNumeroDigitado = false;
            while( !isNumeroDigitado ){
                esperaEntradaDeMenu( );
            }
            switch ( numeroDigitadoMenu ) {
                case 1 -> irAoCinema( );
                case 2 -> ficarEmCasa( );
                default ->{ System.out.println("Decida o que fazer!!!");
                    continue; }
            }
        }
    }
    
    public static String leitura( String mensagem ){
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String retorno = "";

        System.out.print( mensagem );
        
        try {
            while( retorno.isEmpty( ) ){
                retorno = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro de entrada");
        } 
        
        return retorno;
    }

    static List<Cine> cines = new ArrayList<>();
    
    private static void irAoCinema( ) throws NumException {
        
        informarEnderecoCinema( );
        comprarIngressos( );    // valTotalIngressos = ( qtdIngressos * valIngresso )
        comprarLanches( );      // valTotalLanches   = ( qtdLanches   * valLanche   )
        calcularPagamento( );   // totalParaPagar    = ( valTotalIngressos + valTotalLanches )

        imprimirNota( );
    }


    private static int valTotalLanches = 0, qtdLanches = 0;
    
    //private static int valParcialLanche = 0;

    private static void pipocaComGuarana() {
        qtdLanches = 1;
        precoLanche =+ 35;
        prato = "Pipoca com Guaraná";
    }

    private static void hotDogComCocaCola() {
        qtdLanches = 1;
        precoLanche =+ 40;
        prato = "Hot-Dog + Coca-Cola";
    }

    
    private static void informarEnderecoCinema( ) throws NumException {
        
        System.out.println("Indo de Táxi");
        ruaCine  = leitura( "Rua: "    );
        cine.ender.setRua( ruaCine );
        cine.validar( );
        System.out.print( "Numero: " );

        isNumeroDigitado = false;
        while( !isNumeroDigitado ){
            esperaEntradaDeMenu();
        }
        numeroCine = numeroDigitadoMenu;
        try {
            cine.setEnder( numeroCine, ruaCine );
            
        } catch (NumException e) {
            
        }
    }
    // Proteger valor numérico
    public static boolean isNumeroDigitado   = false;
    public static int     numeroDigitadoMenu = 0;
    private static void esperaEntradaDeMenu(){
        numeroDigitadoMenu = 0;
        try {
            numeroDigitadoMenu = Integer.parseInt( leitura( "" ) );
            isNumeroDigitado = true;
            
        } catch (NumberFormatException e) {
            System.out.println("Atenção ao digitar Números");
        }
    }

    private static void ficarEmCasa() {
        System.out.println("Estudando Java Online na UTFPR");
    }

    private static void comprarIngressos( ) {
        
        System.out.println("");
        System.out.println("Comprar Ingressos");
        System.out.println("1 - Comprar Entrada Inteira R$ 50,00" );
        System.out.println("2 - Comprar Meia Entrada R$ 25,00");
        System.out.print( "Qual ingresso comprar? " );
        isNumeroDigitado = false;
        while (!isNumeroDigitado) {            
            esperaEntradaDeMenu( );
        }
        switch (numeroDigitadoMenu) {
            case 1 -> valIngresso += 50;
            case 2 -> valIngresso += 25;
        }
        qtdIngressos++;
        parcialIngresso = 1;
        // calcular valor total gastos com ingressos de cinema.
        valTotalIngressos =+ ( parcialIngresso * valIngresso );
        System.out.println("\nQuantidade: " + qtdIngressos + " Valor: " + valIngresso );
        
    }
    
    private static int  valTotalIngressos = 0, qtdIngressos = 0, valIngresso = 0, parcialIngresso = 0;
    
    private static void comprarLanches() {
        
        System.out.println("");
        System.out.println("Comprar Lanche: " );
        System.out.println("1 - Pipoca  + Guaraná   = R$ 35,00");
        System.out.println("2 - Hot Dog + Coca-Cola = R$ 40,00");
        
        System.out.print( "Escolha seu Lanche: " );
        isNumeroDigitado = false;
        while (!isNumeroDigitado) {            
            esperaEntradaDeMenu();
        }
        switch ( numeroDigitadoMenu ) {
            case 1 -> pipocaComGuarana();
            case 2 -> hotDogComCocaCola();
        }

        valTotalLanches   = ( qtdLanches   * precoLanche );

        cine.setLanche( qtdLanche, prato, precoLanche );
        
    }

    private static void imprimirNota( ) {
        for ( Cine cine : cines ) {
            System.out.println("\n");
            System.out.println("Nome do Cinema: " + cine.getNome( ) );
            System.out.println("Rua: "  + cine.getEnder( ).getRua( ) );
            System.out.println("Número: " + cine.getEnder( ).getNum( ) );
            //System.out.println("Lanche: " + cine.getLanche().getPrato( ) );
            
            cine.validar( );
            cine.calcVal();
            cine.getLanche( ).validar( );
            cine.getLanche( ).calcVal( );
            
        }
    }

    
    private static int totalParaPagar = 0;
    private static void calcularPagamento() {
        
        totalParaPagar = ( valTotalIngressos + valTotalLanches );
        
        cine.setValConta( totalParaPagar );
        cines.add( cine );
    }
    
}
