package ru.netology.domain;
//  "Заглушка" для пользователей, которые не произвели подписку VK Donut. Отображается вместо содержимого записи.

public class Placeholder {
    private boolean canPublishFreeCopy; //можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut
    private String editModeAll;// значения VK Donut можно изменить в записи VK Donut.
    private String editModeDuration; // изменение времени, в течение которого запись будет доступна только платным подписчикам VK Donut
    private int postponedId; //Идентификатор отложенной записи возвращается тогда, когда запись находилась на таймере
}
