package Controller;

import Models.Theater;
import Models.User;
import Models.VideoFile;
import Views.HomeView;
import Views.PlaylistView;
import javafx.stage.Stage;

import java.util.ArrayList;

public class LoginController {

    public static void login(String username, String password, Stage stage){

        // For each in Demo.users
        for(User u : Demo.users){

            if(username.toLowerCase().trim().equals( u.getName() )
                    && password.trim().equals( u.getPassword() )){


                HomeView homeView = new HomeView();
                homeView.start(stage);
            }
        }
    }

    public static void register(String username, String password){

        // Do not allow duplicates of username
        for (User u : Demo.users){
            if(u.getName() == username.toLowerCase()){
                return;
            }
        }

        Demo.users.add(new User(username.toLowerCase(), password, Demo.users.size(), false));
    }
}

