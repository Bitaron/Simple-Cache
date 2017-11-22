package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum DomainType {
    DOMAIN(new DomainTypeHandler<>(CacheManager.domainCacheObject)),
    DOMAIN2(new DomainTypeHandler<>(CacheManager.domain2BaseCacheObject))
    ;

    private DomainTypeHandler domainTypeHandler;

     DomainType(DomainTypeHandler domainTypeHandler) {
        this.domainTypeHandler = domainTypeHandler;
    }


    public static void handle(List<CachRepository> cachRepositories) {
        for(CachRepository cachRepository : cachRepositories) {
            cachRepository.getDomainType().domainTypeHandler.prepare(cachRepository.getDomainId(), cachRepository.getRepositoryAction());
        }

        for(DomainType domainType : DomainType.values()) {
            domainType.domainTypeHandler.build();
        }
    }

    private static class DomainTypeHandler<T> {
        private BaseCacheObject<T> cacheObject;
        private Map<Object, T> updatddomainObject;
        private List<Object> idsToFetch;

        public DomainTypeHandler(BaseCacheObject<T> cacheObject) {
            this.cacheObject = cacheObject;
            this.updatddomainObject = Collections.EMPTY_MAP;
            this.idsToFetch = Collections.EMPTY_LIST;
        }


        public void prepare(Object domainId, RepositoryAction repositoryAction) {
            switch (repositoryAction) {
                case DELETE:
                    this.cacheObject.remove(domainId);
                    break;
                case ADD:
                    this.idsToFetch.add(domainId);
                    break;
            }
        }


        public void build() {
            updatddomainObject = fetchFromDb(idsToFetch);
            for(Map.Entry<Object, T> entry : updatddomainObject.entrySet()) {
                cacheObject.put(entry.getKey(), entry.getValue());
            }
        }

        private  HashMap<Object, T> fetchFromDb(List<Object> idsToFetch) {
            List<T> 
            return null;
        }

    }
}
