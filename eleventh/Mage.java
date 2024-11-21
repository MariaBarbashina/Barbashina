package eleventh;

public class Mage implements GameCharacter{
    private String name;
    private int mana;
    private int spellPower;

    public Mage(String name, int mana, int spellPower) {
        this.name = name;
        this.mana = mana;
        this.spellPower = spellPower;
    }

    @Override
    public GameCharacter clone() {
        try {
            return (GameCharacter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported for Mage");
        }
    }
    @Override
    public void displayInfo() {
        System.out.println("Mage - Name: " + name + ", Mana: " + mana + ", Spell Power: " + spellPower);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }
}
