package com.example.damio.play;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SonglistAdapter extends ArrayAdapter<Songlist> {

    public SonglistAdapter (Activity context, ArrayList<Songlist> listOfSongs) {

        super(context, 0, listOfSongs);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list, parent, false);
        }
        Songlist currentSong = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.song_name);
        nameTextView.setText(currentSong.getmSongname());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.artist_timespan);
        numberTextView.setText(currentSong.getmArtistimespan());

        ImageView albumicon = (ImageView) listItemView.findViewById(R.id.album_icon);
        albumicon.setImageResource(currentSong.getmAlbumicon());


        ImageView playicon = (ImageView) listItemView.findViewById(R.id.play_icon);
        playicon.setImageResource(currentSong.getmPlayicon());

       return listItemView;
}
}
