package eleventh;

public class Warrior implements GameCharacter{
    private String name;
    private int health;
    private int attackPower;

    public Warrior(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    @Override
    public GameCharacter clone() {
        try {
            return (GameCharacter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported for Warrior");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Warrior - Name: " + name + ", Health: " + health + ", Attack Power: " + attackPower);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
