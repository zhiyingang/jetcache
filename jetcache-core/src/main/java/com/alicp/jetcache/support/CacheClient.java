/**
 * Created on  13-09-04 14:03
 */
package com.alicp.jetcache.support;

import com.alicp.jetcache.anno.impl.CacheImplSupport;

/**
 * @author <a href="mailto:yeli.hl@taobao.com">huangli</a>
 */
public class CacheClient {

    private GlobalCacheConfig globalCacheConfig;

    public <T> T getProxy(T target, CacheConfig cacheConfig) {
        return CacheImplSupport.getProxy(target, cacheConfig, globalCacheConfig);
    }

    public <T> T getProxyByAnnotation(T target) {
        return CacheImplSupport.getProxyByAnnotation(target, globalCacheConfig);
    }

    public void setGlobalCacheConfig(GlobalCacheConfig globalCacheConfig) {
        this.globalCacheConfig = globalCacheConfig;
    }

    public GlobalCacheConfig getGlobalCacheConfig() {
        return globalCacheConfig;
    }
}
