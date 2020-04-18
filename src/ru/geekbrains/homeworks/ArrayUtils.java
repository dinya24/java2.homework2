package ru.geekbrains.homeworks;

public class ArrayUtils {

    public static int arraySum(String[][] strArray) throws ArrayDataExemption, ArraySizeExemption {

        int count = 0;
        if (strArray.length != 4) {
            throw new ArraySizeExemption();
        }
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length != 4) {
                throw new ArraySizeExemption();
            }
            for (int j = 0; j < strArray[i].length; j++) {
                try {
                    count = count + Integer.parseInt(strArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataExemption(i, j);
                }
            }

        }
        return count;
    }
}


