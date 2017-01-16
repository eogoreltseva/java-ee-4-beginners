package com.acme.etl.extractor;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by vm.andreev on 16.01.17.
 */
public class BatchedBufferReader {
    private int batchSize;
    private BufferedReader bufferedReader;

    public BatchedBufferReader(int batchSize, BufferedReader bufferedReader) {
        this.batchSize = batchSize;
        this.bufferedReader = bufferedReader;
    }

    public String[] read() throws IOException {
        String[] lines = new String[batchSize];
        for (int counter = 0; counter < batchSize; counter++) {
            String line = bufferedReader.readLine();
            if (line != null) {
                lines[counter] = line;
            }
        }
        return lines;
    }

    public void close() throws IOException {
        this.bufferedReader.close();
    }
}
