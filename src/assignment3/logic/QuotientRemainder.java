package assignment3.logic;

import assignment3.exception.ArgsCount;
import assignment3.exception.IsNumeric;
import assignment3.exception.IsZero;

public class QuotientRemainder {
    public void calculateQuotientRemainder(String[] args){

        StringBuilder sb = new StringBuilder();
        try {
            isTwoArgs(args);
            isNumeric(args);

            sb.append("Quotient : ").append(Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
            sb.append(" & Remainder : ").append(Integer.parseInt(args[0]) % Integer.parseInt(args[1]));
            System.out.print(sb);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void isTwoArgs(String[] args) throws ArgsCount, IsZero {
        if(args.length !=2){
            throw new ArgsCount("please enter number and divisor only");
        } else if (Integer.parseInt(args[1])== 0) {
            throw new IsZero("Divisor shouldn't be zero ");
        }
    }
    public void isNumeric(String[] args) throws IsNumeric{

        try {
                Integer.parseInt(args[0]);
            Integer.parseInt(args[1]);
        } catch (Exception ignored) {
            throw new IsNumeric("please enter num only");
        }
    }

}
