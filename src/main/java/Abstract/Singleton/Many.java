package Abstract.Singleton;

public class Many {

    private static Many many1 = new Many();
    private static Many many2 = new Many();
    private Many()
    {

    }
    public static Many getInstance (int whickOne)
    {
        if (whickOne == 1)
            return many1;
        else
            return many2;
    }
}
