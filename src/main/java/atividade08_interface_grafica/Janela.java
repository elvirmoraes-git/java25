/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atividade08_interface_grafica;

import static com.mycompany.atividade08_interface_grafica.BDVeiculos.listaDeVeiculos;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author D88P
 */
public class Janela implements ActionListener {

    static Janela j = new Janela();

    static final String taraName           = "Tara: ";
    static final String cargaMaximaName    = "Carga Máx.: ";
    static final String qtdPassageirosName = "Qtd.Passageiros: ";
    static final String placaName          = "Placa: "          ;
    static final String marcaName          = "Marca: "          ;
    static final String modeloName         = "Modelo: "         ;
    static final String corName            = "Cor: "            ;
    static final String qtdRodasName       = "Qtd. Rodas"       ;
    static final String velocMaxName       = "Velocidade Máx.: ";
    static final String qtdPistoesName     = "Qtd. Pistões: "   ;
    static final String potenciaName       = "Potência: "       ;
    
    public static void configuraInterfaceGrafica( ) {
        
        // Frame Cadastro de Passeio.
        labelQtdPassageiros       .setText( qtdPassageirosName );
        labelPlacaPasseio         .setText( placaName          );
        labelMarcaPasseio         .setText( marcaName          );
        labelModeloPasseio        .setText( modeloName         );
        labelCorPasseio           .setText( corName            );
        labelQtdRodasPasseio      .setText( qtdRodasName       );
        labelVelocMaxPasseio      .setText( velocMaxName       );
        labelQtdPistoesPasseio    .setText( qtdPistoesName     );
        labelPotenciaPasseio      .setText( potenciaName       );
        // Largura Campos de Entrada de texto Cadastro de Passeio.
        txtQtdPassageiros   .setColumns( 20 );
        txtPlacaPasseio     .setColumns( 20 );
        txtMarcaPasseio     .setColumns( 20 );
        txtModeloPasseio    .setColumns( 20 );
        txtCorPasseio       .setColumns( 20 );
        txtQtdRodasPasseio  .setColumns( 20 );
        txtVelocMaxPasseio  .setColumns( 20 );
        txtQtdPistoesPasseio.setColumns( 20 );
        txtPotenciaPasseio  .setColumns( 20 );
        // Frame Cadastro de Carga
        labelTaraCarga       .setText( taraName        );
        labelCargaMaximaCarga.setText( cargaMaximaName );
        labelPlacaCarga      .setText( placaName       );
        labelMarcaCarga      .setText( marcaName       );
        labelModeloCarga     .setText( modeloName      );
        labelCorCarga        .setText( corName         );
        labelQtdRodasCarga   .setText( qtdRodasName    );
        labelVelocMaxCarga   .setText( velocMaxName    );
        labelQtdPistoesCarga .setText( qtdPistoesName  );
        labelPotenciaCarga   .setText( potenciaName    );
        // Largura de Campos de Entrada de Textos Cadastro de Carga.
        txtTaraCarga       .setColumns( 20 );
        txtCargaMaximaCarga.setColumns( 20 );
        txtPlacaCarga      .setColumns( 20 );
        txtMarcaCarga      .setColumns( 20 );
        txtModeloCarga     .setColumns( 20 );
        txtCorCarga        .setColumns( 20 );
        txtQtdRodasCarga   .setColumns( 20 );
        txtVelocMaxCarga   .setColumns( 20 );
        txtQtdPistoesCarga .setColumns( 20 );
        txtPotenciaCarga   .setColumns( 20 );
    }

    public static void configFormularioCadastroVeiculos( int veiculo ) {
        
        switch ( veiculo ) {
            case 1 -> {
                labelQtdPassageiros       .setText( qtdPassageirosName );
                labelPlacaPasseio         .setText( placaName          );
                labelMarcaPasseio         .setText( marcaName          );
                labelModeloPasseio        .setText( modeloName         );
                labelCorPasseio           .setText( corName            );
                labelQtdRodasPasseio      .setText( qtdRodasName       );
                labelVelocMaxPasseio      .setText( velocMaxName       );
                labelQtdPistoesPasseio    .setText( qtdPistoesName     );
                labelPotenciaPasseio      .setText( potenciaName       );
                
                txtPlacaPasseio     .setColumns( 20 );
                txtQtdPassageiros   .setColumns( 20 );
                txtMarcaPasseio     .setColumns( 20 );
                txtModeloPasseio    .setColumns( 20 );
                txtCorPasseio       .setColumns( 20 );
                txtQtdRodasPasseio  .setColumns( 20 );
                txtVelocMaxPasseio  .setColumns( 20 );
                txtQtdPistoesPasseio.setColumns( 20 );
                txtPotenciaPasseio  .setColumns( 20 );
            }
            case 2 -> {
                
                labelTaraCarga       .setText( taraName        );
                labelCargaMaximaCarga.setText( cargaMaximaName );
                labelPlacaCarga      .setText( placaName       );
                labelMarcaCarga      .setText( marcaName       );
                labelModeloCarga     .setText( modeloName      );
                labelCorCarga        .setText( corName         );
                labelQtdRodasCarga   .setText( qtdRodasName    );
                labelVelocMaxCarga   .setText( velocMaxName    );
                labelQtdPistoesCarga .setText( qtdPistoesName  );
                labelPotenciaCarga   .setText( potenciaName    );
                // Largura de Campos de Entrada de Textos Cadastro de Carga.
                txtTaraCarga       .setColumns( 20 );
                txtCargaMaximaCarga.setColumns( 20 );
                txtPlacaCarga      .setColumns( 20 );
                txtMarcaCarga      .setColumns( 20 );
                txtModeloCarga     .setColumns( 20 );
                txtCorCarga        .setColumns( 20 );
                txtQtdRodasCarga   .setColumns( 20 );
                txtVelocMaxCarga   .setColumns( 20 );
                txtQtdPistoesCarga .setColumns( 20 );
                txtPotenciaCarga   .setColumns( 20 );
            }
        }
    }

    public Janela( ) {
        // default
    }
    
    public static void main( String[] args ) {
        
        configuraInterfaceGrafica( );
        frameGestaoDeVeiculos       ( );
        frameVeiculosDePasseio      ( );
        frameVeiculosDeCarga        ( );
        frameCadastroDePasseio      ( );
        frameCadastroDeCarga        ( );
        frameConsExcPelaPlacaPasseio( );
        frameConsExcPelaPlacaCarga  ( );
        frameImpExcTodosPasseio     ( );
        frameImpExcTodosCarga       ( );
    }
    

    static FlowLayout flowLayoutPadrao = new FlowLayout();
    
    static JFrame     frameGestaoDeVeiculos = new JFrame( );
    static JButton    btGestaoPasseio       = new JButton( );
    static JButton    btGestaoCarga         = new JButton( );
    static int        largura      = 300,  
                      altura       = 500; 
    /**
     * 
     * @return Frame inicial do sistema.
     */
    public static void frameGestaoDeVeiculos( ) {
        
        frameGestaoDeVeiculos.setTitle( "Gestão de Veículos" );
        frameGestaoDeVeiculos.setSize ( largura, altura      );
        flowLayoutPadrao.setAlignment( FlowLayout.CENTER );
        
        btGestaoPasseio.setText( "Passeio" );
        btGestaoCarga   .setText( "Carga"   );
        
        frameGestaoDeVeiculos.add( btGestaoPasseio );
        frameGestaoDeVeiculos.add(btGestaoCarga    );
        
        btGestaoPasseio.addActionListener( j );
        btGestaoCarga   .addActionListener( j );
        
        
        frameGestaoDeVeiculos.setLayout ( flowLayoutPadrao  );
        frameGestaoDeVeiculos.setVisible( true );
    }

