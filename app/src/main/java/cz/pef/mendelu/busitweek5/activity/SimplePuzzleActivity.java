package cz.pef.mendelu.busitweek5.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import cz.mendelu.busItWeek.library.SimplePuzzle;
import cz.mendelu.busItWeek.library.StoryLine;
import cz.mendelu.busItWeek.library.Task;
import cz.pef.mendelu.busitweek5.R;
import cz.pef.mendelu.busitweek5.database.MyDemoStoryLineDBHelper;


public class SimplePuzzleActivity extends AppCompatActivity {

    private EditText answer;
    private TextView question;

    private StoryLine storyLine;
    private Task currentTask;

    private SimplePuzzle puzzle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_puzzle);
        
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        answer = findViewById(R.id.answer);
        question = findViewById(R.id.question);

        storyLine = StoryLine.open(this, MyDemoStoryLineDBHelper.class);
        currentTask = storyLine.currentTask();

        puzzle = (SimplePuzzle) currentTask.getPuzzle();

        question.setText(puzzle.getQuestion());
    }

    public void answerQuestion(View view) {
        //Toast.makeText(this, answer.getText(),Toast.LENGTH_SHORT).show();

        String userAnswer = answer.getText().toString();
        String correctAnswer = puzzle.getAnswer();

        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            // Correct answer
            storyLine.currentTask().finish(true);
            finish();
        } else {
            // Wrong answer
            Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();
        }
    }
}