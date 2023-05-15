public class _00_Class_04 {
    public static void main(String[] args) {
        //2차원 배열
        // [4][3] 배열
        int[][] tbox = new int[4][3];
        //
        //위 타이틀 0,1,2 출력
        System.out.println("  |\t ");
        for (int i = 0; i < tbox.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + "\t");
                System.out.println();
            }
        }
        System.out.println("----------------");
        //번호 출력
        for (int i = 0; i < tbox.length; i++) {
            for (int j = 0; j < 3; j++) {
                tbox[i][j] = (3 * i) + (j + 1);
            }
            System.out.println();
        }//for
        System.out.println("----------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tbox[i][j] + "\t");
                    }
                    System.out.println();
                }
            }//main
        }//class