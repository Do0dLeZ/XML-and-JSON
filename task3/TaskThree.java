package task3;

import task3.entity.Query;
import task3.parser.FinanceParser;
import task3.parser.IXMLParser;

public class TaskThree {
    private static final String URL_REQUEST = "https://query.yahooapis.com/v1/public/yql?format=xml&q=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20(%22USDEUR%22,%20%22USDUAH%22)&env=store://datatables.org/alltableswithkeys";

    public static void start(){
        IXMLParser parser = new FinanceParser();
        Query ratesFactory = (Query) parser.fromXML(URL_REQUEST, Query.class);
        System.out.println(ratesFactory.getRates().getRates());
    }
}
