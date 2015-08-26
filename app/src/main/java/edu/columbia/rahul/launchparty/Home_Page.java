package edu.columbia.rahul.launchparty;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.*;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;


public class Home_Page extends ActionBarActivity {

    RelativeLayout home_page;
    Button btn1,btn2;
    public static final String a = "http://192.168.0.7:8888/test/AZM33DS";
    public String partycode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__page);
        //Button button = (Button) onCreatePanelView().findViewById(R.id.button);

        home_page = (RelativeLayout) findViewById(R.id.homepage);
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //click button code goes here
                Intent intent = new Intent(v.getContext(), ListPlaylists.class);
                startActivityForResult(intent,0);

                ConnectionTask ct = new ConnectionTask();
                ct.execute();

            }

        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                //click button code goes here
                Intent intent = new Intent(v1.getContext(), ConnectPlaylist.class);
                startActivityForResult(intent, 0);
            }
        });

    }

//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_home__page, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
