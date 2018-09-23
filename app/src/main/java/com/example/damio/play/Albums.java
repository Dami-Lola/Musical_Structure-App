package com.example.damio.play;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        ArrayList<Albumdata> dataOfAlbum = new ArrayList<Albumdata>();
        dataOfAlbum.add(new Albumdata("24k Magic", R.drawable.brunomars));
        dataOfAlbum.add(new Albumdata("In the Lonely Hour", R.drawable.samsmith));
        dataOfAlbum.add(new Albumdata("Ayo", R.drawable.wizkid));
        dataOfAlbum.add(new Albumdata("Starboy", R.drawable.weeknd));
        dataOfAlbum.add(new Albumdata("Perfect Day", R.drawable.cascada));


        AlbumdataAdapter adapter = new AlbumdataAdapter (this, dataOfAlbum);
        GridView gridView = (GridView) findViewById(R.id.album_gridview);
        gridView.setAdapter(adapter);
    }
}
