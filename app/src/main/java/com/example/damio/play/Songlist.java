package com.example.damio.play;

public class Songlist {

    private String mSongname;

    private String mArtistimespan;

    private int mAlbumicon;

    private int mPlayicon;

    public Songlist(String vSongname, String vartistimespan, int albumicon, int playicon)
    {
        mSongname = vSongname;
        mArtistimespan = vartistimespan;
        mAlbumicon = albumicon;
        mPlayicon = playicon;
    }

    /**
     * Get the name of the Song
     */
    public String getmSongname() {
        return mSongname;
    }

    /**
     * Get the Name of the Artist and Song time span
     */
    public String getmArtistimespan() {
        return mArtistimespan;
    }

    /**
     * Get the Album icon image
     */
    public int getmAlbumicon() {
        return mAlbumicon;
    }

    /**
     * Get the Play icon image
     */
    public int getmPlayicon() {
        return mPlayicon;
    }

}
