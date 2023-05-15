import java.util.Scanner;

public class _00_Class_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp = 0;
        int random = 0;
        String input;
        int[] num = new int[25];
        String[][] box = new String[5][5];
        for (int i = 0; i < 25; i++) {
            num[i] = i + 1;
        }
        // 1차원 배열을 섞기
        for (int i = 0; i < 100; i++) {
            random = (int)(Math.random() * 25);
            temp = num[0];
            num[0] = num[random];
            num[random] = temp;
        }
        // 1차원 배열 값을 2차원 배열에 넣기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                box[i][j] = " "+num[5 * i + j];
            }
        }
        //무한반복 출력
        while (true) {
            // 상단번호출력
            System.out.print("  \t");
            for (int i = 0; i < 5; i++) {
                System.out.print(i + "\t");
            }
            System.out.println();
            System.out.println("--------------------------------");
            // box 번호출력
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(box[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println();
            System.out.println("좌표를 입력하세요. (예: 0,2)>>");
            input = scan.next();
            String[] coordinates = input.split(","); // 입력받은 좌표를 쉼표를 기준으로 분리
            int no1 = Integer.parseInt(coordinates[0]);
            int no2 = Integer.parseInt(coordinates[1]);
            // X 표시넣기
            box[no1][no2] = "X";
        }//while
    }//main
}//class
