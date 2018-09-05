public class StepPrice
  extends ProportionalPrice
{
  int step = 2;
  
  public StepPrice() {}
  
  public StepPrice(double newGuidingCoefficient) throws BeanNumberMustBePositiveException {
    super(newGuidingCoefficient);
  }
  
  public StepPrice(double newGuidingCoefficient, int step) throws BeanNumberMustBePositiveException {
    super(newGuidingCoefficient);
    this.step = step;
  }
  
  public double calculatePrice(double beans)  {
    double realBeansToPay = (int)beans / step;
    if ((int)beans % step == 1) realBeansToPay += 1.0;
    return realBeansToPay * guidingCoefficient;
  }
}