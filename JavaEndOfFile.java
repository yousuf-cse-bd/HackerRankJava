package HackerRank;import java.util.Scanner;public class JavaEndOfFile {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        for(int i = 1; scanner.hasNextLine(); i++){            System.out.println(i+" "+scanner.nextLine());        }        scanner.close();    }}