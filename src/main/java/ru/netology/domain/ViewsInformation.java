package ru.netology.domain;
//Информация о просмотрах записи. Объект с единственным полем

public class ViewsInformation {
    private int count;// Количество просмотров записи;
    private String postType;//Вид записи может принимать следующие значения: post, copy, reply, postpone, suggest
}

