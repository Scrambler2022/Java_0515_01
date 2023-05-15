public class _00_Class_07 {
    public static void main(String[] args) {
        //5,5 배열
        String[][] box = new String[10][10]; // 5*5의 표생성
        int[] num = new int[100]; // 50개의 공간생성
        int temp = 0, random = 0;
        //int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        //1차원 배열에 숫자넣기
        for (int i = 0; i < num.length; i++) {
            num[i] = (i + 1);
        }
        //배열섞기
        for (int i = 0; i < 1000; i++) {
            random = (int) (Math.random() * 100);
            temp = num[0];
            num[0] = num[random];
            num[random] = temp;
        }
        //2차원 배열에 숫자넣기
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {
                box[i][j] = " " + num[box[i].length * i + j]; // String타입 = " "+int;
            }
        }
        while (true) {
            //상단 번호 출력
            System.out.println(" " + "|\t");
            for (int i = 0; i < 10; i++) {
                System.out.print(i + "\t" + "low");
            }
            System.out.println();
            System.out.println("----------------------------------------------------------------------------------------");
            //화면출력
            for (int i = 0; i < box.length; i++) {
                System.out.print((i + 1) + " |columns :");
                for (int j = 0; j < box[i].length; j++) {
                    System.out.print(box[i][j] + "\t");
                }
                System.out.println();
            }
            //1-100까지 번호입력
            System.out.println("1-100까지 번호를 입력하세요.>>>");



        }//while
    }
}