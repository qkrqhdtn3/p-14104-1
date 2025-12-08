package com.back.global.rsData;

import com.back.domain.post.postComment.dto.PostCommentDto;

public record RsData<T>(String resultCode, String msg, T data) {
    public RsData(String resultCode, String formatted) {
        this(resultCode, formatted, null);
    }git add .;
    git commit -m "19";
    git push origin main;

}