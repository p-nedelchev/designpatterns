package com.clouway.adapter;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Petar Nedelchev <peter.krasimirov@gmail.com>.
 */
public class InputStreamAdapterConcrete implements InputStreamAdapter {
    private InputStream input;

    public InputStreamAdapterConcrete(InputStream input){
        this.input = input;
    }

    public int read(byte[] buf, int offset, int length) {
        int readBytes = -1;
        try {
            readBytes = input.read(buf, offset, length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readBytes;
    }
}
