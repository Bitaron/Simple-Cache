package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int first = 1;
        int second = 2;

        Domain domain1 = new Domain(first);
        Domain domain2 = new Domain(second);

        CacheManager.domainCacheObject.put(domain1.getId(), domain1);
        CacheManager.domainCacheObject.put(domain1.getId(), domain2);

        System.out.println(CacheManager.domainCacheObject.get(first).getId());
        System.out.println(CacheManager.domainCacheObject.get(second).getId());
    }
}
