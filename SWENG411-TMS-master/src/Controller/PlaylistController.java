package Controller;

import Views.AuditoriumView;
import Views.HomeView;
import Views.PlaylistView;
import Views.ScheduleView;
import javafx.stage.Stage;

public class PlaylistController {

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
