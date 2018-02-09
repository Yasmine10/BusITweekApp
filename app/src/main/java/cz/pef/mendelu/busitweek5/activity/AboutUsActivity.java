package cz.pef.mendelu.busitweek5.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import cz.pef.mendelu.busitweek5.R;
import cz.pef.mendelu.busitweek5.adapters.AboutUsAdapter;


public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        setToolbar();
        setUpRecycleView();
    }

    /**
     * Set toolbar
     */
    private void setToolbar() {
        getSupportActionBar().setTitle(R.string.activity_title_about_us);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /**
     * Set up Recycler'sView adapter
     */
    private void setUpRecycleView() {
        List<String> names = new ArrayList<>();
        names.add("Yasmine De Wolf");
        names.add("Simon Wuyts");
        names.add("Loïc Persyn");
        names.add("Petr Tykal");
        RecyclerView recyclerView = findViewById(R.id.about_us_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        AboutUsAdapter aboutUsAdapter = new AboutUsAdapter(this, names);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(aboutUsAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}