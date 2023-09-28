package lab5_command;

public class PushCommand implements Command {

    //Receiver
    private VStack stackVector;
    private Object obj;

    PushCommand(VStack vector, Object obj) {
        this.stackVector = vector;
        this.obj = obj;
    }

    @Override
    public void execute() {
         stackVector.push(obj);
    }

    @Override
    public void undo() {
        stackVector.pop();
    }

}
