package com.mycompany.atividade08_interface_grafica;


/**
 * @author Elvir Moraes
 * Ra: 02398150
 * Rio de Janeiro, 21/07/2022
 * UTFPR - Universidade Tecnol�gica Federal do Paran�
 * 
 * Classe Abstrata para qualquer tipo de Ve�culo.
 * 
 */
public abstract class Veiculo {
	
	// Dados em comum com qualquer tipo de ve�culo.
	private   String placa   = "";
	private   String marca   = "";
	private   String modelo  = "";
	private   String cor     = "";
	private   float velocMax = 0.0f;
	private   int   qtdRodas = 0;
	// protected Motor motor; // N�o pode declarar assim
	// Tem que passar por par�metro as configura��es do motor
	private   int qtdPist  = 0;
	private   int potencia = 0;
	// Construtor vazio
	public Veiculo() {}
	// com parametros
	public Veiculo( String placa, 
					String marca, 
					String modelo, 
					String cor, 
					float  velocMax, 
					int    qtdRodas, 
					// configura��o do motor
					int    qtdPist, 
					int    potencia
					) {
		// TODO Construtor sobrecarregado de Veiculo.
		this.placa     =             placa;
		this.marca     =             marca;
		this.modelo    =             modelo;
		this.cor       =             cor;
		this.velocMax  =             velocMax;
		this.qtdRodas  =             qtdRodas;
		// O certo � receber os valores do Motor pelo par�metro 
		// e fazer o new Motor dentro do construtor
		Motor motor    = new Motor (          );
		motor          .setQtdPist ( qtdPist  );
		motor          .setPotencia( potencia );
		// motor = new Motor( qtdPis, potencia );
		
	}
	
	// M�todo para calcuar velocidade de ve�culos.
	public abstract float calcVel(float velocMax);
	
	public String getPlaca() {
		return ( placa == null )? "" : placa;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getCor() {
		return cor;
	}
	public float getVelocMax() {
		return velocMax;
	}
	public int getQtdRodas() {
		return qtdRodas;
	}
	
	/**
	 * 4) RESTRI��ES -> a. N�O PERMITA QUE:
	 * ii. Sobrescrevam os m�todos setters da classe Veiculo;
	 */
	public final void setPlaca( String placa ) {
		this.placa = placa;
	}
	public final void setMarca(String marca) {
		this.marca = marca;
	}
	public final void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public final void setCor(String cor) {
		this.cor = cor;
	}
        
        /**
         * 
         * @param velocMax
         * @throws VelocException 
         */
	public final void setVelocMax( int veiculo, float velocMax ) throws VelocException {
            
            if( veiculo == 1 ){
                try {
                    boolean veloc = VelocException.verifica( velocMax );
                    /** ii. Neste caso (ap�s disparar a exce��o), se estiver �tentando� atribuir 
                     * velocidade para um carro de passeio, este dever� assumir 100 (Km/h 
                     * para velocidade m�xima) se for um ve�culo de carga assumir� 90 Km/h;
                     */
                    this.velocMax = velocMax;
                } catch ( Exception e ) {
                    //System.out.println("Velocidade padrão Passeio.");
                    this.velocMax = 100.0f;
                }
            }else if( veiculo == 2 ){
                try {
                    boolean veloc = VelocException.verifica( velocMax );
                    /** ii. Neste caso (ap�s disparar a exce��o), se estiver �tentando� atribuir 
                     * velocidade para um carro de passeio, este dever� assumir 100 (Km/h 
                     * para velocidade m�xima) se for um ve�culo de carga assumir� 90 Km/h;
                     */
                    this.velocMax = velocMax;
                } catch ( Exception e ) {
                    //System.out.println("Velocidade padr�o Carga.");
                    this.velocMax = 90.0f;
                }
            }
	}
	
        public final void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}
	
	// Motor
	public int getQtdPist() {
		return qtdPist;
	}
	public int getPotencia() {
		return potencia;
	}
	public final void setQtdPist(int qtdPist) {
		this.qtdPist = qtdPist;
	}
	public final void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}
