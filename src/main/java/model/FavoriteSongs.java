package model;

import iterator.Iterator;
import iterator.SongListIterator;

import java.util.List;

public class FavoriteSongs extends PlayList {

    private List<Song> songs;

    public FavoriteSongs(List<Song> songs) {
        this.songs = songs;
        this.songsIterator = new SongListIterator(songs);
    }

    @Override
    public Iterator<Song> iterator() {
        return this.songsIterator;
    }
}
