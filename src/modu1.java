public class modu1
{
    public static void main(String[] a1)
    {
        System.out.println(remainder(1, 3));
        System.out.println(triArea(3, 2));
        System.out.println(animals(2, 3, 5));
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(operation(24, 15, 9));
        System.out.println(ctoa('A'));
        System.out.println(addUpTo(3));
        System.out.println(nextEdge(8, 10));
        int[] var1 = new int[] {1, 5, 9};
        System.out.println(sumOfCubes(var1));
        System.out.println(abcmath(42, 5, 10));
    }
    // остаток от операции деления
    public static int remainder(int a1, int a2)
    {
        return a1 % a2;
    }
    // площадь по основанию и высоте
    public static double triArea(double a1, double a2)
    {
        return a1 * a2 * 0.5;
    }
    //  общее количество ног всех животных
    public static int animals(int a1, int a2, int a3)
    {
        return a1 * 2 + a2 * 4 + a3 * 4;
    }
    //  возвращает true, если a1 * a2 > a3; в противном случае возвращает false
    public static boolean profitableGamble(double a1, int a2, int a3)
    {
        return a1 * (double)a2 > (double)a3;
    }
    // возвращает, что нужно сделать с a и b
    public static String operation(int a1, int a2, int a3)
    {
        if (a2 + a3 == a1)
        {
            return "added";
        }
        else if (a2 - a3 == a1)
        {
            return "subtracted";
        }
        else if (a2 * a3 == a1)
        {
            return "multiplied";
        }
        else
            {
            return a2 / a3 == a1 ? "divided" : "none";
            }
    }
    // возвращает значение ASCII переданного символа
    public static int ctoa(char a1)
    {
        return a1;
    }
    // возвращает сумму всех чисел
    public static int addUpTo(int a1)
    {
        int a2 = 0;
        for(int a3 = 1; a3 <= a1; ++a3)
        {
            a2 += a3;
        }
        return a2;
    }
    // максимальное значение третьего ребра треугольника
    public static int nextEdge(int a1, int a2)
    {
        return a1 + a2 - 1;
    }
    // сумму его кубов
    public static int sumOfCubes(int[] a1)
    {
        int a2 = 0;
        for(int a3 = 0; a3 < a1.length; a3++)
        {
            a2 += Math.pow(a1[a3],3);
        }
        return a2;
    }
    // Добавьте A к себе B раз; Проверьте, делится ли результат на C.
    public static boolean abcmath(int a1, int a2, int a3)
    {
        int a4 = a1;

        for(int a5 = 1; a5 <= a2; ++a5)
        {
            a4 += a1;
        }
        return a4 % a3 == 0;
    }
}

