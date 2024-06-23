package org.homework;

public class Todo {
    private int id;
    private String contents;

    public Todo(int id, String contents) {
        this.id = id;
        this.contents = contents;
    }

    public int getId() {
        return id;
    }

    public String getContents() {
        return contents;
    }

}
