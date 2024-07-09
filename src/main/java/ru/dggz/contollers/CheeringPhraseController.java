package ru.dggz.contollers;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.dggz.services.CheeringService;
import ru.dggz.dto.AddPhrase;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class CheeringPhraseController {
    private final CheeringService cheeringService;

    @GetMapping(value = "/support")
    public String getCheeringPhrase() {
        return cheeringService.getRandomPhrase();
    }

    @PostMapping(value = "/support")
    public String addCheeringPhrase(@RequestBody @Validated AddPhrase addPhrase) {
        return cheeringService.addPhrase(addPhrase.phrase());
    }
}
