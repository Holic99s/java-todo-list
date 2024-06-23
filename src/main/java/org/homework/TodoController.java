package org.homework;

import java.util.Scanner;

public class TodoController {
    TodoView todoView = new TodoView();
    TodoRepository todoRepository = new TodoRepository();

    public void start() {
        boolean flag = true;
        while (flag) {
            String n = todoView.getOption();
            Option option = Option.of(n);
            switch (option) {
                case ADD:
                    addTodo();
                    break;
                case DELETE:
                    deleteTodo();
                    break;
                case FIND:
                    findTodo();
                    break;
                case EXIT:
                    todoView.exit();
                    flag = false;
                    break;
                case NONE:
                    todoView.none();
            }
        }
    }

    private void addTodo() {
        String contents = todoView.getContents();
        todoView.printAdd(todoRepository.addTodo(contents));
    }

    private void deleteTodo() {
        int id = todoView.getDeleteId();
        todoView.printDelete(todoRepository.deleteTodo(id));
    }

    private void findTodo() {
        int id = todoView.getFindId();
        todoView.printFind(todoRepository.findTodo(id));
    }

}
