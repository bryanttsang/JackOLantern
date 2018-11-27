public class JackOLantern
{
    private String[][] faceFeatures;

    public JackOLantern(String[][] faceFeatures)
    {
        this.faceFeatures = faceFeatures;
    }

    public void edit(String replace, int row, int column)
    {
        faceFeatures[row][column] = replace;
    }

    public void fill(String str)
    {
        for (int i = 0; i < faceFeatures.length; i++)
        {
            for (int ii = 0; ii < faceFeatures[i].length; ii++)
            {
                faceFeatures[i][ii] = str;
            }
        }
    }

    @Override
    public String toString()
    {
        String toString = "";
        for (int i = 0; i < faceFeatures.length; i++)
        {
            for (int ii = 0; ii < faceFeatures[i].length; ii++)
            {
                toString = toString + faceFeatures[i][ii];
                if (ii == faceFeatures[i].length) {
                    toString = toString + "\n";
                }
            }
        }
        return toString;
    }
}
