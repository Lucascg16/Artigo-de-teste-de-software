package cucumber.modelo;

public class Conta {

	private String dono;
	private Integer numero;
	private Double saldo;
	private Double limite;

	public Conta(String dono, int numero, Double limite, Double saldo) {
		this.dono = dono;
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;

	}

	public boolean sacar(Double valor) {
		if (this.saldo <= valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	public boolean depositar(Double quantidade) {

		if (this.limite <= quantidade + this.saldo) {
			return false;
		} else {
			this.saldo += quantidade;
			return true;
		}
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

}
