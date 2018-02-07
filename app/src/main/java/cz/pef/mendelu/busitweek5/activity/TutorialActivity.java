package cz.pef.mendelu.busitweek5.activity;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import cz.pef.mendelu.busitweek5.R;
import cz.pef.mendelu.busitweek5.adapters.TutorialAdapter;

public class TutorialActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TutorialAdapter tutorialAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        initViews();
        setUpViewPager();
        //FOR TUTORIAL
    }

    /**
     * Initialize views
     */
    private void initViews() {
        viewPager = findViewById(R.id.tutorial_view_pager);
    }

    /**
     * Set up ViewPager for tutorial
     */
    private void setUpViewPager() {
        List<Integer> pages = new ArrayList<>();
        pages.add(R.layout.tutorial_first);
        pages.add(R.layout.tutorial_second);
        tutorialAdapter = new TutorialAdapter(pages);
        viewPager.setAdapter(tutorialAdapter);
        //tabLayout.setupWithViewPager(viewPager, true);
    }

    //temporary button for opening map
    public void openMap(View view) {
        startActivity(new Intent(this, MapsActivity.class));
    }
}