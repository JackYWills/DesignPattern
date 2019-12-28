package command;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/28 18:37
 * @Version V1.0
 **/
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
