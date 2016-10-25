package com.clouway.factory;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class JsonReflectFactory implements CodecFactory{
    public Codec create() {
        Codec codec = null;
        try {
            codec = (Codec) JsonFactory.class.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return codec;
    }
}
