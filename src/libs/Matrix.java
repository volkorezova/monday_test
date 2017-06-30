package libs;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by tatyanavolkorezova on 22.06.17.
 */
public class Matrix {
    public static Logger logger = Logger.getLogger(Matrix.class);
    public int[][] matrixInitialization(int size) {


        int[][] graph = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                graph[i][j] = 0;
            }
        }
        return graph;

    }


    public static void fillWithOneByDiagonSlevaNapravo(int size, int[][] graphWithDiagon) {

        System.out.println("Zapolnenie sleva napravo po diagonali by 1");

//        if (size != graphWithDiagon.length)
//            System.out.println("Nevozmozno zapolnit dannuyu matritsy");
  //      else {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    graphWithDiagon[i][j] = 0;
                    if (i == j) {
                        graphWithDiagon[i][j] = 1;
                    }
                    logger.info(graphWithDiagon[i][j]);
                }
                System.out.println();
            }
       // }
    }


    public static void fillWithOneByDiagonSpravaNalevo(int size, int[][] graphWithDiagon) {
        System.out.println("Zapolnenie spava nalevo  po diagonali by 1");
    //    if (size != graphWithDiagon.length)
     //       System.out.println("Nevozmozno zapolnit dannuyu matritsy");
   //     else {
            for (int i = 0; i < size; i++) {
                int j = (size - 1) - i;
                graphWithDiagon[i][j] = 1;
            }
            displayMatrix(size, graphWithDiagon);
      //  }
    }


    public static void displayMatrix(int size, int[][] graph ) {
//        if (size != graph.length)
//            System.out.println("Nevozmozno otobrazit dannuyu matritsy");
//        else {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    logger.info(graph[i][j]);
                }
                System.out.println();
            }
       // }
    }


    public static void sendToFile(int size, int [][]graph){

//        UUID id = UUID.randomUUID();
//        String filename = id.toString().replaceAll("-","") + ".txt";
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy - hh:mm:ss");
        String filename = "Matrix_"+ format.format(date)+".txt";
        File myFile = new File("/Users/tatyanavolkorezova/"+filename);
        if(myFile.exists())
            logger.info("File exists");
        else
            logger.info("File isn't exist");

        try(FileWriter writer = new FileWriter(myFile, false))
        {
            for (int i=0;i<size;i++){
                for (int j=0; j<size; j++){

                    writer.write(Integer.toString(graph[i][j]));
                    writer.flush();
                }
                writer.write("\r\n");
            }

        } catch(IOException ex){

            logger.error(ex.getMessage());
        }
    }



    }









