package models;

public class Character {

    private int lifePoints = 100;
    private int attack;
    private int speed;
    private int defense;

    public Character(int atack, int speed, int defense) {
        this.attack = atack;
        this.speed = speed;
        this.defense = defense;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getattack() {
        return attack;
    }

    public void setattack(int attack) {
        this.attack = attack;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void attackSomeone(Character otherCharacter) {
        otherCharacter.lifePoints -= this.attack;
    }
}
