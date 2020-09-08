package com.example.demo1_91social.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@JsonPropertyOrder({"intArray"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MachinePriceResponse {
    @JsonProperty("machine_name")
    private String machine_name ;

    @JsonProperty("machine_price")
    private double machine_price ;



    public void setMachine_name(String machine_name) {
        this.machine_name = machine_name;
    }

    public double getMachine_price() {
        return machine_price;
    }


    @Override
    public String toString() {
        return "MachinePriceResponse{" +
                "machine_name='" + machine_name + '\'' +
                ", machine_price='" + machine_price + '\'' +
                '}';
    }

    public MachinePriceResponse() {

    }
}