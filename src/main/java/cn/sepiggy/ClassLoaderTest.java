package cn.sepiggy;

import org.junit.Test;

public class ClassLoaderTest {

    @Test
    public void testBootClassPath() {
        String bootClassPath = System.getProperty("sun.boot.class.path");
        String[] strings = bootClassPath.split(";");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void testExtDirs() {
        String extDirs = System.getProperty("java.ext.dirs");
        String[] strings = extDirs.split(";");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void testClassPath() {
        String classPath = System.getProperty("java.class.path");
        String[] strings = classPath.split(";");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void loadOrder() {
        ClassLoader classLoader = HelloWorld.class.getClassLoader();
        System.out.println("ClassLoader is:" + classLoader.toString());
        System.out.println("ClassLoader\'s parent is:" + classLoader.getParent().toString());
        System.out.println("ClassLoader\'s grand father is:" + classLoader.getParent().getParent().toString());

        classLoader = int.class.getClassLoader();
        System.out.println("ClassLoader is:" + classLoader.toString());
    }


}
