package com.zlf.springboot.learning.Model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

public class ExtendableBean {
    public String name;
    private Map<String, String> properties;

    public ExtendableBean(String name){
        this.name = name;
    }

    @JsonAnyGetter
    public Map<String, String> getProperties() {
        return properties;
    }

    public void add(String key, String value){
        if(CollectionUtils.isEmpty(properties))
            properties = new HashMap<>();
        properties.put(key,value);

    }
}
