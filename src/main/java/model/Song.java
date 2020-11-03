package model;

import java.io.File;

public class Song {

    private String title;
    private String artist;
    private String description;
    private int year;
    private String album;
    private File audioFile;

    public Song(String title, String artist, String description, int year, String album, File audioFile) {
        this.title = title;
        this.artist = artist;
        this.description = description;
        this.year = year;
        this.album = album;
        this.audioFile = audioFile;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public File getAudioFile() {
        return audioFile;
    }

    public void setAudioFile(File audioFile) {
        this.audioFile = audioFile;
    }

    @Override
    public String toString() {
        return artist + " - " + title + " (" + album + ")";
    }
}
