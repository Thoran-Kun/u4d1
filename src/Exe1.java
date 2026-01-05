public class Exe1 {

    String[] stringhe = new String[5];
    String str3 = "ho 35 anni";

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static String printString(String str1, int str2) {
        return str1 + str2;
    }

    public static String[] inserisciInArray(String[] array, String str4) {

        String[] stringhe = new String[6];
        stringhe[0] = array[0];
        stringhe[1] = array[1];
        //inseriamo al 3 posto la nuova stringa str4
        stringhe[2] = str4;
        stringhe[3] = array[2];
        stringhe[4] = array[3];
        stringhe[5] = array[4];
        return stringhe;
    }
}
