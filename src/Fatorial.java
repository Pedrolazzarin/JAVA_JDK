package Java_JDK;

public class FatorialAte10 {
	/*Agora crie uma nova classe, escreva um for que inicie uma variável n (número atual) como 1 
	e fatorial (resultado total) como 1. Faça seu laço entre 1 a 10 e calcule o resultado!*/
	
	public static void main(String args[]) {
		int fatorial = 1;
		for(int i = 1; i < 11; i++) {
			 fatorial *= i;
		
			System.out.println("O fatorial de "+i+ " eh: "+fatorial);
		}
	}
}

