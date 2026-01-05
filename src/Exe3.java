public class Exe3 {
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static int pariDispari(int num1) {
        if (num1 % 2 == 0) {
            return 0;
        } else return 1;
    }

    public static double areaTriangolo() {
        //formula di Erone A = Math.sqrt(semip * (semip - a) * (semip - b) + (semip - c)
        // formula per calcolare il semiperimetro: p = (a + b + c)/ 2.0
        int a = 5, b = 7, c = 10;
        double semiperimetro = (a + b + c) / 2.0;
        double areaTriangolo = Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));
        return areaTriangolo;
    }
}
