public class Matrizes {

    public static void main(String[] args) {

        double[][] notasAlunos = new double[30][4];

        notasAlunos[0][1] = 6;
        notasAlunos[0][2] = 3;
        notasAlunos[0][3] = 7;
        notasAlunos[0][4] = 7;

        notasAlunos[1][1] = 7;
        notasAlunos[1][2] = 7.8;
        notasAlunos[1][3] = 6;
        notasAlunos[1][4] = 9;

        for (int i = 0; i < notasAlunos.length;i++) {
            for (int j = 0; j < notasAlunos.length; j++) {
                System.out.println(notasAlunos[i][j]);

            }


        }

    }
}
