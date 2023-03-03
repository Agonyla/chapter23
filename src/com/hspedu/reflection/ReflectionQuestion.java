package com.hspedu.reflection;

import com.hspedu.Cat;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author Agony
 * @Create 2023/3/3 15:08
 * @Version 1.0
 */
public class ReflectionQuestion {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.getProperty("classfullpath");
        String methodName = properties.getProperty("method");

        System.out.println(classfullpath);
        System.out.println(methodName);

        // 反射

        Class<?> aClass = Class.forName(classfullpath);
        Class<?> aClass2 = Class.forName(classfullpath);
        Object o = aClass.newInstance();
        Cat o2 = (Cat) aClass.newInstance();
        System.out.println(o.getClass());

        Method method = aClass.getMethod(methodName);

        method.invoke(o);

        Cat cat = new Cat();
        System.out.println(cat);
        System.out.println(o.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(aClass.getPackage());
        System.out.println(aClass.getPackage().getName());

        System.out.println(aClass.hashCode());
        System.out.println(aClass2.hashCode());


        //
        System.out.println("=================================");

        Class<Cat> catClass = Cat.class;

        Constructor<Cat> constructor = catClass.getConstructor();

        Cat cat1 = constructor.newInstance();

        Constructor<Cat> constructor1 = catClass.getConstructor(String.class, int.class);

        Cat cat2 = constructor1.newInstance("1", 1);
        System.out.println(cat2);
    }
}
