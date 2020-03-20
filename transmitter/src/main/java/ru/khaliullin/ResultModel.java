package ru.khaliullin;

import org.springframework.stereotype.Component;

@Component
public class ResultModel {
    private String name;

    public ResultModel(String name) {
        this.name = name;
    }

    public ResultModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ResultModel{" +
                "name='" + name + '\'' +
                '}';
    }
}
