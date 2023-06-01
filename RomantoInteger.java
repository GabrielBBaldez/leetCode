import java.io.IOException;
import java.util.HashMap;

public class RomantoInteger {
    public static void main(String[] args) throws IOException {
        System.out.println( romanToInt("IV"));
    }
    public static int romanToInt(String s) {
        HashMap<Character,Integer> mapaDeNumerosRomanos = new HashMap<>();
        mapaDeNumerosRomanos.put('I', 1);
        mapaDeNumerosRomanos.put('V', 5);
        mapaDeNumerosRomanos.put('X', 10);
        mapaDeNumerosRomanos.put('L', 50);
        mapaDeNumerosRomanos.put('C', 100);
        mapaDeNumerosRomanos.put('D', 500);
        mapaDeNumerosRomanos.put('M', 1000);

        int resultado = 0;
        int tamanhoNumeroRomano = s.length();

        for(int i = 0; i < tamanhoNumeroRomano ;i++){

            if( i < tamanhoNumeroRomano - 1 && mapaDeNumerosRomanos.get(s.charAt(i)).intValue() < mapaDeNumerosRomanos.get(s.charAt(i + 1)).intValue()){
                resultado -= mapaDeNumerosRomanos.get(s.charAt(i));
            } else {
                resultado += mapaDeNumerosRomanos.get(s.charAt(i));
            }
        }
        return resultado;
    }
}

