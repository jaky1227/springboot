package com.zlf.springboot.learning.chap8;

import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RawBean {
    public String name;

    @JsonRawValue
    public String json;
}
