package ru.netology.domain;

public class Post {
    private int signerId;//Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    private boolean canPin; // Информация о том, может ли текущий пользователь закрепить запись (true — может, false — не может)
    private boolean canDelete; // Информация о том, может ли текущий пользователь удалить запись (true — может, false — не может);
    private boolean canEdit; // Информация о том, может ли текущий пользователь редактировать запись (true — может, false — не может);
    private int isPinned; //Информация о том, что запись закреплена;
    private boolean markedAsAds;//Информация о том, содержит ли запись отметку «реклама» (true — да, false — нет);
    private boolean isFavorite;//true, если объект добавлен в закладки у текущего пользователя;

    // boolean true/false
    //+ getter/setter§
}
