package Server;
/**
 * Created by ariel on 16.03.2016.
 */

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ServerController {

    public boolean r5;
    public boolean me;

    @FXML
    Button startr5;

    @FXML
    Button stopr5;

    @FXML
    Button startme;

    @FXML
    Button stopme;

    @FXML
    Button stopall;

    @FXML
    Button setting;

    @FXML
    TextArea console;

    public void startr5(){
        this.r5 = true;
        startr5.setDisable(true);
        stopr5.setDisable(false);
        stopall.setDisable(false);
        console.setText(console.getText() + "Started Red5 server" + "\n");
    }

    public void stopr5(){
        this.r5 = false;
        startr5.setDisable(false);
        stopr5.setDisable(true);
        if (r5 == false && me == false){
            stopall.setDisable(true);
        }
        console.setText(console.getText() + "Stopped Red5 server" + "\n");
    }

    public void startme(){
        this.me = true;
        startme.setDisable(true);
        stopme.setDisable(false);
        stopall.setDisable(false);
        console.setText(console.getText() + "Started save.me server" + "\n");
    }

    public void stopme(){
        this.me = false;
        startme.setDisable(false);
        stopme.setDisable(true);
        if (r5 == false && me == false){
            stopall.setDisable(true);
        }
        console.setText(console.getText() + "Stopped save.me server" + "\n");
    }

    public void stopall(){
        this.me = false;
        this.r5 = false;
        startme.setDisable(false);
        startr5.setDisable(false);
        stopme.setDisable(true);
        stopr5.setDisable(true);
        console.setText(console.getText() + "Stopped all servers" + "\n");

    }
}
