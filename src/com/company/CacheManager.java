package com.company;

public class CacheManager {
    public static BaseCacheObject<Domain> domainCacheObject;
    public static BaseCacheObject<Domain2> domain2BaseCacheObject;

    static {
        init();
    }

    private static void init() {
        domainCacheObject = new BaseCacheObject<>();
        domain2BaseCacheObject = new BaseCacheObject<>();
        new CacheManagerBuilder().build();
    }
}
