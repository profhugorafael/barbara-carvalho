package models;

public class Archer extends Character {

    private Arch primaryWeapon;
    private Arch secondaryWeapon;

    public Archer(int atack, int speed, int defense, Arch primaryWeapon, Arch secondaryWeapon) {
        super(atack, speed, defense);
        this.primaryWeapon = primaryWeapon;
        this.secondaryWeapon = secondaryWeapon;
    }

    public static Archer of(int atack, int speed, int defense, int primaryWeaponAtack, int primaryWeaponArrows, int secondaryWeaponAtack, int secondaryWeaponArrows) {
        Arch arch1 = new Arch(primaryWeaponAtack, primaryWeaponArrows);
        Arch arch2 = new Arch(secondaryWeaponAtack, secondaryWeaponArrows);

        return new Archer(atack, speed, defense, arch1, arch2);
    }

    public Arch getPrimaryWeapon() {
        return primaryWeapon;
    }

    public void setPrimaryWeapon(Arch primaryWeapon) {
        this.primaryWeapon = primaryWeapon;
    }

    public Arch getSecondaryWeapon() {
        return secondaryWeapon;
    }

    public void setSecondaryWeapon(Arch secondaryWeapon) {
        this.secondaryWeapon = secondaryWeapon;
    }

    public void sayHello() {
        System.out.println("hello, im a archer");
    }
}
