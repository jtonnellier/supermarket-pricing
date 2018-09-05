import org.junit.Test;

public class StepPriceTest {
  public StepPriceTest() {}
  
  @Test
  public void testcalculatePriceFiveBeansValueThreeBeans() { 
	  StepPrice price = new StepPrice();
	  assert (price.calculatePrice(5.0) == 1.0);
  }
  
  @Test
  public void testcalculatePriceSixBeansValueThreeBeans() {
    StepPrice price = new StepPrice();
    assert (price.calculatePrice(6.0) == 1.0);
  }
  
  @Test
  public void testcalculatePriceFourBeansValueTwoBeans() {
    StepPrice price = new StepPrice();
    assert (price.calculatePrice(4.0) == 2.0 / 3.0);
  }
}