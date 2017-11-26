package com.company;


public interface CacheManagerBuilder {
    int init();
    int update(int lastUpdateId);
}
