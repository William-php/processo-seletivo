package models;

public class Candidato {
	private String name;
	private double intendedSalary;
	
	public Candidato(String name, double intendedSalary) {
		this.name = name;
		this.intendedSalary = intendedSalary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getIntendedSalary() {
		return intendedSalary;
	}

	public void setIntendedSalary(double intendedSalary) {
		this.intendedSalary = intendedSalary;
	}

	@Override
	public String toString() {
		return "Candidato: " + name + "\n Salário pretendido R$" + intendedSalary;
	}
	
}
