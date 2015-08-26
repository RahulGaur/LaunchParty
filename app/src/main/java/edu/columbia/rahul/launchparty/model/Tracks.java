package edu.columbia.rahul.launchparty.model;

/**
 * Created by rahul on 5/24/15.
 */
public class Tracks {
    private String trackName, artistName, albumName, trackId;

    public Tracks() {

    }
    public Tracks(String trackName, String artistName, String albumName, String trackId)
    {
        this.trackName = trackName;
        this.artistName = artistName;
        this.albumName = albumName;
        this.trackId = trackId;
    }

    public void setTrackName(String trackName) {
        trackName = trackName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getTrackId() {
        return trackId;
    }


}
