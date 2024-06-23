package org.homework;

import java.util.HashMap;
import java.util.Map;

public class TodoRepository {
    private Map<Integer, Todo> todoMap = new HashMap<>();
    private int mapId = 1;

    public Todo addTodo(String contents) {
        Todo todo = new Todo(mapId, contents);
        todoMap.put(mapId++, todo);
        return todo;
    }

    public Todo deleteTodo(int id) {
            return todoMap.remove(id);
    }


    public Todo findTodo(int id) {
        return todoMap.get(id);
    }
}
