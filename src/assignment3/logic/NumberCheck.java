package assignment3.logic;

import assignment3.exception.ArgsCount;
import assignment3.exception.IsNumeric;

public class NumberCheck {

    public void evenOrOdd(String[] args){

        try {
            isOneArg(args);
            isNumeric(args[0]);
                if (isEven(Integer.parseInt(args[0]))){
                    System.out.println(args[0] + " is Even");
                } else {
                    System.out.println(args[0] + " is Odd");
                }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public Boolean isEven(int number){
        boolean flag = false;
        if((number)%2 == 0){
            flag = true;
        }
        return flag;
    }

    public void isOneArg(String[] args) throws ArgsCount {
        if(args.length != 1){
            throw new ArgsCount("please enter only one number.");
        }
    }

    public void isNumeric(String input) throws IsNumeric{
        try{
            Integer.parseInt(input);
        }catch (Exception e){
            throw new IsNumeric("please enter number.");
        }
    }

}
