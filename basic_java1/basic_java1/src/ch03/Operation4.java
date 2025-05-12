package ch03;

public class Operation4 {

    // 코드의 진입점
    public static void main(String[] args) {

        // 게임 캐릭터의 상태를 설정
        int playerHealth = 50; // 플레이어의 체력
        int playerLevel = 10; // 플레이어 레벨
        int enemyHealth = 30; // 적의 체력
        int requiredLevel = 15; // 특정 퀘스트를 수행하기 위한 최소 레벨

        // 1. 플레이어의 체력이 적 체력보다 높은지 확인 -> true , false
        boolean isStronger = playerHealth > enemyHealth;
        System.out.println("isStronger : " + isStronger);

        if ( playerHealth > enemyHealth ) {
            System.out.println("진입이 가능합니다");
        } else {
            System.out.println("체력이 낮아 진입이 불가능 합니다.");
        }

        // 2. 플레이어의 체력이 위험 수준(20이하) 인지 확인
        boolean isInDanger = playerHealth <= 20;
        System.out.println("플레이어가 위험 상태이다 : " + isInDanger);

        // 3. 플레이어 레벨이 퀘스트 수행 가능한 레벨 이상인지 확인
        boolean canDoQuest = playerHealth >= requiredLevel;
        System.out.println("퀘스트를 수행할 수 있다 : " + canDoQuest);

        // 4. 플레이어와 적의 체력이 같은지 확인 (비교 연산자)
        boolean isHealthSame = playerHealth == enemyHealth;

        // 5. 플레이어 레벨이 특정 레벨과 같은지 확인 (비교 연산자)
        int needLevel = 50;
        boolean isTrueLevel = playerLevel == needLevel;

        // 6. 플레이어 레벨이 특정 레벨과 다른지 확인
        boolean isFalseLevel = playerLevel != needLevel;



    } // end of main
} // end of class
