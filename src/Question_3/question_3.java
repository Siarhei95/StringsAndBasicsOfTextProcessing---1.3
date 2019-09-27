package Question_3; //В строке найти количество цифр

public class question_3 {
    public static void main(String[] args) {
        String someWords = ";1-car; 2-motors; 30 - bicycles ant etc.";
        int count = 0;
            for (int i = 0; i < someWords.length(); i++) {
                if (Character.isDigit(someWords.charAt(i))){ //через метод Character.isDigit() — определим, является ли указанное значение типа char цифрой.
                    count++;                                 //метод charAt() — возвратит символ, расположенный по указанному индексу (i) строки.
                }
            }
            System.out.println("Digits in line: " + count);
        }
    }
