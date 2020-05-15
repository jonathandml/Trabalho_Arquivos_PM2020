package model.dao;

public interface DAO<T> {
    
    public void add(T obj);

    public T get(String id);

    public void update(T obj);

    public void remove(T obj);
}
