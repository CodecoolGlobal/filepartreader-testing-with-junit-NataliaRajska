package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FilePartReaderTest {

    FilePartReader filePartReader = new FilePartReader();

    @Test
    public void testReader() throws IOException {
        filePartReader.setUp("src/main/resources/text.txt",3, 6);
        
        assertEquals("Mrs. Dursley came into the living room carrying two\n" +
                "cups of tea. It was no good. He’d have to say\n" +
                "something to her. He cleared his throat nervously. “Er\n" +
                "— Petunia, dear — you haven’t heard from your sister\n" +
                "lately, have you?”\n" +
                "\n" +
                "As he had expected, Mrs. Dursley looked shocked and\n" +
                "angry. After all, they normally pretended she didn’t\n" +
                "have a sister.\n" +
                "\n" +
                "\"No,\" she said sharply. \"Why?\"\n" +
                "\n" +
                "\"Funny stuff on the news,” Mr. Dursley mumbled.\n" +
                "\"Owls, shooting starsand there were a lot of\n" +
                "funny-looking people in town today\"\n" +
                "\n" +
                "\"So?\" snapped Mrs. Dursley.", filePartReader.read());
    }

}
