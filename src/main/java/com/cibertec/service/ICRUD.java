package com.cibertec.service;

import java.util.Date;
import java.util.List;

public interface ICRUD<T, ID> {
    T register(T bean) throws  Exception;
    List<T> list() throws Exception;
}
