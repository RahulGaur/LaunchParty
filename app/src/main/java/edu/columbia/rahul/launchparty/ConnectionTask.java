package edu.columbia.rahul.launchparty;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by rahul on 5/23/15.
 */
public class ConnectionTask extends AsyncTask<String,Void, String> {
    public static final String a = "http://192.168.0.7:8888/test/AZM33DS";

    @Override
    protected String doInBackground(String... params) {

        String result= "";
        try {
            URL url = new URL(a);
            URLConnection conn = url.openConnection();
//            result = conn.getContent().toString();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));

            String inputLine;
            while ((inputLine = br.readLine()) != null) {

                result += inputLine;
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }



}
