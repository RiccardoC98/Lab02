package it.polito.tdp.alien;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import it.polito.tdp.alien.model.*;

public class FXMLController {

    @FXML
    private TextArea txtArea;

    @FXML
    private Button btnClear;

    @FXML
    private TextField txtInput;

    @FXML
    private Button btnTranslate;

    Dictionary words = new Dictionary();
    
    @FXML
    void doReset(ActionEvent event) {
    	txtArea.clear();
    }

    @FXML
    void doTranslate(ActionEvent event) {
    	txtArea.appendText(words.translate(txtInput.getText()));
    }

}
