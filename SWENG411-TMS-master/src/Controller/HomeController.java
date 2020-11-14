package Controller;

import Views.AuditoriumView;
import Views.HomeView;
import Views.PlaylistView;
import Views.ScheduleView;
import javafx.stage.Stage;

public class HomeController {

    public void goToAuditorium(int audNum, Stage stage){
        AuditoriumView view = new AuditoriumView(audNum);
        view.start(stage);
    }

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