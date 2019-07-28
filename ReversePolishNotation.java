package google2019;

import java.util.Stack;

public class ReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        int result = -1;
        Stack<Integer> evaluate = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                if (!evaluate.empty()) {
                    int y = evaluate.pop();
                    int x = evaluate.pop();
                    if(x==0 && tokens[i].equals("/")){
                        evaluate.push(0);
                    }
                    else
                    evaluate.push(evaluateExp(x,y,tokens[i]));
                }
            }
            else
                evaluate.push(Integer.parseInt(tokens[i]));
        }
        return evaluate.pop();
    }

    public static int evaluateExp(int m,int n,String operator){
        int result=0;
        System.out.println("m="+m+" n="+n);
            switch (operator) {
                case "+":
                    result=m+n;
                    break;
                case "-":
                    result=m-n;
                    break;
                case "*":
                    result=m*n;
                    break;
                case "/":
                    result=m/n;
                    break;
                default :
                    break;
            }
        return result;
    }

    public static void main(String as[]){
        String tokens[] = {"4", "13", "5", "/", "+"};
        String tokens1[] = {"0", "3", "/"};
        System.out.println(evalRPN(tokens));
    }
}
