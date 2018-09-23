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

public class AlbumdataAdapter extends ArrayAdapter<Albumdata>{

    public AlbumdataAdapter (Activity context, ArrayList<Albumdata> dataOfAlbum) {

        super(context, 0, dataOfAlbum);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.album_data, parent, false);
        }
        Albumdata currentAlbum = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.textt);
        nameTextView.setText(currentAlbum.getmText());

        ImageView albumimg = (ImageView) listItemView.findViewById(R.id.albumimg);
        albumimg.setImageResource(currentAlbum.getmAlbumimg());

        return listItemView;
    }

}
