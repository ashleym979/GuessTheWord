public class RandomizedWord {
    private static int wordLen;
    private static String randomWord;

    public static int length() {
        wordLen = (int) ((Math.random() * 4) + 2);


        return wordLen;
    }


    public static String random() {
        randomWord = "";
        String alphabet = "abcdefghijklmnopqrstuwxyz";
        for (int i = 0; i < wordLen; i++) {
            int num = (int) (Math.random() * 26);
            String character = alphabet.substring(num, (num + 1));
            randomWord = randomWord + character;
        }
        return randomWord;
    }

    public static String check(String guess) {
        StringBuilder checking = new StringBuilder(" ");
        int h = 0;
        while (h <= wordLen - 1) {
            int count = 0;
            String b = guess.substring(h, (h + 1));
            for (int i = 0; i < randomWord.length(); i++) {
                String a = randomWord.substring(i, (i + 1));
                if (b.equals(a)) {
                    if (i == h) {
                        checking.append(b).append(" is in the correct spot. ");
                    } else {
                        checking.append(b).append(" is a letter in the word but its placement is wrong. ");
                    }
                } else {
                    count++;
                }

                if (count == wordLen) {
                    checking.append(b).append(" is not a letter in the word. ");
                }
            }
            h++;
        }
        return checking.toString();
    }

    public static String hint(String userWord) {
        String alphabet = "abcdefghijklmnopqrstuwxyz";
        StringBuilder notGuessed = new StringBuilder();
        int h = 0;
        while (h <= wordLen - 1) {
            int count = 0;
            String b = userWord.substring(h, (h + 1));
            for (int i = 0; i < randomWord.length(); i++) {
                String a = randomWord.substring(i, (i + 1));
                if (!(a.equals(b)))
                {
                    count++;
                }
                if (count==wordLen)
                {
                    notGuessed.append(a);
                }
            }
            h++;
        }

        int ind= (int) (Math.random()*(notGuessed.length()));
        for (int s=0;s<notGuessed.length();s++)
        {
            String a = notGuessed.substring(s, (s + 1));
            if (notGuessed.indexOf(a)==ind)
            {
                return "the index of the missing letter in your word in the alphabet is: " + (alphabet.indexOf(a)+1);
            }
        }
    }
}