    // Frame Veículos de Passeio.
    static JFrame  frameVeiculosDePasseio        =  new JFrame( );
    static JButton btCadastrarVeiculoDePasseio   = new JButton( );
    static JButton btConsExcluirPelaPlacaPasseio = new JButton( );
    static JButton btImprExcluirTodosPasseio     = new JButton( );
    static JButton btSairVeiculosDePasseio       = new JButton( );
    // Frame Veículos de Passeio.
    public static void frameVeiculosDePasseio( ) {
        frameVeiculosDePasseio.setTitle    ( "Veículos de Passeio" );
        frameVeiculosDePasseio.setSize     ( largura, altura       );
        flowLayoutPadrao      .setAlignment( FlowLayout.LEADING    );
        
        // Botões Frame Veículos de Passeio.
        btCadastrarVeiculoDePasseio  .setText( "Cadastrar"                    );
        btConsExcluirPelaPlacaPasseio.setText( "Consultar/Excluir pela Placa" );
        btImprExcluirTodosPasseio    .setText( "Imprimir /Excluir todos."     );
        btSairVeiculosDePasseio      .setText( "Sair"                         );
        frameVeiculosDePasseio.add( btCadastrarVeiculoDePasseio   );
        frameVeiculosDePasseio.add( btConsExcluirPelaPlacaPasseio );
        frameVeiculosDePasseio.add( btImprExcluirTodosPasseio     );
        frameVeiculosDePasseio.add( btSairVeiculosDePasseio       );
        // Escutar os Botões Frame Veículos de Passeio.
        btCadastrarVeiculoDePasseio  .addActionListener( j );
        btConsExcluirPelaPlacaPasseio.addActionListener( j );
        btImprExcluirTodosPasseio    .addActionListener( j );
        btSairVeiculosDePasseio      .addActionListener( j );
        
        frameVeiculosDePasseio.setLayout (flowLayoutPadrao );
    }
    
    // Frame Veículos de Carga.
    static JFrame  frameVeiculosDeCarga      = new JFrame( );
    static JButton btCadastrarVeiculoDeCarga = new JButton( );
    static JButton btConsExcluirPlacaCarga   = new JButton( );
    static JButton btImprExcluirTodosCarga   = new JButton( );
    static JButton btSairCarga               = new JButton( );
    // Frame Veículos de Carga.
    public static void frameVeiculosDeCarga( ) {
        
        frameVeiculosDeCarga.setTitle    ( "Veículos de Carga" );
        frameVeiculosDeCarga.setSize     ( largura, altura     );
        flowLayoutPadrao    .setAlignment( FlowLayout.LEADING  );
        // Botões Frame Veículos de Carga
        btCadastrarVeiculoDeCarga.setText( "Cadastrar"                    );
        btConsExcluirPlacaCarga  .setText( "Consultar/Excluir pela Placa" );
        btImprExcluirTodosCarga  .setText( "Imprimir /Excluir todos."     );
        btSairCarga              .setText( "Sair"                         );
        frameVeiculosDeCarga.add( btCadastrarVeiculoDeCarga );
        frameVeiculosDeCarga.add( btConsExcluirPlacaCarga   );
        frameVeiculosDeCarga.add( btImprExcluirTodosCarga   );
        frameVeiculosDeCarga.add( btSairCarga               );
        // Escuta os Botões Frame Veículos De Carga.
        btCadastrarVeiculoDeCarga.addActionListener( j );
        btConsExcluirPlacaCarga  .addActionListener( j );
        btImprExcluirTodosCarga  .addActionListener( j );
        btSairCarga              .addActionListener( j );
        
        frameVeiculosDeCarga.setLayout ( flowLayoutPadrao );
        
    }
    
