package by.training.task08.controller;

import by.training.task08.view.PrintMatrix;
import by.training.task08.view.PrintMatrixImpl;
import by.training.task08.service.ReadMatrix;

public class Runner {

    public static void main(String[] args) {

        PrintMatrix pm = new PrintMatrixImpl();
        pm.printMatrix(new ReadMatrix().readMatrix());
    }
}
