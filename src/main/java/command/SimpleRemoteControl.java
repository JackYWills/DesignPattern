package command;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/28 18:42
 * @Version V1.0
 **/
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl(){}

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }

}
