package com.example.OOPMVC;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * POJO modeling player data
 */
public class PlayerModel {
    private String name;
    private String position;
    private int number;
    private int age;
    private String height;
    private int weight;

    public PlayerModel(@JsonProperty("name") String name, @JsonProperty("position") String position,
                       @JsonProperty("number") int number, @JsonProperty("age") int age, @JsonProperty("height") String height,
                       @JsonProperty("weight") int weight)
    {
        this.name = name;
        this.position = position;
        this.number = number;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
