package model;

import iterator.Iterator;
import iterator.SongArrayIterator;

public class Top10Songs extends PlayList {

    private Song[] songs;

    public Top10Songs(Song[] songs) {
        this.songs = songs;
        this.songsIterator = new SongArrayIterator(songs);
    }

    @Override
    public Iterator<Song> iterator() {
        return this.songsIterator;
    }
}
