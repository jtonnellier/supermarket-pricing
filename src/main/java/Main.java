public class Main {
  
  public static void main(String[] args) { double beans = 5.0D;
    
    ProportionalPrice propPrice = new ProportionalPrice();
    System.out.println("propPrice.calculatePrice(" + beans + ")=" + propPrice.calculatePrice(beans));
    beans = 6.0;
    System.out.println("propPrice.calculatePrice(" + beans + ")=" + propPrice.calculatePrice(beans));
    
    StepPrice price = new StepPrice();
    beans = 5.0;
    System.out.println("price.calculatePrice(" + beans + ")=" + price.calculatePrice(beans));
    beans = 6.0;
    System.out.println("price.calculatePrice(" + beans + ")=" + price.calculatePrice(beans));
    

    PricePerPound pricePerPound = new PricePerPound();
    beans = 3.0;
    System.out.println("pricePerPound.calculatePrice(" + beans + ")=" + pricePerPound.calculatePrice(beans));
    beans = 6.0;
    System.out.println("pricePerPound.calculatePrice(" + beans + ")=" + pricePerPound.calculatePrice(beans));
  }
}