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
import java.lang.*;

/**
 *
 * @author student
 */
public class FXMLDocumentController implements Initializable {
    
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
    private TextField ans;
    @FXML
    private TextField num1;
    @FXML
    private TextField num2;
    
    @FXML
    private void handelClick(ActionEvent e) {
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());

        if(e.getSource() == btadd){
            handelAdd(e,n1,n2);
        }
        else if(e.getSource() == btsub){
            handelSub(e,n1,n2);
        }
        else if(e.getSource() == btmult){
            handelMult(e,n1,n2);
        }
        else if(e.getSource() == btdiv){
            handelDiv(e,n1,n2);
        }
    }
    @FXML
    private void handelAdd(ActionEvent e, int n1, int n2){
        ans.setText(Integer.toString(n1+n2));
    }
    @FXML
    private void handelSub(ActionEvent e, int n1, int n2){
        ans.setText(Integer.toString(n1-n2));
    }
    @FXML
    private void handelMult(ActionEvent e, int n1, int n2){
        ans.setText(Integer.toString(n1*n2));
    }
    @FXML
    private void handelDiv(ActionEvent e, int n1, int n2){
        ans.setText(Integer.toString(n1/n2));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
