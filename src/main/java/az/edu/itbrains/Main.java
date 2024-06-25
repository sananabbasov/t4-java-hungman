package az.edu.itbrains;

import java.util.Random;
import java.util.Scanner;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] words = {"Arsenal", "Barcelona", "Garabagh", "Zire", "Kepez", "Real Madrid", "Real Mardin", "HullCity", "Fenerbahce", "Neftci", "Inter Baku", "Eski Sehir Spor"};

        Random rnd = new Random();
        String findWord = words[rnd.nextInt(0, words.length)].toLowerCase();

        String[] result = new String[findWord.length()];
        System.out.println(findWord.split("")[0]);
        String[] strArray = findWord.split("");

        int space = findSpace(findWord);
        int health = 6;
        int trueAnswer = result.length+1-space;




        while (health != 0)
        {
            Draw(result);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Herif daxil edin: ");
            String symbol = scanner.next();
            if (findWord.contains(symbol.toLowerCase())){ // arsenal  z
                for (int i = 0; i < strArray.length; i++) {
                    if (strArray[i].equals(symbol.toLowerCase())){
                        result = addToData(result, symbol.toLowerCase(),findWord);
                        trueAnswer--;
                    }
                }
            }else{
                health--;
                drawTree(health);
            }


            if (trueAnswer == 1)
            {
                Draw(result);
                break;
            }
        }

    }


    public static void Draw(String[] result){

        for (int i = 0; i < result.length; i ++)
        {
            if (result[i] == null) {
                System.out.print("_ ");
            } else {
                System.out.print(result[i]);
            }
        }


        System.out.println("");
    }


    public static String[] addToData(String[] data, String word, String findWord)
    {
        String[] result = data;
        String[] myArr = findWord.split("");
        for (int i = 0; i < findWord.length(); i++) {
            if (myArr[i].equals(word)){
                result[i] = word;
            }

        }
        return result;
    }

    public static int findSpace(String text)
    {
        int count = 0;
        String[] res =  text.split("");
        for (int i = 0; i < res.length; i++) {
            if (res[i].equals(" ")){
                count++;
            }
        }

        return count;
    }


    public static void drawTree(int num)
    {
        switch (num){
            case 5:
                System.out.println("--------------------");
                System.out.println("  |                 |");
                System.out.println("  |                 |");
                System.out.println("  |                 O ");
                System.out.println("  |                  ");
                System.out.println("  |                  ");
                System.out.println("  |                  ");
                System.out.println("__|__                ");
                break;
            case 4:
                System.out.println("--------------------");
                System.out.println("  |                 |");
                System.out.println("  |                 |");
                System.out.println("  |                 O ");
                System.out.println("  |                 |");
                System.out.println("  |                  ");
                System.out.println("  |                  ");
                System.out.println("__|__                ");
                break;
            case 3:
                System.out.println("--------------------");
                System.out.println("  |                 |");
                System.out.println("  |                 |");
                System.out.println("  |                 O ");
                System.out.println("  |                /|");
                System.out.println("  |                  ");
                System.out.println("  |                  ");
                System.out.println("__|__                ");
                break;
            case 2:
                System.out.println("--------------------");
                System.out.println("  |                 |");
                System.out.println("  |                 |");
                System.out.println("  |                 O ");
                System.out.println("  |                /|\\");
                System.out.println("  |                  ");
                System.out.println("  |                  ");
                System.out.println("__|__                ");
                break;
            case 1:
                System.out.println("--------------------");
                System.out.println("  |                 |");
                System.out.println("  |                 |");
                System.out.println("  |                 O ");
                System.out.println("  |                /|\\");
                System.out.println("  |                / ");
                System.out.println("  |                  ");
                System.out.println("__|__                ");
                break;
            case 0:
                System.out.println("--------------------");
                System.out.println("  |                 |");
                System.out.println("  |                 |");
                System.out.println("  |                 O ");
                System.out.println("  |                /|\\");
                System.out.println("  |                / \\");
                System.out.println("  |                  ");
                System.out.println("__|__                ");
                break;

        }
    }

}