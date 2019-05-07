//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.iotplatform.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {
    private static Properties properties = null;

    public PropertyUtil() {
    }

    public static void init(InputStream  input) {
        properties = new Properties();

        try {
            properties.load(input);
        } catch (IOException var3) {
            System.out.println(var3.getMessage());
            properties = null;
        }
    }

    public static String getProperty(String key) {
        return properties == null ? null : properties.getProperty(key);
    }
}
