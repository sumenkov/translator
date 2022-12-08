package org.example.model;

public class OutData {
    private Languages name;
    private Languages title;
    private Languages description;

    public Languages getName() {
        return name;
    }

    public void setName(Languages name) {
        this.name = name;
    }

    public Languages getTitle() {
        return title;
    }

    public void setTitle(Languages title) {
        this.title = title;
    }

    public Languages getDescription() {
        return description;
    }

    public void setDescription(Languages description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "OutDataModel{" +
                "name=" + name +
                ", title=" + title +
                ", description=" + description +
                '}';
    }
}
