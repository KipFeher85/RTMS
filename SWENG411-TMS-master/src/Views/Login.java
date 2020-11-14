package Views;

import Controller.Demo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import Controller.LoginController;


import java.awt.*;

import static javafx.application.Application.launch;

public class Login extends Application {
    public void start(Stage stage) {
        LoginController controller = new LoginController();
        PlaylistView plv = new PlaylistView();
        Font font1 = new Font("Arial Rounded MT Bold", 70);
        Font font2 = new Font("Arial Rounded MT Bold", 30);

        //Setting the top, bottom, center, right and left nodes to the pane
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(25, 25, 25, 25));

        Text RTMS = new Text("RTMS");
        RTMS.setFont(font1);
        pane.add(RTMS, 0, 0, 2, 1);

        Text Username = new Text("Username: ");
        Username.setFont(font2);
        pane.add(Username, 0, 1);

        TextField Userfield = new TextField();
        pane.add(Userfield, 1, 1);

        Text Password = new Text("Password: ");
        Password.setFont(font2);
        pane.add(Password, 0, 2);

        PasswordField Passfield = new PasswordField();
        pane.add(Passfield, 1, 2);


        Button sign_in = new Button("Sign In");
        sign_in.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                LoginController.login(Userfield.getText(), Passfield.getText(), stage);

            }
        });


        Button reg = new Button("Register");
        reg.setOnAction(new EventHandler<ActionEvent>() {
             @Override
             public void handle(ActionEvent event) {
                 LoginController.register(Userfield.getText(), Passfield.getText());
             }
        });


        HBox hBox = new HBox(10);
        hBox.getChildren().add(reg);
        hBox.getChildren().add(sign_in);
        hBox.setAlignment(Pos.BOTTOM_LEFT);

        pane.add(hBox, 1, 5, 2, 1);






        //Creating a scene object
        Scene scene = new Scene(pane, 500, 500);

        //Setting title to the Stage
        stage.setTitle("BorderPane Example");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }

    public static void main(String[] args){
        // Data Parser
        Demo demo = new Demo();

        launch(args);

    }
}