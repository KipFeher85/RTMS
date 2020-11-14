package Views;

import Controller.Demo;
import Controller.ScheduleController;
import Models.Playlist;
import Models.Theater;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;
import java.util.ArrayList;

public class ScheduleView extends Application {
    public static int getNumTheaters(ArrayList<Theater> theaterList)
    {
        int count = 0;
        for (int i = 0; i < theaterList.size(); i++)
        {
            count = i;
        }
        count += 1;
        return count;
    }
    public static void getTheaterDetails(ArrayList<Theater> theaterList)
    {
        for (int i = 0; i < theaterList.size(); i++)
        {
            System.out.println("Theater ID: " + theaterList.get(i).getId());
            System.out.println("Number of projectors: " + theaterList.get(i).getNumProjectors());
            System.out.println("Theater Address: " + theaterList.get(i).getAddress());
            System.out.println("");
        }
    }
    public static void getAuditoriums (Theater t1, VBox vBox, BorderPane borderPane, Stage stage)
    {
        vBox.setSpacing(20);
        int num = t1.getNumProjectors();
        for (int i = 0; i < num; i++)
        {
            Button text = new Button();
            text.setText("Auditorium " + (i+1) + ": ");
            vBox.getChildren().add(text);
            int index = i  ;
            text.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    //AuditoriumView.index = index;
                    //AuditoriumView view = new AuditoriumView();
                    //view.start(stage);
                }
            });
        }
    }

    @Override
    public void start(Stage primaryStage) {
        ScheduleController sc = new ScheduleController();
        ArrayList<Theater> theaterList = new ArrayList<Theater>();
        Theater t1 = new Theater(1, 6, "12345 Bumblebee Road");
        Theater t2 = new Theater(2, 6, "12345 Happy Day Lane");

        Demo d1 = new Demo();

        VBox vBox = new VBox(10);   // Holds auditoriums
        VBox vBox1 = new VBox(10);  // Holds every playlist
        HBox hBox = new HBox(50); // Seperates auditoriums from playlists
        javafx.scene.text.Font font1 = new Font("Arial Rounded MT Bold", 12);

        BackgroundFill backgroundFill1 = new BackgroundFill(Color.BLUEVIOLET, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(backgroundFill1);

        BackgroundFill backgroundFill2 = new BackgroundFill(Color.WHEAT, CornerRadii.EMPTY, Insets.EMPTY);
        Background background2 = new Background(backgroundFill2);

        String style = "-fx-border-style: solid;"
                + "-fx-border-width: 1;"
                + "-fx-border-color: black";

        theaterList.add(t1);
        theaterList.add(t2);

        int num = getNumTheaters(theaterList);


        BorderPane pane = new BorderPane();
        getAuditoriums(t1, vBox, pane, primaryStage);

        //CREATE TOP MENU BUTTONS
        Button home = new Button("Home");
        home.setUnderline(true);
        home.setFont(font1);
        home.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                sc.goToHome(primaryStage);
            }
        });
        Button play = new Button("Playlist");
        play.setUnderline(true);
        play.setFont(font1);
        play.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                sc.goToPlaylist(primaryStage);
            }
        });
        Button sched = new Button("Schedule");
        sched.setUnderline(true);
        sched.setFont(font1);
        sched.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                sc.goToSchedule(primaryStage);
            }
        });
        TextField timeField = new TextField();
        timeField.setMaxWidth(40);
        HBox top = new HBox(30);
        top.getChildren().addAll(home, play, sched);
        pane.setTop(top);
        top.setAlignment(Pos.CENTER);

        Text text2 = new Text();
        text2.setText("Playlists: ");



        HBox hBox1 = new HBox();
        HBox hBox2 = new HBox();
        HBox hBox3 = new HBox();
        HBox hBox4 = new HBox();
        HBox hBox5 = new HBox();
        HBox hBox6 = new HBox();

        Button p1 = new Button(d1.playlists.get(0).getName());
        p1.setMinSize(40, 5);
        Button p2 = new Button("Playlist 2");
        Button p3 = new Button("Playlist 3");
        Button p4 = new Button("Playlist 4");
        Button p5 = new Button("Playlist 5");
        Button p6 = new Button("Playlist 6");
        Button p7 = new Button("Playlist 7");
        Button p8 = new Button("Playlist 8");
        Button p9 = new Button("Playlist 9");
        Button p10 = new Button("Playlist 10");
        Button p11 = new Button("Playlist 11");
        Button p12 = new Button("Playlist 12");
        Button p13 = new Button("Playlist 13");
        Button p14 = new Button("Playlist 14");
        Button p15 = new Button("Playlist 15");
        Button p16 = new Button("Playlist 16");
        Button p17 = new Button("Playlist 17");
        Button p18 = new Button("Playlist 18");
        Button p19 = new Button("Playlist 19");
        Button p20 = new Button("Playlist 20");
        Button p21 = new Button("Playlist 21");
        Button p22 = new Button("Playlist 22");
        Button p23 = new Button("Playlist 23");
        Button p24 = new Button("Playlist 24");
        Button p25 = new Button("Playlist 25");
        Button p26 = new Button("Playlist 26");
        Button p27 = new Button("Playlist 27");
        Button p28 = new Button("Playlist 28");
        Button p29 = new Button("Playlist 29");
        Button p30 = new Button("Playlist 30");


        String name1 = d1.playlists.get(0).getFiles().get(d1.playlists.get(0).getFiles().size() - 1).getName();
        String name2 = d1.playlists.get(1).getFiles().get(d1.playlists.get(1).getFiles().size() - 1).getName();
        String name3 = d1.playlists.get(2).getFiles().get(d1.playlists.get(2).getFiles().size() - 1).getName();
        String name4 = d1.playlists.get(3).getFiles().get(d1.playlists.get(3).getFiles().size() - 1).getName();
        String name5 = d1.playlists.get(4).getFiles().get(d1.playlists.get(4).getFiles().size() - 1).getName();
        String name6 = d1.playlists.get(5).getFiles().get(d1.playlists.get(5).getFiles().size() - 1).getName();
        String name7 = d1.playlists.get(6).getFiles().get(d1.playlists.get(6).getFiles().size() - 1).getName();
        String name8 = d1.playlists.get(7).getFiles().get(d1.playlists.get(7).getFiles().size() - 1).getName();
        String name9 = d1.playlists.get(8).getFiles().get(d1.playlists.get(8).getFiles().size() - 1).getName();
        String name10 = d1.playlists.get(9).getFiles().get(d1.playlists.get(9).getFiles().size() - 1).getName();
        String name11 = d1.playlists.get(10).getFiles().get(d1.playlists.get(10).getFiles().size() - 1).getName();
        String name12 = d1.playlists.get(11).getFiles().get(d1.playlists.get(11).getFiles().size() - 1).getName();
        String name13 = d1.playlists.get(12).getFiles().get(d1.playlists.get(12).getFiles().size() - 1).getName();
        String name14 = d1.playlists.get(13).getFiles().get(d1.playlists.get(13).getFiles().size() - 1).getName();
        String name15 = d1.playlists.get(14).getFiles().get(d1.playlists.get(14).getFiles().size() - 1).getName();
        String name16 = d1.playlists.get(15).getFiles().get(d1.playlists.get(15).getFiles().size() - 1).getName();
        String name17 = d1.playlists.get(16).getFiles().get(d1.playlists.get(16).getFiles().size() - 1).getName();
        String name18 = d1.playlists.get(17).getFiles().get(d1.playlists.get(17).getFiles().size() - 1).getName();
        String name19 = d1.playlists.get(18).getFiles().get(d1.playlists.get(18).getFiles().size() - 1).getName();
        String name20 = d1.playlists.get(19).getFiles().get(d1.playlists.get(19).getFiles().size() - 1).getName();
        String name21 = d1.playlists.get(20).getFiles().get(d1.playlists.get(20).getFiles().size() - 1).getName();
        String name22 = d1.playlists.get(21).getFiles().get(d1.playlists.get(21).getFiles().size() - 1).getName();
        String name23 = d1.playlists.get(22).getFiles().get(d1.playlists.get(22).getFiles().size() - 1).getName();
        String name24 = d1.playlists.get(23).getFiles().get(d1.playlists.get(23).getFiles().size() - 1).getName();
        String name25 = d1.playlists.get(24).getFiles().get(d1.playlists.get(24).getFiles().size() - 1).getName();
        String name26 = d1.playlists.get(25).getFiles().get(d1.playlists.get(25).getFiles().size() - 1).getName();
        String name27 = d1.playlists.get(26).getFiles().get(d1.playlists.get(26).getFiles().size() - 1).getName();
        String name28 = d1.playlists.get(27).getFiles().get(d1.playlists.get(27).getFiles().size() - 1).getName();
        String name29 = d1.playlists.get(28).getFiles().get(d1.playlists.get(28).getFiles().size() - 1).getName();
        String name30 = d1.playlists.get(29).getFiles().get(d1.playlists.get(29).getFiles().size() - 1).getName();


        p1.setText(name1);
        p2.setText(name2);
        p3.setText(name3);
        p4.setText(name4);
        p5.setText(name5);
        p6.setText(name6);
        p7.setText(name7);
        p8.setText(name8);
        p9.setText(name9);
        p10.setText(name10);
        p11.setText(name11);
        p12.setText(name12);
        p13.setText(name13);
        p14.setText(name14);
        p15.setText(name15);
        p16.setText(name16);
        p17.setText(name17);
        p18.setText(name18);
        p19.setText(name19);
        p20.setText(name20);
        p21.setText(name21);
        p22.setText(name22);
        p23.setText(name23);
        p24.setText(name24);
        p25.setText(name25);
        p26.setText(name26);
        p27.setText(name27);
        p28.setText(name28);
        p29.setText(name29);
        p30.setText(name30);


        hBox1.getChildren().add(p1);
        p1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 0;
                view.start(primaryStage);
            }
        });
        hBox1.getChildren().add(p2);
        p2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 1;
                view.start(primaryStage);
            }
        });
        hBox1.getChildren().add(p3);
        p3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 2;
                view.start(primaryStage);
            }
        });
        hBox1.setSpacing(20);
        hBox1.setBackground(background2);
        hBox1.setStyle(style);
        hBox1.setAlignment(Pos.CENTER);

        hBox1.getChildren().add(p4);
        p4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 3;
                view.start(primaryStage);
            }
        });
        hBox1.getChildren().add(p5);
        p5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 4;
                view.start(primaryStage);
            }
        });
        hBox2.getChildren().add(p6);
        p6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 5;
                view.start(primaryStage);
            }
        });
        hBox2.setSpacing(20);
        hBox2.setBackground(background2);
        hBox2.setStyle(style);
        hBox2.setAlignment(Pos.CENTER);


        hBox2.getChildren().add(p7);
        p7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 6;
                view.start(primaryStage);
            }
        });
        hBox2.getChildren().add(p8);
        p8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 7;
                view.start(primaryStage);
            }
        });
        hBox2.getChildren().add(p9);
        p9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 8;
                view.start(primaryStage);
            }
        });
        hBox3.setSpacing(20);
        hBox3.setBackground(background2);
        hBox3.setStyle(style);
        hBox3.setAlignment(Pos.CENTER);

        hBox2.getChildren().add(p10);
        p10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 9;
                view.start(primaryStage);
            }
        });
        hBox3.getChildren().add(p11);
        p11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 10;
                view.start(primaryStage);
            }
        });
        hBox3.getChildren().add(p12);
        p12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 11;
                view.start(primaryStage);
            }
        });
        hBox4.setSpacing(20);
        hBox4.setBackground(background2);
        hBox4.setStyle(style);
        hBox4.setAlignment(Pos.CENTER);

        hBox3.getChildren().add(p13);
        p13.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 12;
                view.start(primaryStage);
            }
        });
        hBox3.getChildren().add(p14);
        p14.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 13;
                view.start(primaryStage);
            }
        });
        hBox3.getChildren().add(p15);
        p15.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 14;
                view.start(primaryStage);
            }
        });
        hBox5.setSpacing(20);
        hBox5.setBackground(background2);
        hBox5.setStyle(style);
        hBox5.setAlignment(Pos.CENTER);

        hBox4.getChildren().add(p16);
        p16.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 15;
                view.start(primaryStage);
            }
        });
        hBox4.getChildren().add(p17);
        p17.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 16;
                view.start(primaryStage);
            }
        });
        hBox4.getChildren().add(p18);
        p18.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 17;
                view.start(primaryStage);
            }
        });
        hBox4.getChildren().add(p19);
        p19.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 18;
                view.start(primaryStage);
            }
        });
        hBox4.getChildren().add(p20);
        p20.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 19;
                view.start(primaryStage);
            }
        });

        hBox5.getChildren().add(p21);
        p21.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 20;
                view.start(primaryStage);
            }
        });
        hBox5.getChildren().add(p22);
        p22.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 21;
                view.start(primaryStage);
            }
        });
        hBox5.getChildren().add(p23);
        p23.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 22;
                view.start(primaryStage);
            }
        });
        hBox5.getChildren().add(p24);
        p24.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 23;
                view.start(primaryStage);
            }
        });
        hBox5.getChildren().add(p25);
        p25.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 24;
                view.start(primaryStage);
            }
        });

        hBox6.getChildren().add(p26);
        p26.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 25;
                view.start(primaryStage);
            }
        });
        hBox6.getChildren().add(p27);
        p27.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 26;
                view.start(primaryStage);
            }
        });
        hBox6.getChildren().add(p28);
        p28.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 27;
                view.start(primaryStage);
            }
        });
        hBox6.getChildren().add(p29);
        p29.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 28;
                view.start(primaryStage);
            }
        });
        hBox6.getChildren().add(p30);
        p30.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PlaylistView view = new PlaylistView();
                PlaylistView.index = 29;
                view.start(primaryStage);
            }
        });

        hBox6.setSpacing(20);
        hBox6.setBackground(background2);
        hBox6.setStyle(style);
        hBox6.setAlignment(Pos.CENTER);


        VBox vBox2 = new VBox();
        VBox vBox3 = new VBox();
        VBox vBox4 = new VBox();
        VBox vBox5 = new VBox();
        VBox vBox6 = new VBox();
        VBox vBox7 = new VBox();

        vBox2.getChildren().add(hBox1);
        vBox3.getChildren().add(hBox2);
        vBox4.getChildren().add(hBox3);
        vBox5.getChildren().add(hBox4);
        vBox6.getChildren().add(hBox5);
        vBox7.getChildren().add(hBox6);

        VBox vBox8 = new VBox(20);
        vBox8.getChildren().add(vBox2);
        vBox8.getChildren().add(vBox3);
        vBox8.getChildren().add(vBox4);
        vBox8.getChildren().add(vBox5);
        vBox8.getChildren().add(vBox6);
        vBox8.getChildren().add(vBox7);
        vBox8.setMaxSize(600, 100);
        vBox8.setAlignment(Pos.CENTER);


        vBox.setAlignment(Pos.CENTER);

        vBox1.setAlignment(Pos.CENTER);

        vBox.setMaxSize(200, 200);

        HBox hBox7 = new HBox(20);
        hBox7.getChildren().add(vBox);
        hBox7.getChildren().add(vBox8);
        hBox7.setAlignment(Pos.CENTER);

        //createButtons(pane, primaryStage);

        pane.setBackground(background);
        pane.setCenter(hBox7);
        Scene scene = new Scene(pane, 1000, 600);

        primaryStage.setMinWidth(1000);
        primaryStage.setMinHeight(600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Schedule");
        primaryStage.show();

    }

}
