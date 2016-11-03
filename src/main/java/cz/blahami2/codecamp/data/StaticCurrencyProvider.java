package cz.blahami2.codecamp.data;

import cz.blahami2.codecamp.model.Currency;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by blaha on 03.11.2016.
 */
@Component
public class StaticCurrencyProvider implements CurrencyProvider {

    private final static List<Currency> currencies = Arrays.asList(
            new Currency( "CZK", 1 / 27.021 )
            , new Currency( "EUR", 1 )
            , new Currency( "USD", 1 / 1.1116 )
    );

    @Override
    public List<Currency> getAll() {
        return new ArrayList<>( currencies );
    }

    @Override
    public Optional<Currency> findByName( String name ) {
        return currencies.stream().filter( c -> c.getName().equals( name ) ).findAny();
    }
}
