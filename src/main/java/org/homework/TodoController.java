package org.homework;

import java.util.HashMap;
import java.util.Map;

public class TodoController {
    private Map<Integer, Todo> todoMap = new HashMap<>();
    private int mapId = 1;

    public int addTodo(String contents) {
        Todo todo = new Todo(mapId, contents);
        todoMap.put(mapId, todo);
        System.out.println(todoMap);
        return mapId++;
    }

    public boolean deleteTodo(int id) {
        if (todoMap.containsKey(id)) {
            todoMap.remove(id);
            return true;
        }
        return false;
    }


    public Todo findTodo(int id) {
        return todoMap.get(id);
    }
}
