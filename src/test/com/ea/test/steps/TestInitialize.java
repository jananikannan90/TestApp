package com.ea.test.steps;

import com.ea.framework.base.DriverContext;
import com.ea.framework.base.FrameworkInitialize;
import com.ea.framework.config.ConfigReader;
import com.ea.framework.config.Settings;
import com.ea.framework.utilities.LogUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import java.io.IOException;

public class TestInitialize extends FrameworkInitialize {

    @Before
    public void Initialize() throws IOException {

        //Initialize Config
        ConfigReader.populateSettings();

        //Initialize LogUtil
        Settings.logUtil = new LogUtil();
        Settings.logUtil.CreateLogFile();
        Settings.logUtil.Write("Framework Initialize");

        Settings.logUtil.Write("Test Cycle created");

        initializeBrowser(Settings.BrowserType);
        Settings.logUtil.Write("Browser Initialized");
        DriverContext.Browser.GoToUrl(Settings.BaseURL);
        Settings.logUtil.Write("Navigated to URL " + Settings.BaseURL);

    }

    @After
    public void close() {
        DriverContext.Driver.quit();
    }

}
