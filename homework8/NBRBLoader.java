package homework8;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader{

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        double rate = 0;
        try {
            String rateStr = content.substring(content.indexOf("Cur_OfficialRate") + 18, content.indexOf("}"));
            rate = Double.parseDouble(rateStr);
        } catch (NumberFormatException e) {
            System.out.println("Проблема поиска курса " + e.getMessage());
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Проблема поиска курса " + ex.getMessage());
        }
        return rate;
    }
}