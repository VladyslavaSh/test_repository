package ee.taltech.game;

public class Hero {
    private String name;
    private Fight fight;

    public Hero(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFight(Fight fight) {
        this.fight = fight;
    }

    public void doFight(){
        if (fight == null){
            return;
        }

        System.out.print("I was fighting");
    }
}
