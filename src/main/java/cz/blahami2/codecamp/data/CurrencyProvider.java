package cz.blahami2.codecamp.data;

import cz.blahami2.codecamp.model.Currency;

import java.util.List;
import java.util.Optional;

/**
 * Created by blaha on 03.11.2016.
 */
public interface CurrencyProvider {

    List<Currency> getAll();

    Optional<Currency> findByName( String name );
}
