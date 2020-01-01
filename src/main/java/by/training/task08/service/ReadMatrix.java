package by.training.task08.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadMatrix {

    public int[][] readMatrix() {

        File file = new File("D:\\study\\task08\\matrix.txt");
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<String> list = new ArrayList();

        try {
            while (br.ready()) {

                list.add(br.readLine());
            }
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }

        int height = list.get(0).split(" ").length;
        int width = list.size();

        int[][] matrix = new int[width][height];


        for (int i = 0; i < width; i++) {

            for (int j = 0; j < height; j++) {
                String[] strings = list.get(i).split(" ");
                matrix[i][j] = Integer.parseInt(strings[j]);
            }

        }
        return matrix;
    }
}
