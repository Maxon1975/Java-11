package ru.netology.domain;

public class LikesInformation {
    private int count; // количество пользователей, которым понравилась публикация;
    private int userLikes; //наличие отметки «Мне нравится» от текущего пользователя (1 — есть, 0 — нет);
    private int canLike; // данные о том, может ли текущий пользователь поставить отметку «Мне нравится» (1 — может, 0 — не может);
    private int canPublish;// данные о том, может ли текущий пользователь сделать репост записи или публикации (1 — может, 0 — не может)

    //+getter/setter
}
