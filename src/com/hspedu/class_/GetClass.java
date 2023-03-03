package com.hspedu.class_;

import com.hspedu.Cat;

/**
 * @Author Agony
 * @Create 2023/3/3 19:49
 * @Version 1.0
 * 演示得到Class对象的各种方式
 */
public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {

        // 1. Class.forName  多用于通过读取配置文件
        String classFullName = "com.hspedu.Cat";
        Class<?> aClass1 = Class.forName(classFullName);

        System.out.println(aClass1.hashCode());

        // 2. 类.class  多用于参数传递
        Class<Cat> aClass2 = Cat.class;
        System.out.println(aClass2.hashCode());

        // 3. 通过 对象.getClass  已有对象实例
        Cat cat = new Cat();
        Class<? extends Cat> aClass3 = cat.getClass();
        System.out.println(aClass3.hashCode());

        // 4. 通过类加载器来获取类的Class对象
        // (1) 先得到类加载器
        ClassLoader classLoader = cat.getClass().getClassLoader();
        // (2) 通过类加载器得到Class对象
        Class<?> aClass4 = classLoader.loadClass(classFullName);
        System.out.println(aClass4.hashCode());

        // 5. 基本数据类型
        Class<Integer> integerClass = int.class;
        System.out.println(integerClass.hashCode());

        // 6.基本数据类型的包装类
        Class<Integer> type = Integer.TYPE;
        System.out.println(type.hashCode());

    }
}

