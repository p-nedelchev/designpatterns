package com.clouway.factory;

/**
 * @author Petar Nedelchev <peter.krasimirov@gmail.com>
 */
public interface Codec {
    String marchall(Object object);
    <T> T unmarchall(String message, Class<T> clazz);
}
