public class Programa{
    public static void main(String[] args) {
   double krastineA = 2.2;
   double krastineB = 3.2;
   double krastineC = 2.6;
   double krastineD = 3.8;
   double perimetras = staciakampioPerimetras( krastineA,krastineB,krastineC,krastineD);
        System.out.println("perimetras = " + perimetras);

        int X = 2;
        int Z = 4;
        int Y = 2;
        float M = 4.2f;

        int perimetrasXZYM = (int) staciakampioPerimetras(X,Z,Y,M);
        System.out.println("perimetrasXZYM = " + perimetrasXZYM);
    }

    public static double staciakampioPerimetras(double a ,double b,double c ,double d )
    {return a + b +c + d;}






}
