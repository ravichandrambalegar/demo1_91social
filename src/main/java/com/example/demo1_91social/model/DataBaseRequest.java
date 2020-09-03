package com.example.demo1_91social.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class DataBaseRequest {
    @JsonProperty("query")
    private String query;
    public DataBaseRequest() {
    }

    @Override
    public String toString() {
        return "DataBaseRequest{" +
                "query='" + query + '\'' +
                '}';
    }
}




