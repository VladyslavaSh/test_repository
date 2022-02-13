package ee.taltech;

import ee.taltech.game.Fight;
import ee.taltech.game.FightType;
import ee.taltech.game.Hero;
import ee.taltech.game.Monster;
import java.util.ArrayList;
import java.util.List;


public class ReadyPlayer1 {

    /**
     * this is for player 1 - Strong One
     */
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }

        System.out.print("Numbers are:" + numbers.toString());

        numbers.stream()
                .filter(n -> n < 10)
                .forEach(n -> System.out.println(n));

        Hero vladik = new Hero("Vladik");
        vladik.setFight(new Fight(FightType.KICK));
        vladik.doFight();
        Hero alonik = new Hero("Alonik");
        alonik.setFight(new Fight((FightType.GUN)));
        alonik.doFight();
        // todo chapter 1 creation
        //  create yourself a new hero with an epic name (an instance of class Hero)
        //  your hero is strong, so find a way to define Strength for your hero
        //  add strength to your hero

        // todo team check [pull, commit and push]
        //  continue only when everyone has completed the chapter

        // todo chapter 2 equipment
        //  create a class Weapon.java in package ee.taltech.game, add necessary properties to the weapon (or none)
        //  equip your hero with an epic weapon

        // todo team check [pull, commit and push]
        //  continue only when everyone has completed the chapter

        //todo chapter 3 monster invasion
        //  create a list of 3 monsters, each monster has 222 strength, 333 intelligence, 444 dexterity and 555 charisma
        //  create a fight method in Fight.java which takes in a hero + a list of monsters
        //  Inside the method iterate over each monster
        //  If hero sum of (strength + intelligence + dexterity + charisma) > sum of monster (strength + intelligence + dexterity + charisma)
        //  then you win, if not you loose
        //  fight them (call the method fight with necessary inputs)


        Monster monster1 = new Monster("Monster1",222, 333, 444, 555);
        Monster monster2 = new Monster("Monster2",222, 333, 444, 555);
        Monster monster3 = new Monster("Monster3",222, 333, 444, 555);

        List<Monster> monsters = List.of(monster1, monster2, monster3);

        // todo team check [pull, commit and push]
        //  continue only when everyone has completed the chapter

        //todo chapter 4 train to become epic
        // create a method to train strength (your teammates will create other methods)
        // train your hero in strength, intelligence, dexterity and charisma

        // todo team check [pull, commit and push]
        //  continue only when everyone has completed the chapter

        //todo chapter 5 epic boss battle
        // create an epic boss monster, it has 999999 strength, 999999 intelligence, 999999 dexterity and 999999 charisma
        // create a fight method in Fight.java which takes in a hero and 1 monster (or reuse existing one)
        // fight the boss monster till you win
        // print something epic to conclude your quest of epic-ness
    }

}
