package cz.pef.mendelu.busitweek5.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cz.pef.mendelu.busitweek5.utils.SharedPrefUtil;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (SharedPrefUtil.getTutorialStatus(this.getApplicationContext())) {
            startActivity(new Intent(this, TextSelectActivity.class));
        } else {
            startActivity(new Intent(this, MapsActivity.class));
        }
        finish();
    }
}