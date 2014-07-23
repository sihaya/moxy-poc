/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masterpay.moxy.test;

import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import org.eclipse.persistence.jaxb.JAXBContext;

/**
 *
 * @author sihaya
 */
public class MusMain {

    public Configset read() throws JAXBException {
        // XML Input
        File xmlInput = new File("src/main/resources/mus.xml");

        // Process the XML
        JAXBContext context = (JAXBContext) JAXBContext.newInstance(Configset.class, Mus.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Configset configset = (Configset) unmarshaller.unmarshal(xmlInput);

        return configset;
    }

    public void write(Configset configset) throws PropertyException, JAXBException {
        JAXBContext jc = (JAXBContext) JAXBContext.newInstance(Configset.class, Mus.class);
        Marshaller m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(configset, System.out);
    }

}
