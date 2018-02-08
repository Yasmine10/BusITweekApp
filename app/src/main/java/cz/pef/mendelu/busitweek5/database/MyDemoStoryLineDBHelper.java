package cz.pef.mendelu.busitweek5.database;

import cz.mendelu.busItWeek.library.StoryLineDatabaseHelper;
import cz.mendelu.busItWeek.library.builder.StoryLineBuilder;


public class MyDemoStoryLineDBHelper extends StoryLineDatabaseHelper {

    private static final int DB_VERSION = 3;

    public MyDemoStoryLineDBHelper() {
        super(DB_VERSION);
    }

    @Override
    protected void onCreate(StoryLineBuilder builder) {

        builder.addGPSTask("1")
                .radius(1000)
                .location(49.209804, 16.614527)
                .simplePuzzle()
                .question("Question")
                .answer("ok")
                .puzzleTime(30000)
                .puzzleDone()
                .taskDone();
    }
}