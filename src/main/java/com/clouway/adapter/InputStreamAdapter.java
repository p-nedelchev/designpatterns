package com.clouway.adapter;

import java.io.IOException;

/**
 * Created by Petar Nedelchev <peter.krasimirov@gmail.com>..
 */
public interface InputStreamAdapter {
    int read(byte[] buf, int offset, int length) throws IOException;
}
