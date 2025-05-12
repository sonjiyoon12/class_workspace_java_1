package exercise;

public class SelfExercise {

    // 속성
    int busId;
    String busType;
    String company;


    public SelfExercise(int id, String type, String com) {
        busId = id;
        busType = type;
        company = com;
    }

    //매서드

    public void showInfo() {
        System.out.println("------상태창-----");
        System.out.println("버스 ID :" + busId);
        System.out.println("버스 type :" + busType);
        System.out.println("버스 company :" + company);
    }



} // end of class

