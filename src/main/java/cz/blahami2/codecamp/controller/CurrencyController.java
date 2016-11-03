package cz.blahami2.codecamp.controller;

import cz.blahami2.codecamp.data.CurrencyProvider;
import cz.blahami2.codecamp.model.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by blaha on 03.11.2016.
 */
@RestController
public class CurrencyController {

    @Autowired
    private CurrencyProvider currencyProvider;

    @RequestMapping( "/currency" )
    public List<Currency> getCurrencies() {
        return currencyProvider.getAll();
    }

    @RequestMapping( "currency/{name}" )
    public Currency getCurrencyByName( @PathVariable( "name" ) String name ) {
        return currencyProvider.findByName( name ).orElse( new Currency( "UNKNOWN", 0 ) );
    }

}
