package ee.taltech.game;

public class Monster {
    private String name;
    private Integer strength;
    private Integer intelligence;
    private Integer dexterity;
    private Integer charisma;

    public Monster(String name) {
        this.name = name;
    }

    public Monster(String name, Integer strength, Integer intelligence, Integer dexterity, Integer charisma) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.charisma = charisma;
    }

    public String getName() {
        return name;
    }

    public Monster setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getStrength() {
        return strength;
    }

    public Monster setStrength(Integer strength) {
        this.strength = strength;
        return this;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public Monster setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
        return this;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public Monster setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
        return this;
    }

    public Integer getCharisma() {
        return charisma;
    }

    public Monster setCharisma(Integer charisma) {
        this.charisma = charisma;
        return this;
    }
}
