package com.company;

import java.util.List;

import static java.util.Arrays.asList;

public class CacheManagerBuilder {

    public void build() {
        List<CachRepository>  cachRepositories = fetchDataFromDb();

        DomainType.handle(cachRepositories);
    }

    private  List<CachRepository> fetchDataFromDb() {
        int third = 3;
        int fourth = 4;
        CachRepository cachRepository1 = new CachRepository(1, third, DomainType.DOMAIN, RepositoryAction.DELETE);
        CachRepository cachRepository2 = new CachRepository(1, fourth, DomainType.DOMAIN2, RepositoryAction.ADD);
        return asList(cachRepository1, cachRepository2);
    }

}
