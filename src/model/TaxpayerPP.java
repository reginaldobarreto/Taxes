package model;

public class TaxpayerPP extends Taxpayer{
	
	private Double healthSpending;

	public TaxpayerPP(String name, Double annual_Income, Double healthSpending) {
		super(name, annual_Income);
		this.healthSpending = healthSpending;
	}

	public TaxpayerPP() {
		super();
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public Double tax() {
		Double tax;
		if(super.getAnnual_Income() < 20000){
			tax = super.getAnnual_Income() * 0.15 - (getHealthSpending() * 0.5);
		}
		else {
			tax = super.getAnnual_Income() * 0.25 - (getHealthSpending() * 0.5);
		}
		return tax;
	}
	

}
