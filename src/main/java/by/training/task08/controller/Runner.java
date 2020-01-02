package by.training.task08.controller;

import by.training.task08.exception.MatrixException;
import by.training.task08.validator.MatrixValidator;
import by.training.task08.view.PrintMatrix;
import by.training.task08.view.PrintMatrixImpl;
import by.training.task08.service.ReadMatrix;

public class Runner {

    public static void main(String[] args) {

        PrintMatrix pm = new PrintMatrixImpl();
        pm.printMatrix(new ReadMatrix().readMatrix());
        try{
            new MatrixValidator().checkRange(new int[0][8], new int[8][10]);
        }catch (MatrixException me){
            me.getMessage();
        }
    }
}
