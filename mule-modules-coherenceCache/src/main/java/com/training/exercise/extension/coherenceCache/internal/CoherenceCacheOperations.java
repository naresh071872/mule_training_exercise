package com.training.exercise.extension.coherenceCache.internal;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;
import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;
/**
 * This class is a container for operations, every public method in this class will be taken as an extension operation.
 */
public class CoherenceCacheOperations {
	

  /**
   * Example of an operation that uses the configuration and a connection instance to perform some action.
   */
  @MediaType(value = ANY, strict = false)
  public String retrieveInfo(@Config CoherenceCacheConfiguration configuration, @Connection CoherenceCacheConnection connection){
    return "Using Configuration [" + configuration.getConfigId() + "] with Connection id [" + connection.getId() + "]";
  }

  /**
   * Cache Object to put key and value using specific cache.
   */
  @MediaType(value = ANY, strict = false)
  public void put(String cacheName, String key,String value) {
	
 
      CacheFactory.ensureCluster();
      NamedCache cache = CacheFactory.getCache(cacheName);
 
      cache.put(key, value);
      System.out.println((String)cache.get(key));
  }

  /**
   * Cache Object to put key and value using specific cache.
   */
  @MediaType(value = ANY, strict = false)
  public String get(String cacheName, String key) {
	
 
      CacheFactory.ensureCluster();
      NamedCache cache = CacheFactory.getCache(cacheName);
 
      return (String)cache.get(key);
  }
 
}
