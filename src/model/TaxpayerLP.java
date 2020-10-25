package model;

public class TaxpayerLP extends Taxpayer{
	
	private Double numberEmployees;

	public TaxpayerLP(String name, Double annual_Income) {
		super(name, annual_Income);
	}

	public TaxpayerLP() {
		super();
	}
	
	public Double getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Double numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public Double tax() {
		// TODO Auto-generated method stub
		return null;
	}

}
