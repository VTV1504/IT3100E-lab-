package AimsProject.src.hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Media implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String artist, List<Track> tracks) {
        this.artist = artist;
        this.tracks = tracks;
    }

    /**
     * If the track is already in the playlist, return false. Otherwise, add the track to the playlist and return true
     *
     * @param newTrack The track to be added to the playlist.
     * @return A boolean value.
     */
    public boolean addTrack(Track newTrack) {
        if(tracks.contains(newTrack)){
            return false;
        } else {
            tracks.add(newTrack);
            return true;
        }
    }

    public boolean remoteTrack(Track track) {
        if(tracks.contains(track)){
            tracks.remove(track);
            return true;
        } else {
            return false;
        }
    }

    /**
     * For each track in the tracks list, add the length of the track to the result.
     *
     * @return The length of the album in seconds.
     */
    public int getLength(){
        int result = 0;
        for (Track track : tracks){
            result += track.getLength();
        }
        return result;
    }

    @Override
    public void play() {
        System.out.println("Artist: " + artist);
        for (Track track : tracks) {
            track.play();
        }
    }

    @Override
    public boolean isMatch(String title) {
        return this.getTitle().equals(title);
    }
}