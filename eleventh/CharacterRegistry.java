package eleventh;
import java.util.HashMap;
import java.util.Map;

public class CharacterRegistry {
    private Map<String, GameCharacter> prototypes = new HashMap<>();

    public void registerPrototype(String key, GameCharacter character) {
        prototypes.put(key, character);
    }

    public GameCharacter getPrototype(String key) {
        GameCharacter prototype = prototypes.get(key);
        if (prototype != null) {
            return prototype.clone();
        }
        throw new IllegalArgumentException("No prototype found with key: " + key);
    }
}
