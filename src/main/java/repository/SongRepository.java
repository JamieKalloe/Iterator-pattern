package repository;

import model.Song;

import java.util.Arrays;
import java.util.List;

public class SongRepository {

    public List<Song> createSongList() {
        return Arrays.asList(
                new Song("Shape of You", "Ed Sheeran", "c", 2020, "Divide", null),
                new Song("Closer", "The Chainsmokers, Halsey", "c", 2020, "Single", null),
                new Song("Stay With Me", "Sam Smith", "c", 2020, "In The Lonely Hour", null)
        );
    }

    public Song[] createSongArray() {
        return new Song[]{
                new Song("Counting Stars", "OneRepublic", "c", 2020, "Native", null),
                new Song("Sugar", "Maroon 5", "c", 2020, "V", null),
                new Song("If You Can Afford Me", "Katy Perry", "c", 2020, "One Of The Boys", null)
        };
    }
}
