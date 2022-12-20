package condicional;

public class IfeElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0, b = 20;
		
		for( a = 0; a <= b; a++ ) {
			
			if( a == (b/2)  ) {
				
				System.out.println( "O valor de A é igual a metade de B, logo A vale " + a + 
						" e B, vale " + b );
				System.out.println("entrou aqui");
				
			}
			else if ( a != (b/2) ){
				
				System.out.println( "O valor de A é diferente da metade de B, logo A vale "
						+ a + " e B vale " + b );
			}
		}
		
	}

}
