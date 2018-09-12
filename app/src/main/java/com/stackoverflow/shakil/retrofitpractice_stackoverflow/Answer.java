package com.stackoverflow.shakil.retrofitpractice_stackoverflow;

import com.google.gson.annotations.SerializedName;

public class Answer {
    @SerializedName("answer_id")
    public  int answer_id;

    @SerializedName("is_accepted")
    public boolean accepted;

    public int score;

    @Override
    public String toString() {
        return answer_id+" - Score : " + score + " - Accepted : " + (accepted ? "Yes" : "No");
    }
}
