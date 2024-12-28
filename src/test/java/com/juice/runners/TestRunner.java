package com.juice.runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.juice.steps",
        plugin = {"pretty",
                "summary",
                "html:target/reports/cucumber-reports/html-report.html",
                "json:target/reports/cucumber-reports/cucumber.json",
                "junit:target/reports/cucumber-reports/cucumber.xml",
                "timeline:target/reports/cucumber-timeline",
                "rerun:target/failedrerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        tags = "@Login",
        monochrome = false,
        dryRun = false  ,
        publish = true
)

public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}