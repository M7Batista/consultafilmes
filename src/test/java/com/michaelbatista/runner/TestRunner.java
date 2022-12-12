package com.michaelbatista.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    publish = true,
    snippets = SnippetType.CAMELCASE,
    features = "src/test/resources/features",
    glue = "com.michaelbatista.stepDefinitions",
    plugin = {"pretty" , "json:target/cucumber-reports/report.json", "html:target/cucumber-reports/report.html"}
)
public class TestRunner {
    
}