    /**
     *
     * @param e
     */
    public void actionPerformed( ActionEvent e ) {
 ///////////////////////////////////////////////////////////////////////////////       
        // Frame Gestão de Veículos.
        if( e.getSource().equals( btGestaoPasseio ) ){
            frameGestaoDeVeiculos .setVisible( false );
            frameVeiculosDePasseio.setVisible( true );
            
        }else if( e.getSource().equals(btGestaoCarga ) ){
            frameGestaoDeVeiculos.setVisible( false );
            frameVeiculosDeCarga .setVisible( true  );
        }
////////////////////////////////////////////////////////////////////////////////        
        // Frame Veículos de Passeio
        else if( e.getSource() .equals( btCadastrarVeiculoDePasseio   ) ){
            configuraInterfaceGrafica( );
            frameVeiculosDePasseio.setVisible( false );
            frameCadastroDePasseio.setVisible( true  );
            
        }else if( e.getSource().equals( btConsExcluirPelaPlacaPasseio ) ){
            frameVeiculosDePasseio      .setVisible( false );
            frameConsExcPelaPlacaPasseio.setVisible( true  );
        }else if( e.getSource().equals( btImprExcluirTodosPasseio     ) ){
            frameVeiculosDePasseio .setVisible( false );
            frameImpExcTodosPasseio.setVisible( true  );
        }else if( e.getSource().equals( btSairVeiculosDePasseio       ) ){
            frameVeiculosDePasseio.setVisible( false );
            frameGestaoDeVeiculos.setVisible( true  );
        }
////////////////////////////////////////////////////////////////////////////////        
        // Frame Veículos de Carga
        else if( e.getSource( ) .equals( btCadastrarVeiculoDeCarga ) ){
            frameVeiculosDeCarga.setVisible( false  );
            frameCadastroDeCarga.setVisible( true   );
        }else if( e.getSource( ).equals( btConsExcluirPlacaCarga   ) ){
            frameVeiculosDeCarga      .setVisible( false );
            frameConsExcPelaPlacaCarga.setVisible( true  );
        }else if( e.getSource( ).equals( btImprExcluirTodosCarga   ) ){
            frameVeiculosDeCarga .setVisible( false );  
            frameImpExcTodosCarga.setVisible( true  );
        }else if( e.getSource( ).equals( btSairCarga               ) ){
            frameVeiculosDeCarga.setVisible( false );
            frameGestaoDeVeiculos.setVisible( true  );
        }
////////////////////////////////////////////////////////////////////////////////        
        // Frame Cadastro De Passeio
        else if( e.getSource( ).equals( btCadastrarCadastroDePasseio ) ){
            // Cadastrar De Passeio
            
            //cadastroDeVeiculo();
            
            try {
                validaTextFields ( veiculoDePasseio );
                infoDadosCadastro( veiculoDePasseio );
                validaVariaveis  ( veiculoDePasseio );
                VeicExistException.verifica( String.valueOf( placaPasseio ) );
                Passeio novoPasseio = new Passeio( );
                novoPasseio.setPlaca         (                      placaPasseio       );
                novoPasseio.setQtdPassageiros(    Integer.parseInt( qtdPassageiros  )  );
                novoPasseio.setMarca         (                      marcaPasseio        );
                novoPasseio.setModelo        (                      modeloPasseio       );
                novoPasseio.setCor           (                      corPasseio          );
                novoPasseio.setQtdRodas      (    Integer.parseInt( qtdRodasPasseio   ) );
                novoPasseio.setVelocMax      ( 1, Integer.parseInt( velocMaxPasseio   ) );
                novoPasseio.setQtdPist       (    Integer.parseInt( qtdPistoesPasseio ) );
                novoPasseio.setPotencia      (    Integer.parseInt( potenciaPasseio   ) );
                BDVeiculos.listaDeVeiculos.add( novoPasseio );
            }
            //catch ( VeicExistException ex ) {
            //   //Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
            //} 
            catch (VelocException | VeicExistException ex) {
                //Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch( NumberFormatException j ){
                System.out.println("Erro: " + j);
            }
            finally{
                limparDadosCadastro( veiculoDePasseio );
            }
        }else if( e.getSource( ).equals( btLimparCadastroPasseio ) ){
            
            limparDadosCadastro( veiculoDePasseio );
            
        }else if( e.getSource( ).equals( btNovoCadastroPasseio    ) ){
            
            limparDadosCadastro( veiculoDePasseio );
            
        }else if( e.getSource( ).equals( btSairCadastroDePasseio ) ){
            //limparDadosCadastro( veiculoDePasseio );
            frameCadastroDePasseio.setVisible( false );
            frameCadastroDePasseio.dispose( );
            frameVeiculosDePasseio.setVisible(true);
        }
////////////////////////////////////////////////////////////////////////////////        
        // Frame Cadastro de Carga.
        else if( e.getSource( ).equals( btCadastrarCadastroDeCarga ) ){
            
            try {
                VeicExistException.verifica( String.valueOf( txtPlacaCarga.getText( ) ) );
                if( txtPlacaCarga      .getText().isBlank() || txtPlacaCarga      .getText().isEmpty() ||
                    txtTaraCarga       .getText().isBlank() || txtTaraCarga       .getText().isEmpty() ||
                    txtCargaMaximaCarga.getText().isBlank() || txtCargaMaximaCarga.getText().isBlank() || 
                    txtMarcaCarga      .getText().isBlank() || txtMarcaCarga      .getText().isBlank() || 
                    txtModeloCarga     .getText().isBlank() || txtModeloCarga     .getText().isBlank() || 
                    txtCorCarga        .getText().isBlank() || txtCorCarga        .getText().isBlank() || 
                    txtQtdRodasCarga   .getText().isBlank() || txtQtdRodasCarga   .getText().isBlank() || 
                    txtVelocMaxCarga   .getText().isBlank() || txtVelocMaxCarga   .getText().isBlank() || 
                    txtQtdPistoesCarga .getText().isBlank() || txtQtdPistoesCarga .getText().isBlank() || 
                    txtPotenciaCarga   .getText().isBlank() || txtPotenciaCarga   .getText().isBlank() ){

                    //JOptionPane.showMessageDialog( null, "Preencha os campos corretamente", "Atenção", JOptionPane.ERROR_MESSAGE );
                }
                else{
                    Carga novoCarga = new Carga( );
                    novoCarga.setPlaca         (                      txtPlacaCarga      .getText( )   );
                    novoCarga.setTara          (    Integer.parseInt( txtTaraCarga       .getText( ) ) );
                    novoCarga.setCargaMax      (    Integer.parseInt( txtCargaMaximaCarga.getText( ) ) );
                    novoCarga.setMarca         (                      txtMarcaCarga      .getText( )   );
                    novoCarga.setModelo        (                      txtModeloCarga     .getText( )   );
                    novoCarga.setCor           (                      txtCorCarga        .getText( )   );
                    novoCarga.setQtdRodas      (    Integer.parseInt( txtQtdRodasCarga   .getText( ) ) );
                    novoCarga.setVelocMax      ( 1, Integer.parseInt( txtVelocMaxCarga   .getText( ) ) );
                    novoCarga.setQtdPist       (    Integer.parseInt( txtQtdPistoesCarga .getText( ) ) );
                    novoCarga.setPotencia      (    Integer.parseInt( txtPotenciaCarga   .getText( ) ) );

                    BDVeiculos.listaDeVeiculos.add( novoCarga );
                }
            }
            catch ( VelocException | VeicExistException ex ) {
               //Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        
            }
            
        }else if( e.getSource( ).equals( btLimparCadastroDeCarga ) ){
            
            limparDadosCadastro( veiculoDeCarga );
            
        }else if( e.getSource( ).equals( btNovoCadastroDeCarga ) ){
            
            limparDadosCadastro( veiculoDeCarga );
            
        }else if( e.getSource( ).equals( btSairCadastroDeCarga ) ){
            
            frameCadastroDeCarga.setVisible( false );
            frameVeiculosDeCarga.setVisible( true  );
        }
        
///////////////////////////////////////////////////////////////////////////////
        // Frame Cosultar/Excluir pela Placa Passeio.
        else if ( e.getSource().equals( btConsultarConsExcPelaPlacaPasseio ) ){
            try{
                validaTextFieldsPlaca      ( veiculoDePasseio           );
                VeicExistException.verifica( txtPlacaPasseio.getText( ) );
                carregaFrame               ( veiculoDePasseio           );
                
            }catch( VeicExistException ec ){
                
            }
            
            // Botão Excluir 
        }else if ( e.getSource().equals( btExcluirConsExcPelaPlacaPasseio  ) ){
            
            while (true) {                
                validaTextFields       ( veiculoDePasseio );
                infoDadosCadastro      ( veiculoDePasseio );
                validaVariaveis        ( veiculoDePasseio );
                excluirVeiculoPelaPlaca( veiculoDePasseio );
                limparDadosCadastro    ( veiculoDePasseio );
            }
            
        }else if( e.getSource().equals( btSairConsExcPelaPlacaPasseio     ) ){
            frameConsExcPelaPlacaPasseio.setVisible( false );
            frameVeiculosDePasseio      .setVisible( true  );
        }
        
        // Frame Cosultar/Excluir pela Placa Carga.
        else if ( e.getSource().equals( btConsultarConsExcPelaPlacaCarga ) ){
            try{
                validaTextFieldsPlaca      ( veiculoDeCarga           );
                VeicExistException.verifica( txtPlacaCarga.getText( ) );
                carregaFrame               ( veiculoDeCarga           );
                
            }catch( VeicExistException ec ){
                
            }
            
        }else if ( e.getSource().equals( btExcluirConsExcPelaPlacaCarga  ) ){
            while ( true ) {                
                validaTextFields       ( veiculoDeCarga );
                infoDadosCadastro      ( veiculoDeCarga );
                validaVariaveis        ( veiculoDeCarga );
                excluirVeiculoPelaPlaca( veiculoDeCarga );
                limparDadosCadastro    ( veiculoDeCarga );
            }
            
        }else if( e.getSource().equals( btSairConsExcPelaPlacaCarga      ) ){
            frameConsExcPelaPlacaCarga.setVisible( false );
            frameVeiculosDeCarga      .setVisible( true  );
        }
        
        // Frame Imprimir/Excluir todos Passeio.
        else if( e.getSource().equals( btImpTodosImpExcTodosPasseio ) ){
            
            
            
            
        }else if( e.getSource().equals( btExcTodosImpExcTodosPasseio ) ){
            
        }else if( e.getSource().equals( btSairImpExcTodosPasseio    ) ){
            frameImpExcTodosPasseio.setVisible( false );
            frameVeiculosDePasseio .setVisible( true  );
        }
        
        // Frame Imprimir/Excluir todos Carga.
        else if( e.getSource().equals( btImpTodosImpExcTodosCarga ) ){
            
        }else if( e.getSource().equals( btExcTodosImpExcTodosCarga ) ){
            
        }else if( e.getSource().equals( btSairImpExcTodosCarga    ) ){
            frameImpExcTodosCarga.setVisible( false );
            frameVeiculosDeCarga .setVisible( true  );
        }
        
    }

    // Frame Cadastro de Passeio.
    static JFrame     frameCadastroDePasseio  = new JFrame( );
    static JLabel     labelPlacaPasseio       = new JLabel( );
    static JLabel     labelQtdPassageiros     = new JLabel( );
    static JLabel     labelMarcaPasseio       = new JLabel( );
    static JLabel     labelModeloPasseio      = new JLabel( );
    static JLabel     labelCorPasseio         = new JLabel( );
    static JLabel     labelQtdRodasPasseio    = new JLabel( );
    static JLabel     labelVelocMaxPasseio    = new JLabel( );
    static JLabel     labelQtdPistoesPasseio  = new JLabel( );
    static JLabel     labelPotenciaPasseio    = new JLabel( );
    static JTextField txtPlacaPasseio         = new JTextField( );
    static JTextField txtQtdPassageiros       = new JTextField( );
    static JTextField txtMarcaPasseio         = new JTextField( );
    static JTextField txtModeloPasseio        = new JTextField( );
    static JTextField txtCorPasseio           = new JTextField( );
    static JTextField txtQtdRodasPasseio      = new JTextField( );
    static JTextField txtVelocMaxPasseio      = new JTextField( );
    static JTextField txtQtdPistoesPasseio    = new JTextField( );
    static JTextField txtPotenciaPasseio      = new JTextField( );
    // Botôes Formulário de Cadastro Veiculo de Passeio.
    static JButton    btCadastrarCadastroDePasseio = new JButton( );
    static JButton    btLimparCadastroPasseio      = new JButton( );
    static JButton    btNovoCadastroPasseio        = new JButton( );        
    static JButton    btSairCadastroDePasseio      = new JButton( );
    
