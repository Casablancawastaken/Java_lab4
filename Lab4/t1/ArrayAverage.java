package java_labs.Lab4.t1;

public class ArrayAverage {
    public static void main(String[] args) {
        //Object[] arr = {1, 2, 3, 4, 5};
        Object[] arr = {1, 2, 3, 4, 5, "a"};
        int sum = 0;

        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] instanceof Integer) {
                    sum += (int) arr[i];
                } else {
                    throw new NumberFormatException("Ошибка: неверные данные в массиве.");
                }
            }
            double average = (double) sum / arr.length;
            //System.out.println(arr[10]);
            System.out.println("Среднее арифметическое: " + average);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Ошибка: выход за пределы массива.");
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Произошла другая ошибка: " + e.getMessage());
        }
    }
}