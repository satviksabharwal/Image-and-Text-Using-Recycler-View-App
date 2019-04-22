package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ArrayList<String> mImageUrl = new ArrayList<>();
    private ArrayList<String> mName = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"On Create: Started");

        initImageBitMap();

    }

    private void initImageBitMap(){

        Log.d(TAG,"initBitmap: Preparing Bitmap");

        mImageUrl.add("https://i.redd.it/5r9svspklot21.png");
        mName.add("Star Wars");
        mImageUrl.add("https://i.redd.it/1qxbg73w6st21.png");
        mName.add("Sunset");
        mImageUrl.add("https://i.redd.it/jllxu4k7oit21.png");
        mName.add("Fedora");
        mImageUrl.add("https://i.redd.it/0z33790blmt21.jpg");
        mName.add("Safari Island");
        mImageUrl.add("https://i.redd.it/8qmb9n7qtot21.jpg");
        mName.add("Dark Experiment");
        mImageUrl.add("https://external-preview.redd.it/aZPtcSE07ST_7IaJgEj9HZc9ggDhax2-jaji8vT6ob0.jpg?auto=webp&s=4c2b07d838840973bfd4610d3200fabc70f27cee");
        mName.add("Game Preview");
        mImageUrl.add("https://i.redd.it/t4zm0k33lot21.jpg");
        mName.add("Icy Lake");

        initRecyclerView();
    }

    private void initRecyclerView(){

        Log.d(TAG,"initRecyclerView: Preparing View");

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mName,mImageUrl,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