    public static void frameCadastroDePasseio( ) {
        controleEnableDisableTextFields ( ativar );
        configFormularioCadastroVeiculos( veiculoDePasseio );
        
        frameCadastroDePasseio.setTitle( "Cadastro de Passeio" );
        frameCadastroDePasseio.setSize ( largura, altura       );
        
        labelQtdPassageiros       .setText( qtdPassageirosName );
        labelPlacaPasseio         .setText( placaName          );
        labelMarcaPasseio         .setText( marcaName          );
        labelModeloPasseio        .setText( modeloName         );
        labelCorPasseio           .setText( corName            );
        labelQtdRodasPasseio      .setText( qtdRodasName       );
        labelVelocMaxPasseio      .setText( velocMaxName       );
        labelQtdPistoesPasseio    .setText( qtdPistoesName     );
        labelPotenciaPasseio      .setText( potenciaName       );
        
        txtPlacaPasseio     .setColumns( 20 );
        txtQtdPassageiros   .setColumns( 20 );
        txtMarcaPasseio     .setColumns( 20 );
        txtModeloPasseio    .setColumns( 20 );
        txtCorPasseio       .setColumns( 20 );
        txtQtdRodasPasseio  .setColumns( 20 );
        txtVelocMaxPasseio  .setColumns( 20 );
        txtQtdPistoesPasseio.setColumns( 20 );
        txtPotenciaPasseio  .setColumns( 20 );
        
                
        
        txtPlacaPasseio     .setEditable( true  );
        txtQtdPassageiros   .setEditable( true );
        txtMarcaPasseio     .setEditable( true );
        txtModeloPasseio    .setEditable( true );
        txtCorPasseio       .setEditable( true );
        txtQtdRodasPasseio  .setEditable( true );
        txtVelocMaxPasseio  .setEditable( true );
        txtQtdPistoesPasseio.setEditable( true );
        txtPotenciaPasseio  .setEditable( true );
        
        
        
        // Itens do Frame Cadastro de Passeio. Labels e TextFields.
        frameCadastroDePasseio.add( labelQtdPassageiros   );
        frameCadastroDePasseio.add( txtQtdPassageiros     );
        frameCadastroDePasseio.add( labelPlacaPasseio      );
        frameCadastroDePasseio.add( txtPlacaPasseio       );
        frameCadastroDePasseio.add( labelMarcaPasseio      );
        frameCadastroDePasseio.add( txtMarcaPasseio       );
        frameCadastroDePasseio.add( labelModeloPasseio     );
        frameCadastroDePasseio.add( txtModeloPasseio      );
        frameCadastroDePasseio.add( labelCorPasseio        );
        frameCadastroDePasseio.add( txtCorPasseio         );
        frameCadastroDePasseio.add( labelQtdRodasPasseio   );
        frameCadastroDePasseio.add( txtQtdRodasPasseio    );
        
        frameCadastroDePasseio.add( labelVelocMaxPasseio  );
        frameCadastroDePasseio.add( txtVelocMaxPasseio    );
        
        frameCadastroDePasseio.add( labelQtdPistoesPasseio );
        frameCadastroDePasseio.add( txtQtdPistoesPasseio   );
        
        frameCadastroDePasseio.add( labelPotenciaPasseio   );
        frameCadastroDePasseio.add( txtPotenciaPasseio    );
        
        // Botões Formulário Cadastro Veículos de Passeio.
        btCadastrarCadastroDePasseio.setText( "Cadastrar" );
        btLimparCadastroPasseio     .setText( "Limpar"    );
        btNovoCadastroPasseio       .setText( "Novo"      );
        btSairCadastroDePasseio     .setText( "Sair"      );
        
        frameCadastroDePasseio.add( btCadastrarCadastroDePasseio );
        frameCadastroDePasseio.add( btLimparCadastroPasseio      );
        frameCadastroDePasseio.add( btNovoCadastroPasseio        );
        frameCadastroDePasseio.add( btSairCadastroDePasseio      );
        // Fim Botões 
        // Na escuta
        btCadastrarCadastroDePasseio.addActionListener( j );
        btLimparCadastroPasseio     .addActionListener( j );
        btNovoCadastroPasseio       .addActionListener( j );
        btSairCadastroDePasseio     .addActionListener( j );
        
        frameCadastroDePasseio.setLayout ( flowLayoutPadrao );
        
    }// Fim Método JFrame Cadastro de passeio.

////////////////////////////////////////////////////////////////////////////////
    
    // Frame Consultar / Excluir pela Placa Passeio.
    static JFrame  frameConsExcPelaPlacaPasseio       = new JFrame( );
    static JButton btConsultarConsExcPelaPlacaPasseio = new JButton( );
    static JButton btExcluirConsExcPelaPlacaPasseio   = new JButton( );
    static JButton btSairConsExcPelaPlacaPasseio      = new JButton( );
    public static void  frameConsExcPelaPlacaPasseio( ) {
        controleEnableDisableTextFields( desativar );
        frameConsExcPelaPlacaPasseio.setTitle( "Consultar/Excluir pela Placa" );
        frameConsExcPelaPlacaPasseio.setSize ( largura, altura                );

        labelPlacaPasseio.setText( "Informe a Placa: " );
        frameConsExcPelaPlacaPasseio.add(labelPlacaPasseio      );
        frameConsExcPelaPlacaPasseio.add( txtPlacaPasseio        );
        frameConsExcPelaPlacaPasseio.add( labelQtdPassageiros    );
        frameConsExcPelaPlacaPasseio.add( txtQtdPassageiros      );
        frameConsExcPelaPlacaPasseio.add(labelMarcaPasseio      );
        frameConsExcPelaPlacaPasseio.add( txtMarcaPasseio        );
        frameConsExcPelaPlacaPasseio.add(labelModeloPasseio     );
        frameConsExcPelaPlacaPasseio.add( txtModeloPasseio       );
        frameConsExcPelaPlacaPasseio.add(labelCorPasseio        );
        frameConsExcPelaPlacaPasseio.add( txtCorPasseio          );
        frameConsExcPelaPlacaPasseio.add(labelQtdRodasPasseio   );
        frameConsExcPelaPlacaPasseio.add( txtQtdRodasPasseio     );
        frameConsExcPelaPlacaPasseio.add(labelVelocMaxPasseio   );
        frameConsExcPelaPlacaPasseio.add( txtVelocMaxPasseio     );
        frameConsExcPelaPlacaPasseio.add(labelQtdPistoesPasseio );
        frameConsExcPelaPlacaPasseio.add( txtQtdPistoesPasseio   );
        frameConsExcPelaPlacaPasseio.add(labelPotenciaPasseio   );
        frameConsExcPelaPlacaPasseio.add( txtPotenciaPasseio     );
        
        btConsultarConsExcPelaPlacaPasseio.setText( "Consultar" );
        btExcluirConsExcPelaPlacaPasseio  .setText( "Excluir"   );
        btSairConsExcPelaPlacaPasseio     .setText( "Sair"      );
        
        frameConsExcPelaPlacaPasseio.add( btConsultarConsExcPelaPlacaPasseio );
        frameConsExcPelaPlacaPasseio.add( btExcluirConsExcPelaPlacaPasseio   );
        frameConsExcPelaPlacaPasseio.add( btSairConsExcPelaPlacaPasseio      );
        
        btConsultarConsExcPelaPlacaPasseio.addActionListener( j );
        btExcluirConsExcPelaPlacaPasseio  .addActionListener( j );
        btSairConsExcPelaPlacaPasseio     .addActionListener( j );
        
        frameConsExcPelaPlacaPasseio.setLayout (flowLayoutPadrao );
        
    }

    // Imprimir/Excluir Todos
    static JFrame  frameImpExcTodosPasseio     = new JFrame( );
    static JButton btImpTodosImpExcTodosPasseio = new JButton( );
    static JButton btExcTodosImpExcTodosPasseio = new JButton( );
    static JButton btSairImpExcTodosPasseio     = new JButton( );
    
