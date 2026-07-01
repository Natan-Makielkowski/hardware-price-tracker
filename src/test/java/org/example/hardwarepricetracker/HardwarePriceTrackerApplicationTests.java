package org.example.hardwarepricetracker;

import org.example.hardwarepricetracker.scraper.HtmlPriceScraperTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class HardwarePriceTrackerApplicationTests {

    @Test
    void contextLoads() throws IOException {
        HtmlPriceScraperTest scraperTest = new HtmlPriceScraperTest();
        scraperTest.shouldExtractPriceFromXkomHtml();
    }

}
