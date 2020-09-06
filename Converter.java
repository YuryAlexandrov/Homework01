public class Converter {
    public static void main(String[] args) {
		double n = 36.6;
        System.out.print(n);
        System.out.println(" Celsium");
        System.out.print(toFahrenheit(n));
        System.out.println(" Fahrenheit");
        System.out.print(toKalvin(n));
        System.out.println(" Kalvin");
        System.out.print(toRankin(n));
        System.out.println(" Rankin");
        System.out.print(toDelisle(n));
        System.out.println(" Delisle");
        System.out.print(toNewton(n));
        System.out.println(" Newton");
        System.out.print(toReaumur(n));
        System.out.println(" Reaumur");
        System.out.print(toRomer(n));
        System.out.println(" Romer");
    }

    public static double toFahrenheit(double c) {
        return c * 9/5 + 32;
    }
    public static double toKalvin(double c) {
        return c + 273.15;
    }
    public static double toRankin(double c) {
        return (c + 273.15)*9/5;
    }
    public static double toDelisle(double c) {
        return (100 - c)*3/2;
    }
    public static double toNewton(double c) {
        return c + 273.15;
    }
    public static double toReaumur(double c) {
        return c*4/5;
    }
    public static double toRomer(double c) {
        return c*21/40 + 7.5;
    }

}