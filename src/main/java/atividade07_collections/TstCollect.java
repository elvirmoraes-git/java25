package com.mycompany.atividade07_collections;

/**
 * @author  Elvir Moraes * Ra: 02398150
 * @version Atividade 04 Interface.
 *
 * Software de cadastro de veículos de passeio e de carga.
 */
public class TstCollect {
    
    // Dispositivo de entrada de digitação.
    static Leitura    leitura         = new Leitura();
    // Por meio dela deverá ser possível instanciar 5 veículos
    // de cada tipo (Passeio/Carga)
    
    // static Passeio[ ] vetorPasseio    = new Passeio[ 3 ];
    // static Carga  [ ] vetorCarga      = new Carga  [ 3 ];
    static int contadorPasseio = 0,
               contadorCarga   = 0;
    
    // Atributos globais.
    static String placa          = "",
                  marca          = "",
                  modelo         = "",
                  cor            = "";
    static float  velocMax       = 0f;
    static int    qtdRodas       = 0,
                  qtdPist        = 0,
                  potencia       = 0,
                  // Atributo somente de passeio.
                  qtdPassageiros = 0,
                  // Atributos somete de carga.
                  cargaMax       = 0,
                  tara           = 0;
    
    public void imprimirCargaPelaPlaca( ) {	// TODO Mãtodo para imprimir Veículo de Carga pela placa.
        System.out.println( "\nImprimir Veículo de Carga pela Placa. " );
        String placa = leitura.teclado( "\n Digite a Placa: " );
        Carga comparaPlaca = new Carga( );
        comparaPlaca.setPlaca( placa );
        for ( Carga carga : BDVeiculos.arrayListCarga ) {
            if ( comparaPlaca.getPlaca( ).equals( carga.getPlaca( ) ) ) {
                System.out.println( "--------------------------------" );
                // f. Sempre que se optar pela opãão 5 ou pela 6 do Menu Inicial, (Imprimir Pela Placa)
                System.out.println( "Placa: "               + carga.getPlaca   ( ) );
                // estes valores serão apresentados junto com as demais informaãães do respectivo veãculo;
                System.out.println( "Marca: "               + carga.getMarca   ( ) );
                System.out.println( "Modelo: "              + carga.getModelo  ( ) );
                System.out.println( "Cor predominante: "    + carga.getCor     ( ) );
                System.out.println( "Quantidade de Rodas: " + carga.getQtdRodas( ) );
                System.out.println( "Quantos Pistães: "     + carga.getQtdPist ( ) );
                System.out.println( "Cavalos de Potãncia: " + carga.getPotencia( ) );
                System.out.println( "Tara: "                + carga.getTara    ( ) );
                System.out.println( "--------------------------------" );
                // ii. Saãdas: como achar melhor, porãm deve imprimir os dados na mesma
                // sequãncia dos atributos da classe-mãe Veiculo
                // e depois destes os resultados dos mãtodos
                // ãcalcularã e ãcalcVelã;
                int totalCaracteres = carga.calcular( carga );
                System.out.println( "Caracteres dos Atributos String: " + totalCaracteres );
                System.out.println( "Velocidade Mãxima em m/h: "        + carga.calcVel( carga.getVelocMax( ) ) );
            }
        }
        
        System.out.println( "Fim da impressão de Carga pela Placa." );
    }
    
    /**
     * f. Sempre que se optar pela opãão 5 ou pela 6 do Menu Inicial, estes valores serão
     * apresentados junto com as demais informaãães do respectivo veãculo;
     */
    public void imprimirPasseioPelaPlaca( ) { // TODO Mãtodo para imprimir Veículo de Passeio pela Placa
        System.out.println( "\nImprimir Veículo de Passeio pela Placa. " );
            String plac = leitura.teclado( "\nDigite a Placa: " );
            Passeio comparaPlaca = new Passeio();
            comparaPlaca.setPlaca( plac );
            for ( Passeio passeio : BDVeiculos.arrayListPasseio ) {
                if ( comparaPlaca.getPlaca().equals( passeio.getPlaca( ) ) ) {
                    System.out.println( "--------------------------------" );
                    // f. Sempre que se optar pela opãão 5 ou pela 6 do Menu Inicial, (Imprimir Pela Placa)
                    System.out.println( "Placa: "                        + passeio.getPlaca         ( )   );
                    // estes valores serão apresentados junto com as demais informaãães do respectivo veãculo;
                    System.out.println( "Marca: "                        + passeio.getMarca         ( )   );
                    System.out.println( "Modelo: "                       + passeio.getModelo        ( )   );
                    System.out.println( "Cor predominante: "             + passeio.getCor           ( )   );
                    System.out.println( "Quantidade de Rodas: "          + passeio.getQtdRodas      ( )   );
                    System.out.println( "Quantos Pistães: "              + passeio.getQtdPist       ( )   );
                    System.out.println( "Cavalos de Potãncia: "          + passeio.getPotencia      ( )   );
                    System.out.println( "Limite Máximo de Passageiros: " + passeio.getQtdPassageiros( )   );
                    System.out.println( "--------------------------------" );
                    // ii. Saãdas: como achar melhor, porãm deve imprimir os dados na mesma
                    // sequãncia dos atributos da classe-mãe Veiculo
                    // e depois destes os resultados dos mãtodos
                    // ãcalcularã e ãcalcVelã;
                    int total = passeio.calcular( passeio );
                    System.out.println( "Caracteres dos Atributos String: " + total );
                    System.out.println( "Velocidade Máxima em m/h: "        + passeio.calcVel( passeio.getVelocMax   ( ) ) );
                }
            }
            System.out.println( "Fim da impressão de Passeio pela Placa." );
    }
    
