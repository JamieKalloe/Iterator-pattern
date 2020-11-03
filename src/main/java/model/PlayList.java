package model;

import iterator.Iterable;
import iterator.Iterator;

public abstract class PlayList implements Iterable<Song> {

    protected Iterator<Song> songsIterator;
}
