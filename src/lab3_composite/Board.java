package lab3_composite;

import java.util.*;

public class Board implements EquipmentComponent {
  private Bus bus;
  private Vector<Card> cardlist = new Vector();

  public void setBus (Bus b) {
    bus=b;
  }
  public void addCard(Card d) {
    cardlist.addElement(d);
  }


   @Override
  public double netPrice() {
     return 26.00;
  }

  @Override
  public double discountPrice() {
    return  6.00;
  }

  @Override
  public double computePrice() {
    double tmp=discountPrice();
    if (bus!= null)
       tmp+=bus.computePrice();
    for (Card card : cardlist)
        //Card card = (Card)cardlist.elementAt(x);
        tmp+=card.computePrice();
    return tmp;
  }
}
