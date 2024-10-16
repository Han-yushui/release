package com.example.demo.module;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class Person {
    String name;
    int age;
    int height;
    int weight;
    String birth;
    // 这是A分支的追加属性
    String amount;
}
