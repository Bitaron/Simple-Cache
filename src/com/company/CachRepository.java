package com.company;

public class CachRepository {
    private int id;
    private DomainType domainType;
    private Object domainId;
    private RepositoryAction repositoryAction;

    public int getId() {
        return id;
    }

    public DomainType getDomainType() {
        return domainType;
    }

    public Object getDomainId() {
        return domainId;
    }

    public RepositoryAction getRepositoryAction() {
        return repositoryAction;
    }

    public CachRepository(int id, int domainId, DomainType domainType, RepositoryAction repositoryAction) {
        this.id = id;
        this.domainType = domainType;
        this.domainId = domainId;
        this.repositoryAction = repositoryAction;
    }
}
