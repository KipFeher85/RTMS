package Views;

import Controller.Demo;
import Controller.PlaylistController;
import Models.VideoFile;
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
import java.util.ArrayList;

public class PlaylistView extends Application
{
    public static int index = 1;
    public static int playlist_Length(ArrayList<VideoFile> a)
    {
        int length = 0;
        for (int i = 0; i < a.size() - 1; i++)
        {
            length += a.get(i).getLength();
        }
        return length;
    }
    public static void addFiles(VBox vBox, VBox vBox2)
    {
        javafx.scene.text.Font f1 = new Font("Arial Rounded MT Bold", 12);
        Demo d1 = new Demo();

        String name = "Trailer: " + d1.trailers.get(0).getName();
        Button n = new Button(name);
        n.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String name2 = "Trailer Name: " + d1.trailers.get(0).getName();
                Text name = new Text(name2);
                name.setFont(f1);
                vBox2.getChildren().add(name);
            }
        });
        vBox.getChildren().add(n);

        String name2 = "Trailer: " + d1.trailers.get(1).getName();
        Button n2 = new Button(name2);
        n2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String name2 = "Trailer Name: " + d1.trailers.get(1).getName();
                Text name = new Text(name2);
                name.setFont(f1);
                vBox2.getChildren().add(name);
            }
        });
        vBox.getChildren().add(n2);

        String name3 = "Trailer: " + d1.trailers.get(2).getName();
        Button n3 = new Button(name3);
        n3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String name2 = "Trailer Name: " + d1.trailers.get(2).getName();
                Text name = new Text(name2);
                name.setFont(f1);
                vBox2.getChildren().add(name);
            }
        });

        vBox.getChildren().add(n3);

        String name4 = "Trailer: " + d1.trailers.get(3).getName();
        Button n4 = new Button(name4);
        n4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String name2 = "Trailer Name: " + d1.trailers.get(3).getName();
                Text name = new Text(name2);
                name.setFont(f1);
                vBox2.getChildren().add(name);
            }
        });
        vBox.getChildren().add(n4);

        String name5 = "Trailer: " + d1.trailers.get(4).getName();
        Button n5 = new Button(name5);
        n5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String name2 = "Trailer Name: " + d1.trailers.get(4).getName();
                Text name = new Text(name2);
                name.setFont(f1);
                vBox2.getChildren().add(name);
            }
        });

        vBox.getChildren().add(n5);

        String name6 = "Trailer: " + d1.trailers.get(5).getName();
        Button n6 = new Button(name6);
        n6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String name2 = "Trailer Name: " + d1.trailers.get(5).getName();
                Text name = new Text(name2);
                name.setFont(f1);
                vBox2.getChildren().add(name);
            }
        });

        vBox.getChildren().add(n6);

    }

    @Override
    public void start(Stage primaryStage) {
        PlaylistController pc = new PlaylistController();
        System.out.println(Demo.playlists.size());
        BorderPane pane = new BorderPane();
        BackgroundFill backgroundFill1 = new BackgroundFill(Color.BLUEVIOLET, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(backgroundFill1);

        BackgroundFill backgroundFill = new BackgroundFill(Color.WHEAT, CornerRadii.EMPTY, Insets.EMPTY);
        Background background1 = new Background(backgroundFill);

        javafx.scene.text.Font font1 = new Font("Arial Rounded MT Bold", 12);


        VBox vBox = new VBox(0);
        VBox vBox1 = new VBox(10);
        VBox vBox2 = new VBox(10);
        VBox vBox3 = new VBox(10);
        VBox vBox4 = new VBox(10);

        Text num = new Text("Trailer Files: ");
        num.setUnderline(true);
        num.setFont(font1);



        vBox1.getChildren().add(num);
        vBox1.setBackground(background1);

        //CREATE TOP MENU BUTTONS
        Button home = new Button("Home");
        home.setUnderline(true);
        home.setFont(font1);
        home.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                pc.goToHome(primaryStage);
            }
        });
        Button play = new Button("Playlist");
        play.setUnderline(true);
        play.setFont(font1);
        play.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                pc.goToPlaylist(primaryStage);
            }
        });
        Button sched = new Button("Schedule");
        sched.setUnderline(true);
        sched.setFont(font1);
        sched.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                pc.goToSchedule(primaryStage);
            }
        });
        TextField timeField = new TextField();
        timeField.setMaxWidth(40);
        HBox top = new HBox(30);
        top.getChildren().addAll(home, play, sched);
        pane.setTop(top);
        top.setAlignment(Pos.CENTER);


        Text movieF = new Text("Movie Files: ");
        movieF.setUnderline(true);
        vBox3.getChildren().add(movieF);
        movieF.setFont(font1);

        vBox3.setBackground(background1);


        Text playlistQueue = new Text("Playlist Queue: ");
        playlistQueue.setUnderline(true);
        playlistQueue.setFont(font1);

        vBox.getChildren().add(vBox1);
        vBox.getChildren().add(vBox2);
        vBox.getChildren().add(vBox3);
        vBox.setSpacing(30);
        vBox4.getChildren().add(playlistQueue);
        vBox4.setBackground(background1);

        addFiles(vBox4, vBox2);


        vBox4.setAlignment(Pos.CENTER);
        vBox4.setMaxSize(200, 200);


        vBox1.setStyle("-fx-border-style: solid;"
                + "-fx-border-width: 1;"
                + "-fx-border-color: black");
        vBox2.setStyle("-fx-border-style: solid;"
                + "-fx-border-width: 1;"
                + "-fx-border-color: black");
        vBox3.setStyle("-fx-border-style: solid;"
                + "-fx-border-width: 1;"
                + "-fx-border-color: black");
        vBox4.setStyle("-fx-border-style: solid;"
                + "-fx-border-width: 1;"
                + "-fx-border-color: black");



        pane.setLeft(vBox);
        pane.setRight(vBox4);
        pane.setBackground(background);
        Scene scene = new Scene(pane, 1000, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setMinWidth(1000);
        primaryStage.setMinHeight(600);
        primaryStage.setTitle("Playlist ");

    }
}
