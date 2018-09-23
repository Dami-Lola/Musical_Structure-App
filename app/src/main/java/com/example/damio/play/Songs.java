package com.example.damio.play;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);


        ArrayList<Songlist> listOfSongs = new ArrayList<Songlist>();
        listOfSongs.add(new Songlist(getResources().getString(R.string.versaceontheFloor), "Bruno Mars 4:21", R.drawable.brunomars, R.drawable.playicon3));
        listOfSongs.add(new Songlist("On Top Your Matter", "Wizkid 3:21", R.drawable.wizkid, R.drawable.playicon3));
        listOfSongs.add(new Songlist("Because the Night", "Cascada 3:01", R.drawable.cascada, R.drawable.playicon3));
        listOfSongs.add(new Songlist("In Love", "Wizkid 4:00", R.drawable.wizkid, R.drawable.playicon3));
        listOfSongs.add(new Songlist("Leave Your Lover", "Sam Smith 3:08", R.drawable.samsmith, R.drawable.playicon3));
        listOfSongs.add(new Songlist("Starboy", "The Weeknd 3:21", R.drawable.weeknd, R.drawable.playicon3));
        listOfSongs.add(new Songlist("24k Magic", "Bruno Mars 5:00", R.drawable.brunomars, R.drawable.playicon3));
        listOfSongs.add(new Songlist("I Feel It Coming", "The Weeknd 4:29", R.drawable.weeknd, R.drawable.playicon3));
        listOfSongs.add(new Songlist("What Hurts the Most", "Sam Smith 4:21", R.drawable.samsmith, R.drawable.playicon3));
        listOfSongs.add(new Songlist("Lay Me Down", "Cascada 3:21", R.drawable.cascada, R.drawable.playicon3));


        SonglistAdapter adapter = new SonglistAdapter (this, listOfSongs);
        ListView listView = (ListView) findViewById(R.id.list_songs);
        listView.setAdapter(adapter);
    }
}
