package com.example.demo1_91social.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class InsertDBRequest {
    @JsonProperty("insert_count")
    private int number;
    public InsertDBRequest() {
    }

    @Override
    public String toString() {
        return "InsertDBRequest{" +
                "number=" + number +
                '}';
    }
}



