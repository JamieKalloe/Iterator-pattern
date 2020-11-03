package iterator;

import model.Song;

import java.util.List;

public class SongListIterator implements Iterator<Song> {

    private int currentIndex;
    private List<Song> songs;

    public SongListIterator(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return this.currentIndex < this.songs.size();
    }

    @Override
    public Song next() {
        Song song = this.songs.get(currentIndex);

        this.currentIndex++;

        return song;
    }
}
