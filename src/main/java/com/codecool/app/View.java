package com.codecool.app;

public interface View {
    public void println(String text);
    public String getInput();
    public void printError(String err);
}