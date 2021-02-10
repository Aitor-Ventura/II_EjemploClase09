public class Vocales {
    public static void aux(char[] fila, int[] count){
        int res = 0;
        for (int i = 0; i < fila.length; i++){
            switch (fila[i]){
                case 'a': count[0]++;
                    break;
                case 'e': count[1]++;
                    break;
                case 'i': count[2]++;
                    break;
                case 'o': count[3]++;
                    break;
                case 'u': count[4]++;
                    break;
            }
        }
    }
    
    public static char calculaVocalMasFrecuente(char[][] matVocales) {
        // Complete el código
        char res = '_';
        int[] count = new int[5];
        for (int i = 0; i < matVocales.length; i++){
            aux(matVocales[i], count);
        }
        int max = count[0];
        int pos = 0;
        for (int i = 1; i < count.length; i++){
            if (count[i] > max){
                max = count[i];
                pos = i;
            }
        }
        switch(pos){
            case 0: return 'a';
            case 1: return 'e';
            case 2: return 'i';
            case 3: return 'o';
            case 4: return 'u';
        }
        return res;
    }
}

