package Views;

import Controller.AuditoriumController;
import Controller.Demo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import static Controller.Util.font;

public class AuditoriumView extends Application {
    int audNum;
    public static int currentVol = 5;
    public static int currentB = 5;

    public AuditoriumView(int audNum){
        this.audNum = audNum;
    }

    public static VBox info (int index, VBox vBox1)
    {
        vBox1.setSpacing(10);
        vBox1.setAlignment(Pos.CENTER);
        String movieName = Demo.playlists.get(index).getFiles().get(4).getName();
        String start = "00:00";
        Text name = new Text(movieName);
        name.setFont(font);
        String endT = Integer.toString(Demo.playlists.get(index).getLength());
        String time = start + " ---------------------------------o--------------------------------------------------------- " + endT;
        Text len = new Text(time);
        len.setFont(font);
        vBox1.getChildren().add(name);
        vBox1.getChildren().add(len);
        vBox1.setMaxSize(500, 50);
        vBox1.setMinSize(300, 50);
        return vBox1;

    }

    @Override
    public void start(Stage primaryStage)
    {
        AuditoriumController ac = new AuditoriumController();
        BorderPane pane = new BorderPane();
        BackgroundFill backgroundFill = new BackgroundFill(Color.WHEAT, CornerRadii.EMPTY, Insets.EMPTY);
        Background background1 = new Background(backgroundFill);
        BackgroundFill backgroundFill1 = new BackgroundFill(Color.BLUEVIOLET, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(backgroundFill1);

        String style = "-fx-border-style: solid;"
                + "-fx-border-width: 2;"
                + "-fx-border-color: black";

        Font font1 = new Font("Arial Rounded MT Bold", 12);
        pane.setBackground(background);

        //CREATE TOP MENU BUTTONS
        Button home = new Button("Home");
        home.setUnderline(true);
        home.setFont(font1);
        home.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ac.goToHome(primaryStage);
            }
        });

        HBox top = new HBox(30);
        top.getChildren().add(home);

        if(Demo.users.get(1).isManager()) {
            Button play = new Button("Playlist");
            play.setUnderline(true);
            play.setFont(font1);
            play.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    ac.goToPlaylist(primaryStage);
                }
            });
            Button sched = new Button("Schedule");
            sched.setUnderline(true);
            sched.setFont(font1);
            sched.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    ac.goToSchedule(primaryStage);
                }
            });

            top.getChildren().addAll(play, sched);
        }
        TextField timeField = new TextField();
        timeField.setMaxWidth(40);
        pane.setTop(top);
        top.setAlignment(Pos.CENTER);


        //CREATE REST OF VIEW
        Text text = new Text("Auditorium" + audNum);
        text.setUnderline(true);
        text.setFont(font1);


        VBox vBox7 = new VBox(50);     // Going to hold every thing "Box" itself
        vBox7.setMaxSize(500, 400);
        vBox7.setMinSize(400, 200);
        // vBox7.setStyle(style2);




        Text playlist = new Text("Playlist: ");
        playlist.setUnderline(true);
        playlist.setFont(font1);



        VBox vBox1 = new VBox();
        vBox1 = AuditoriumView.info(audNum-1, vBox1);

        vBox1.setBackground(background1);
        vBox1.setStyle(style);
        vBox1.setAlignment(Pos.CENTER);


        HBox hBox = new HBox();
        VBox vBox4 = new VBox(5);
        Text t1 = new Text(Demo.playlists.get(audNum-1).getFiles().get(0).getName());
        t1.setFont(font1);
        Text t2 = new Text(Demo.playlists.get(audNum-1).getFiles().get(1).getName());
        t2.setFont(font1);
        Text t3 = new Text(Demo.playlists.get(audNum-1).getFiles().get(2).getName());
        t3.setFont(font1);
        Text t4 = new Text(Demo.playlists.get(audNum-1).getFiles().get(3).getName());
        t4.setFont(font1);
        Text play_m = new Text(Demo.playlists.get(audNum-1).getFiles().get(4).getName());
        play_m.setFont(font1);


        vBox4.getChildren().addAll(playlist, t1, t2, t3, t4, play_m);
        hBox.getChildren().add(vBox4);
        hBox.setStyle(style);
        hBox.setMinSize(200, 100);
        hBox.setBackground(background1);

        HBox hBox8 = new HBox(5);
        HBox hBox9 = new HBox(5);

        VBox vBox3 = new VBox(5);
        HBox hBox1 = new HBox();

        Label vol = new Label("Volume: ");
        vol.setFont(font1);
        vol.setMinHeight(25);

        String cur1 = Integer.toString(Demo.auditoriums.get(audNum-1).getVolume());
        Label curV = new Label(cur1);
        curV.setMinSize(15, 25);
        Button volUp = new Button("Up");
        volUp.setFont(font1);
        volUp.setMaxHeight(5);
        volUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                curV.setText(ac.volumeUp(Demo.auditoriums.get(audNum-1)));
            }
        });
        Button volDown = new Button("Down");
        volDown.setFont(font1);
        volDown.setMaxHeight(5);
        volDown.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                curV.setText(ac.volumeDown(Demo.auditoriums.get(audNum-1)));
            }
        });

        Label light = new Label("Light:     ");
        light.setFont(font1);
        light.setMinHeight(25);
        Label curB = new Label(Integer.toString(Demo.auditoriums.get(audNum-1).getBrightness()));
        curB.setMinSize(15, 25);
        Button bUp = new Button("Up");
        bUp.setFont(font1);
        bUp.setMaxHeight(5);
        bUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                curB.setText(ac.brightnessUp(Demo.auditoriums.get(audNum-1)));
            }
        });
        Button bDown = new Button("Down");
        bDown.setFont(font1);
        bDown.setMaxHeight(5);
        bDown.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                curB.setText(ac.brightnessDown(Demo.auditoriums.get(audNum-1)));
            }
        });


        hBox8.getChildren().add(vol);
        hBox8.getChildren().add(curV);
        hBox8.getChildren().add(volUp);
        hBox8.getChildren().add(volDown);


        hBox9.getChildren().add(light);
        hBox9.getChildren().add(curB);
        hBox9.getChildren().add(bUp);
        hBox9.getChildren().add(bDown);

        vBox3.getChildren().add(hBox8);
        vBox3.getChildren().add(hBox9);
        hBox1.getChildren().add(vBox3);

        hBox1.setStyle(style);
        hBox1.setBackground(background1);

        HBox hBox2 = new HBox(100);
        hBox2.getChildren().add(hBox);
        hBox2.getChildren().add(hBox1);

        vBox3.setMinSize(200,200);


        VBox vBox2 = new VBox();
        vBox2.setMaxSize(500, 200);
        vBox2.setMinSize(500, 200);
        // vBox2.setStyle(style5);
        vBox2.setBackground(background);
        // Need to add two hBoxes
        vBox2.getChildren().add(hBox2);

        vBox7.getChildren().add(vBox1);
        vBox7.getChildren().add(vBox2);


        VBox vBox = new VBox();   // Holds auditorium name and box
        vBox.getChildren().add(text);
        vBox.getChildren().add(vBox7);


        pane.setCenter(vBox);
        vBox.setAlignment(Pos.CENTER);


        Scene sceneAud = new Scene(pane, 1000, 600);
        primaryStage.setMinWidth(1000);
        primaryStage.setMinHeight(600);
        primaryStage.setScene(sceneAud);
        primaryStage.setTitle("Auditorium " + (audNum));
        primaryStage.show();


    }


}
