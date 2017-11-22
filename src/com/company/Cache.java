package com.company;

import java.util.List;

public interface Cache<T> {
    void put(Object id, T value);

    <T> T get(int first);

    void remove(Object domainId);
}
