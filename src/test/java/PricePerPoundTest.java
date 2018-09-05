import org.junit.Test;

public class PricePerPoundTest {	
  
  @Test
  public void testCalculatePrice() {
    PricePerPound price = new PricePerPound();    
    double beans = 2.0;
    assert(price.calculatePrice(beans) == beans * price.BEAN_POUND_AVERAGE * price.ONE_POUND_VALUE);
  }
  
  @Test
  public void testConvertBeansToPound() { 
	  PricePerPound price = new PricePerPound();
	  double beans = 2.0;
	  assert(price.convertBeansToPound(beans) == price.BEAN_POUND_AVERAGE * beans);
  }
  
}