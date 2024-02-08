package org.example.features.search;

import app.getxray.xray.junit.customjunitxml.annotations.XrayTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import org.example.steps.serenity.EndUserSteps;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps anna;

    @Test
//    @XrayTest(key = "XRTMP-35")
//    @Requirement("XPTO-2847")
    public void searching_by_keyword_apple_should_display_the_corresponding_article() {
        anna.is_the_home_page();
        anna.looks_for("apple");
        anna.should_see_definition("w4rg34g34g");

    }

    @Test
    public void searching_by_keyword_banana_should_display_the_corresponding_article() {
        anna.is_the_home_page();
        anna.looks_for("pear");
        anna.should_see_definition("An edible fruit produced by the pear tree, similar to an apple but typically elongated towards the stem.");
    }

    @Test
    public void searching_by_ambiguious_keyword_should_display_the_disambiguation_page_NEW() {
        anna.is_the_home_page();
        anna.looks_for("pineapple");
    }

    @Test
//    @XrayTest(key = "XRTMP-15")
    public void verify_IF_OfferIsRetractedWhenBuyerHasNoSufficientFunds() {
        anna.is_the_home_page();
        anna.looks_for("pineapple");
    }
} 