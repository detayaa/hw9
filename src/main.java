public class main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println("Задание 1");
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей");

        System.out.println("Задание 2");
        int maxLen = 1;
        int minLen = 10000000;
        for (int i = 0; i < arr.length; i++) {
            if (maxLen < arr[i]) {
                maxLen = arr[i];
            }if (minLen > arr[i]) {
                minLen = arr[i];
            }
        }
        System.out.println("«Минимальная сумма трат за день составила " + minLen +" рублей. Максимальная сумма трат за день составила " + maxLen + " рублей»");

    }

}

