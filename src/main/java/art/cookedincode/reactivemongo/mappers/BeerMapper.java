package art.cookedincode.reactivemongo.mappers;

import art.cookedincode.reactivemongo.domain.Beer;
import art.cookedincode.reactivemongo.model.BeerDTO;
import org.mapstruct.Mapper;

/**
 * Created by Georgi Ivanov
 */
@Mapper
public interface BeerMapper {

    BeerDTO beerToBeerDTO(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);
}
