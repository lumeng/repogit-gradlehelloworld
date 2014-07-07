package net.meng6.gradlehelloworld;

import com.google.common.base.Strings;

/**
 * A toy project to experiment Gradle usage in IntelliJ IDEA.
 * Author: Meng LuX <lumeng.dev@gmail.com>
 * Date: 7/3/14 9:44 AM
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(repeat("Hello World!\n", 3));
        System.out.println("My name is "
                + System.getProperty("net.meng6.gradlehelloworld.name") + ".");
    }

    static String repeat(String str, int count) {

        return Strings.repeat(str, count);
    }
}
