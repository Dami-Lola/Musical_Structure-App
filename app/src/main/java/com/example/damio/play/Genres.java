package com.example.damio.play;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class Genres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);

        ArrayList<Albumdata> dataOfAlbum = new ArrayList<Albumdata>();
        dataOfAlbum.add(new Albumdata("Pop", R.drawable.pop));
        dataOfAlbum.add(new Albumdata("R&B Soul", R.drawable.rnbsoul));
        dataOfAlbum.add(new Albumdata("AfroBeats", R.drawable.afrobeats));
        dataOfAlbum.add(new Albumdata("Dance", R.drawable.dance));
        dataOfAlbum.add(new Albumdata("R&B", R.drawable.rnb));


        AlbumdataAdapter adapter = new AlbumdataAdapter (this, dataOfAlbum);
        GridView gridView = (GridView) findViewById(R.id.genre_gridveiw);
        gridView.setAdapter(adapter);
    }
}
