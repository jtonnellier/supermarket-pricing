public class ProportionalPrice
  implements Price
{
  double guidingCoefficient = 1.0 / 3.0 ;
  
  public ProportionalPrice() {}
  
  public ProportionalPrice(double newGuidingCoefficient) throws BeanNumberMustBePositiveException {
    if (newGuidingCoefficient < 0) throw new BeanNumberMustBePositiveException();
    guidingCoefficient = newGuidingCoefficient;
  }
  

  public double calculatePrice(double beans) {
    return guidingCoefficient * beans;
  }
}