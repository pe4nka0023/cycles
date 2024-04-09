import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //task 1
        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        double[] doubles = {1.57, 7.654, 9.986};
        boolean[] bools = {false, false, true};

        //task 2
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < doubles.length; i++) {
            System.out.print(doubles[i]);
            if (i < doubles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < bools.length; i++) {
            System.out.print(bools[i]);
            if (i < bools.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        //task 3
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = doubles.length - 1; i >= 0; i--) {
            System.out.print(doubles[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = bools.length - 1; i >= 0; i--) {
            System.out.print(bools[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        //task 4
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                nums[i]++;

            }

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }

        }
        }

    }