package com.automatedtest.vodacom;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/automatedtest/vodacom/Assessment.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
        "html:target/home-page-html"},
        glue = {"com.automatedtest.oldmutual.infrastructure.driver",
                "com.automatedtest.oldmutual.commonSteps"})
public class TestRunner {
}
