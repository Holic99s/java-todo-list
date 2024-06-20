package org.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TodoView {
    Scanner sc = new Scanner(System.in);
    TodoController controller = new TodoController();

    public void start() {
        int n;
        boolean flag = true;
        while (flag) {
            System.out.println("옵션을 선택하세요: 1. 추가, 2. 삭제, 3. 조회, 4. 종료");
            try {
                n = sc.nextInt();
                sc.nextLine();
                switch (n) {
                    case 1:
                        addTodo();
                        break;
                    case 2:
                        deletTodo();
                        break;
                    case 3:
                        findTodo();
                        break;
                    case 4:
                        System.out.println("프로그램을 종료합니다.");
                        flag = false;
                        break;
                    default:
                        System.out.println("잘못된 입력입니다.");
                }
            } catch (InputMismatchException e) {
                // 숫자가 아닌 값을 입력한 경우
                System.out.println("잘못된 입력입니다.");
                sc.nextLine();
            }
        }
    }

    private void addTodo() {
        System.out.println("할 일을 입력해주세요");
        String contents = sc.nextLine();
        int id = controller.addTodo(contents);
        System.out.println("할 일이 추가되었습니다. ID: [ " + id + " ]");
    }

    private void deletTodo() {
        System.out.println("삭제하실 할 일의 ID를 입력해주세요.");
        int id = sc.nextInt();
        sc.nextLine();
        if (controller.deleteTodo(id)) {
            System.out.println("할 일이 삭제되었습니다. ID: [ " + id + " ]");
        } else {
            System.out.println("해당 ID의 할 일이 없습니다.");
        }
    }

    private void findTodo() {
        System.out.println("조회하실 할 일의 ID를 입력해주세요.");
        int id = sc.nextInt();
        sc.nextLine();

        Todo todo = controller.findTodo(id);
        if (todo != null) {
            System.out.println("할 일 ID: [ " + todo.getId() + " ] 내용: [ " + todo.getContents() + " ]");
        } else {
            System.out.println("해당 ID의 할 일이 없습니다.");
        }

    }

}
