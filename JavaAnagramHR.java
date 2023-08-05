package HackerRank;/** * Application of frequency counting for checking anagram */import java.util.Scanner;public class JavaAnagramHR {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        final String word1 = scanner.next();        final String word2 = scanner.next();        scanner.close();        if(isAnagram(word1, word2)){            System.out.println("Anagrams");        }        else{            System.out.println("Not Anagrams");        }    }    public static boolean isAnagram(String word1, String word2){        final int size = 26;        final int[] frequencies1 = countAlphabetFrequencies(word1);        final int[] frequencies2 = countAlphabetFrequencies(word2);        for(int i = 0; i < size; i++){            if(frequencies1[i] != frequencies2[i]){                return false;            }        }        return true;    }    public static int[] countAlphabetFrequencies(String word){        word = word.toLowerCase(); /*Lower case is better than upper case*/        final int[] frequencies = new int[26];        final int size = word.length();        for(int i = 0; i < size; i++){            frequencies[word.charAt(i) - 'a']++;        }        return frequencies;    }}