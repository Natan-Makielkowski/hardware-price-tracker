package org.example.hardwarepricetracker.scraper;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

//parts__ScreenReaderPrice-sc-fd70cef5-6 dCVjrv
public class HtmlPriceScraperTest {
    @Test
    public void shouldExtractPriceFromXkomHtml() throws IOException {
        File input = new File("src/test/resources/x-kom-gpu.html");
        Document document = Jsoup.parse(input, "UTF-8");
        String htmlContent = document.html();

        String selector = ".parts__ScreenReaderPrice-sc-fd70cef5-6.dCVjrv";
        HtmlPriceScraper scraper = new HtmlPriceScraper();
        Double extractedPrice = scraper.extractPrice(htmlContent, selector);

        assertEquals(5999.00, extractedPrice, 0.01);
    }
}
