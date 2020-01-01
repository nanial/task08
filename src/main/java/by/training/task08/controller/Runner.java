package by.training.task08.controller;

import by.training.task08.service.PrintMatrix;
import by.training.task08.service.PrintMatrixImpl;
import by.training.task08.service.ReadMatrix;

public class Runner {
    public static void main(String[] args) {
        PrintMatrix pm = new PrintMatrixImpl();
        pm.printMatrix(new ReadMatrix().readMatrix());
    }
}
