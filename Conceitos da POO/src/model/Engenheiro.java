package model;

public class Engenheiro extends Profissional {

	private String crea;

	private final static float PISO_SALARIAL = 7000;

	public String getCrea() {
		return crea;
	}

	public void setCrea(String crea) {
		this.crea = crea;
	}

}
