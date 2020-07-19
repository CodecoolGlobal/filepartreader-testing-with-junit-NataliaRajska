package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileWordAnalyzerTest {

    FileWordAnalyzer fileWordAnalyzer = null;

    @BeforeEach
    void setUp() {
        FilePartReader filePartReader = new FilePartReader();
        filePartReader.setUp("src/main/resources/text.txt", 1, 1);
        fileWordAnalyzer = new FileWordAnalyzer(filePartReader);
    }

    @Test
    void fileWordAnalyzer() {
    }
}