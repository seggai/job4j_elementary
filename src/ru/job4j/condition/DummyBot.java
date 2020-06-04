package ru.job4j.condition;

/**
 * Class DummyBot for understanding basic rules of operator "if"
 * @author Yuri.Argunov
 * @version 1
 * @since 20.03.2020
 */
public class DummyBot {
    /**
     * Method answer for writing DummyBot answers in some cases
     * @param question - input question
     * @return rsl - Bot answer
     */
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) { // заменить ... на проверку, известен ли боту этот вопрос и он знает как на него ответить.
            // заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
  }
