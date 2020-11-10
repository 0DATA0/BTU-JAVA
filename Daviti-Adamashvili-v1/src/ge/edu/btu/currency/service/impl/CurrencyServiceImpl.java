package ge.edu.btu.currency.service.impl;

import ge.edu.btu.currency.service.CurrencyService;
import org.apache.log4j.Logger;

public class CurrencyServiceImpl implements CurrencyService {

    final static Logger logger=Logger.getLogger(CurrencyServiceImpl.class);

    private double exchangeRate = 1.0;

    @Override
    public double convert(int amount) {
        double value = amount/exchangeRate;

        logger.info("successfully converted " + amount + " to " + value);

        return value;
    }

    @Override
    public double convert(double amount) {
        double value = amount/exchangeRate;

        logger.info("successfully converted " + amount + " to " + value);

        return value;
    }

    @Override
    public void setExchangeRate(double value) {
        if (value > 0) {
            exchangeRate = value;
            logger.info("Exchange rate was successfully changed to: " + value);
            return;
        }
        logger.error("Exchange rate can not be equal or less then 0!");
    }
}