    public void imprimirTodosCarga( )  {
        // TODO Imprime veículos de carga cadastrados.
        // teste de impressão
        for ( Carga eachCarga : BDVeiculos.arrayListCarga ) {
                
            if( !eachCarga.getPlaca().isBlank() ){
                System.out.println( "--------------------------------" );
                System.out.println( "Placa: "                                    + eachCarga.getPlaca   ( ) );
                System.out.println( "Marca: "                                    + eachCarga.getMarca   ( ) );
                System.out.println( "Modelo: "                                   + eachCarga.getModelo  ( ) );
                System.out.println( "Cor predominante: "                         + eachCarga.getCor     ( ) );
                System.out.println( "Quantidade de Rodas: "                      + eachCarga.getQtdRodas( ) );
                System.out.println( "Quantos Pistães: "                          + eachCarga.getQtdPist ( ) );
                System.out.println( "Cavalos de Potência: "                      + eachCarga.getPotencia( ) );
                System.out.println( "Carga Máxima Suportada: "                   + eachCarga.getCargaMax( ) );
                System.out.println( "Tara: "                                     + eachCarga.getTara    ( ) );
                System.out.println( "--------------------------------" );

                // ii. Saãdas: como achar melhor, porãm deve imprimir os dados na mesma
                // sequãncia dos atributos da classe-mãe Veiculo
                // e depois destes os resultados dos mãtodos
                // ãcalcularã e ãcalcVelã;
                int soma = eachCarga.calcular(eachCarga);
                System.out.println( "Soma valores numéricos dos atributos int: " + soma );
                System.out.println( "Velocidade Máxima em c/h: "                 + eachCarga.calcVel( eachCarga.getVelocMax( ) ) );
            }
        }
    }
    
    public void imprimirTodosPasseio( ){
        // TODO Imprime veículos de passeio cadastrados.
        
        // Imprime um veãculo por vez.
        for ( Passeio eachPasseio : BDVeiculos.arrayListPasseio ) {
            
            if( !eachPasseio.getPlaca().isBlank( ) ){
                System.out.println( "--------------------------------" );
                System.out.println( "Placa: "                        + eachPasseio.getPlaca         ( )   );
                System.out.println( "Marca: "                        + eachPasseio.getMarca         ( )   );
                System.out.println( "Modelo: "                       + eachPasseio.getModelo        ( )   );
                System.out.println( "Cor predominante: "             + eachPasseio.getCor           ( )   );
                System.out.println( "Quantidade de Rodas: "          + eachPasseio.getQtdRodas      ( )   );
                System.out.println( "Quantos Pistões: "              + eachPasseio.getQtdPist       ( )   );
                System.out.println( "Cavalos de Potência: "          + eachPasseio.getPotencia      ( )   );
                System.out.println( "Limite Máximo de Passageiros: " + eachPasseio.getQtdPassageiros( )   );
                System.out.println( "--------------------------------" );

                // ii. Saãdas: como achar melhor, porãm deve imprimir os dados na mesma
                // sequãncia dos atributos da classe-mãe Veiculo
                // e depois destes os resultados dos mãtodos
                // ãcalcularã e ãcalcVelã;
                int total = eachPasseio.calcular( eachPasseio );
                System.out.println( "Caracteres dos Atributos String: " + total );
                System.out.println( "Velocidade Máxima em m/h: "        + eachPasseio.calcVel( eachPasseio.getVelocMax   ( ) ) );
            }
        }
        System.out.println( "Fim da impressão." );
        
    }
    
