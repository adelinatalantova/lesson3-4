package com.example.lesson3_4.data;

import java.util.ArrayList;
import java.util.List;

public class QuizClient {


    public static List<QuestionModel> list = new ArrayList();

    public static List<QuestionModel> getLevel(){
        list.add(new QuestionModel("One","Третий Президент Кыргызстана?",
                "Р.Отумбаева","К.Бакиев","А.Акаев","А.Атамбаев","Р.Отумбаева"));

        list.add(new QuestionModel("Two","В каком году была написана Мона Лиза?",
                "1503","1502","1503","1504","1505"));

        list.add(new QuestionModel("Three","Какая самая глубокая река в мире?",
                "Конго","Хуанхэ","Миссисипи","Меконг","Конго"));



        return list;
    }
}
