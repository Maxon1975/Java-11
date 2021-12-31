package ru.netology.domain;

public class Post {
    private int signerId;//Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    private int canPin; // Данные о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может)
    private int canDelete; // Данные о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может);
    private int canEdit; // Данные о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может);
    private int isPinned; // Данные о том, что запись закреплена;
    private int markedAsAds;//Информация о том, содержит ли запись отметку «Реклама» (1 — да, 0 — нет);
    private boolean isFavorite;//true, если объект добавлен в закладки у текущего пользователя;


    //+ getter/setter
}