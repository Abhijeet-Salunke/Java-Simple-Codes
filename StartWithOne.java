public class StartWithOne {
    public static void main(String[] args) {
        int[] arr = {10, 2, 15, 6, 11, 31};
        printSpecificElements(arr);
    }

    public static void printSpecificElements(int[] arr) {
        System.out.println("Elements with tens place as 1 or starting with 1:");
        for (int num : arr) {
            if (isTensPlaceOneOrStartsWithOne(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isTensPlaceOneOrStartsWithOne(int num) {
//        // Check if the tens place is 1
//        if ((num / 10) % 10 == 1) {
//            return true;
//        }

        // Check if the number starts with 1
        while (num >= 10) {
            num /= 10;
        }

        return num == 1;
    }
}

