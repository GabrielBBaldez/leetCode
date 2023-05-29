import java.util.HashMap;
import java.util.Map;

public class MarvintheParanoidMusician {
    public static void main(String[] args) {
        int[] notas = {1, 2, 3, 2, 2, 1, 5, 5};
        //  int[] notas = {1, 2, 5, 2, 2, 1, 5, 5};
        int notaRara = getUniqueNote(notas);
        System.out.println(notaRara != -1 ? notaRara : "null");
    }

    /*Before Marvin, the Paranoid Android, became so bored and depressed by humanity, he was a musician in the Sirius Cibernetic Corporation.
     One day, he decided to discover the rare notes in every song ever produced. A rare note is a note that appears only once in a particular song.
      As Marvin has a head the size of a planet, he knows that it will will take just a nanosecond to process all the songs,
       but the diodes in his left side are in such a pain he don't want to write a program that can solve this and he is waiting for you to do it.
       Given an int[] "notes" with all the notes in a song, return another int[] with the rare notes present in that song.
        For example, given a song with the notes {1, 2, 3, 2, 2, 1, 5, 5}, your method should return {3}. If there are no rare notes in the song, your method should return null.
    *
    Method signature: int[] getRareNotes(int[] notes)*/
    public static int getUniqueNote(int[] notas) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int nota : notas) {
            countMap.put(nota, countMap.getOrDefault(nota, 0) + 1);
        }
        for (int nota : notas) {
            if (countMap.get(nota) == 1) {
                return nota;
            }
        }
        return -1; //Não é possivel retornar null pq pede um retorno int e não Integer
    }
}
