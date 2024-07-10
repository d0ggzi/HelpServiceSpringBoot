package ru.dggz.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dggz.storage.CheeringPhraseStorageImpl;

@RequiredArgsConstructor
@Service
public class CheeringService {
    private final CheeringPhraseStorageImpl cheeringPhraseStorage;

    public String getRandomPhrase() {
        return cheeringPhraseStorage.getRandomCheeringPhrase();
    }

    public String addPhrase(String phrase) {
        cheeringPhraseStorage.addCheeringPhrase(phrase);
        return "Successfully added: " + phrase;
    }
}
