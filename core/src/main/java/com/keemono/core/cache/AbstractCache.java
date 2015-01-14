package com.keemono.core.cache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

/**
 * Created by edu on 12/01/2015.
 */
public class AbstractCache {

    private CacheManager manager;

    private void init(){
        manager = CacheManager.newInstance("src/config/ehcache.xml");
        manager.addCache("testCache");
        Cache cache = manager.getCache("testCache");

        Element element = new Element("key1", "value1");
        cache.put(element);
    }
}
