package com.jst1;

public class Title {
    private int id;
    private String name;
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String title) {
        this.name = title;
    }

    public Title(int id,String title){
        this.id = id;
        this.name = title;
    }
}