    public static void frameImpExcTodosPasseio( ) {
        
        frameImpExcTodosPasseio.setTitle( "Imprimir/Excluir Todos" );
        frameImpExcTodosPasseio.setSize ( largura, altura          );
        
        String[]          colunasPasseio = { placaName , marcaName, modeloName, corName, 
                                             qtdRodasName, velocMaxName, qtdPistoesName, 
                                             potenciaName, qtdPassageirosName };
        DefaultTableModel model             = new DefaultTableModel( colunasPasseio, 0 );
        JTable            tableDados        = new JTable           ( model             );
        JScrollPane       barraRolagemLista = new JScrollPane      ( tableDados        );
        frameImpExcTodosPasseio.add( barraRolagemLista );
        
        btImpTodosImpExcTodosPasseio.setText( "Imprimir Todos" );
        btExcTodosImpExcTodosPasseio.setText( "Excluir Todos"  );
        btSairImpExcTodosPasseio    .setText( "Sair"           );
        
        frameImpExcTodosPasseio.add( btImpTodosImpExcTodosPasseio );
        frameImpExcTodosPasseio.add( btExcTodosImpExcTodosPasseio );
        frameImpExcTodosPasseio.add( btSairImpExcTodosPasseio     );
        
        btImpTodosImpExcTodosPasseio.addActionListener( j );
        btExcTodosImpExcTodosPasseio.addActionListener( j );
        btSairImpExcTodosPasseio    .addActionListener( j );
        
        frameImpExcTodosPasseio .setLayout( flowLayoutPadrao );
        
    }
   
    static String taraCarga        = "";
    static String cargaMaximaCarga = "";
    static String placaCarga       = "";
    static String marcaCarga       = "";
    static String modeloCarga      = "";
    static String corCarga         = "";
    static String qtdRodasCarga    = "";
    static String velocMaxCarga    = "";
    static String qtdPistoesCarga  = "";
    static String potenciaCarga    = "";
    
    static String qtdPassageiros    = "";
    static String placaPasseio      = "";
    static String marcaPasseio      = "";
    static String modeloPasseio     = "";
    static String corPasseio        = "";
    static String velocMaxPasseio   = "";
    static String qtdRodasPasseio   = "";
    static String qtdPistoesPasseio = "";
    static String potenciaPasseio   = "";
    
    // Frame Cadastro de Carga.
    static JFrame     frameCadastroDeCarga  = new JFrame( );
    static JLabel     labelTaraCarga        = new JLabel( );
    static JLabel     labelCargaMaximaCarga = new JLabel( );
    static JLabel     labelPlacaCarga       = new JLabel( );
    static JLabel     labelMarcaCarga       = new JLabel( );
    static JLabel     labelModeloCarga      = new JLabel( );
    static JLabel     labelCorCarga         = new JLabel( );
    static JLabel     labelQtdRodasCarga    = new JLabel( );
    static JLabel     labelVelocMaxCarga    = new JLabel( );
    static JLabel     labelQtdPistoesCarga  = new JLabel( );
    static JLabel     labelPotenciaCarga    = new JLabel( );
    static JTextField txtTaraCarga          = new JTextField();
    static JTextField txtCargaMaximaCarga   = new JTextField();
    static JTextField txtPlacaCarga         = new JTextField();
    static JTextField txtMarcaCarga         = new JTextField();
    static JTextField txtModeloCarga        = new JTextField();
    static JTextField txtCorCarga           = new JTextField();
    static JTextField txtQtdRodasCarga      = new JTextField();
    static JTextField txtVelocMaxCarga      = new JTextField();
    static JTextField txtQtdPistoesCarga    = new JTextField();
    static JTextField txtPotenciaCarga      = new JTextField();
    // Botôes Frame de Cadastro de Carga.
    static JButton    btCadastrarCadastroDeCarga = new JButton();
    static JButton    btLimparCadastroDeCarga    = new JButton();
    static JButton    btNovoCadastroDeCarga      = new JButton();        
    static JButton    btSairCadastroDeCarga    = new JButton(); 
    
    public static void frameCadastroDeCarga( ) {
        controleEnableDisableTextFields ( ativar         );
        configFormularioCadastroVeiculos( veiculoDeCarga );
        
        frameCadastroDeCarga.setTitle( "Cadastro de Carga" );
        frameCadastroDeCarga.setSize ( largura, altura     );
        
        
        

        
        
        // Itens do Frame Cadastro de Carga.
        frameCadastroDeCarga.add( labelTaraCarga        );
        frameCadastroDeCarga.add( txtTaraCarga          );
        frameCadastroDeCarga.add( labelCargaMaximaCarga );
        frameCadastroDeCarga.add( txtCargaMaximaCarga   );
        frameCadastroDeCarga.add( labelPlacaCarga       );
        frameCadastroDeCarga.add( txtPlacaCarga         );
        frameCadastroDeCarga.add( labelMarcaCarga       );
        frameCadastroDeCarga.add( txtMarcaCarga         );
        frameCadastroDeCarga.add( labelModeloCarga      );
        frameCadastroDeCarga.add( txtModeloCarga        );
        frameCadastroDeCarga.add( labelCorCarga         );
        frameCadastroDeCarga.add( txtCorCarga           );
        frameCadastroDeCarga.add( labelQtdRodasCarga    );
        frameCadastroDeCarga.add( txtQtdRodasCarga      );
        frameCadastroDeCarga.add( labelVelocMaxCarga    );
        frameCadastroDeCarga.add( txtVelocMaxCarga      );
        frameCadastroDeCarga.add( labelQtdPistoesCarga  );
        frameCadastroDeCarga.add( txtQtdPistoesCarga    );
        frameCadastroDeCarga.add( labelPotenciaCarga    );
        frameCadastroDeCarga.add( txtPotenciaCarga      );
        
        // Botões Frame Cadastro de Carga.
        btCadastrarCadastroDeCarga.setText( "Cadastrar" );
        btLimparCadastroDeCarga   .setText( "Limpar"    );
        btNovoCadastroDeCarga     .setText( "Novo"      );
        btSairCadastroDeCarga     .setText( "Sair"      );
        frameCadastroDeCarga.add( btCadastrarCadastroDeCarga );
        frameCadastroDeCarga.add( btLimparCadastroDeCarga    );
        frameCadastroDeCarga.add( btNovoCadastroDeCarga      );
        frameCadastroDeCarga.add( btSairCadastroDeCarga      );
        // Escutar Botões Frame Cadastro de Carga.
        btCadastrarCadastroDeCarga.addActionListener( j );
        btLimparCadastroDeCarga   .addActionListener( j );
        btNovoCadastroDeCarga     .addActionListener( j );
        btSairCadastroDeCarga     .addActionListener( j );
        
        frameCadastroDeCarga.setLayout ( flowLayoutPadrao );
    }

