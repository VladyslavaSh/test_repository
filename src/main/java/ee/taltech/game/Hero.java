package ee.taltech.game;

public class Hero {
    private String name;
    private int strength;
    private int intelligence;
    private int dexterity;
    private int charisma;


    public Hero(String name, int strength, int intelligence, int dexterity, int charisma) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.charisma = charisma;

    }

    public String getName() {
        return name;
    }
    public int getStrength() { return strength; }
    public int getIntelligence() { return intelligence; }
    public int getDexterity() { return dexterity; }
    public int getCharisma() { return charisma; }
    public void printStats() {
        String printString = getName() + ":";
        printString = printString + "\nStrength: " + getStrength();
        printString = printString + "\nIntelligence: " + getIntelligence();
        printString = printString + "\nDexterity: " + getDexterity();
        printString = printString + "\nCharisma: " + getCharisma();
        printString = printString + "\n";
        System.out.println(printString);
    }
    public int statSum() {
        return(getStrength() + getCharisma() + getDexterity() + getIntelligence());
    }

    public void trainDexterity(int points) {
        dexterity += points;
        System.out.println(">--Dexterity: " + (dexterity - points) + "-->" + dexterity);
    }
}