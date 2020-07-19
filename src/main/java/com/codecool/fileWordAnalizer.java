package com.codecool;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class fileWordAnalizer {

    FilePartReader filePartReader;

    public void FileWordAnalyzer(FilePartReader filePartReader) {
        this.filePartReader = filePartReader;
    }

    private List<String> split() throws IOException {
        String originalText = filePartReader.readLines().replaceAll("[.]*[,]*\\n*", "");
        return Arrays.asList(originalText.split("\\W"));
    }


}
