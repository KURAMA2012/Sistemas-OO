package model;

public class Principal {

	public static void main(String[] args) {
		
		Engenheiro engenheiro1  = new Engenheiro();
		engenheiro1.setNome("Davy");
		engenheiro1.setSalarioBruto(10000);
		engenheiro1.setCpf("12345670");
		System.out.println(engenheiro1.calcularSalarioLiquido(0.8f, 400.70f));
		
		Medico medico1 = new Medico();
		medico1.setNome("Gabriel");
		medico1.setSalarioBruto(14000);
		medico1.setCpf("1234764");
		System.out.println(medico1.calcularSalarioLiquido(0.7f, 1500.70f));
		
		Professor professor1 = new Professor(78);
		professor1.setNome("WarLord");
		professor1.setSalarioBruto(2500.60f);
		professor1.setCpf("343343434");
		professor1.setHorasTrabalhadas(9);
		System.out.println(professor1.calcularSalarioLiquido(0.6f, 500.30f));
		System.out.println(professor1.calcularSalarioLiquido(0.8f));

	}

}