    static JFrame  frameConsExcPelaPlacaCarga       = new JFrame( );
    static JButton btConsultarConsExcPelaPlacaCarga = new JButton( );
    static JButton btExcluirConsExcPelaPlacaCarga   = new JButton( );
    static JButton btSairConsExcPelaPlacaCarga      = new JButton( );
    public static void frameConsExcPelaPlacaCarga( ) {
        
        controleEnableDisableTextFields( desativar );
        frameConsExcPelaPlacaCarga.setTitle( "Consultar/Excluir pela Placa" );
        frameConsExcPelaPlacaCarga.setSize ( largura, altura                );

        
        labelPlacaCarga.setText( "Informe a Placa: " );
        frameConsExcPelaPlacaCarga.add( labelPlacaCarga       );
        frameConsExcPelaPlacaCarga.add( txtPlacaCarga         );
        frameConsExcPelaPlacaCarga.add( labelTaraCarga        );
        frameConsExcPelaPlacaCarga.add( txtTaraCarga          );
        frameConsExcPelaPlacaCarga.add( labelCargaMaximaCarga );
        frameConsExcPelaPlacaCarga.add( txtCargaMaximaCarga   );
        frameConsExcPelaPlacaCarga.add( labelMarcaCarga       );
        frameConsExcPelaPlacaCarga.add( txtMarcaCarga         );
        frameConsExcPelaPlacaCarga.add( labelModeloCarga      );
        frameConsExcPelaPlacaCarga.add( txtModeloCarga        );
        frameConsExcPelaPlacaCarga.add( labelCorCarga         );
        frameConsExcPelaPlacaCarga.add( txtCorCarga           );
        frameConsExcPelaPlacaCarga.add( labelQtdRodasCarga    );
        frameConsExcPelaPlacaCarga.add( txtQtdRodasCarga      );
        frameConsExcPelaPlacaCarga.add( labelVelocMaxCarga    );
        frameConsExcPelaPlacaCarga.add( txtVelocMaxCarga      );
        frameConsExcPelaPlacaCarga.add( labelQtdPistoesCarga  );
        frameConsExcPelaPlacaCarga.add( txtQtdPistoesCarga    );
        frameConsExcPelaPlacaCarga.add( labelPotenciaCarga    );
        frameConsExcPelaPlacaCarga.add( txtPotenciaCarga      );
        
        btConsultarConsExcPelaPlacaCarga.setText( "Consultar" );
        btExcluirConsExcPelaPlacaCarga  .setText( "Excluir"   );
        btSairConsExcPelaPlacaCarga     .setText( "Sair"      );
        
        frameConsExcPelaPlacaCarga.add( btConsultarConsExcPelaPlacaCarga );
        frameConsExcPelaPlacaCarga.add( btExcluirConsExcPelaPlacaCarga   );
        frameConsExcPelaPlacaCarga.add( btSairConsExcPelaPlacaCarga      );
        
        btConsultarConsExcPelaPlacaCarga.addActionListener( j );
        btExcluirConsExcPelaPlacaCarga  .addActionListener( j );
        btSairConsExcPelaPlacaCarga     .addActionListener( j );
        
        frameConsExcPelaPlacaCarga.setLayout ( flowLayoutPadrao );
    }

    // Frame Imprimir/Excluir Carga
    static JFrame  frameImpExcTodosCarga      = new JFrame( );
    static JButton btImpTodosImpExcTodosCarga = new JButton( );
    static JButton btExcTodosImpExcTodosCarga = new JButton( );
    static JButton btSairImpExcTodosCarga     = new JButton( );
    
    public static void frameImpExcTodosCarga( ) {
        
        frameImpExcTodosCarga.setTitle( "Imprimir/Excluir Todos" );
        frameImpExcTodosCarga.setSize ( largura, altura          );
        
        String[] colunasCarga   = { placaName, marcaName, modeloName, corName, qtdRodasName, 
                                    velocMaxName, qtdPistoesName, potenciaName, taraName, cargaMaximaName  };
        
        DefaultTableModel model             = new DefaultTableModel( colunasCarga, 0 );
        JTable            tableDados        = new JTable           ( model             );
        JScrollPane       barraRolagemLista = new JScrollPane      ( tableDados        );
        frameImpExcTodosCarga.add( barraRolagemLista );
        
        
        btImpTodosImpExcTodosCarga.setText( "Imprimir Todos" );
        btExcTodosImpExcTodosCarga.setText( "Excluir Todos"  );
        btSairImpExcTodosCarga    .setText( "Sair"           );
        
        frameImpExcTodosCarga.add( btImpTodosImpExcTodosCarga );
        frameImpExcTodosCarga.add( btExcTodosImpExcTodosCarga );
        frameImpExcTodosCarga.add( btSairImpExcTodosCarga     );
        
        btImpTodosImpExcTodosCarga.addActionListener( j );
        btExcTodosImpExcTodosCarga.addActionListener( j );
        btSairImpExcTodosCarga    .addActionListener( j );
        
        frameImpExcTodosCarga .setLayout( flowLayoutPadrao );

    }

    static int desativar = 1, ativar = 2;
    /**
     * Método para Ativar / Desativar Entradas de Campos de Texto.
     * @param key 
     * 1 para Desativar
     * 2 para Ativar
     */
    public static void controleEnableDisableTextFields( int key ) {
        // Desativar
        switch ( key ) {
            case 1 -> {
                txtPlacaPasseio     .setEditable( true  );
                txtQtdPassageiros   .setEditable( false );
                txtMarcaPasseio     .setEditable( false );
                txtModeloPasseio    .setEditable( false );
                txtCorPasseio       .setEditable( false );
                txtQtdRodasPasseio  .setEditable( false );
                txtVelocMaxPasseio  .setEditable( false );
                txtQtdPistoesPasseio.setEditable( false );
                txtPotenciaPasseio  .setEditable( false );
                
                txtPlacaCarga      .setEditable( true  );
                txtTaraCarga       .setEditable( false );
                txtCargaMaximaCarga.setEditable( false );
                txtMarcaCarga      .setEditable( false );
                txtModeloCarga     .setEditable( false );
                txtCorCarga        .setEditable( false );
                txtQtdRodasCarga   .setEditable( false );
                txtVelocMaxCarga   .setEditable( false );
                txtQtdPistoesCarga .setEditable( false );
                txtPotenciaCarga   .setEditable( false );                
            }
            case 2 -> {
                txtPlacaPasseio     .setEditable( true  );
                txtQtdPassageiros   .setEditable( true );
                txtMarcaPasseio     .setEditable( true );
                txtModeloPasseio    .setEditable( true );
                txtCorPasseio       .setEditable( true );
                txtQtdRodasPasseio  .setEditable( true );
                txtVelocMaxPasseio  .setEditable( true );
                txtQtdPistoesPasseio.setEditable( true );
                txtPotenciaPasseio  .setEditable( true );
                
                txtPlacaCarga      .setEditable( true );
                txtTaraCarga       .setEditable( true );
                txtCargaMaximaCarga.setEditable( true );
                txtMarcaCarga      .setEditable( true );
                txtModeloCarga     .setEditable( true );
                txtCorCarga        .setEditable( true );
                txtQtdRodasCarga   .setEditable( true );
                txtVelocMaxCarga   .setEditable( true );
                txtQtdPistoesCarga .setEditable( true );
                txtPotenciaCarga   .setEditable( true );
                
            }
        } 
    }
    
    // Método Captura Variáveis dos Frames de Cadastro de Passeio e Carga
    static int veiculoDePasseio = 1;
    static int veiculoDeCarga   = 2;
    public void infoDadosCadastro( int veiculo ){
        
        switch ( veiculo ) {
            case 1 -> {
                qtdPassageiros    = txtQtdPassageiros   .getText( );
                placaPasseio      = txtPlacaPasseio     .getText( );
                marcaPasseio      = txtMarcaPasseio     .getText( );
                modeloPasseio     = txtModeloPasseio    .getText( );
                corPasseio        = txtCorPasseio       .getText( );
                velocMaxPasseio   = txtVelocMaxPasseio  .getText( );
                qtdRodasPasseio   = txtQtdRodasPasseio  .getText( );
                qtdPistoesPasseio = txtQtdPistoesPasseio.getText( );
                potenciaPasseio   = txtPotenciaPasseio  .getText( );
            }
            case 2 -> {
                taraCarga        = txtTaraCarga       .getText( );
                cargaMaximaCarga = txtCargaMaximaCarga.getText( );
                placaCarga       = txtPlacaCarga      .getText( );
                marcaCarga       = txtMarcaCarga      .getText( );
                modeloCarga      = txtModeloCarga     .getText( );
                corCarga         = txtCorCarga        .getText( );
                qtdRodasCarga    = txtQtdRodasCarga   .getText( );
                velocMaxCarga    = txtVelocMaxCarga   .getText( );
                qtdPistoesCarga  = txtQtdPistoesCarga .getText( );
                potenciaCarga    = txtPotenciaCarga   .getText( );
            }
        }
    }

