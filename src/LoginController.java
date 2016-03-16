/**
 * Created by Ariel on 3/16/2016.
 */

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController {

    @FXML
    TextField ip;

    @FXML
    TextField port;

    @FXML
    PasswordField password;

    public void login(){
        System.out.println(ip.getText());
    }
}
