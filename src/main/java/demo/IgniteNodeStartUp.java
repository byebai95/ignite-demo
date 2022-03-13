package demo;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.CacheConfiguration;

public class IgniteNodeStartUp {
    public static void main(String[] args) {
//        Ignition.start("example-ignite.xml");
        Ignite ignite = Ignition.start();
        CacheConfiguration<Integer, String> cfg = new CacheConfiguration<Integer, String>();
        cfg.setName("myCache");
        IgniteCache<Integer, String> cache = ignite.getOrCreateCache(cfg);
        cache.put(1, "hello");
        cache.put(2, "ignite");
        System.out.println(cache.get(1) + " " + cache.get(2));
    }
}
