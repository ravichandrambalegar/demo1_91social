package com.example.demo1_91social.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "customer_info")
public class Customers {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonProperty("id")
    private long id;

    @Column(name = "first_name")
    @JsonProperty("first_name")
    private String first_name;

    @Column(name = "last_name")
    @JsonProperty("last_name")
    private String last_name;

    @Column(name = "contact")
    @JsonProperty("contact")
    private String contact;

    @Column(name = "c_time")
    @JsonProperty("c_time")
    private Timestamp c_time;

    @Column(name = "touchtime")
    @JsonProperty("touchtime")
    private Timestamp touchtime;

}
