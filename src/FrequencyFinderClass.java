public class FrequencyFinderClass {
    static boolean isFinder(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 5, 5, 6, 7, 8, 9, 4, 5, 6, 3, 9, 8, 2, 4, 7, 1, 2, 4, 5,6,9,3,2,5,4,7,4,2,3,5,9,8,9,1};
        int[] newArray = new int[array.length];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[i] && a != i) {
                    if (!isFinder(newArray, array[i])) {
                        newArray[a++] = array[i];
                    }
                }
            }
        }
        for (int b : newArray) {
            int number = 0;
            if (b != 0) {
                for (int c : array) {
                    if (b == c) {
                        number++;
                    }
                }
                System.out.println(b + " " + "Repeating" + " " + number + " " + "Times");
            }
        }
    }
}
