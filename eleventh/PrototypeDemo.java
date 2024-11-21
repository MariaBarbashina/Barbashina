package eleventh;

public class PrototypeDemo {
    public static void main(String[] args) {
        CharacterRegistry registry = new CharacterRegistry();

        Warrior baseWarrior = new Warrior("Base Warrior", 100, 15);
        Mage baseMage = new Mage("Base Mage", 80, 25);
        registry.registerPrototype("Warrior", baseWarrior);
        registry.registerPrototype("Mage", baseMage);

        Warrior warrior1 = (Warrior) registry.getPrototype("Warrior");
        warrior1.setName("Conan");
        warrior1.setHealth(120);

        Mage mage1 = (Mage) registry.getPrototype("Mage");
        mage1.setName("Gandalf");
        mage1.setMana(100);
        mage1.setSpellPower(40);

        warrior1.displayInfo();
        mage1.displayInfo();


        Warrior warrior2 = (Warrior) registry.getPrototype("Warrior");
        warrior2.setName("Thor");
        warrior2.setAttackPower(20);
        warrior2.displayInfo();
    }
}
