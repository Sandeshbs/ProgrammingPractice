public class CountWordInAString {

    public static int countOcurrencesOfAWordInStringUsingForLoop(String str, String word)
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

    public static int countOcurrencesOfAWordInStringUsingWhileLoop(String str, String word)
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
        System.out.println("Result Using For Loop : "+ countOcurrencesOfAWordInStringUsingForLoop("SandeshSan", "San"));

        System.out.println("Result Using While Loop : "+ countOcurrencesOfAWordInStringUsingWhileLoop("SandeshSan", "San"));
    }
}
