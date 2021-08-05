/**
 * The type Main.
 */
public final class Main {
    private Main() {
    }

    /**
     * The type Check clean.
     */
    static class CheckClean {
        /**
         *
         */
        private int smallestNumber;
        /**
         *
         */
        private int largestNumber;
    }

    /**
     * Upper bound an lower bound check clean.
     *
     * @param givenArray the given array
     * @param arraysize  the arraysize
     * @return the check clean
     */
    static CheckClean upperBoundANLowerBound(final int[] givenArray, final int arraysize) {
        CheckClean objectOfCheck = new CheckClean();
        int i;
        if (arraysize == 1) {
            objectOfCheck.largestNumber = givenArray[0];
            objectOfCheck.smallestNumber = givenArray[0];
            return objectOfCheck;
        }

        if (givenArray[0] > givenArray[1]) {
            objectOfCheck.largestNumber = givenArray[0];
            objectOfCheck.smallestNumber = givenArray[1];
        } else {
            objectOfCheck.largestNumber = givenArray[1];
            objectOfCheck.smallestNumber = givenArray[0];
        }

        for (i = 2; i < arraysize; i++) {
            if (givenArray[i] > objectOfCheck.largestNumber) {
                objectOfCheck.largestNumber = givenArray[i];
            } else if (givenArray[i] < objectOfCheck.smallestNumber) {
                objectOfCheck.smallestNumber = givenArray[i];
            }
        }

        return objectOfCheck;
    }

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(final String... args) {
        int[] givenArray; //declaring Array//
        givenArray = new int[]{1, 11, 330, 445, 1000, 3000};
        int sizeofarray = 6;
        CheckClean objectOfCheck = upperBoundANLowerBound(givenArray, sizeofarray);
        // passing value of array according to size//
        System.out.printf("%n Smallest: %d", objectOfCheck.smallestNumber);
        System.out.printf("%n Largest: %d", objectOfCheck.largestNumber);
    }
}
