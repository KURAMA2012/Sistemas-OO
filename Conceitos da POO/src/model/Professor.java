package model;

public class Professor extends Profissional {

	private Integer horasTrabalhadas;

	public Professor() {
		this(0);
	}

	public Professor(float salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	// Polimorfismo de sobrescrita
	@Override
	public float calcularSalarioLiquido(float desconto, float bonus) {
		return ((getSalarioBruto() * getHorasTrabalhadas()) * desconto) + bonus;
	}

	// Polimorfismo de sobrecarga
	public float calcularSalarioLiquido(float desconto) {
		return (getSalarioBruto() * getHorasTrabalhadas()) * desconto;
	}

}
