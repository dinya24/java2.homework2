package ru.geekbrains.homeworks;



public class Main {

    public static void main(String[] args) {

        String[][] goodArr = {
                {"3", "2", "3", "3"},
                {"6", "1", "3", "3"},
                {"0", "2", "7", "3"},
                {"0", "2", "7", "3"}
        };
        String[][] badSizeArr = {
                {"3", "2", "3", "3"},
                {"6", "1"},
                {"0", "2", "7", "3"},
                {"0", "2", "7", "3"}
        };
        String[][] badCharArr = {
                {"3", "2", "3", "3"},
                {"6", "1", "", ""},
                {"0", "2", "7", "3"},
                {"0", "2", "7", "3"}
        };

        try {
            ArrayUtils.arraySum(goodArr);
        } catch (ArrayDataExemption arrayDataExemption) {
            arrayDataExemption.printStackTrace();
        } catch (ArraySizeExemption sizeExemption) {
            sizeExemption.printStackTrace();
        }

        try {
            ArrayUtils.arraySum(badSizeArr);
        } catch (ArrayDataExemption arrayDataExemption) {
            arrayDataExemption.printStackTrace();
        } catch (ArraySizeExemption sizeExemption) {
            sizeExemption.printStackTrace();
        }

        try {
            ArrayUtils.arraySum(badCharArr);
        } catch (ArrayDataExemption arrayDataExemption) {
            arrayDataExemption.printStackTrace();
        } catch (ArraySizeExemption sizeExemption) {
            sizeExemption.printStackTrace();
        }

    }
}







