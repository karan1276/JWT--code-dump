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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author student
 */
public class ComplexCalcController implements Initializable {

    Stage stage;
    Parent root;
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
    private Button btpow;
    @FXML
    private Button btmod;
    @FXML
    private Button btsin;
    @FXML
    private Button btcos;
    @FXML
    private TextField ans;
    @FXML
    private TextField num1;
    @FXML
    private TextField num2;

    @FXML
    private void handelClick(ActionEvent e) throws Exception {
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());

        if (e.getSource() == btadd) {
            handelAdd(e, n1, n2);
        } else if (e.getSource() == btsub) {
            handelSub(e, n1, n2);
        } else if (e.getSource() == btmult) {
            handelMult(e, n1, n2);
        } else if (e.getSource() == btdiv) {
            handelDiv(e, n1, n2);
        } else if (e.getSource() == btpow) {
            handelPow(e, n1, n2);
        } else if (e.getSource() == btmod) {
            handelMod(e, n1, n2);
        } else if (e.getSource() == btsin) {
            handelSin(e, n1);
        } else if (e.getSource() == btcos) {
            handelCos(e, n1);
        } else if (e.getSource() == btchng) {
            handelChange(e);
        }
    }

    @FXML
    private void handelAdd(ActionEvent e, int n1, int n2) {
        ans.setText(Integer.toString(n1 + n2));
    }

    @FXML
    private void handelSub(ActionEvent e, int n1, int n2) {
        ans.setText(Integer.toString(n1 - n2));
    }

    @FXML
    private void handelMult(ActionEvent e, int n1, int n2) {
        ans.setText(Integer.toString(n1 * n2));
    }

    @FXML
    private void handelDiv(ActionEvent e, int n1, int n2) {
        ans.setText(Double.toString(n1 / n2));
    }

    @FXML
    private void handelPow(ActionEvent e, int n1, int n2) {
        ans.setText(Double.toString(Math.pow(n1, n2)));
    }

    @FXML
    private void handelMod(ActionEvent e, int n1, int n2) {
        ans.setText(Integer.toString(n1 % n2));
    }

    @FXML
    private void handelSin(ActionEvent e, int n1) {
        ans.setText(Double.toString(Math.sin(n1)));
    }

    @FXML
    private void handelCos(ActionEvent e, int n1) {
        ans.setText(Double.toString(Math.cos(n1)));
    }

    @FXML
    private void handelChange(ActionEvent e) throws Exception {
        stage = (Stage) btchng.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
