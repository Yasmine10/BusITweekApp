package cz.pef.mendelu.busitweek5.database;

import cz.mendelu.busItWeek.library.StoryLineDatabaseHelper;
import cz.mendelu.busItWeek.library.builder.StoryLineBuilder;


public class MyDemoStoryLineDBHelper extends StoryLineDatabaseHelper {

    private static final int DB_VERSION = 6;

    public MyDemoStoryLineDBHelper() {
        super(DB_VERSION);
    }

    @Override
    protected void onCreate(StoryLineBuilder builder) {

        builder.addGPSTask("1")
                .location(49.259804, 16.654527)
                .radius(1000)
                .simplePuzzle()
                .question("I am a vast complex called Špilberk situated atop a hill of the same name. " +
                        "I was established in the 13th centry by Přemysl Otakar II to protect both the Czech lands and the town of Brno." +
                        " An occasional residence of Moravian margraves, I became a huge military fortress in the 17th and 18th centuries. " +
                        "My walls offer an amazing view of Brno. I am a…")
                .answer("castle")
                .puzzleDone()
                .taskDone();

        builder.addBeaconTask("2")
                .location(49.279804, 16.604527)
                .beacon(6977,28402)
                .hint("purple beacon")
                .choicePuzzle()
                .question("Welcome to St James the Elder Church! " +
                        "This is a late Gothic tree-nave hall church whose history dates to the early 13th century. " +
                        "Here is a legend! The legend is about an indecent creature, who is visible in one of the window arches in the south side of the church near Svoboda square. " +
                        "This creature is showing his naked bottom in the direction of Saint Peter and Paul's cathedral. " +
                        "It all arises from a competition between the two churches to build the highest tower. The bottom directed towards Petrov means that Saint James's church won the competition, because its tower is 94m tall, 10m more than Petrov tower. Is this creature:")
                .addChoice("an angel", false)
                .addChoice("a man", true)
                .addChoice("a dragon", false)
                .puzzleDone()
                .taskDone();

        builder.addGPSTask("3")
                .location(49.229804, 16.594527)
                .radius(1000)
                .choicePuzzle()
                .question("You’re now in front of the Constitutional Court of the Czech Republic. " +
                        "It is a specialized type of court which primarily works to protect the people in the Czech Republic against violations of the Constitution by either the legislature, " +
                        "government or by any other subject that violates people's constitutional rights and freedoms. " +
                        "The decisions of the Court are final, cannot be overturned and are considered being a source of law, like precedents in a common law system. " +
                        "What’s the nearest bus stop and the most well-known of the city?")
                .addChoice("Česká", true)
                .addChoice("Moravské náměstí", false)
                .addChoice("Komenského náměstí", false)
                .puzzleDone()
                .taskDone();

        builder.addCodeTask("4")
                .qr("Welcome in Brno !")
                .location(49.110417, 16.714601)
                .choicePuzzle()
                .question("One of the most famous legends in the city of Brno is that of the dragon that once threatened the people. " +
                        "It is said that the beast was savaging the citizens and their livestock and no one seemed to know how to stop it. " +
                        "That is until a visiting butcher had a brainstorm. The tradesman called for an animal hide (ox or sheep depending on the telling) and a large amount of caustic lime. " +
                        "The lime was placed in the hide and sewn up to look like a juicy meal for the dragon. " +
                        "The trojan feast was fed to the dragon and it was successfully vanquished. " +
                        "Actually, the dragon looks like :")
                .addChoice("A crcodile", true)
                .addChoice("A seal", false)
                .addChoice("A squirrel", false)
                .puzzleDone()
                .taskDone();

        builder.addGPSTask("5")
                .radius(1000)
                .location(49.175258, 16.571470)
                .simplePuzzle()
                .question("On approach of the old Town Hall you might notice that one of the turrets on the decorative facade looks a bit skewed. " +
                        "The story goes that Anton Pilgram, the building’s architect was screwed out of money by Brno’s City Council and his payback was to mess with the design. " +
                        "The other version holds that he was simply too drunk to get it right. " +
                        "The building goes back to the 1200s, and formed part of the city defences during the famous siege by Swedish forces in 1645." +
                        " What is the name of the street you are in ?")
                .answer("radnická")
                .puzzleDone()
                .taskDone();

        builder.addCodeTask("6")
                .qr("mendelu")
                .location(49.190341, 16.610712)
                .simplePuzzle()
                .question("In front of which kind of building are you right now ?")
                .answer("theatre")
                .puzzleDone()
                .taskDone();

        builder.addBeaconTask("7")
                .location(49.196805, 16.614242)
                .beacon(14294,18407)
                .hint("red beacon")
                .simplePuzzle()
                .question("You are now in front of a famous pub of Brno. " +
                        "What is the full name of the main brand of blond beer ?")
                .answer("pilsner urquell")
                .puzzleDone()
                .taskDone();

        builder.addCodeTask("8")
                .qr("b jako brno")
                .location(49.194109, 16.659529)
                .simplePuzzle()
                .question("What is the name of this place ?")
                .answer("b jako brno")
                .puzzleDone()
                .taskDone();



















    }


}