/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentfx;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.text.Text;
/**
 *
 * @author student
 */
public class StudentFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
//        
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
//        
//        Scene scene = new Scene(root, 300, 250);
//        
//        primaryStage.setTitle("Hello World!");
//        primaryStage.setScene(scene);
//        primaryStage.show();
        
        //Initializinf classes
        GridPane grid = new GridPane();
        Scene s = new Scene(grid, 400, 400);
        final List<StudentNode> al = new ArrayList();
        int count = 2;//row count
        
        //Setting fake data
        for (int i = 0; i < 5; i++) {
            StudentNode stu = new StudentNode();
            stu.setPrn(i);
            stu.setName("chintu"+i);
            stu.setCity("asd"+i);
            al.add(stu);
        }
        
//        
//        StudentNode stu = new StudentNode();
//        
//        stu.setPrn(8);
//        stu.setName("chintu");
//        stu.setCity("asd");
//        al.add(stu);
//        stu.setPrn(9);
//        stu.setName("chintu");
//        stu.setCity("asd");
//        al.add(stu);
//        stu.setPrn(10);
//        stu.setName("chintu");
//        stu.setCity("asd");
//        al.add(stu);
        // add elements to the array list
        System.out.println("--------------------------");
        for(int i = 0; i<al.size(); i++){
                System.out.println(" "+al.get(i).getPrn()+" ");
        }
     //   al.add("A");
      
        //Setting options for classes
        grid.setAlignment(Pos.BASELINE_CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        //grid.setPadding(new Insets(25, 25, 25, 25));
        
        //Seting components'
        Text title = new Text("GUI Student App");
        Text prn = new Text("Prn");
        Text name = new Text("Name");
        Text city = new Text("City");
        final TextField inprn = new TextField();
        final TextField inname = new TextField();
        final TextField incity = new TextField();
        Button btn = new Button("Submit");
        
        
        
        
        
        //adding components to grid
        grid.add(prn, 0,1);
        grid.add(name,1,1);
        grid.add(city,2,1);
        
        grid.add(inprn, 0,2);
        grid.add(inname,1,2);
        grid.add(incity,2,2);
        grid.add(btn,1,3);
        
        
        //Event handels
        btn.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent t) {
                StudentNode stu = new StudentNode();
                stu.setPrn(Integer.parseInt(inprn.getText()));
                stu.setName(inname.getText());
                stu.setCity(incity.getText());
                al.add(stu);

                
                for(int i = 0; i<al.size(); i++){
                        System.out.println(" "+al.get(i).getPrn()+" ");
                }
            }
        });
        
        
        //Final adding scene to stage
        primaryStage.setScene(s);
        primaryStage.show();
    }

    /**
     * This function adds components to the scene
     * @param grid
     */
    public static void constructGrid(GridPane grid){
        
    }
    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
