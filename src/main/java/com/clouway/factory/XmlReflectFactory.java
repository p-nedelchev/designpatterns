package com.clouway.factory;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public class XmlReflectFactory implements CodecFactory {
    public Codec create() {
        Codec codec = null;
        try {
           codec = (Codec) XmlFactory.class.newInstance();
        } catch (InstantiationException|IllegalAccessException e) {
            e.printStackTrace();
        }
        return codec;
    }
}
