package cz.pef.mendelu.busitweek5.activity;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import cz.mendelu.busItWeek.library.Task;
import cz.pef.mendelu.busitweek5.R;
import cz.pef.mendelu.busitweek5.adapters.TutorialAdapter;

public class TutorialActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private FloatingActionButton nextFrameButton;
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
        tabLayout = findViewById(R.id.tab_layout_tutorial);
        nextFrameButton = findViewById(R.id.next_frame_button);
    }

    /**
     * Set up ViewPager for tutorial
     */
    private void setUpViewPager() {
        List<Integer> pages = new ArrayList<>();
        pages.add(R.layout.tutorial_first);
        pages.add(R.layout.tutorial_second);
        pages.add(R.layout.tutorial_third);
        tutorialAdapter = new TutorialAdapter(pages);
        viewPager.setAdapter(tutorialAdapter);
        tabLayout.setupWithViewPager(viewPager, true);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position == tutorialAdapter.getCount() - 1) {
                    nextFrameButton.setImageResource(R.drawable.ic_explore_white_36dp);
                    nextFrameButton.animate().rotationXBy(0).rotationX(360).setDuration(700).start();
                } else {
                    nextFrameButton.setImageResource(R.drawable.ic_arrow_forward_white_36dp);
                }
            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    /**
     * Move to the next tutorial frame with FAB
     *
     * @param view Floating action button
     */
    public void nextTutorialFrame(View view) {
        int item = viewPager.getCurrentItem();
        if (viewPager.getCurrentItem() + 1 < tutorialAdapter.getCount()) {
            viewPager.setCurrentItem(item + 1, true);
        } else {
            finish();
            startActivity(new Intent(this, MapsActivity.class));
        }
    }


}