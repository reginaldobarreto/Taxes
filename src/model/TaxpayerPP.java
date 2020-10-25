package model;

public class TaxpayerPP extends Taxpayer{
	
	private Double healthSpending;
	
	public TaxpayerPP(String name, Double annual_Income) {
		super(name, annual_Income);
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
		// TODO Auto-generated method stub
		return null;
	}
	

}
