package model;

public abstract class Taxpayer {
	
	private String name;
	private Double annual_Income;
	
	public Taxpayer(String name, Double annual_Income) {
		this.name = name;
		this.annual_Income = annual_Income;
	}

	public Taxpayer() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnual_Income() {
		return annual_Income;
	}

	public void setAnnual_Income(Double annual_Income) {
		this.annual_Income = annual_Income;
	}

	public abstract Double tax();

}
