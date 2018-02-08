package cz.pef.mendelu.busitweek5.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import cz.pef.mendelu.busitweek5.R;
import cz.pef.mendelu.busitweek5.adapters.GridAdapter;

public class PuzzleImageActivity extends AppCompatActivity {

    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle_image);

        gridView = findViewById(R.id.gridView);

        gridView.setAdapter(new GridAdapter(this, new int[]{
                R.drawable.top_left,
                R.drawable.top_center,
                R.drawable.top_right,
                R.drawable.center_left,
                R.drawable.center_part,
                R.drawable.center_right,
                R.drawable.given_part,
                R.drawable.bottom_center,
                R.drawable.bottom_right
        }));
    }
}