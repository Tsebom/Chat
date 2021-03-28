package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField textMassage;

    @FXML
    public TextArea conversation;

    @FXML
    public void click() {
        if (!textMassage.getText().equals("")) {
            conversation.appendText(textMassage.getText() + "\n");
            if (textMassage.getText().equals("clear"))
                conversation.clear();
            textMassage.clear();
            textMassage.requestFocus();
        }
    }
}