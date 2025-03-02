package az.bank;

public class CurrencyConverter {
    public double convert(double amount, String fromCurrency, String toCurrency)
            throws UnsupportedCurrencyException {
        if (!isSupportedCurrency(fromCurrency) || !isSupportedCurrency(toCurrency)) {
            throw new UnsupportedCurrencyException("This currency is not supported");
        }

        double conversionRate = getConversionRate(fromCurrency, toCurrency);
        return amount * conversionRate;
    }

    private boolean isSupportedCurrency(String currency) {
        return currency.equals("USD") || currency.equals("EUR") || currency.equals("AZN");
    }

    private double getConversionRate(String fromCurrency, String toCurrency) {
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) return 0.85;
        if (fromCurrency.equals("USD") && toCurrency.equals("AZN")) return 1.70;
        if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) return 1.18;
        if (fromCurrency.equals("EUR") && toCurrency.equals("AZN")) return 2.00;
        if (fromCurrency.equals("AZN") && toCurrency.equals("USD")) return 0.59;
        if (fromCurrency.equals("AZN") && toCurrency.equals("EUR")) return 0.50;
        return 1.0;
    }
}

