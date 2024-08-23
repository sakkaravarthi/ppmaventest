package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@ToString
@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
public class Cat {
    private String name;
    private int age;


}
