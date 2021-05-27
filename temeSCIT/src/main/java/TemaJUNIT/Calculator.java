package TemaJUNIT;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    /**
     * Method that takes a string expression and calculates
     *
     * @param expression contains the string that it was added
     * @return the result number
     */
    public int calculator(String expression) {
        List<String> addList = new ArrayList<>();
        List<String> minusList = new ArrayList<>();
        int checkPoint = 0;
        boolean checkOperator = true;
        for (int i = 1; i < expression.length(); i++) {
            String s = expression.substring(i, i + 1);
            if (s.equals("+")) {
                check(addList, minusList, checkOperator, expression.substring(checkPoint, i).trim());
                checkPoint = i + 1;
                checkOperator = true;
                continue;
            }
            if (s.equals("-")) {
                check(addList, minusList, checkOperator, expression.substring(checkPoint, i).trim());
                checkPoint = i + 1;
                checkOperator = false;
                continue;
            }
        }

        //add the last part
        check(addList, minusList, checkOperator, expression.substring(checkPoint).trim());

        int sumAdd = list(addList);
        int sumMinus = list(minusList);

        return sumAdd - sumMinus;
    }

    /**
     * Method that converts
     *
     * @param addList contains the list add
     * @return the converted number
     */
    private static int list(List<String> addList) {
        Convertor convertor = new Convertor();

        int sum = 0;
        for (String s : addList) {
            String[] arr = s.split(" ");
            int value = Integer.parseInt(arr[0]);
            int scale;

            switch (arr[1]) {
                case "km":
                    scale = convertor.getKm();
                    sum += value * scale;
                    break;
                case "m":
                    scale = convertor.getM();
                    sum += value * scale;
                    break;
                case "dm":
                    scale = convertor.getDm();
                    sum += value * scale;
                    break;
                case "cm":
                    scale = convertor.getCm();
                    sum += value * scale;
                    break;
                case "mm":
                    scale = convertor.getMm();
                    sum += value * scale;
                    break;
            }
        }
        return sum;
    }

    /**
     * Method that checks the operator and puts in the approriate list
     *
     * @param addList       contains the list that it will pe added
     * @param minusList     contains the list that it will pe added
     * @param checkOperator contains the value that decide in what list it will be added
     * @param sub           contains the substring
     */
    private static void check(List<String> addList, List<String> minusList, boolean checkOperator, String sub) {
        if (checkOperator == true) {
            addList.add(sub);
        } else {
            minusList.add(sub);
        }
    }
}