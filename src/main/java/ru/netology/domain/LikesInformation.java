package ru.netology.domain;
public class LikesInformation {
    private int count; // количество пользователей, которым понравилась публикация;
    private boolean userLikes; //наличие отметки «Мне нравится» от текущего пользователя (1 — true, 0 — false);
    private boolean canLike; // данные о том, может ли текущий пользователь поставить отметку «Мне нравится» (1 — true, 0 — false);
    private boolean canPublish;// данные о том, может ли текущий пользователь сделать репост записи или публикации (1 — true, 0 — false)
    // boolean  true/false
} 
