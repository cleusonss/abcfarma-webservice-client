package br.inf.cs.data.dao;

import java.util.List;

public interface GenericDao<T> {

    public void create(T t);

    public T findByCod(Integer cod);

    public void delete(Integer cod);

    public void update(T t);

    public List<T> findAll();
}
