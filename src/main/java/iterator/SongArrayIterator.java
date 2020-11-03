package iterator;

import model.Song;

public class SongArrayIterator implements Iterator<Song> {

    private int currentIndex;
    private Song[] songs;

    public SongArrayIterator(Song[] songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return this.currentIndex < this.songs.length;
    }

    @Override
    public Song next() {
        Song song = this.songs[currentIndex];

        this.currentIndex++;

        return song;
    }
}
