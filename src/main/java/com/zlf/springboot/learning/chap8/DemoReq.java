package com.zlf.springboot.learning.chap8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemoReq {

    @NotBlank(message = "code can not be null")
    String code;

    @Length(max=10,message = "the length of name can not larger than 10")
    String name;
}
