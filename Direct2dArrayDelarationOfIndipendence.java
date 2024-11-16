public class Main {
    public static void main(String[] args) {
        int[][] twoD_array = {
                { 1, 3, 4 },
                { 9, 8, 6 },
                { 2, 0, 5 }
        };
        for (int[] temp : twoD_array) {
            for (int val : temp) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}