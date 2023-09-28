package lab3_composite;

import java.util.*;

public class Cabinet implements EquipmentComponent {
  private Board board;
  private Vector<Drive> drivelist = new Vector();
  public void setBoard (Board b) {
    board=b;
  }
  public void addDrive (Drive d) {
    drivelist.addElement(d);
  }

  @Override
  public double netPrice() {
    return 6.00;
  }

  @Override
  public double discountPrice() {
    return 3.00;
  }

  @Override
  public double computePrice() {
    double tmp=netPrice();
    if (board!= null)
       tmp+=board.computePrice();
    for (Drive drive  : drivelist)
        tmp+=drive.computePrice();
    return tmp;  
  }
}
