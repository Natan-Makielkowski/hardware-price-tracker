package org.example.hardwarepricetracker.scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.Objects;

public class HtmlPriceScraper {
    public Double extractPrice(String htmlContent, String selector) {
        Document document = Jsoup.parse(htmlContent);
        Elements elements = document.select(selector);

        String priceString = Objects.requireNonNull(elements.first()).text();
        priceString = priceString.replaceAll("[^0-9,.]", "").replace(",", ".");
        return Double.parseDouble(priceString);
    }

}