    public static void limparDadosCadastro( int veiculo ) {
        
        switch ( veiculo ) {
            case 1 -> {
                txtQtdPassageiros   .setText( "" );
                txtPlacaPasseio     .setText( "" );
                txtMarcaPasseio     .setText( "" );
                txtModeloPasseio    .setText( "" );
                txtCorPasseio       .setText( "" );
                txtQtdRodasPasseio  .setText( "" );
                txtVelocMaxPasseio  .setText( "" );
                txtQtdPistoesPasseio.setText( "" );
                txtPotenciaPasseio  .setText( "" );
                resetaVariaveis( veiculoDePasseio );
            }
            case 2 -> {
                txtTaraCarga        .setText( "" );
                txtCargaMaximaCarga .setText( "" );
                txtPlacaCarga       .setText( "" );
                txtMarcaCarga       .setText( "" );
                txtModeloCarga      .setText( "" );
                txtCorCarga         .setText( "" );
                txtQtdRodasCarga    .setText( "" );
                txtVelocMaxCarga    .setText( "" );
                txtQtdPistoesCarga  .setText( "" );
                txtPotenciaCarga    .setText( "" );
                resetaVariaveis( veiculoDeCarga );
            }
        }
    }

    public static void resetaVariaveis( int veiculo ){
    
        switch ( veiculo ) {
            case 1 -> {
                qtdPassageiros    = "";
                placaPasseio      = "";
                marcaPasseio      = "";
                modeloPasseio     = "";
                corPasseio        = "";
                velocMaxPasseio   = "";
                qtdRodasPasseio   = "";
                qtdPistoesPasseio = "";
                potenciaPasseio   = "";
            }
            case 2 -> {
                taraCarga        = "";
                cargaMaximaCarga = "";
                placaCarga       = "";
                marcaCarga       = "";
                modeloCarga      = "";
                corCarga         = "";
                qtdRodasCarga    = "";
                velocMaxCarga    = "";
                qtdPistoesCarga  = "";
                potenciaCarga    = "";
            }
        }
    }

    public static boolean remover( String placa ){
        boolean retorno = false;
        
        for ( Veiculo veiculo : listaDeVeiculos ) {
            if( veiculo.getPlaca( ).equals(placa) ){
                retorno = true;
                listaDeVeiculos.remove( veiculo );
            }
        }
    
        return retorno;
    }
    
