package com.mycompany.atividade08_interface_grafica;

import javax.swing.JOptionPane;

public class VeicExistException extends Exception {
    
    public VeicExistException() {
        // TODO Auto-generated constructor stub
        JOptionPane.showMessageDialog( null, "Veículo já cadastrado.", "VeicExistException1", JOptionPane.ERROR_MESSAGE );
    }

    static boolean verifica( String placa ) throws VeicExistException {//throws NullPointerException
        boolean existe = false;
        
        for ( Veiculo veiculo : BDVeiculos.listaDeVeiculos ) {
            if( veiculo.getPlaca( ).equals( placa )){
                existe = true;
                throw new VeicExistException( );
            }
        }
       
        return existe;
    }
	
    
}
