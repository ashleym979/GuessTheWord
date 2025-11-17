public class RandomizedWord {
    private static int wordLen;
    private static String randomWord;

    public static int length()
    {
        wordLen= 4;

        return wordLen;
    }

    public static String random()
    {
        randomWord= "abcd";
        return randomWord;
    }

    public static String check(String guess)
    {
        String checking= " ";
        int h=0;
        while (h<=wordLen-1) {
            String b = guess.substring(h, (h + 1));
            for (int i = 0; i < randomWord.length(); i++) {
                String a = randomWord.substring(i, (i + 1));
                int count= 1;
                if (b.equals(a)) {
                    if (i == h) {
                        checking = (checking+b+" is in the correct spot. ");
                    }else
                    {
                        checking = (checking+b+" is a letter in the word but its placement is wrong. ");
                    }
                } else if (((b.equals(a)) = false) && !(i == h)) {
                    count++;
                }
                if (!(b.equals(a)) && !(i == h)) {
                }
                if (count==wordLen){
                    checking = (checking+b+" is not a letter in the word. ");
                }
            }
            h++;
        }
        return checking;
    }

}
