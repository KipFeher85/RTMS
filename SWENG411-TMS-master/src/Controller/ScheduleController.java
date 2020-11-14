package Controller;

import Views.HomeView;
import Views.PlaylistView;
import Views.ScheduleView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.swing.border.Border;

public class ScheduleController {
    public void goToHome(Stage stage){
        HomeView view = new HomeView();
        view.start(stage);
    }

    public void goToSchedule(Stage stage){
        ScheduleView view = new ScheduleView();
        view.start(stage);
    }

    public void goToPlaylist(Stage stage){
        PlaylistView view = new PlaylistView();
        view.start(stage);
    }
}
