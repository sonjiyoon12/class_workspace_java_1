package _my_test;

import collections.UniqueUserIDSystem;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueIUserDSystem {

    private HashSet<String> registeredIDs;

    public UniqueIUserDSystem(){

        registeredIDs = new HashSet<>();

        registeredIDs.add("홍길동");
        registeredIDs.add("이순신");
        registeredIDs.add("야스오");

    }

    // ID 등록 메서드
    public boolean addUSerID(String userid){
        return registeredIDs.add(userid);
    }

    // ID 출력 메서드
    public void printAllIDs(){
        if(registeredIDs.isEmpty()){
            System.out.println("등록된 id가 없습니다");
            return;
        }
        for(String id : registeredIDs){
            System.out.println("id : " + id);
        }
        System.out.println("총 등록된 id 개수 : " + registeredIDs.size());
    }

    // 시스템 실행 메서드
    public void start(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("사용하고 싶은 id를 입력하세요 종료하려면 'exit' 입력");
            String input = scanner.nextLine().trim();

            if(input.isEmpty()){
                System.out.println("id를 입력해주세요");
                continue;
            }
            if("exit".equals(input)){
                System.out.println("시스템을 종료 합니다");
                break;
            }
            boolean isRegistered = addUSerID(input);

            if(isRegistered){
                System.out.println("새로운 사용자 id가 등록되었습니다");
            }else{
                System.out.println("이미 등록된 사용자 id 입니다");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        UniqueUserIDSystem idSystem = new UniqueUserIDSystem();
        idSystem.start();
        idSystem.printAllIDs();
    }

}
