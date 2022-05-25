package assignment3.logic;

import assignment3.exception.ArgsCount;
import assignment3.exception.IsNumeric;

public class Swapping {
    public void swapTwoNumbers(String[] inputNumbers){

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        try{
            isTwoArgs(inputNumbers);
            isNumeric(inputNumbers);

            sb1.append("Given numbers : ").append(Integer.parseInt(inputNumbers[0])).append(" , ").append(Integer.parseInt(inputNumbers[1]));
            sb2.append("After Swapping : ").append(Integer.parseInt(inputNumbers[1])).append(" , ").append(Integer.parseInt(inputNumbers[0]));

            System.out.println(sb1);
            System.out.println(sb2);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void isTwoArgs(String[] args) throws ArgsCount {
        if(args.length != 2){
            throw new ArgsCount("please enter two values to swap.");
        }
    }
    public void isNumeric(String[] args) throws IsNumeric {

        try{
            for (String arg : args) {
                Integer.parseInt(arg);
            }
        }catch (Exception ignored){
            throw new IsNumeric("please enter number only");
        }
    }
}
