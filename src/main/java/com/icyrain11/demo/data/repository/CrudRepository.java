package com.icyrain11.demo.data.repository;

import org.springframework.data.repository.Repository;

import java.util.Optional;

/**
 * @author icyrain11
 * @version 1.8
 */
public interface CrudRepository<T, ID> extends Repository<T, ID> {
    <S extends T> S save(S entity);

    Optional<T> findById(ID primaryKey);

    Iterable<T> findAll();

    long count();

    void delete(T entity);

    boolean existsById(ID primaryKey);
}
