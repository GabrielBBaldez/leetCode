public class HoldTheDoor {
    public static void main(String[] args) {
        int hodorStrength = 50;
        int[] doorsStrength = {10, 25, 5};
        int[] zombiesInflux = {2, 3, 1};

        System.out.println(holdTheDoor(hodorStrength, doorsStrength, zombiesInflux) +1);
    }

    /*When Hodor was a teenager, he became interested in door strengths. He knew how strong he was and was always trying to figure out how long he could keep a door closed with an horde of zombies behind it trying to pass through.
     By his calculations, he was able to hold "hodorStrength" zombies. Given a "doorsStrength" array with N doors and the amount of zombies each door can hold by itself and a "zombieInflux" array with the number of zombies arriving at each door per second,
     return the door that Hodor can hold the longest before being crushed. You are guaranteed that both arrays have the same length. For example,
      for an input where hodorStrength=50, doorsStrength={10,25,5} and zombiesInflux={2,3,1}, door[0] would be held for 30 seconds, door[1] would be held for 25 seconds and door[2] would be held for 55 seconds. So the answer in this case is "2".
        Method signature: int holdTheDoor(int hodorStrength, int[] doorsStrength, int[] zombiesInflux)*/
    public static int holdTheDoor(int hodorStrength, int[] doorsStrength, int[] zombiesInflux) {
        //garantir que qualquer tempo calculado seja maior
        int maxTime = -1;
        int maxDoor = -1;

        for (int i = 0; i < doorsStrength.length; i++) {
            int forcaPorta = doorsStrength[i];
            int influxoZumbis = zombiesInflux[i];
            int tempo = forcaPorta / influxoZumbis;

            if (forcaPorta <= hodorStrength && tempo > maxTime) {
                maxTime = tempo;
                maxDoor = i;
            }
        }

        return maxDoor;
    }
}
