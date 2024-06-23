package org.homework;

import java.util.Scanner;

public class TodoView {
    Scanner sc = new Scanner(System.in);


    public String getOption() {
        System.out.println("옵션을 선택하세요: 1. 추가, 2. 삭제, 3. 조회, 4. 종료");
        return sc.nextLine();
    }


    public String getContents() {
        System.out.println("할 일을 입력해주세요");
        return sc.nextLine();
    }

    public int getDeleteId() {
        System.out.println("삭제하실 할 일의 ID를 입력해주세요.");
        int id = sc.nextInt();
        sc.nextLine();
        return id;
    }

    public int getFindId() {
        System.out.println("조회하실 할 일의 ID를 입력해주세요.");
        int id = sc.nextInt();
        sc.nextLine();
        return id;
    }

    public void exit() {
        System.out.println("프로그램을 종료합니다.");
    }

    public void none() {
        System.out.println("잘못된 입력입니다.");
    }

    public void printAdd(Todo todo) {
        System.out.println("할 일이 추가되었습니다. ID: [ " + todo.getId() + " ]");
    }

    public void printDelete(Todo todo) {
        if (todo != null) {
            System.out.println("할 일이 삭제되었습니다. ID: [ " + todo.getId() + " ]");
        } else {
            System.out.println("해당 ID의 할 일이 없습니다.");
        }
    }

    public void printFind(Todo todo) {
        if (todo != null) {
            System.out.println("할 일 ID: [ " + todo.getId() + " ] 내용: [ " + todo.getContents() + " ]");
        } else {
            System.out.println("해당 ID의 할 일이 없습니다.");
        }
    }
}
