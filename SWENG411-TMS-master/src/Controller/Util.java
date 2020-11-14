package Controller;

import Models.*;
import Views.HomeView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

import static Controller.Demo.theater;

/**
 * Helper functions for the different controllers
 */
public class Util {

    public static Font font = new Font("Arial Rounded MT Bold", 12);

    //---------------------------------------------------------------------------
    //------------------------------___Playlist Methods___-----------------------
    //---------------------------------------------------------------------------

    /** Returns Playlist object of a the given parameters trailers + movie
     *
     * @param trailers  VideoFile ArrayList containing trailers for movies
     * @param movie     A single movie file to be added to the end of VideoFile ArrayList
     * @return          Playlist Object constructed with the finished VideoFile ArrayList
     */
    public static Playlist createPlaylist(ArrayList<VideoFile> trailers, VideoFile movie){

        // Combine trailers and movie
        trailers.add(movie);

        // Create Playlist
        return new Playlist(trailers);
    }

    /** Useful for understanding the data when needed
     *  Prints All the contents of an ArrayList of Playlists to System.out
     *
     * @param pList ArrayLists of Playlists to have contents displayed
     */
    public static void displayAllPlaylists(ArrayList<Playlist> pList){
        for(int i = 0; i < pList.size(); i++){
            System.out.println("\n\nPlaylist: " + i);

            for(int j = 0; j < pList.get(i).getFiles().size(); j++){
                System.out.println("Title: " + pList.get(i).getFiles().get(j).getName());
                System.out.println("\tLength: " + pList.get(i).getFiles().get(j).getLength());
            }
        }
    }

    //---------------------------------------------------------------------------
    //------------------------------___vBoxDiplayAttributes Method___-----------------------
    //---------------------------------------------------------------------------

    /**
     *  Does Some functions for a view, not necessary at all but leaving it here to know what is possible
     */

    public static void vBoxDisplayTrailerFiles(ArrayList<VideoFile> trailerList, VBox vBox)
    {
        for (int i = 0; i < trailerList.size(); i++)
        {
            Text trailerName = new Text("Trailer Name: " + trailerList.get(i).getName());
            Text trailerLength = new Text("Trailer Length: " + trailerList.get(i).getLength());
            trailerName.setFont(font);
            trailerLength.setFont(font);
            vBox.getChildren().add(trailerName);
            vBox.getChildren().add(trailerLength);
        }
    }
    public static void vBoxDisplayMovieFIles(ArrayList<VideoFile> movieList, VBox vBox)
    {
        for (int i = 0; i < movieList.size(); i++)
        {
            Text movieName = new Text("Movie Name: " + movieList.get(i).getName());
            Text movieLength = new Text("Movie Length: " + movieList.get(i).getLength());
            movieName.setFont(font);
            movieLength.setFont(font);
            vBox.getChildren().add(movieName);
            vBox.getChildren().add(movieLength);
        }
    }

}
