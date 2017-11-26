package com.company;

public class CacheManager {
    public CacheManagerBuilder cacheManagerBuilder;
    private int lastUpdatedId;
    
    public CacheManager(CacheManagerBuilder cacheManagerBuilder) {
        this.cacheManagerBuilder = cacheManagerBuilder;
    }
    
    public void init() {
       lastUpdatedId = this.cacheManagerBuilder.init();
    }
    
     public void update() {
       lastUpdatedId = this.cacheManagerBuilder.update(lastUpdatedId);
    }
}
