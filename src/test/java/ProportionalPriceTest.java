import org.junit.Test;

public class ProportionalPriceTest {
  
  @Test
  public void testCalculatePrice() {
    ProportionalPrice price = new ProportionalPrice();
    assert (price.calculatePrice(3.0) == 1.0);
  }
}