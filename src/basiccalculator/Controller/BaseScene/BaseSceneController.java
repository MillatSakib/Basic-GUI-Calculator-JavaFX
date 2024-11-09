
package basiccalculator.Controller.BaseScene;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class BaseSceneController implements Initializable {

    @FXML
    private TextField display;
    @FXML
    private void handleClick(ActionEvent Event){
        System.out.println("Calculator off");
    }
    @FXML
    private void allCrlear(ActionEvent Event){
        
        display.setText("");
    }
    @FXML
    private void clear(ActionEvent Event){
        String temp = display.getText();
        temp =temp.substring(0, temp.length() - 1);
        display.setText(temp);
    }
    @FXML
    private void writingDigit(ActionEvent Event){
        String oldText = display.getText();
        String newText = ((Button)Event.getSource()).getText();
        String number = oldText+newText;
        display.setText(number);
    }
    @FXML
    private void operatorAction(ActionEvent Event){
        System.out.println("Hello worldsdff");
    }
    @FXML
        private void persentageButtonAction(ActionEvent Event){
        System.out.println(Event.getTarget());
    }
       @FXML
        private void dotButtonAction(ActionEvent Event){
        System.out.println("Hello worldsdff");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
