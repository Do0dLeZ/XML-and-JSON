package task3.parser;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.MalformedURLException;
import java.net.URL;

public class FinanceParser implements IXMLParser {
    @Override
    public Object fromXML(String urlRequest, Class c) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(c);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return unmarshaller.unmarshal(new URL(urlRequest));
        } catch (JAXBException | MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
