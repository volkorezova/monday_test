package libs;

/**
 * Created by tatyanavolkorezova on 22.06.17.
 */
public class Matrix {
    public int[][]  matrixWithNull(int size) {


        int[][] graph = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                graph[i][j] = 0;
            }
        }
        return graph;

    }


    public static void fillWithOneByDiagonSpravaNalevo(int size, int[][] graphWithDiagon) {

        System.out.println("Zapolnenie sleva napravo po diagonali by 1");

        if (size != graphWithDiagon.length)
            System.out.println("Nevozmozno zapolnit dannuyu matritsy");
        else {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    graphWithDiagon[i][j] = 0;
                    if (i == j) {
                        graphWithDiagon[i][j] = 1;
                    }
                    System.out.print(graphWithDiagon[i][j]);
                }
                System.out.println();
            }
        }
    }


    public static void fillWithOneByDiagonSlevaNapravo(int size, int[][] graphWithDiagon) {
        System.out.println("Zapolnenie sprava nalevo po diagonali by 1");
        if (size != graphWithDiagon.length)
            System.out.println("Nevozmozno zapolnit dannuyu matritsy");
        else {
            for (int i = 0; i < size; i++) {
                int j = (size - 1) - i;
                graphWithDiagon[i][j] = 1;
            }
            displayMatrix(size, graphWithDiagon);
        }
    }


    public static void displayMatrix(int size, int[][] graph ) {
        if (size != graph.length)
            System.out.println("Nevozmozno otobrazit dannuyu matritsy");
        else {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(graph[i][j]);
                }
                System.out.println();
            }
        }
    }



}
