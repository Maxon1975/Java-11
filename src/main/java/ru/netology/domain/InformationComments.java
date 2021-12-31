package ru.netology.domain;

public class InformationComments  {
    private int commentsInfo; // количество комментариев
    private String idInformationComments ; // идентификатор комментариев
    private int canPost; //информация о возможности, может ли текущий пользователь комментировать запись (1 — может, 0 — не может);
    private boolean canClose;//может ли текущий пользователь закрыть комментарии к записи;
    private boolean canOpen; //может ли текущий пользователь открыть комментарии к записи.
    private int  groupsCanPost;// данные о том, могут ли сообщества комментировать запись;


    //+getter/setter
}