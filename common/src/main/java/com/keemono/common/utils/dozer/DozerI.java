package com.keemono.common.utils.dozer;

import org.dozer.Mapper;

import java.util.List;

/**
 * Created by edu on 19/01/2015.
 */
public interface DozerI<T> {

    public  <M> M map (final Object sourceObject, final Class<M> destType);
    public <T, U> List<U> map(final Mapper mapper, final List<T> source, final Class<U> destType);
}
