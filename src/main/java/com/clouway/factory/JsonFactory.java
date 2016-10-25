package com.clouway.factory;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class JsonFactory implements CodecFactory {
    public Codec create() {
        return new JsonCodec();
    }
}
