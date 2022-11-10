 package bytebankComposto;
	
	
		public class Conta {
		private double saldo;
		int agencia;
		int numero;
		String cpf;
		String profissao;
		Cliente titular;
		
		
		//double valor;
		//double deposita = this.saldo -= valor;
		
		public void deposita(double valor) {
			this.saldo += valor;
		}
		
		public boolean saca(double valor) {
			if(this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			}else {
				return false;
			}
		}
		
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
		public double pegaSaldo() {
			return this.saldo;
		}
	
}
