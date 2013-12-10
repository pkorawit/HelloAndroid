package com.example.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void openMap(View view) {

        Log.d("Hello","Start Open Map");

        // Build the intent
        double latitude = 40.714728;
        double longitude = -73.998672;
        String label = "I'm Here!";
        String uriBegin = "geo:" + latitude + "," + longitude;
        String query = latitude + "," + longitude + "(" + label + ")";
        String encodedQuery = Uri.encode(query);
        String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";
        Uri location = Uri.parse(uriString);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);

        startActivity(mapIntent);

    }

    public void openWeb(View view){

        Log.d("Hello","Start Open Web");

        // Build the intent
        Uri location = Uri.parse("http://www.google.com");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(webIntent);


    }
    
}
