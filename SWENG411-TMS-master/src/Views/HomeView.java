package Views;

import Controller.Demo;
import Controller.HomeController;
import Models.User;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HomeView extends Application {

    @Override
    public void start(Stage primaryStage)
    {
        HomeController hc = new HomeController();

        BorderPane pane = new BorderPane();
        Font font1 = new Font("Arial Rounded MT Bold", 12);

        VBox vBox = new VBox(30);             // Box to hold all auditorium boxes
        VBox vBox8 = new VBox(30);            // Displays auditoriums 1-6 on side of boxes
        VBox vBox1 = new VBox(30);            // Box to hold everything

        HBox hBox1 = new HBox(20);              // Box to hold aud 1 info
        HBox hBox2 = new HBox(20);
        HBox hBox3 = new HBox(20);
        HBox hBox4 = new HBox(20);
        HBox hBox5 = new HBox(20);
        HBox hBox6 = new HBox(20);

        HBox hBox7 = new HBox(20);              // Box to hold every auditorium box


        VBox vBox2 = new VBox();                        // Vetical boxes for each auditorium
        VBox vBox3 = new VBox();
        VBox vBox4 = new VBox();
        VBox vBox5 = new VBox();
        VBox vBox6 = new VBox();
        VBox vBox7 = new VBox();

        if(Demo.users.get(1).isManager()) {
            //CREATE TOP MENU BUTTONS
            Button home = new Button("Home");
            home.setUnderline(true);
            home.setFont(font1);
            home.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    hc.goToHome(primaryStage);
                }
            });
            Button play = new Button("Playlist");
            play.setUnderline(true);
            play.setFont(font1);
            play.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    hc.goToPlaylist(primaryStage);
                }
            });
            Button sched = new Button("Schedule");
            sched.setUnderline(true);
            sched.setFont(font1);
            sched.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    hc.goToSchedule(primaryStage);
                }
            });
            TextField timeField = new TextField();
            timeField.setMaxWidth(40);
            HBox top = new HBox(30);
            top.getChildren().addAll(home, play, sched);
            pane.setTop(top);
            top.setAlignment(Pos.CENTER);
        }

        //CREATE AUDITORIUM BUTTONS
        Button aud1 = new Button("Auditorium 1");
        aud1.setUnderline(true);
        aud1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                hc.goToAuditorium(1, primaryStage);
            }
        });
        Button aud2 = new Button("Auditorium 2");
        aud2.setUnderline(true);
        aud2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                hc.goToAuditorium(2, primaryStage);
            }
        });
        Button aud3 = new Button("Auditorium 3");
        aud3.setUnderline(true);
        aud3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                hc.goToAuditorium(3, primaryStage);
            }
        });
        Button aud4 = new Button("Auditorium 4");
        aud4.setUnderline(true);
        aud4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                hc.goToAuditorium(4, primaryStage);
            }
        });
        Button aud5 = new Button("Auditorium 5");
        aud5.setUnderline(true);
        aud5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                hc.goToAuditorium(5, primaryStage);
            }
        });
        Button aud6 = new Button("Auditorium 6");
        aud6.setUnderline(true);
        aud6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                hc.goToAuditorium(6, primaryStage);
            }
        });

        aud1.setFont(font1);
        aud2.setFont(font1);
        aud3.setFont(font1);
        aud4.setFont(font1);
        aud5.setFont(font1);
        aud6.setFont(font1);


        String style = "-fx-border-style: solid;"
                + "-fx-border-width: 1;"
                + "-fx-border-color: black";

        hBox1.setStyle(style);
        hBox2.setStyle(style);
        hBox3.setStyle(style);
        hBox4.setStyle(style);
        hBox5.setStyle(style);
        hBox6.setStyle(style);


        String start = "00:00";


        String endT1 = Integer.toString(Demo.playlists.get(0).getLength());
        String endT2 = Integer.toString(Demo.playlists.get(1).getLength());
        String endT3 = Integer.toString(Demo.playlists.get(2).getLength());
        String endT4 = Integer.toString(Demo.playlists.get(3).getLength());
        String endT5 = Integer.toString(Demo.playlists.get(4).getLength());
        String endT6 = Integer.toString(Demo.playlists.get(5).getLength());


        String name1 = Demo.playlists.get(0).getFiles().get(4).getName();
        String name2 = Demo.playlists.get(1).getFiles().get(4).getName();
        String name3 = Demo.playlists.get(2).getFiles().get(4).getName();
        String name4 = Demo.playlists.get(3).getFiles().get(4).getName();
        String name5 = Demo.playlists.get(4).getFiles().get(4).getName();
        String name6 = Demo.playlists.get(5).getFiles().get(4).getName();

        Text n1 = new Text(name1);
        Text n2 = new Text(name2);
        Text n3 = new Text(name3);
        Text n4 = new Text(name4);
        Text n5 = new Text(name5);
        Text n6 = new Text(name6);

        n1.setFont(font1);
        n2.setFont(font1);
        n3.setFont(font1);
        n4.setFont(font1);
        n5.setFont(font1);
        n6.setFont(font1);

        String f1 = new String(start + " ------------------------------------------------------------------------------ " + endT1);
        String f2 = new String(start + " ------------------------------------------------------------------------------ " + endT2);
        String f3 = new String(start + " ------------------------------------------------------------------------------ " + endT3);
        String f4 = new String(start + " ------------------------------------------------------------------------------ " + endT4);
        String f5 = new String(start + " ------------------------------------------------------------------------------ " + endT5);
        String f6 = new String(start + " ------------------------------------------------------------------------------ " + endT6);

        Text start1 = new Text(f1);
        Text start2 = new Text(f2);
        Text start3 = new Text(f3);
        Text start4 = new Text(f4);
        Text start5 = new Text(f5);
        Text start6 = new Text(f6);

        start1.setFont(font1);
        start2.setFont(font1);
        start3.setFont(font1);
        start4.setFont(font1);
        start5.setFont(font1);
        start6.setFont(font1);




        BackgroundFill backgroundFill = new BackgroundFill(Color.WHEAT, CornerRadii.EMPTY, Insets.EMPTY);
        Background backgrounDemo = new Background(backgroundFill);

        vBox2.getChildren().addAll(n1, start1);
        vBox2.setAlignment(Pos.CENTER);

        vBox3.getChildren().addAll(n2, start2);
        vBox3.setAlignment(Pos.CENTER);

        vBox4.getChildren().addAll(n3, start3);
        vBox4.setAlignment(Pos.CENTER);

        vBox5.getChildren().addAll(n4, start4);
        vBox5.setAlignment(Pos.CENTER);

        vBox6.getChildren().addAll(n5, start5);
        vBox6.setAlignment(Pos.CENTER);

        vBox7.getChildren().addAll(n6, start6);
        vBox7.setAlignment(Pos.CENTER);



        hBox1.getChildren().add(vBox2);
        hBox2.getChildren().add(vBox3);
        hBox3.getChildren().add(vBox4);
        hBox4.getChildren().add(vBox5);
        hBox5.getChildren().add(vBox6);
        hBox6.getChildren().add(vBox7);

        hBox1.setBackground(backgrounDemo);
        hBox2.setBackground(backgrounDemo);
        hBox3.setBackground(backgrounDemo);
        hBox4.setBackground(backgrounDemo);
        hBox5.setBackground(backgrounDemo);
        hBox6.setBackground(backgrounDemo);



        vBox.getChildren().add(hBox1);
        vBox.getChildren().add(hBox2);
        vBox.getChildren().add(hBox3);
        vBox.getChildren().add(hBox4);
        vBox.getChildren().add(hBox5);
        vBox.getChildren().add(hBox6);
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.CENTER);
        vBox.setMaxSize(400, 50);

        vBox8.getChildren().add(aud1);
        vBox8.getChildren().add(aud2);
        vBox8.getChildren().add(aud3);
        vBox8.getChildren().add(aud4);
        vBox8.getChildren().add(aud5);
        vBox8.getChildren().add(aud6);
        vBox8.setSpacing(10);
        vBox8.setAlignment(Pos.CENTER);



        vBox1.getChildren().add(vBox);




        pane.setLeft(vBox8);
        pane.setCenter(vBox);

        BackgroundFill backgroundFill1 = new BackgroundFill(Color.BLUEVIOLET, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(backgroundFill1);
        pane.setBackground(background);
        Scene scene = new Scene(pane, 1000, 600);
        primaryStage.setMaxWidth(1000);
        primaryStage.setMaxHeight(600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("RTMS-Home");
        primaryStage.show();



    }
}
