package art.cookedincode.reactivemongo.services;

import art.cookedincode.reactivemongo.model.BeerDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by Georgi Ivanov
 */
public interface BeerService {
    Mono<BeerDTO> findFirstByBeerName(String beerName);

    Flux<BeerDTO> findByBeerStyle(String beerStyle);

    Flux<BeerDTO> listBeers();

    Mono<BeerDTO> saveBeer(Mono<BeerDTO> beerDTO);

    Mono<BeerDTO> saveBeer(BeerDTO beerDTO);

    Mono<BeerDTO> getBeerById(String beerId);

    Mono<BeerDTO> updateBeer(String beerId, BeerDTO beerDTO);

    Mono<BeerDTO> patchBeer(String beerId, BeerDTO beerDTO);

    Mono<Void> deleteBeerById(String beerId);
}
