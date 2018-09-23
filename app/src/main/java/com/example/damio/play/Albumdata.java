package com.example.damio.play;

public class Albumdata {


    private String mText;

    private int mAlbumimg;

    public Albumdata (String vText, int albumimg)
    {
        mText = vText;
        mAlbumimg = albumimg;
    }

    /**
     * Get the Text content
     */
    public String getmText() {
        return mText;
    }


    /**
     * Get the Album Image
     */
    public int getmAlbumimg() {
        return mAlbumimg;
    }

}
