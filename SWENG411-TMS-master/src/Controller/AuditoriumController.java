package Controller;

import Models.Projector;
import Views.AuditoriumView;
import Views.HomeView;
import Views.PlaylistView;
import Views.ScheduleView;
import javafx.stage.Stage;

public class AuditoriumController {

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

    public String volumeUp(Projector proj){
        if (proj.getVolume() <= 9) {
            proj.setVolume(proj.getVolume()+1);
        }
        return Integer.toString(proj.getVolume());
    }

    public String volumeDown(Projector proj){
        if (proj.getVolume() > 0) {
            proj.setVolume(proj.getVolume()-1);
        }
        return Integer.toString(proj.getVolume());
    }

    public String brightnessUp(Projector proj){
        if (proj.getBrightness() <= 9) {
            proj.setBrightness(proj.getBrightness()+1);
        }
        return Integer.toString(proj.getBrightness());
    }

    public String brightnessDown(Projector proj){
        if (proj.getBrightness() > 0) {
            proj.setBrightness(proj.getBrightness()-1);
        }
        return Integer.toString(proj.getBrightness());
    }
}
