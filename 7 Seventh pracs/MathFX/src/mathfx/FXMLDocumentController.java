/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author student
 */
public class FXMLDocumentController implements Initializable {
    int n1,n2;
    @FXML
    private Button btadd;
    @FXML
    private Button btsub;
    @FXML
    private Button btmult;
    @FXML
    private Button btdiv;
    @FXML
    private Button btchng;
    @FXML
    private Button btcalc;
    @FXML
    private TextField num1;
    @FXML
    private TextField num2;
    
    @FXML
    private void handleButtonAction(ActionEvent e) {
        System.out.println("Just hit something");
        if(btadd== e.getSource()){
            n1 = Integer.parseInt(num1.getText());
            n2 = Integer.parseInt(num2.getText());
            System.out.println("Addintion is :"+(n1+n2));
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
