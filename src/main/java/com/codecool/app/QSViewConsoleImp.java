package com.codecool.app;

public class QSViewConsoleImp extends ViewConsoleImp implements QSView{

    @Override
    public void printMenu(String[] options) {
        for (int i=0; i<options.length; i++){
            println(String.format("(%d) %s", i+1, options[i]));
        }
    }
}