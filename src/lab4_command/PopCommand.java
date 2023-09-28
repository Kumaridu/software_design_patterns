package lab4_command;

import java.util.Vector;

public class PopCommand implements Command {

    private VStack stackVector;

    public PopCommand(VStack stackVector) {
        this.stackVector = stackVector;
    }

    @Override
    public void execute() {
        Vector vector = stackVector.getStackVector();
        if (vector.size() > 0){
            Object obj =vector.firstElement();
            vector.removeElementAt(0);
          //  return obj;
        }
//        else
//            return null;
    }
}
