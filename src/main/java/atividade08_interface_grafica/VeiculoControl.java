/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade08_interface_grafica;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author D88P
 */
public class VeiculoControl {
    
    public static void cadastrarVeiculo( int veiculo ) throws VeicExistException {
        
        switch ( veiculo ) {
            case 1 -> {
                try {
                    Passeio passeio = new Passeio( );
                    
                    if( !consultarVeiculo( Janela.veiculoDePasseio, Janela.placaPasseio ) ){
                        passeio.setQtdPassageiros(    Integer.parseInt( Janela.qtdPassageiros    ) );
                        passeio.setPlaca         (                      Janela.placaPasseio        );
                        passeio.setMarca         (                      Janela.marcaPasseio        );
                        passeio.setModelo        (                      Janela.modeloPasseio       );
                        passeio.setCor           (                      Janela.corPasseio          );
                        passeio.setVelocMax      ( 1, Float.parseFloat( Janela.velocMaxPasseio   ) );
                        passeio.setQtdRodas      (    Integer.parseInt( Janela.qtdRodasPasseio   ) );
                        passeio.setQtdPist       (    Integer.parseInt( Janela.qtdPistoesPasseio ) );
                        passeio.setPotencia      (    Integer.parseInt( Janela.potenciaPasseio   ) );
                    
                        BDVeiculos.listaDeVeiculos.add( passeio );
                    }
                    
                } catch ( VelocException ex ) {
                    Logger.getLogger(VeiculoControl.class.getName()).log(Level.SEVERE, null, ex);
                }
                finally{
                    Janela.limparDadosCadastro( Janela.veiculoDePasseio );
                
                }
            }

            case 2 -> {
                
                try {
                    Carga carga = new Carga( );
                    
                    if( !consultarVeiculo( Janela.veiculoDeCarga, Janela.placaCarga ) ){
                        carga.setTara    (    Integer.parseInt( Janela.taraCarga        ) );
                        carga.setCargaMax(    Integer.parseInt( Janela.cargaMaximaCarga ) );
                        carga.setPlaca   (                      Janela.placaCarga         );
                        carga.setMarca   (                      Janela.marcaCarga         );
                        carga.setModelo  (                      Janela.modeloCarga        );
                        carga.setCor     (                      Janela.corCarga           );
                        carga.setQtdRodas(    Integer.parseInt( Janela.qtdRodasCarga    ) );
                        carga.setVelocMax( 2, Float.parseFloat( Janela.velocMaxCarga    ) );
                        carga.setQtdPist (    Integer.parseInt( Janela.qtdPistoesCarga  ) );
                        carga.setPotencia(    Integer.parseInt( Janela.potenciaCarga    ) );

                        BDVeiculos.listaDeVeiculos.add( carga );
                    }                    
                    
                } catch ( VelocException ex ) {
                    Logger.getLogger(VeiculoControl.class.getName()).log(Level.SEVERE, null, ex);
                }
                finally{
                    Janela.limparDadosCadastro( Janela.veiculoDeCarga );
                
                }
            }

            default -> throw new AssertionError();
        }
        
        
    }
    
    /**
     * 
     * Elvir Moraes - UTFPR
     * 
     * @param veiculo = indicar qual veículo consultar.
     * @param placa   = indicar qual placa consultar.
     * @return true   = se a placa do veículo for encontrado na lista de 
     *                  veículos cadastrados.
     * @throws VeicExistException = dispara exceção se placa encontrada 
     *                              na lista de veículos.
     */
    public static boolean consultarVeiculo( int veiculo, String placa ) throws VeicExistException  {
        
        switch ( veiculo ) {
            case 1 -> {

                return VeicExistException.verifica( placa );
                
            }
            case 2 -> {
                
                return VeicExistException.verifica( placa );
                
            }
            default -> throw new AssertionError();
        }
    }
    
}
