public class Reduce {

    public static void main(String[] args) {

        int count = 0;
        int n = 100;

        while (n != 0) {

            n = n / 2;
            count++;

            if (n % 2 == 1) {

                n--;

            }

        }

        System.out.println(count);

    }

}