    public void cadastroDeVeiculos( int veiculo ) {
        
        switch ( veiculo ) {
            case 1 -> {
                if( txtPlacaPasseio     .getText().isBlank() || txtPlacaPasseio     .getText().isEmpty()||
                    txtQtdPassageiros   .getText().isBlank() || txtQtdPassageiros   .getText().isEmpty()||
                    txtMarcaPasseio     .getText().isBlank() || txtMarcaPasseio     .getText().isEmpty()||
                    txtModeloPasseio    .getText().isBlank() || txtModeloPasseio    .getText().isEmpty()||
                    txtCorPasseio       .getText().isBlank() || txtCorPasseio       .getText().isEmpty()||
                    txtQtdRodasPasseio  .getText().isBlank() || txtQtdRodasPasseio  .getText().isEmpty()||
                    txtVelocMaxPasseio  .getText().isBlank() || txtVelocMaxPasseio  .getText().isEmpty()||
                    txtQtdPistoesPasseio.getText().isBlank() || txtQtdPistoesPasseio.getText().isEmpty()||
                    txtPotenciaPasseio  .getText().isBlank() || txtPotenciaPasseio  .getText().isEmpty() ){

                    JOptionPane.showMessageDialog( null, "Preencha os campos do formulário corretamente.", "Atenção", JOptionPane.ERROR_MESSAGE);
                }else{
                    try {
                        infoDadosCadastro( veiculoDePasseio );
                        VeiculoControl.cadastrarVeiculo( veiculoDePasseio );
                    } catch ( VeicExistException ex) {
                        //Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }
            case 2 ->{
                if(             
                    txtTaraCarga       .getText().isBlank() ||
                    txtCargaMaximaCarga.getText().isBlank() ||
                    txtPlacaCarga      .getText().isBlank() ||
                    txtMarcaCarga      .getText().isBlank() ||
                    txtModeloCarga     .getText().isBlank() ||
                    txtCorCarga        .getText().isBlank() ||
                    txtQtdRodasCarga   .getText().isBlank() ||
                    txtVelocMaxCarga   .getText().isBlank() ||
                    txtQtdPistoesCarga .getText().isBlank() ||
                    txtPotenciaCarga   .getText().isBlank() ){
                    
                    JOptionPane.showMessageDialog( null, "Preencha os campos do formulário corretamente.", "Atenção", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    try {
                        infoDadosCadastro( veiculoDeCarga );
                        VeiculoControl.cadastrarVeiculo( veiculoDeCarga );

                    } catch ( VeicExistException ex ) {
                        Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }
        }
    }

    public void consultarVeiculoPelaPlaca( int veiculo ) {

        switch ( veiculo ) {
            case 1 -> {
                if( txtPlacaPasseio.getText( ).isBlank( ) || txtPlacaPasseio.getText().isEmpty( )){
                    JOptionPane.showMessageDialog( null ,"Preencha a Placa corretamente","Atenção", JOptionPane.ERROR_MESSAGE );
                }else{
                    for ( Iterator<Veiculo> it = BDVeiculos.listaDeVeiculos.iterator( ); it.hasNext( ); ) {
                        Passeio passeio = ( Passeio) it.next( );
                        if( !passeio.getPlaca().isBlank( ) || !passeio.getPlaca().isEmpty( ) ){
                        
                            if( txtPlacaPasseio.getText( ).equals( passeio.getPlaca( ) ) ){
                                txtQtdPassageiros   .setText( String.valueOf( passeio.getQtdPassageiros( ) ) );
                                txtMarcaPasseio     .setText(                 passeio.getMarca         ( )   );
                                txtModeloPasseio    .setText(                 passeio.getModelo        ( )   );
                                txtCorPasseio       .setText(                 passeio.getCor           ( )   );
                                txtQtdRodasPasseio  .setText( String.valueOf( passeio.getQtdRodas      ( ) ) );
                                txtVelocMaxPasseio  .setText( String.valueOf( passeio.getVelocMax      ( ) ) );
                                txtQtdPistoesPasseio.setText( String.valueOf( passeio.getQtdPist       ( ) ) );
                                txtPotenciaPasseio  .setText( String.valueOf( passeio.getPotencia      ( ) ) );
                            }
                        }
                    }
                
                    //limparDadosCadastro( veiculoDePasseio );
                }
            }
            case 2 -> {
                if( txtPlacaCarga.getText( ).isBlank( ) || txtPlacaCarga.getText().isEmpty( ) ){
                    JOptionPane.showMessageDialog( null ,"Preencha a Placa corretamente","Atenção", JOptionPane.ERROR_MESSAGE );
                }else{
                    for ( Iterator<Veiculo> it = BDVeiculos.listaDeVeiculos.iterator( ); it.hasNext( ); ) {
                        Carga carga = ( Carga ) it.next();
                        if( txtPlacaCarga.getText( ).equals(carga.getPlaca( ) ) ){
                            txtTaraCarga       .setText( String.valueOf( carga.getTara    ( ) ) );
                            txtCargaMaximaCarga.setText( String.valueOf( carga.getCargaMax( ) ) );
                            txtMarcaCarga      .setText(                 carga.getMarca   ( )   );
                            txtModeloCarga     .setText(                 carga.getModelo  ( )   );
                            txtCorCarga        .setText(                 carga.getCor     ( )   );
                            txtQtdRodasCarga   .setText( String.valueOf( carga.getQtdRodas( ) ) );
                            txtVelocMaxCarga   .setText( String.valueOf( carga.getVelocMax( ) ) );
                            txtQtdPistoesCarga .setText( String.valueOf( carga.getQtdPist ( ) ) );
                            txtPotenciaCarga   .setText( String.valueOf( carga.getPotencia( ) ) );

                        }
                    }
                    //limparDadosCadastro( veiculoDeCarga );
                }
            }
        }
    }

    public void excluirVeiculoPelaPlaca( int veiculo ) {
        
        switch ( veiculo ) {
            case 1 -> {
                
                for ( Iterator<Veiculo> it = BDVeiculos.listaDeVeiculos.iterator( ); it.hasNext( ); ) {
                    Passeio passeio = ( Passeio ) it.next( );
                    
                    if( passeio.getPlaca().equals( placaPasseio ) ){
                        BDVeiculos.listaDeVeiculos.remove( passeio );
                    }
                    
                }
            }
            case 2 -> {
                for ( Iterator<Veiculo> it = BDVeiculos.listaDeVeiculos.iterator( ); it.hasNext( ); ) {
                    Carga carga = ( Carga ) it.next( );
                    
                    if( carga.getPlaca().equals( placaCarga ) ){
                        BDVeiculos.listaDeVeiculos.remove( carga );
                    }
                    
                }
            }
        }
    }

    public boolean validaTextFieldsPlaca( int veiculo ){
        boolean empty = true;
        
        switch (veiculo) {
            case 1 -> {
                if( txtPlacaPasseio.getText( ).isBlank( ) || txtPlacaPasseio.getText( ).isEmpty( ) ){
                    empty = false;
                }
            }
            case 2 -> {
                if( txtPlacaCarga.getText( ).isBlank( ) || txtPlacaCarga.getText( ).isEmpty( ) ){
                    empty = false;
                }
            }
        }
        
        return empty;
    }
    
    public boolean validaTextFields( int veiculo ) {
        boolean empty = true;
        
        switch ( veiculo ) {
            case 1 -> {
                if( txtPlacaPasseio     .getText().isBlank() || txtPlacaPasseio     .getText().isEmpty() ||
                    txtQtdPassageiros   .getText().isBlank() || txtQtdPassageiros   .getText().isBlank() || 
                    txtMarcaPasseio     .getText().isBlank() || txtMarcaPasseio     .getText().isBlank() || 
                    txtModeloPasseio    .getText().isBlank() || txtModeloPasseio    .getText().isBlank() || 
                    txtCorPasseio       .getText().isBlank() || txtCorPasseio       .getText().isBlank() || 
                    txtQtdRodasPasseio  .getText().isBlank() || txtQtdRodasPasseio  .getText().isBlank() || 
                    txtVelocMaxPasseio  .getText().isBlank() || txtVelocMaxPasseio  .getText().isBlank() || 
                    txtQtdPistoesPasseio.getText().isBlank() || txtQtdPistoesPasseio.getText().isBlank() || 
                    txtPotenciaPasseio  .getText().isBlank() || txtPotenciaPasseio  .getText().isBlank() ){

                    empty = false;
                }
            }
            case 2 ->{
                if( txtPlacaCarga      .getText().isBlank() || txtPlacaCarga      .getText().isEmpty() ||
                    txtTaraCarga       .getText().isBlank() || txtTaraCarga       .getText().isBlank() || 
                    txtCargaMaximaCarga.getText().isBlank() || txtCargaMaximaCarga.getText().isBlank() || 
                    txtMarcaCarga      .getText().isBlank() || txtMarcaCarga      .getText().isBlank() || 
                    txtModeloCarga     .getText().isBlank() || txtModeloCarga     .getText().isBlank() || 
                    txtCorCarga        .getText().isBlank() || txtCorCarga        .getText().isBlank() || 
                    txtQtdRodasCarga   .getText().isBlank() || txtQtdRodasCarga   .getText().isBlank() || 
                    txtVelocMaxCarga   .getText().isBlank() || txtVelocMaxCarga   .getText().isBlank() || 
                    txtQtdPistoesCarga .getText().isBlank() || txtQtdPistoesCarga .getText().isBlank() || 
                    txtPotenciaCarga   .getText().isBlank() || txtPotenciaCarga   .getText().isBlank() ){

                    empty = false;
                }
            }
        }
        return empty;
    }

    public boolean validaVariaveis( int veiculo ) {
        boolean empty = true;
        
        switch (veiculo) {
            case 1 -> {
                if( placaPasseio     .isEmpty() || placaPasseio     .isEmpty() ||
                    qtdPassageiros   .isEmpty() || qtdPassageiros   .isEmpty() ||  
                    marcaPasseio     .isEmpty() || marcaPasseio     .isEmpty() ||
                    modeloPasseio    .isEmpty() || modeloPasseio    .isEmpty() ||
                    corPasseio       .isEmpty() || corPasseio       .isEmpty() ||
                    qtdRodasPasseio  .isEmpty() || qtdRodasPasseio  .isEmpty() ||
                    velocMaxPasseio  .isEmpty() || velocMaxPasseio  .isEmpty() ||
                    qtdPistoesPasseio.isEmpty() || qtdPistoesPasseio.isEmpty() ||
                    potenciaPasseio  .isEmpty() || potenciaPasseio  .isEmpty() ){
                    //JOptionPane.showMessageDialog( null, "Preencha os campos corretamente", "Atenção", JOptionPane.ERROR_MESSAGE );
                    empty = false;
                } 
            }
            case 2 -> {
                
                if( taraCarga       .isEmpty() || taraCarga       .isEmpty() || 
                    cargaMaximaCarga.isEmpty() || cargaMaximaCarga.isEmpty() || 
                    placaCarga      .isEmpty() || placaCarga      .isEmpty() || 
                    marcaCarga      .isEmpty() || marcaCarga      .isEmpty() || 
                    modeloCarga     .isEmpty() || modeloCarga     .isEmpty() || 
                    corCarga        .isEmpty() || corCarga        .isEmpty() || 
                    qtdRodasCarga   .isEmpty() || qtdRodasCarga   .isEmpty() || 
                    velocMaxCarga   .isEmpty() || velocMaxCarga   .isEmpty() || 
                    qtdPistoesCarga .isEmpty() || qtdPistoesCarga .isEmpty() || 
                    potenciaCarga   .isEmpty() || potenciaCarga   .isEmpty() ){
                    
                    empty = false;
                } 
            }
        }
        
        return empty;
    }

    public void carregaFrame( int veiculo ) {
        
        switch ( veiculo ) {
            case 1 -> {
                for ( Iterator<Veiculo> it = BDVeiculos.listaDeVeiculos.iterator( ); it.hasNext( ); ) {
                    Passeio passeio = ( Passeio) it.next( );
                    
                    if( passeio.getPlaca( ).equals( String.valueOf( txtPlacaPasseio.getText( ) ) ) ){
                        txtPlacaPasseio     .setText(                 passeio.getPlaca         ( )   );
                        txtQtdPassageiros   .setText( String.valueOf( passeio.getQtdPassageiros( ) ) );
                        txtMarcaPasseio     .setText(                 passeio.getMarca         ( )   );
                        txtModeloPasseio    .setText(                 passeio.getModelo        ( )   );
                        txtCorPasseio       .setText(                 passeio.getCor           ( )   );
                        txtQtdRodasPasseio  .setText( String.valueOf( passeio.getQtdRodas      ( ) ) );
                        txtVelocMaxPasseio  .setText( String.valueOf( passeio.getVelocMax      ( ) ) );
                        txtQtdPistoesPasseio.setText( String.valueOf( passeio.getQtdPist       ( ) ) );
                        txtPotenciaPasseio  .setText( String.valueOf( passeio.getPotencia      ( ) ) );
                    }
                }
            }
            case 2 -> {
                for ( Iterator<Veiculo> it = BDVeiculos.listaDeVeiculos.iterator( ); it.hasNext( ); ) {
                    Carga carga = ( Carga ) it.next( );

                    if( carga.getPlaca().equals( String.valueOf( txtPlacaCarga.getText( ) ) ) ){
                        txtPlacaCarga      .setText(                 carga.getPlaca   ( )   );
                        txtTaraCarga       .setText( String.valueOf( carga.getTara    ( ) ) );
                        txtCargaMaximaCarga.setText( String.valueOf( carga.getCargaMax( ) ) );
                        txtMarcaCarga      .setText(                 carga.getMarca   ( )   );
                        txtModeloCarga     .setText(                 carga.getModelo  ( )   );
                        txtCorCarga        .setText(                 carga.getCor     ( )   );
                        txtQtdRodasCarga   .setText( String.valueOf( carga.getQtdRodas( ) ) );
                        txtVelocMaxCarga   .setText( String.valueOf( carga.getVelocMax( ) ) );
                        txtQtdPistoesCarga .setText( String.valueOf( carga.getQtdPist ( ) ) );
                        txtPotenciaCarga   .setText( String.valueOf( carga.getPotencia( ) ) );
                    }
                }
            }
            default -> throw new AssertionError();
        }
    }
    
}
