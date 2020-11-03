package media;

import iterator.Iterator;
import model.PlayList;
import model.Song;

public class MusicPlayer {

    public static void play(PlayList playList) {
        Iterator<Song> songsIterator = playList.iterator();

        while (songsIterator.hasNext()) {
            Song song = songsIterator.next();

            System.out.println(song.toString());
        }
    }
}
