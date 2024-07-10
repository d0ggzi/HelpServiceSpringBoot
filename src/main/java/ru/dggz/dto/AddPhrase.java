package ru.dggz.dto;

import jakarta.validation.constraints.NotNull;

public record AddPhrase(
        @NotNull
        String phrase
) {
}
