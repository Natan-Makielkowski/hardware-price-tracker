package org.example.hardwarepricetracker.service;

import org.example.hardwarepricetracker.dto.PriceSnapshotResponseDto;
import org.example.hardwarepricetracker.model.PriceSnapshot;
import org.example.hardwarepricetracker.repository.PriceSnapshotRepository;
import org.example.hardwarepricetracker.repository.ProductOfferRepository;
import org.example.hardwarepricetracker.scraper.HtmlPriceScraper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class PriceTrackerService {
    private final ProductOfferRepository productOfferRepository;
    private final PriceSnapshotRepository priceSnapshotRepository;
    private final HtmlPriceScraper htmlPriceScraper;

    public PriceTrackerService(ProductOfferRepository productOfferRepository, PriceSnapshotRepository priceSnapshotRepository,  HtmlPriceScraper htmlPriceScraper) {
        this.productOfferRepository = productOfferRepository;
        this.priceSnapshotRepository = priceSnapshotRepository;
        this.htmlPriceScraper = htmlPriceScraper;
    }

    public List<PriceSnapshotResponseDto> UpdatePrices(){
        final ArrayList<PriceSnapshotResponseDto> priceSnapshotResponseDtos = new ArrayList<>();

        productOfferRepository.findAll().forEach((productOffer) -> {
            PriceSnapshot priceSnapshot = new PriceSnapshot(htmlPriceScraper.extractPrice(productOffer.getUrl(), productOffer.getPriceSelector()), LocalDateTime.now(), productOffer);
            priceSnapshotRepository.save(priceSnapshot);
            priceSnapshotResponseDtos.add(new PriceSnapshotResponseDto(priceSnapshot.getId(), priceSnapshot.getTheReadPrice(), priceSnapshot.getPriceDateTime(), productOffer));
        }
        );
        return priceSnapshotResponseDtos;
    }

}
