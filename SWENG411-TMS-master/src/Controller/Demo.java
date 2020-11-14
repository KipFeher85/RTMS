package Controller;

import Models.*;
import Views.Login;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import static Controller.Util.displayAllPlaylists;

/**
 *  Demo class is used to create a populated instance of a theater for the purposes of the project
 */
public class Demo {


    //---------------------------------------------------------------------
    //------------------------------LISTS CONTAING ALL THE DATA------------
    //---------------------------------------------------------------------
    public static int time = 0;
    public static ArrayList<Schedule> schedules = new ArrayList<>();
    public static ArrayList<Playlist> playlists = new ArrayList<>();
    public static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<VideoFile> movies = new ArrayList<>();
    public static ArrayList<VideoFile> trailers = new ArrayList<>();
    public static Theater theater = new Theater(1, 20, "9001 Rainbow Road, Harborcreek, PA 16421");
    public static ArrayList<Projector> auditoriums = new ArrayList<>();



    // Fill list when object is created
    public Demo() {

        auditoriums.add(new Projector(1));
        auditoriums.add(new Projector(2));
        auditoriums.add(new Projector(3));
        auditoriums.add(new Projector(4));
        auditoriums.add(new Projector(5));
        auditoriums.add(new Projector(6));


        //---------------------------------------------------------------------
        //------------------------------MOCK DATA------------------------------
        //---------------------------------------------------------------------
        // USERS MAKE THESES LOWERCASE NAMES password can be whatever
        users.add(new User("bob", "open", users.size(), true));
        users.add(new User("sam", "open", users.size(), false));
        users.add(new User("jen", "open", users.size(), false));
        users.add(new User("ken", "open", users.size(), false));
        users.add(new User("Joe", "open", users.size(), false));

        // Theater
        Theater theater = new Theater(1, 6, "9001 Rainbow Road, Erie PA");

        // VIDEO FILES
        // MOVIES
        movies.add(new VideoFile("Frozen 2", 103));
        movies.add(new VideoFile("Jumanji: The Next Level", 123));
        movies.add(new VideoFile("Knives Out", 130));
        movies.add(new VideoFile("The Addams Family", 86));
        movies.add(new VideoFile("A Beautiful Day in the Neighborhood", 109));
        movies.add(new VideoFile("Ford v Ferrari", 153));
        movies.add(new VideoFile("Black Christmas", 98));
        movies.add(new VideoFile("Dark Waters", 126));
        movies.add(new VideoFile("Playmobil: The Movie", 110));
        movies.add(new VideoFile("21 Bridges", 99));
        movies.add(new VideoFile("Queen & Slim", 120));
        movies.add(new VideoFile("Richard Jewwll", 131));
        movies.add(new VideoFile("Midway", 138));
        movies.add(new VideoFile("Playing with Fire", 96));
        movies.add(new VideoFile("Last Christmas", 103));

        // Trailers
        trailers.add(new VideoFile("Wonder Woman 1984", 2));
        trailers.add(new VideoFile("Free Guy", 3));
        trailers.add(new VideoFile("The Assistant", 2));
        trailers.add(new VideoFile("No Time to Die", 3));
        trailers.add(new VideoFile("Black Widow", 2));
        trailers.add(new VideoFile("Just Mercy", 2));
        trailers.add(new VideoFile("Onward International", 3));
        trailers.add(new VideoFile("The Rise of Skywalker", 1));
        trailers.add(new VideoFile("Trolls World Tour", 2));
        trailers.add(new VideoFile("Antebellum", 1));
        trailers.add(new VideoFile("Emma", 1));
        trailers.add(new VideoFile("Call of the Wild", 2));
        trailers.add(new VideoFile("Cats", 2));
        trailers.add(new VideoFile("The Irishman", 3));
        trailers.add(new VideoFile("Spies in Disguise", 2));
        trailers.add(new VideoFile("Antlers", 3));
        trailers.add(new VideoFile("Ghostbusters: Afterlife", 2));
        trailers.add(new VideoFile("The Aeronauts", 3));
        trailers.add(new VideoFile("Inherit The Viper", 2));
        trailers.add(new VideoFile("Grand Isle", 2));
        trailers.add(new VideoFile("Temblores", 2));
        trailers.add(new VideoFile("Melody Makers", 3));
        trailers.add(new VideoFile("JoJo rabbit", 1));
        trailers.add(new VideoFile("Little Joe", 2));
        trailers.add(new VideoFile("TraumaCenter", 3));

        // PLAYLISTS
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));
        playlists.add(genRandomPlaylist(trailers, movies, 4));

        // SCHEDULES
        schedules.add(genRandomSchedule(playlists, 10, 24));
        schedules.add(genRandomSchedule(playlists, 10, 24));
        schedules.add(genRandomSchedule(playlists, 10, 24));
        schedules.add(genRandomSchedule(playlists, 10, 24));
        schedules.add(genRandomSchedule(playlists, 10, 24));
        schedules.add(genRandomSchedule(playlists, 10, 24));
        schedules.add(genRandomSchedule(playlists, 10, 24));

    }

    /** Generate a random Schedule to play in a projector for the day
     *
     * @param p     List of Playlists
     * @param open  Time theater opens (0 - 24)
     * @param close Time theater closes(0 - 24) (if closing past midnight follow example 2am -> 26
     * @return      Geneated Schedule with best firt to end of day. Unused time from 'open' to first real move is filler
     */
    public static Schedule genRandomSchedule(ArrayList<Playlist> p, int open, int close){

        int currLength = 0;
        ArrayList<Playlist> genPlaylistList = new ArrayList<>();


        while(currLength < (close*60) - (open*60)){
            int randIndex = getRandomNumberInRange(0, p.size() - 1);
            genPlaylistList.add( p.get(randIndex) );
            currLength += p.get(randIndex).getLength();
        }


        if(currLength > (close*60) - (open*60)){
            currLength -= genPlaylistList.get(0).getLength();
            genPlaylistList.remove(0);

            int fillerTime =  Math.abs(currLength - (close*60 - open*60));
            VideoFile empty = new VideoFile("_", fillerTime);
            ArrayList<VideoFile> emptyVideoArrayList = new ArrayList<>();
            emptyVideoArrayList.add(empty);
            Playlist emptyPlaylist = new Playlist(emptyVideoArrayList);
            genPlaylistList.add(0, emptyPlaylist);
        }

        Schedule randSchedule = new Schedule(open);
        randSchedule.setPlaylists(genPlaylistList);

        return randSchedule;
    }


    /** Generate a random playlist
     *  Total length of trailers playing will be atleast minLengthOfTrailers
     *  Random Movie is added to the end of the all the trailers
     *
     * @param t ArrayList of trailers, if minLengthofTrailers > totalTime of trailers you will loop forever....
     * @param m ArrayList of Movies
     * @param minLengthOfTrailers minimum ammount of time that movie trailers should be playing for
     * @return  A populated playlist
     */
    public static Playlist genRandomPlaylist(ArrayList<VideoFile> t, ArrayList<VideoFile> m, int numTrailer){

        int currLength = 0;
        ArrayList<VideoFile> randTrailers = new ArrayList<>();
        /*while(currLength < numTrailer){
            int randIndex = getRandomNumberInRange(0, t.size() - 1);
            int tryCounter = 0;
            while (videoFileListContains(randTrailers, t.get(randIndex).getName()) && tryCounter < 5){
                randIndex = getRandomNumberInRange(0, t.size() - 1);
                tryCounter++;
            }
            randTrailers.add( t.get(randIndex) );
            currLength += t.get(randIndex).getLength();
        }*/

        for(int i=0; i<numTrailer; i++){
            randTrailers.add( t.get(getRandomNumberInRange(0, t.size() - 1)) );
        }

        if(randTrailers.size() == 0){
            randTrailers.add( t.get(getRandomNumberInRange(0, t.size()- 1)));
        }

        int randIndex = getRandomNumberInRange(0, m.size() - 1);
        return Util.createPlaylist(randTrailers, m.get(randIndex));
    }


    /** Produce a random integer between min and max
     *
     * @param min Lower bound int
     * @param max Upper bound int
     * @return  Random Int in Range (min, max)
     */
    private static int getRandomNumberInRange(int min, int max)
    {
        if (min >= max)
        {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    /** Determine if an ArrayList of VideoFiles already contains a particular str in the name attribute
     *
     * @param files AarryList of video files to be checked
     * @param str   str to check for in ArrayList
     * @return      True if str == VideoFile.get() in ArrayList, else False
     */
    private static boolean videoFileListContains(ArrayList<VideoFile> files, String str)
    {
        for (VideoFile vf : files){
            if(vf.getName() == str){
                return true;
            }
        }
        return false;
    }


}
