package assignment3.logic;

import assignment3.exception.ArgsCount;
import assignment3.exception.IsNumeric;

public class LargestNumber {
    public void amongThreeNumbers(String[] args){

        StringBuilder sb = new StringBuilder();
        try {
            isNumeric(args);
            isThreeArgs(args);
            if (Integer.parseInt(args[0]) > Integer.parseInt(args[1]) && Integer.parseInt(args[0]) > Integer.parseInt(args[2]) ){
                sb.append("largestNumber : ").append(args[0]);
            } else if (Integer.parseInt(args[1]) > Integer.parseInt(args[0]) && Integer.parseInt(args[1]) > Integer.parseInt(args[2])) {
                sb.append("largestNumber : ").append(args[1]);
            }else{
                sb.append("largestNumber : ").append(args[2]);
            }
            System.out.println(sb);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void isThreeArgs(String[] args) throws ArgsCount {
        if(args.length != 3){
            throw new ArgsCount("please enter three values");
        }
    }

    public void isNumeric(String[] args) throws IsNumeric{

        try{
            for (String arg : args) {
                Integer.parseInt(arg);
            }
        }catch (Exception ignored){
            throw new IsNumeric("please enter number only");
        }
    }
}

