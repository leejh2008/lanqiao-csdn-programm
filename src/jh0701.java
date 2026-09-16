public class jh0701{
    public static void main(String[]args) {
        String s = "*";
        String space = " ";

        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5 - 1 - i; k++) {
                System.out.print(space);
            }
            for (int x = 0; x < 2 * i + 1; x++) {//控制列数
                System.out.print(s);
            }
            System.out.println();
        }



            for(int y=0;y<4;y++) {
                for (int v = 0; v < y + 1; v++) {
                    System.out.print(space);
                }
                {
                    for (int z = 0; z < 7 - 2 * y; z++) {
                        System.out.print(s);
                    }
                    System.out.println();
                }


            }}}