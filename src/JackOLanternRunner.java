public class JackOLanternRunner
{
    public static void main(String args[])
    {
        String[][] face = new String [19][22];
        JackOLantern face1 = new JackOLantern(face);

        face1.fill("  ");

        face1.edit("██", 0, 9);
        face1.edit("██", 0, 10);

        face1.edit("██", 1, 10);
        face1.edit("██", 1, 11);

        face1.edit("██", 2, 10);
        face1.edit("██", 2, 11);

        for (int i = 4; i < 8; i++) { face1.edit("██", 3, i); face1.edit("██", 3, 21 - i); }
        for (int i = 9; i < 13; i++) { face1.edit("██", 3, i); }

        for (int i = 3; i < 19; i++) { face1.edit("██", 4, i); }

        for (int i = 2; i < 20; i++) { face1.edit("██", 5, i); }

        for (int i = 1; i < 21; i++) { face1.edit("██", 6, i); }
        face1.edit("  ", 6, 6);
        face1.edit("  ", 6, 15);

        for (int i = 1; i < 21; i++) { face1.edit("██", 7, i); }
        for (int i = 5; i < 8; i++) { face1.edit("  ", 7, i); face1.edit("  ", 7, 21 - i); }

        for (int i = 0; i < 22; i++) { face1.edit("██", 8, i); }
        for (int i = 4; i < 9; i++) { face1.edit("  ", 8, i); face1.edit("  ", 8, 21 - i); }

        for (int i = 0; i < 22; i++) { face1.edit("██", 9, i); }

        for (int i = 0; i < 22; i++) { face1.edit("██", 10, i); }
        face1.edit("  ", 10, 10);
        face1.edit("  ", 10, 11);

        for (int i = 0; i < 22; i++) { face1.edit("██", 11, i); }
        face1.edit("  ", 11, 10);
        face1.edit("  ", 11, 11);

        for (int i = 0; i < 22; i++) { face1.edit("██", 12, i); }

        for (int i = 0; i < 22; i++) { face1.edit("██", 13, i); }
        for (int i = 4; i < 7; i++) { face1.edit("  ", 13, i); face1.edit("  ", 13, 21 - i); }
        for (int i = 9; i < 13; i++) { face1.edit("  ", 13, i); face1.edit("  ", 13, 21 - i); }

        for (int i = 1; i < 21; i++) { face1.edit("██", 14, i); }
        for (int i = 5; i < 17; i++) { face1.edit("  ", 14, i); }

        for (int i = 1; i < 21; i++) { face1.edit("██", 15, i); }
        for (int i = 6; i < 16; i++) { face1.edit("  ", 15, i); }

        for (int i = 2; i < 20; i++) { face1.edit("██", 16, i); }
        for (int i = 7; i < 10; i++) { face1.edit("  ", 16, i); face1.edit("  ", 16, 21 - i); }

        for (int i = 3; i < 19; i++) { face1.edit("██", 17, i); }

        for (int i = 5; i < 10; i++) { face1.edit("██", 18, i); face1.edit("██", 18, 21 - i);}

        System.out.println(face1);
    }
}
