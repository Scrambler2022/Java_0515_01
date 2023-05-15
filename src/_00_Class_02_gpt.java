import java.util.Random;
import java.util.Scanner;

public class _00_Class_02_gpt {
    public static void main(String[] args) {
        // 보물상자 크기
        int boxSize = 10;
        // 보물상자 생성 및 초기화 (0: 보물 없음, 1: 보물 있음)
        int[] treasureBox = new int[boxSize];
        // 보물의 위치를 랜덤하게 결정
        Random rand = new Random();
        int treasureLocation = rand.nextInt(boxSize);
        treasureBox[treasureLocation] = 1;
        // 사용자로부터 입력 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("보물을 찾을 상자의 번호를 입력하세요 (0~9): ");
            int userGuess = scanner.nextInt();
            // 사용자가 선택한 상자에 보물이 있는지 확인
            if (treasureBox[userGuess] == 1) {
                System.out.println("축하합니다! 보물을 찾았습니다!");
                break; // 보물을 찾았으므로 while 루프 종료
            } else {
                System.out.println("아쉽지만, 선택하신 상자에는 보물이 없습니다. 다시 시도해주세요!");
            }
        }
        // Scanner 객체를 닫음
        scanner.close();
    }
}