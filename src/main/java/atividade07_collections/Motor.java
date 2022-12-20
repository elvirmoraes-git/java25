package com.mycompany.atividade07_collections;

public class Motor {
	
	private int qtdPist;
	private int potencia;
	
	public Motor() {}
	
	// Poss�vel constru��o do motor
	public Motor( int qtdPist, int potencia ) {
		this.qtdPist  = qtdPist;
		this.potencia = potencia;
	}

	public int getQtdPist() {
		return qtdPist;
	}

	public void setQtdPist(int qtdPist) {
		this.qtdPist = qtdPist;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}
