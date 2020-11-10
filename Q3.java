
public class Q3 {
    public static int linear()
    {
        int step = 0;
        int i;
        Stopwatch linearsw = new Stopwatch();
        for(i=0; i < 100000; i++)
        {
            step++;
        }
        return step;
    }
    public static int quadratic()
    {
        int step = 0;
        int i;
        for(i=0; i <100000; i++)
        {
            int j;
            for(j=0; j < 100000; j++)
            {
                step++;
            }
        }
        return step;
    }

    public static int cubic()
    {
        int step = 0;
        int i;
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
        return step;
    }
}
