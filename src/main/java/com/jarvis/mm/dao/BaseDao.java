package com.jarvis.mm.dao;

import java.util.List;

/**
 * Created by jafar.rizvi on 10/09/16.
 */
public interface BaseDao<T> {
    T persist(T entity);
    boolean delete(Object id);
    T findById(Long id);
    List<T> list(int pageNum, int pageSize);
    T update(T entity);
    T findById(String id);
}
