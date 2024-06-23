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
                    System.out.println("프로그램을 종료합니다.");
                    flag = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private void addTodo() {
        String contents = todoView.getContents();
        Todo todo = todoRepository.addTodo(contents);
        System.out.println("할 일이 추가되었습니다. ID: [ " + todo.getId() + " ]");
    }

    private void deleteTodo() {
        int id = todoView.getDeleteId();
        if (todoRepository.deleteTodo(id) != null) {
            System.out.println("할 일이 삭제되었습니다. ID: [ " + id + " ]");
        } else {
            System.out.println("해당 ID의 할 일이 없습니다.");
        }
    }

    private void findTodo() {
        int id = todoView.getFindId();

        Todo todo = todoRepository.findTodo(id);
        if (todo != null) {
            System.out.println("할 일 ID: [ " + todo.getId() + " ] 내용: [ " + todo.getContents() + " ]");
        } else {
            System.out.println("해당 ID의 할 일이 없습니다.");
        }

    }

}
