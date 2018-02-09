package cz.pef.mendelu.busitweek5.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import cz.pef.mendelu.busitweek5.R;
import cz.pef.mendelu.busitweek5.adapters.GridAdapter;
import cz.pef.mendelu.busitweek5.utils.SharedPrefUtil;


public class PuzzleImageActivity extends AppCompatActivity {

    private static final int NUMBER_OF_QUESTIONS = 8;
    private GridView gridView;
    private Menu menu;
    private int[] puzzles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle_image);

        gridView = findViewById(R.id.gridView);

        switch (SharedPrefUtil.getAnsweredQuestions(this)) {
            case 0:
                puzzles = new int[]{
                        R.drawable.white_part,
                        R.drawable.white_part,
                        R.drawable.white_part,
                        R.drawable.white_part,
                        R.drawable.white_part,
                        R.drawable.white_part,
                        R.drawable.given_part,
                        R.drawable.white_part,
                        R.drawable.white_part
                };
                break;
            case 1:
                puzzles = new int[]{
                        R.drawable.top_left,
                        R.drawable.white_part,
                        R.drawable.white_part,
                        R.drawable.white_part,
                        R.drawable.white_part,
                        R.drawable.white_part,
                        R.drawable.given_part,
                        R.drawable.white_part,
                        R.drawable.white_part
                };
                break;
            case 2:
                puzzles = new int[]{
                        R.drawable.top_left,
                        R.drawable.white_part,
                        R.drawable.white_part,
                        R.drawable.white_part,
                        R.drawable.center_part,
                        R.drawable.white_part,
                        R.drawable.given_part,
                        R.drawable.white_part,
                        R.drawable.white_part
                };
                break;
            case 3:
                puzzles = new int[]{
                        R.drawable.top_left,
                        R.drawable.white_part,
                        R.drawable.white_part,
                        R.drawable.white_part,
                        R.drawable.center_part,
                        R.drawable.white_part,
                        R.drawable.given_part,
                        R.drawable.white_part,
                        R.drawable.bottom_right
                };
                break;
            case 4:
                puzzles = new int[]{
                        R.drawable.top_left,
                        R.drawable.top_center,
                        R.drawable.white_part,
                        R.drawable.white_part,
                        R.drawable.center_part,
                        R.drawable.white_part,
                        R.drawable.given_part,
                        R.drawable.white_part,
                        R.drawable.bottom_right
                };
                break;
            case 5:
                puzzles = new int[]{
                        R.drawable.top_left,
                        R.drawable.top_center,
                        R.drawable.white_part,
                        R.drawable.center_left,
                        R.drawable.center_part,
                        R.drawable.white_part,
                        R.drawable.given_part,
                        R.drawable.white_part,
                        R.drawable.bottom_right
                };
                break;
            case 6:
                puzzles = new int[]{
                        R.drawable.top_left,
                        R.drawable.top_center,
                        R.drawable.white_part,
                        R.drawable.center_left,
                        R.drawable.center_part,
                        R.drawable.white_part,
                        R.drawable.given_part,
                        R.drawable.bottom_center,
                        R.drawable.bottom_right
                };
                break;
            case 7:
                puzzles = new int[]{
                        R.drawable.top_left,
                        R.drawable.top_center,
                        R.drawable.top_right,
                        R.drawable.center_left,
                        R.drawable.center_part,
                        R.drawable.white_part,
                        R.drawable.given_part,
                        R.drawable.bottom_center,
                        R.drawable.bottom_right
                };
                break;
            case 8:
                puzzles = new int[]{
                        R.drawable.top_left,
                        R.drawable.top_center,
                        R.drawable.top_right,
                        R.drawable.center_left,
                        R.drawable.center_part,
                        R.drawable.center_right,
                        R.drawable.given_part,
                        R.drawable.bottom_center,
                        R.drawable.bottom_right
                };
                break;
        }

        gridView.setAdapter(new GridAdapter(this, puzzles));
        setToolbar();
    }

    /**
     * @param item
     */
    public void openTreasure(MenuItem item) {
        startActivity(new Intent(this, TreasureActivity.class));
    }

    /**
     * Set toolbar
     */
    private void setToolbar() {
        getSupportActionBar().setTitle(R.string.activity_title_puzzle_image);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (SharedPrefUtil.getAnsweredQuestions(this) == NUMBER_OF_QUESTIONS) {
            getMenuInflater().inflate(R.menu.menu_puzzle, menu);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}