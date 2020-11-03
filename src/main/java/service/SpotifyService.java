package service;

import model.FavoriteSongs;
import model.Song;
import model.Top10Songs;
import repository.SongRepository;

import java.util.List;

public class SpotifyService {

    private SongRepository songRepository = new SongRepository();

    public FavoriteSongs getFavoriteSongs() {
        List<Song> songs = songRepository.createSongList();

        return new FavoriteSongs(songs);
    }

    public Top10Songs getTop10Songs() {
        Song[] songs = songRepository.createSongArray();

        return new Top10Songs(songs);
    }
}
