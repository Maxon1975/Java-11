package ru.netology.domain;

import ru.netology.domain.CommentsInfo;
import ru.netology.domain.LikesInfo;

public class PostInfo {
    private int postId;
    private int userId;
    private int wallId;
    private int date;
    private int text;
    private int photoId;
    private int soundId;
    private int repostId;
    private int commentId;
    private int likeId;
    private boolean canPost;
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostInfo repostInfo;
    private ViewsInfo viewsInfo;
    }
