import java.io.IOException;
import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) throws IOException {
       String  test1 = "()[]{}";
       String test2 =  "(]";
        System.out.println(isValid(test1));
    }
    public static boolean isValid(String s) {
        Stack<Character> pilha = new Stack<Character>();
        HashMap<Character,Character> complemento = new HashMap<>();
        complemento.put(']','[');
        complemento.put( ')','(');
        complemento.put( '}','{');

        for(Character c: s.toCharArray()){
            switch (c){
                case '(':
                case '{':
                case '[':
                    pilha.push(c);
                break;
                case ')':
                case '}':
                case ']':
                  if(pilha.empty() || pilha.pop() != complemento.get(c)){
                          return false;
                  }
            }
        }
        return pilha.empty();
    }
}

