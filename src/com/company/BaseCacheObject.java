package com.company;

import java.util.HashMap;
import java.util.Map;

public class BaseCacheObject<T> implements Cache<T> {
    private Map<Object, T> domainCachObjectMap = new HashMap<>();

    @Override
    public void put(Object key, T value) {
        domainCachObjectMap.put(key, value);
    }


    @Override
    public void remove(Object domainId) {
        if (domainCachObjectMap.containsKey(domainId)) {
            domainCachObjectMap.remove(domainId);
        }
    }

    @Override
    public T get(int first) {
        return domainCachObjectMap.get(first);
    }
}
