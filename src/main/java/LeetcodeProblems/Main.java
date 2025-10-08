package LeetcodeProblems;

public class Main {
    public static void main(String[] args) {
        GenerateParentheses sol=new GenerateParentheses();
        sol.generateParenthesis(3).forEach(System.out::println);
    }
}
