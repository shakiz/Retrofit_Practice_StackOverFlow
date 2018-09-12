package com.stackoverflow.shakil.retrofitpractice_stackoverflow;

import com.google.gson.annotations.SerializedName;

public class Question {
    public String title;
    public String body;

    @SerializedName("question_id")
    public String question_id;

    @Override
    public String toString() {
        return (title);
    }
}
