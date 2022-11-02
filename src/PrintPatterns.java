public class PrintPatterns {
    public static void main(String[] args) {
        printPatternA(8);
        printPatternB(8);
    }


    private static void printPatternA(int size) {
        for (int row = 1; row < size; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("# ");
            }

            System.out.println();
        }

    }
    private static void printPatternB(int size){
        for (int row = 1; row <= size; row++) {
            for (int col = 8; col<=row ; col--) {
                System.out.println("# ");
            }
            System.out.println();
    }

}
}