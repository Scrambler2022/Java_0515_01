public class _00_Class_02 {
    public static void main(String[] args) {
        int box[][] = new int[5][4];
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {
//				box[i][j] = 4 * i + (j + 1);
                if (i != 4) {
                    box[i][j] = 0;
                } else {
                    box[i][j] = 1;
                }
            }
        }
        // 출력
        System.out.print("  " + "\t");
        for (int i = 0; i < 4; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("--------------------------------------");
        for (int i = 0; i < box.length; i++) {
            System.out.print(i + "|\t");
            for (int j = 0; j < box[i].length; j++) {
                System.out.print(box[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
    }//main
}//class