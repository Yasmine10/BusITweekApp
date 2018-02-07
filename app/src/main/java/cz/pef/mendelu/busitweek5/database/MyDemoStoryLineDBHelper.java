package cz.pef.mendelu.busitweek5.database;

import cz.mendelu.busItWeek.library.StoryLineDatabaseHelper;
import cz.mendelu.busItWeek.library.builder.StoryLineBuilder;


public class MyDemoStoryLineDBHelper extends StoryLineDatabaseHelper {

    private static final int DB_VERSION = 1;

    public MyDemoStoryLineDBHelper() {
        super(DB_VERSION);
    }

    @Override
    protected void onCreate(StoryLineBuilder builder) {

    }
}