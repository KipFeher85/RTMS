package Models;

import java.util.ArrayList;

public class Playlist {
    private int length;
    private ArrayList<VideoFile> files;
    private String name;

    public Playlist(ArrayList<VideoFile> files){

        this.files = files;

        setLength();
    }

    public void setFiles(ArrayList<VideoFile> files) {
        this.files = files;
    }

    public void setLength() {
        length = 0;
        for(int i=0; i < files.size(); i++){
            length += files.get(i).getLength();
        }
    }

    public ArrayList<VideoFile> getFiles() {
        return files;
    }

    public int getLength() {
        return length;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


}
