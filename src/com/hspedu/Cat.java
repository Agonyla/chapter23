package com.hspedu;

/**
 * @Author Agony
 * @Create 2023/3/3 15:06
 * @Version 1.0
 */
public class Cat {

    private String name = "招财猫";

    private int age = 10;

    public void hi() {
        System.out.println("hi ya ya ya ");
    }

    public Cat() {

    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
