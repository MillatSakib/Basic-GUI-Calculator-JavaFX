
package basiccalculator.Controller.BaseScene;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class BaseSceneController implements Initializable {
String operator = "";
double number1 = 0;
    @FXML
    private TextField display;
    @FXML
    private void handleClick(ActionEvent Event){
        System.exit(1);
    }
    @FXML
    private void allCrlear(ActionEvent Event){
        number1=0;
        operator = "";
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
        number1 = Double.parseDouble(display.getText());
         operator = ((Button)Event.getSource()).getText();
        display.setText("");
    }
    @FXML
        private void persentageButtonAction(ActionEvent Event){
        System.out.println(Event.getTarget());
    }
       @FXML
        private void dotButtonAction(ActionEvent Event){
        System.out.println("Hello worldsdff");
    }
        
        @FXML
        private void resultButtonAction(ActionEvent Event){
        double number2 = Double.parseDouble(display.getText());
        if(operator.equals("+")){
        display.setText(""+(number1+number2));
        }
        else if(operator.equals("-")){
        display.setText(""+(number1-number2));
        }
        else if(operator.equals("X")){
        display.setText(""+(number1*number2));
        }
        else if(operator.equals("/")){
        display.setText(""+(number1/number2));
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
