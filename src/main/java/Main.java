/**
 * Created by franspaco on 19/12/16.
 */

import net.java.games.input.Controller;
import net.java.games.input.ControllerEnvironment;
import net.java.games.*;

public class Main {
    public static void main(String[] args){
        System.setProperty("java.library.path");
        System.out.println("1");
        Controller[] controllers = ControllerEnvironment.getDefaultEnvironment().getControllers();

        for (Controller c : controllers) {
            System.out.println("  " + c.getName() + " -> " + c.getType());
        }
    }
}
