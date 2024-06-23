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
}
