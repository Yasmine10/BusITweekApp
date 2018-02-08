package cz.pef.mendelu.busitweek5.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import cz.pef.mendelu.busitweek5.R;
import cz.pef.mendelu.busitweek5.adapters.SettingsAdapter;

public class SettingsActivity extends AppCompatActivity {

    private RecyclerView settingsRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        setToolbar();
        setRecycleView();
    }

    /**
     * Set RecylerView's adapter
     */
    private void setRecycleView() {
        List<String> settingsList = new ArrayList<>();
        settingsList.add("Show tutorial");
        settingsList.add("Reset game");
        settingsList.add("About us");
        settingsRecycleView = findViewById(R.id.settings_recycle_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        SettingsAdapter settingsAdapter = new SettingsAdapter(this, settingsList);
        settingsRecycleView.setLayoutManager(linearLayoutManager);
        settingsRecycleView.setAdapter(settingsAdapter);
    }

    /**
     * Set toolbar
     */
    private void setToolbar() {
        getSupportActionBar().setTitle("Settings");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}