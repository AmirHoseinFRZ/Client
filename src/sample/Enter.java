package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

public class Enter {
    @FXML
    Label alias;
    @FXML
    Label number;
    @FXML
    ImageView picture;
    @FXML
    Label username;

    public void transmission(ActionEvent actionEvent) {
    }

    public void payment(ActionEvent actionEvent) {
    }

    public void loan(ActionEvent actionEvent) {
    }

    public void logOut(ActionEvent actionEvent) {
    }

    public void personal(ActionEvent actionEvent) {
    }

    public void acc(ActionEvent actionEvent) throws Exception {
        Main main = new Main();
        main.changeScene("createAcc.fxml");
    }

    public void button() {
        username.setText(AfterSignUpButton.usernames);
        alias.setText(LogIn.aliass); // changes if there are more than one alias.
        number.setText("15749856");
    }
}
