package com.cibertec.impl;

import com.cibertec.service.ICRUD;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collections;
import java.util.List;

public abstract class ICRUDImpl<T, ID> implements ICRUD<T, ID> {

    public  abstract JpaRepository<T, ID> getRepository();

    @Override
    public T register(T bean) throws Exception {
        return getRepository().save(bean);
    }

    @Override
    public List<T> list() throws Exception {
        List<T> received = getRepository().findAll();
        Collections.reverse(received);
        return received;
    }
}
