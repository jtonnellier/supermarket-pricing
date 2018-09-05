class PricePerPound implements Price {
	
	final double ONE_POUND_VALUE = 1.99;
	final double BEAN_POUND_AVERAGE = 1.0 / 6.0;
  
  
	public double calculatePrice(double beans) {
		PricePerPound price = new PricePerPound();
		double beanPound = price.convertBeansToPound(beans);
		return beanPound * 1.99;
	}
  
  public double convertBeansToPound(double beans) { 
	  return beans * BEAN_POUND_AVERAGE; 
  }
  
}