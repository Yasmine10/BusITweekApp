package cz.pef.mendelu.busitweek5.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import cz.pef.mendelu.busitweek5.R;
import cz.pef.mendelu.busitweek5.utils.SharedPrefUtil;


public class TreasureActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private EditText treasureEditText;
    private View shield;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treasure);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        initViews();
        setToolbar();
    }

    private void initViews() {
        treasureEditText = findViewById(R.id.treasure_edit_text);
        shield = findViewById(R.id.map_shield);
        shield.bringToFront();
        if (SharedPrefUtil.getGameComplete(this)) {
            treasureEditText.setText(R.string.treasure_answer);
            shield.setVisibility(View.GONE);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng bar = new LatLng(49.195922, 16.609673);
        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(bar)
                .zoom(15).build();
        mMap.addMarker(new MarkerOptions().position(bar).title(getString(R.string.treasure_answer)));
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
    }

    /**
     * @param view
     */
    public void openMap(View view) {
        if (treasureEditText.getText().toString().equalsIgnoreCase(getString(R.string.treasure_answer))) {
            hideKeyboard();
            shield.animate().translationYBy(0).translationY(1000).setDuration(900).start();
            SharedPrefUtil.setGameComplete(this, true);
        }
    }

    /**
     * Hide software keyboard
     */
    private void hideKeyboard() {
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /**
     * Set toolbar
     */
    private void setToolbar() {
        getSupportActionBar().setTitle(R.string.treasure_title);
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