public class q17 {
    public static void main(String[] args) {
        int number = 34;
        boolean canBeExpressed = false;

        for (int i = 2; i <= number / 2; i++) {
            if (isPrime(i) && isPrime(number - i)) {
                canBeExpressed = true;
                System.out.println(number + " can be expressed as " + i + " + " + (number - i));
                break;
            }
        }

        if (!canBeExpressed) {
            System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
