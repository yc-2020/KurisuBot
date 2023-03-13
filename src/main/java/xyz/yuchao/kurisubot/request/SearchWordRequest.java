package xyz.yuchao.kurisubot.request;

import javax.validation.constraints.NotBlank;

public class SearchWordRequest {

    private String userId;

    @NotBlank
    private String word;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
