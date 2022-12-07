package org.example;

public class OutDataModel {
    private LangModel name;
    private LangModel title;
    private LangModel description;

    public LangModel getName() {
        return name;
    }

    public void setName(LangModel name) {
        this.name = name;
    }

    public LangModel getTitle() {
        return title;
    }

    public void setTitle(LangModel title) {
        this.title = title;
    }

    public LangModel getDescription() {
        return description;
    }

    public void setDescription(LangModel description) {
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
