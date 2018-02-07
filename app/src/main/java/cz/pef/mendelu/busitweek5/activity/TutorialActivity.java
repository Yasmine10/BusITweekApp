package cz.pef.mendelu.busitweek5.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cz.pef.mendelu.busitweek5.R;

public class TutorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //FOR TUTORIAL
    }

    //temporary button for opening map
    public void openMap(View view) {
        startActivity(new Intent(this, MapsActivity.class));
    }
}