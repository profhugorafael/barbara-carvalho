package models;

public class Arch {

    private int attackDamage;
    private int numberOfArrows;

    public Arch(int attackDamage, int numberOfArrows) {
        this.attackDamage = attackDamage;
        this.numberOfArrows = numberOfArrows;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }
}
