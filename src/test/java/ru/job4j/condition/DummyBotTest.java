package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import ru.job4j.condition.DummyBot;

class DummyBotTest {
    @Test
    void whenGreetBot() {
        String input = "Hi, Bot.";
        String result = DummyBot.answer(input);
        String expected = "Hi, my Lady!";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenByeBot() {
        String input = "Bye.";
        String result = DummyBot.answer(input);
        String expected = "Good luck! Have a nice day!";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenUnknownBot() {
        String input = "Can you add two plus two?";
        String result = DummyBot.answer(input);
        String expected = "I don't know. Please, ask another question.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenUnknown1Bot() {
        String input = "Pleace, tell me that I'm the best is the best?";
        String result = DummyBot.answer(input);
        String expected = "I don't know. Please, ask another question.";
        assertThat(result).isEqualTo(expected);
    }
}