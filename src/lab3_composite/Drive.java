package lab3_composite;

public class Drive implements EquipmentComponent {

  @Override
  public double netPrice() {
    return 10.00;
  }

  @Override
  public double discountPrice() {
    return 4.00;
  }

  @Override
  public double computePrice(){
    return discountPrice();
  }
}

