package ru.dggz;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CheeringPhraseController {
    private final CheeringService cheeringService;

    @GetMapping(value = "/support")
    public String getCheeringPhrase(){
        return cheeringService.getRandomPhrase();
    }

    @PostMapping(value = "/support")
    public String addCheeringPhrase(@RequestBody AddPhrase addPhrase){
        return cheeringService.addPhrase(addPhrase.getPhrase());
    }
}
