package cz.pef.mendelu.busitweek5.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
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
        getSupportActionBar().setTitle(R.string.activity_title_settings);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /**
     * Dialog for reseting tutorial
     */
    public void tutorialDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setTitle("Do you really want to show a tutorial?")
                .setCancelable(true)
                .setPositiveButton("SHOW TUTORIAL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        // TODO: 08-Feb-18 finish
                        startActivity(new Intent(SettingsActivity.this, TutorialActivity.class));
                    }
                })
                .setNegativeButton("CLOSE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
        builder.create().show();
    }

    /**
     * Dialog for reseting the game
     */
    public void resetGameDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setTitle("Do you really want to reset a game?")
                .setCancelable(true)
                .setPositiveButton("RESET GAME", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        // TODO: 08-Feb-18 finish
                        startActivity(new Intent(SettingsActivity.this, TutorialActivity.class));
                    }
                })
                .setNegativeButton("CLOSE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
        builder.create().show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}