public class paranthesis {

    public static void generate(int open, int close, StringBuilder sb) {

        // When all parentheses are used, print result
        if (open == 0 && close == 0) {
            System.out.println(sb.toString());
            return;
        }

        // Add '(' if available
        if (open > 0) {
            sb.append('(');
            generate(open - 1, close, sb);
            sb.deleteCharAt(sb.length() - 1); // backtracking
        }

        // Add ')' only if valid
        if (close > open) {
            sb.append(')');
            generate(open, close - 1, sb);
            sb.deleteCharAt(sb.length() - 1); // backtracking
        }
    }

    public static void main(String[] args) {
        int n = 3;
        generate(n, n, new StringBuilder());
    }
}
