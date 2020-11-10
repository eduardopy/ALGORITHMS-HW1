
public class Q3 {
    public static double linear()
    {
        int step = 0;
        int i;
        Stopwatch linearsw = new Stopwatch();
        for(i=0; i < 100000; i++)
        {
            step++;
        }
        return linearsw.elapsedTime();
    }
    public static double quadratic()
    {
        int step = 0;
        int i;
        Stopwatch quadraticsw = new Stopwatch();
        for(i=0; i <100000; i++)
        {
            int j;
            for(j=0; j < 100000; j++)
            {
                step++;
            }
        }
        return quadraticsw.elapsedTime();
    }

    public static double cubic()
    {
        int step = 0;
        int i;
        Stopwatch cubicsw = new Stopwatch();
        for(i=0; i <100000; i++)
        {
            int j;
            for(j=0; j < 100000; j++)
            {
                int k;
                for(k = 0; k < 100000; k++)
                {
                    step++;
                }
            }
        }
        return cubicsw.elapsedTime();
    }
}
