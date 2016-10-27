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

    public int read(byte[] buf, int offset, int length) throws IOException {
        int readBytes = -1;
        readBytes = input.read(buf, offset, length);
        return readBytes;
    }
}
