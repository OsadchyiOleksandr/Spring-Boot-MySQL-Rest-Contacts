package com.example.Spring_Boot_MySQL_Rest_Contacts.dto.contact;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Java record -клас, мета якого зберігати дані та надавати
 * деякі спеціальні функції, наприклад, немає необхідності описувати
 * конструктор, геттер, equals, hashCode, оскільки в рекорді ці речі будуть
 * автоматично згенеровані компілятором
 */
// @JsonIgnoreProperties допомогає уникнути помилки
// при створенні об'єкту цього типу якщо якесь поле є null
@JsonIgnoreProperties(ignoreUnknown = true)
public record ContactDtoRequest(Long id, String name,
                                String surname, String phone) {
}
