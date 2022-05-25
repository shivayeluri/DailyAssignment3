package assignment3.logic;

import assignment3.exception.CharacterOnly;
import assignment3.exception.IsNumeric;

public class CharacterCheck {
    public void vowelOrConsonant(String[] args){
        String vowel = "aeiou";

        try {
            isNumeric(args[0]);
            isChar(args[0]);
            String letter = args[0].toLowerCase();
            StringBuilder stringBuilder = new StringBuilder();

            if (vowel.contains(letter)){
                stringBuilder.append(args[0]).append(" is Vowel");
                System.out.println(stringBuilder);
            }else{
                stringBuilder.append(args[0]).append(" is Consonant");
                System.out.println(stringBuilder);
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void isNumeric(String input) throws IsNumeric {
        try {
            Integer.parseInt(input);
        }catch (Exception ignored){
            return;
        }
        throw new IsNumeric("please enter character only not numbers");

    }
    public void isChar(String input) throws CharacterOnly {
        if(input.length() != 1){
            throw new CharacterOnly("please enter char only.");
        }
    }
}
