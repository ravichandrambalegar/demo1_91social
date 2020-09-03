package com.example.demo1_91social.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
@JsonPropertyOrder({"intArray"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MachinePriceRequest {
    @JsonProperty("machines")
    private List<Machine> machines;

    @Override
    public String toString() {
        return "MachinePriceRequest{" +
                "machins=" + machines +
                '}';
    }
}
