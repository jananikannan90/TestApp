package com.ea.framework.config;

import com.ea.framework.base.BrowserType;

import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static void populateSettings() throws IOException {
        ConfigReader reader = new ConfigReader();
        reader.readProperty();
    }

    private void readProperty() throws IOException {
        //Create Property Object
        Properties p = new Properties();
        //Load the Property file available in same package
        p.load(getClass().getResourceAsStream("GlobalConfig.properties"));
        //Get LogPath
        Settings.LogPath = p.getProperty("LogPath");
        //Get AUT
        Settings.BaseURL = p.getProperty("BaseURL");
        //Browser Type
        Settings.BrowserType = BrowserType.valueOf(p.getProperty("BrowserType"));
    }
}