    /**
     * Cadastra um veãculo de carga por vez
     */
    public void cadastrarCarga( ) throws VelocException {
        // TODO Mãtodo para cadastrar veículos de carga.
        Carga carga = new Carga();
        
        System.out.println( "Cadastro de Veículo de Carga." );
        boolean continua = true;
	while( continua ){
        placa  = leitura.teclado( "Placa: "            );
			
            if( VeicExistException.verifica( placa ) ){
				System.out.println("Já existe um veículo com esta placa.");
                continua = false;
                break;				
			}else{
				marca  = leitura.teclado( "Marca: "            );
				modelo = leitura.teclado( "Modelo: "           );
				cor    = leitura.teclado( "Cor predominante: " );
				// A velocidade do veãculo de carga deverã ser calculada em cm/h;
				// 1 kilometer/hour = 100000 centimeter/hour
				// Atenãão:
				// O mãtodo calcVel(float velocMax) NãO deve alterar o valor do atributo velocMax, apenas
				// convertã-lo e retornar o valor convertido para que seja exibido na tela por meio da classe Teste;
				velocMax = Float.parseFloat( leitura.teclado( "Velocidade Mãxima em km/h: "  ) );
				qtdRodas = Integer.parseInt( leitura.teclado( "Quantidade de Rodas: "        ) );
				qtdPist  = Integer.parseInt( leitura.teclado( "Quantos Pistães: "            ) );
				potencia = Integer.parseInt( leitura.teclado( "Cavalos de Potãncia: "        ) );
				// carga
				cargaMax = Integer.parseInt( leitura.teclado( "Carga Mãxima Suportada: "     ) );
				tara     = Integer.parseInt( leitura.teclado( "Tara: "                       ) );
				// carga = new Carga( placa, marca, modelo, cor, velocMax, qtdRodas, cargaMax, tara, qtdPist, potencia );
				carga.setPlaca(placa);
				carga.setMarca(marca);
				carga.setModelo(modelo);
				carga.setCor(cor);
				carga.setVelocMax( 2, velocMax);
				carga.setQtdRodas(qtdRodas);
				carga.setCargaMax(cargaMax);
				carga.setTara(tara);
				carga.setQtdPist(qtdPist);
				carga.setPotencia(potencia);
			
				BDVeiculos.arrayListCarga.add( contadorCarga, carga );
				contadorCarga++;
				
				System.out.println("Deseja cadastrar outro veãculo de Carga? S = sim, N = não");
                String ss = "";
                while( true ){
                    ss = leitura.teclado( "" );
                    if( ss.equals("s") || ss.equals("n") ){
                        break;
                    }
                }
                
                switch (ss) {
                    case "s":
                        continua = true;
                        break;
                        case "n":
                        continua = false;
                        break;
                    default:
                        break;
                }
                
            }
	}
    }
    
    public void cadastrarPasseio( ) throws VelocException {
        // TODO Mãtodo para cadastrar veículos de Passeio
        Passeio passeio = new Passeio();
        
        System.out.println( "Cadastro de Veículo de Passeio." );
        boolean continua = true;
        while( continua ){
            placa          =                                          leitura.teclado( "Placa: "                         );

            if( VeicExistException.verifica( placa ) ){
                System.out.println("Jã existe um veãculo com esta placa.");
                continua = false;
                break;
            }else{
                marca          =                                       leitura.teclado( "Marca: "                         );
                modelo         =                                       leitura.teclado( "Modelo: "                        );
                cor            =                                       leitura.teclado( "Cor predominante: "              );
                // A velocidade do veãculo de passeio deverã ser calculada em m/h;
                // 1 kilometer/hour = 1000 meter/hour
                velocMax       = Float.parseFloat                    ( leitura.teclado( "Velocidade Mãxima em km/h: "    ) );
                qtdRodas       = Integer.parseInt                    ( leitura.teclado( "Quantidade de Rodas: "          ) );
                qtdPist        = Integer.parseInt                    ( leitura.teclado( "Quantos Pistães: "              ) );
                potencia       = Integer.parseInt                    ( leitura.teclado( "Cavalos de Potãncia: "          ) );
                // passeio
                qtdPassageiros = Integer.parseInt(                     leitura.teclado( "Limite Mãximo de Passageiros: " ) );
                //passeio     = new Passeio( placa, marca, modelo, cor, velocMax, qtdRodas, qtdPassageiros, qtdPist, potencia );
                passeio.setPlaca         ( placa          );
                passeio.setMarca         ( marca          );
                passeio.setModelo        ( modelo         );
                passeio.setCor           ( cor            );
                passeio.setVelocMax      ( 1, velocMax    );
                passeio.setQtdRodas      ( qtdRodas       );
                passeio.setQtdPassageiros( qtdPassageiros );
                passeio.setQtdPist       ( qtdPist        );
                passeio.setPotencia      ( potencia       );
                
                BDVeiculos.arrayListPasseio.add( contadorPasseio, passeio );
                contadorPasseio++;
                
                System.out.println("Deseja cadastrar outro veãculo de Passeio? S = sim, N = não");
                String ss = "";
                while( true ){
                    ss = leitura.teclado( "" );
                    if( ss.equals("s") || ss.equals("n") ){
                        break;
                    }
                }
                
                switch (ss) {
                    case "s":
                        continua = true;
                        break;
                        case "n":
                        continua = false;
                        break;
                    default:
                        break;
                }
            }
        }
    }
}