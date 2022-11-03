public class PrintPatterns {
    public static void main(String[] args) {
        printPatternA(8);
        System.out.println("------------------------");
        printPatternB(8);
        System.out.println();
        System.out.println("------------------------");
        printPatternC(8);
        System.out.println("----------------------------");
        printPatternC2(8);
        System.out.println("----------------------------");
        printPatternD(8);
        System.out.println("------------------------------");
        printPatternE(8);
    }


    private static void printPatternA(int size) {
        for (int row = 1; row < size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("# ");
            }

            System.out.println();
        }

    }

    private static void printPatternB(int size) {
        for (int fila = 1; fila <= size; fila++) {
            System.out.println();
            for (int columna = 8; fila <= columna; columna--) {
                System.out.print("# ");
            }

        }
/* for (int row=1; row<=size; row++
for(int col=1;col<=row;col++)
sout("# ")
soutln
 */


    }

    private static void printPatternC(int size) {
        for (int fila = 1; fila <= size; fila++) {
            for (int columna = 1; columna <= fila - 1; columna++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= size - fila + 1; i++) {
                System.out.print("# ");

            }
            System.out.println();
        }

    }

    private static void printPatternC2(int size) {
        for (int fila = 1; fila <= size; fila++) {
            for (int columna = 1; columna <= size; columna++) {
                if (columna <= fila - 1) {
                    System.out.print(" ");

                } else {
                    System.out.print("#");
                }

            }
            System.out.println();


        }
    }

    private static void printPatternD(int size) {
        for (int fila = 1; fila <= size; fila++) {
            for (int columna = 1; columna <= size; columna++) {
                if (columna <= size - fila) {
                    System.out.print("  ");

                } else {
                    System.out.print("# ");
                }

            }
            System.out.println();

        }
    }

    private static void printPatternE(int size) {
        for (int lineaHorizontal = 1; lineaHorizontal <= size; lineaHorizontal++) {
            System.out.print("# ");
            for (int lineaVertical = 1; lineaVertical < lineaHorizontal; lineaVertical++) {
                if (){

                }


            }


        }

    }

}