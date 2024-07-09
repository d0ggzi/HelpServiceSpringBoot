package ru.dggz.storage;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.Map;

@Component
public class CheeringPhraseStorageImpl implements Storage {
    private final Map<UUID, String> cheeringPhrases = new HashMap<>();

    public String getRandomCheeringPhrase() {
        List<String> valuesList = new ArrayList<>(cheeringPhrases.values());
        int randomIndex = new Random().nextInt(valuesList.size());
        return valuesList.get(randomIndex);
    }

    public void addCheeringPhrase(String phrase) {
        cheeringPhrases.put(UUID.randomUUID(), phrase);
    }

}
