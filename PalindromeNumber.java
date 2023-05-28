import java.io.IOException;

public class PalindromeNumber {
    public static void main(String[] args) throws IOException {
        int x = -121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        int tamanho = ((Integer) x).toString().length();
        String xString = ((Integer) x).toString();
        StringBuilder xInvertido = new StringBuilder();

        for(int i = tamanho; i> 0;i--){
            xInvertido.append(xString.charAt(i - 1));
        }
        return xString.equals(xInvertido.toString());
    }
}
