package model;

public class TaxpayerLP extends Taxpayer{
	
	private int numberEmployees;

	public TaxpayerLP(String name, Double annual_Income, int numberEmployees) {
		super(name, annual_Income);
		this.numberEmployees = numberEmployees;
	}

	public TaxpayerLP() {
		super();
	}
	
	public int getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(int numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public Double tax() {
		Double tax;
		if(getNumberEmployees() <= 10){
			tax = super.getAnnual_Income() * 0.16 ;
		}else {
			tax = super.getAnnual_Income() * 0.14 ;
		}
		return tax;
	}

}
