import media.MusicPlayer;
import model.PlayList;
import service.SpotifyService;

public class Main {

    public static void main(String[] args) {
        SpotifyService spotifyService = new SpotifyService();

        PlayList favoriteSongs = spotifyService.getFavoriteSongs();
        PlayList top10 = spotifyService.getTop10Songs();

        MusicPlayer.play(favoriteSongs);
        MusicPlayer.play(top10);
    }
}
