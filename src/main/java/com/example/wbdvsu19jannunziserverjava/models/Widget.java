package com.example.wbdvsu19jannunziserverjava.models;

public class Widget {
    private Long id;
    private String name;
    private String type;
    private String text;
    private int size;
    private String src;

    public Widget(Long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Widget() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}
