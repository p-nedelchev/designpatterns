package com.clouway.factory;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class XmlFactory implements CodecFactory {
    public Codec create() {
        return new XmlCodec();
    }
}
