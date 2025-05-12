package _my_test;

import java.util.HashMap;
import java.util.Map;

public class UserMapAddSystem {

    private Map<String,User> users;

    public UserMapAddSystem(){
        users = new HashMap<>();
    }

    public void addUser(String name, String email){
        User u1 = new User(name, email);
        users.put(name, new User(name, email));
    }

    public void printAllUser(){
        for(User u : users.values()){
            System.out.println(u.toString());
        }
    }

    public static void main(String[] args) {
        UserMapAddSystem userMapAddSystem = new UserMapAddSystem();
        userMapAddSystem.addUser("홍길동","a@naver.com");
        userMapAddSystem.addUser("이순신","b@naver.com");

        userMapAddSystem.printAllUser();
    }

} // end of class

class User{
    String name;
    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
