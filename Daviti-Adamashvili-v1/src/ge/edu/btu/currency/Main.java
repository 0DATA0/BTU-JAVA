package ge.edu.btu.currency;

import ge.edu.btu.currency.service.CurrencyService;
import ge.edu.btu.currency.service.impl.CurrencyServiceImpl;
import org.apache.log4j.Logger;

public class Main {
    final static Logger logger=Logger.getLogger(Main.class);

    public static void main(String[] args) {
        CurrencyServiceImpl currencyService = new CurrencyServiceImpl();

        currencyService.setExchangeRate(3.75);
        currencyService.convert(50);
        currencyService.convert(85.9);
        currencyService.setExchangeRate(0);

    }
}
