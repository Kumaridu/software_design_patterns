package lab5_command;

import java.util.Vector;

public class VStack{
   private Vector stackvector;
   private Mediator mediator;
   
   public VStack() {
      stackvector= new Vector();
   }

   public void setMediator(Mediator mediator) {
      this.mediator = mediator;
   }
   
   public void push(Object obj) {
      stackvector.insertElementAt(obj,0);
      mediator.update();
   }

   public Object pop() {
      if (stackvector.size()>0) {
         Object obj =stackvector.firstElement();
         stackvector.removeElementAt(0);
         mediator.update();
         return obj;
      }
         else
         return null;
   }

   public void clear() {
      stackvector.clear();
   }
   
   public int getSize(){
      return stackvector.size();
   }
   
   public Vector getStackVector(){
      return stackvector;
   }
    
}
