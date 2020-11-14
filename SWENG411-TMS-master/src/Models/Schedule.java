package Models;

import Models.Playlist;

import java.util.ArrayList;

public class Schedule {
    private int startTime;
    private ArrayList<Playlist> playlists;

    public Schedule(int startTime){
        this.startTime = startTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }
}
