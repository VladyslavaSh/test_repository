package ee.taltech.game;


public class Fight {
    private final FightType fightType;

    public Fight(FightType fightType) {
        this.fightType = fightType;
    }

    public void prepareForFight() {
        System.out.print("I am preparing for fighting");
    }

    public void fight() {
        System.out.print("Starting to..." + fightType.name());
    }
}
