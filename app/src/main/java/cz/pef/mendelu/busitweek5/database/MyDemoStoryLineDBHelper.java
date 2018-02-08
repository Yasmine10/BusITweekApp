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

        builder.addGPSTask("0")
                .radius(1000)
                .location(49.209804, 16.614527)
                .simplePuzzle()
                .question("Question")
                .answer("ok")
                .puzzleTime(30000)
                .puzzleDone()
                .taskDone();

        builder.addGPSTask("1")
                .location(49.259804, 16.654527)
                .radius(1000)
                .simplePuzzle()
                .question("I am a vast complex called Špilberk situated atop a hill of the same name. I was established in the 13th centry by Přemysl Otakar II to protect both the Czech lands and the town of Brno. An occasional residence of Moravian margraves, I became a huge military fortress in the 17th and 18th centuries. My walls offer an amazing view of Brno. I am a…")
                .answer("castle")
                .puzzleDone()
                .taskDone();

        builder.addCodeTask("2")
                .location(49.279804, 16.604527)
                .qr("Welcome in Brno!")
                .choicePuzzle()
                .question("Welcome to St James the Elder Church! This is a late Gothic tree-nave hall church whose history dates to the early 13th century. Here is a legend! The legend is about an indecent creature, who is visible in one of the window arches in the south side of the church near Svoboda square. This creature is showing his naked bottom in the direction of Saint Peter and Paul's cathedral. It all arises from a competition between the two churches to build the highest tower. The bottom directed towards Petrov means that Saint James's church won the competition, because its tower is 94m tall, 10m more than Petrov tower. Is this creature:")
                .addChoice("an angel", false)
                .addChoice("a man", true)
                .addChoice("a dragon", false)
                .puzzleDone()
                .taskDone();

        builder.addBeaconTask("3")
                .beacon(6977, 28402)
                .location(49.229804, 16.594527)
                .choicePuzzle()
                .hint("purple beacon")
                .question("You’re now in front of the Constitutional Court of the Czech Republic. It is a specialized type of court which primarily works to protect the people in the Czech Republic against violations of the Constitution by either the legislature, government or by any other subject that violates people's constitutional rights and freedoms. The decisions of the Court are final, cannot be overturned and are considered being a source of law, like precedents in a common law system. What’s the nearest bus stop and the most well-known of the city?")
                .addChoice("Česká", true)
                .addChoice("Moravské náměstí", false)
                .addChoice("Komenského náměstí", false)
                .puzzleDone()
                .taskDone();
















    }


}