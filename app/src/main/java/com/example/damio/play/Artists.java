package com.example.damio.play;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class Artists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        ArrayList<Albumdata> dataOfAlbum = new ArrayList<Albumdata>();
        dataOfAlbum.add(new Albumdata("Bruno Mars", R.drawable.brunomars1));
        dataOfAlbum.add(new Albumdata("Sam Smith", R.drawable.samsmith1));
        dataOfAlbum.add(new Albumdata("Wizkid", R.drawable.wizkid1));
        dataOfAlbum.add(new Albumdata("The Weeknd", R.drawable.weeknd1));
        dataOfAlbum.add(new Albumdata("Cascada", R.drawable.cascada1));


        AlbumdataAdapter adapter = new AlbumdataAdapter (this, dataOfAlbum);
        GridView gridView = (GridView) findViewById(R.id.artist_gridview);
        gridView.setAdapter(adapter);
    }
}
