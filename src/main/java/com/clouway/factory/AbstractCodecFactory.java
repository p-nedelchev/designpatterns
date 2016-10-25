package com.clouway.factory;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class AbstractCodecFactory {
    public static Codec create(CodecFactory factory) {
        return factory.create();
    }
}
