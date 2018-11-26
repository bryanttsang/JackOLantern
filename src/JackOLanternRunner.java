public class JackOLanternRunner
{
    public static void main(String args[])
    {
        String[][] face = new String [5][8];
        JackOLantern face1 = new JackOLantern(face);

        face1.fill("X");
        face1.edit(" ", 0, 0);

        System.out.println(face1);
    }
}
