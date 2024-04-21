package clase1.moure;
public class Sualseneguer {
	
	//URL sitio web --> https://docs.oracle.com/javase/8/docs/api/
	
	//Comentario de 1 línea: Declaración de una constante
	private static final String CADENA_TEXTO= "Esto es una constante";
	
	/*Los comentarios en varias líneas, para el lenguaje Java
	 * se inician con '/*' y finalizan con los mismos elementos
	 * pero usados en orden inverso
	 */

	public static void main(String[] args) {
		
		//Declaración de una variable
		int entero;
		//Inicialización de una variable
		entero = 0;
		//Declaración + inicialización de una variable
		char inicial = 'r';
		
		//Datos primitivos en Java
		byte id;	//Almacena enteros de 8 bits, de -128 a 127
		short numMatricula;	//Almacena enteros de 16 bits, de -32768 a 32767
		int numEntero;	//Almacena enteros de 32 bits, de -2147483648 a 2147483647
		long numGrande;	//Almacena enteros de 64 bits, de -9223372036854775808 a 922337203684775807
		float decimal;	//Almacena nº real de precisión simple de 32 bits
		double decimalGrande;	//Almacena nº real de precisión doble de 64 bits
		boolean verdaderoFalso;	//Almacena valores lógicos, como son True o False
		char caracter;	//Almacena un único caracter Unicode de 16 bits
		
		//Aparte tendríamos el tipo de dato String, pero no es primitivo
		String lenguaje = "Java";
		
		//Imprimir por pantalla
		System.out.println("Hola, " + lenguaje + "!");

	}

}
