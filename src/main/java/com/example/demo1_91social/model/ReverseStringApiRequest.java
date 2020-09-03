package com.example.demo1_91social.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@Setter
@Getter
@JsonPropertyOrder({"userString"})
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class ReverseStringApiRequest {
    @JsonProperty("userString")
    private String userString;
    public ReverseStringApiRequest() {
    }

    @Override
    public String toString() {
        return "ReverseStringApiRequest{" +
                "userString='" + userString + '\'' +
                '}';
    }
}
