package problem;

import java.util.Set;
import java.util.Stack;

public class BalanceamentoDeParenteses {
    public boolean solve(String expression) {
        Set<Character> openSymbols = Set.of('(', '{', '[');
        Set<Character> closeSymbols = Set.of(')', '}', ']');
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (openSymbols.contains(c)) {
                stack.push(c);
            } else if (closeSymbols.contains(c)) {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if (open == '(' && c != ')') return false;
                if (open == '{' && c != '}') return false;
                if (open == '[' && c != ']') return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        BalanceamentoDeParenteses balanceador = new BalanceamentoDeParenteses();
        System.out.println(balanceador.solve("2*(3+4+5*[2+3)]")); // Deve retornar false
        System.out.println(balanceador.solve("[2*(3+4+5*[2+3]/(2+(3+(7+5)*9)*6)*[5+8]+17)+2]")); // Deve retornar true
    }
}
