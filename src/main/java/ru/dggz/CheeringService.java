package ru.dggz;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CheeringService {
    private final CheeringPhraseStorage cheeringPhraseStorage;

    public String getRandomPhrase(){
        return cheeringPhraseStorage.getRandomCheeringPhrase();
    }

    public String addPhrase(String phrase){
        cheeringPhraseStorage.addCheeringPhrase(phrase);
        return "Successfully added: " + phrase;
    }
}
