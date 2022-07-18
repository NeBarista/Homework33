public class Main {
    public static void main(String[] args) {
        System.out.println(negCount(new int[]{2, 3, -4, 2}));
        System.out.println(negCount(new int[]{2, 3, -4, 2}));
        System.out.println(negCount(new int[]{2, 3, 4, 2}));
        System.out.println(negCount(new int[]{}));
    }

    public static int negCount(int[] array) {
        int count = 0;
        if (array.length < 1) {
            System.out.println("array is empty");
            count = -1;
        } else {
            for (int number : array) {
                if (number < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}