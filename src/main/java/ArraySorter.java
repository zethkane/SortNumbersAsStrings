import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArraySorter {

    public static String[] sortThisArray(String[] arr){
        String[] sorted = new String[arr.length];
        ArrayList<String> stringsLessThan2 = new ArrayList<>();
        ArrayList<String> stringsGreaterThan1 = new ArrayList<>();
        ArrayList<String> stringsAsWords = new ArrayList<>();
        String regex = "^[a-z]";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < arr.length; i++) {
            Matcher matcher = pattern.matcher(arr[i]);
            if (arr[i].length() < 2){
                stringsLessThan2.add(arr[i]);
            }
            if (arr[i].length() > 1){
                stringsGreaterThan1.add(arr[i]);
            }

        }
        String[] sortedLessThan2 = sortLengthLessThanTwo(stringsLessThan2);
        String[] sortedGreaterThan1 = sortLengthGreaterThanOne(stringsGreaterThan1);
        String[] sortedAsWords = sortNumbersAsWords(stringsAsWords);
            if (sortedLessThan2.length == arr.length){
                return sortedLessThan2;
            }
            if (sortedLessThan2.length < arr.length){
                for (int i = 0; i < sortedLessThan2.length ; i++) {
                    sorted[i] = sortedLessThan2[i];
                }
                for (int j = sortedLessThan2.length; j < arr.length ; j++) {
                        sorted[j] = sortedGreaterThan1[j - sortedLessThan2.length];
                }
            }

        return sorted;
    }

    public static String[] sortLengthLessThanTwo(ArrayList<String> arr){
        String[] sorted = new String[arr.size()];
        String temp;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size() ; j++) {
                if (arr.get(i).charAt(0) > arr.get(j).charAt(0)){
                    temp = arr.get(j);
                    arr.set(j, arr.get(i));
                    arr.set(i, temp);
                }
            }
        }
        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = arr.get(i);
        }
        return sorted;
    }

    public static String[] sortLengthGreaterThanOne(ArrayList<String> arr){
        String[] sorted = new String[arr.size()];
        String temp;

        for (int i = 0; i <arr.size() ; i++) {
            for (int j = i + 1; j < arr.size() ; j++) {
                if (arr.get(i).charAt(0) > arr.get(j).charAt(0) && arr.get(i).charAt(1) > arr.get(j).charAt(1) || arr.get(i).charAt(0) == arr.get(j).charAt(0) && arr.get(i).charAt(1) > arr.get(j).charAt(1)){
                    temp = arr.get(j);
                    arr.set(j, arr.get(i));
                    arr.set(i, temp);
                }
            }
        }
        for (int i = 0; i < sorted.length ; i++) {
            sorted[i] = arr.get(i);
        }
        return sorted;
    }

    public static String[] sortNumbersAsWords(ArrayList<String> arr){
        Map<String, String> wordsAndNumbers = new HashMap<>();

        return null;
    }

    public static String matchWordWithNumberLessThan20(String word){
        if (word.equals("one")){
            return "1";
        }
        if (word.equals("two")){
            return "2";
        }
        if (word.equals("three")){
            return "3";
        }
        if (word.equals("four")){
            return "4";
        }
        if (word.equals("five")){
            return "5";
        }
        if (word.equals("six")){
            return "6";
        }
        if (word.equals("seven")){
            return "7";
        }
        if (word.equals("eight")){
            return "8";
        }
        if (word.equals("nine")){
            return "9";
        }
        if (word.equals("ten")){
            return "10";
        }
        if (word.equals("eleven")){
            return "11";
        }
        if (word.equals("twelve")){
            return "12";
        }
        if (word.equals("thirteen")){
            return "13";
        }
        if (word.equals("fourteen")){
            return "14";
        }
        if (word.equals("fifteen")){
            return "15";
        }
        if (word.equals("sixteen")){
            return "16";
        }
        if (word.equals("seventeen")){
            return "17";
        }
        if (word.equals("eighteen")){
            return "18";
        }
        if (word.equals("nineteen")){
            return "19";
        }

        return "0";

    }

    public static String matchWordWithNumberGreaterThan20(String word){
        String number = "";

        return number;
    }
}
