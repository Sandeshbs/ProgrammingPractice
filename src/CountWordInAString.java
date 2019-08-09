/*
    Program to find the occurrences of word in a given string
 */

public class CountWordInAString {

    public static int countOccurrencesOfAWordInStringUsingForLoop(String str, String word)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            int j = str.indexOf(word, i);
            if(i == j)
                count ++;
        }
        return count;
    }

    public static int countOccurrencesOfAWordInStringUsingWhileLoop(String str, String word)
    {
        int count = 0;
        int pos = 0;
        while((pos = str.indexOf(word, pos)) != -1)
        {
            count++;
            pos++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println("Result Using For Loop : "+ countOccurrencesOfAWordInStringUsingForLoop("SandeshSan", "San"));

        System.out.println("Result Using While Loop : "+ countOccurrencesOfAWordInStringUsingWhileLoop("SandeshSan", "San"));
    }
}
