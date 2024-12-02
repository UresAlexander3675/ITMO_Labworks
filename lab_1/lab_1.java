import java.util.Random;
public class lab_1{
    public static void main(String[] args){
        long[] z = new long[(21 - 3 + 1) / 2 + (21 - 3 + 1) % 2];
        int a = 21;
        for (int i = 0; i < z.length; i++){
            z[i] = a;
            a -= 2;
        }
        double[] x = new double[14];
        for(int i = 0; i < x.length; i++){
            Random ran = new Random();
            x[i] = -2.0 + (ran.nextDouble() * (11.0 + 2.0));
        }
        double[][] z1 = new double[10][14];
        for (int i = 0; i < z1.length; i ++){
            for (int j = 0; j < z1[i].length; j ++){
                z1[i][j] = calc_array(x[j], z[i]);
            }
        }
        print(z1);
    }
    public static double calc_array(double x, long z){
        if (z == 7){
        return func1(x);
        }
        if ((z == 5) || (z == 9) || (z == 11) || (z == 15) || (z == 19)){
        return func2(x);
        } else {
        return func3(x);
        }
    }
    public static double func1(double x){
        return Math.sin((Math.pow((Math.cos(x) / 2), 3)));
    }
    public static double func2(double x){
        return Math.asin(Math.cos(Math.pow(((Math.exp(x) + 3) / 3), 2)));
    }
    public static double func3 (double x){
        double pow = Math.pow((Math.PI * (0.5 - Math.tan(x))), Math.cbrt(x));
        double not_pow = (Math.atan(Math.pow(((x + 4.5)/ 13), 2)) + 3) / 2;
        double first = Math.PI + Math.pow(not_pow, pow);
        return Math.pow((first / Math.PI), 3);
    }
    public static void print(double[][] e){
        for (double[] ye : e){
            for (double value: ye){
            System.out.printf("%.5f ", value);
            }
        System.out.println();
        }
    }
}
