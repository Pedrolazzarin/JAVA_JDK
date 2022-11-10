package bytebankencapsulado;

public class TestaGetESet {
	 
	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero = 1337;
		conta.setAgencia(1337);
		System.out.println(conta.getAgencia());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
		paulo.nome = "paulo";
		conta.setTitular(paulo);
		System.out.println(conta.getTitular());
		
		
	}
}
