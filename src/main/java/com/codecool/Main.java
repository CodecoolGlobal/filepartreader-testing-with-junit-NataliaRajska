package com.codecool;

public class Main {

    public static void main(String[] args) {
        FilePartReader filePartReader = new FilePartReader();
        filePartReader.setUp("/src/main/resources/text.txt", 1, 10);

    }
}
