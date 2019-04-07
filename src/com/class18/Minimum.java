package com.class18;

public class Minimum {

    static int minOfValues(int[] x) {

        int min = x[0];

        for (int y : x) {

            if (y < min) {
                min = y;
            }
        }

        return min;

    }

    static int maxOfValues(int[] array) {

        int max = array[0];

        for (int j = 0; j < array.length; j++) {

            if (array[j] >= max) {

                max = array[j];
            }

        }

        return max;
		
		
}

}
