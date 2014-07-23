/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masterpay.moxy.test;

import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.persistence.oxm.annotations.XmlPath;

/**
 *
 * @author sihaya
 */
@XmlRootElement(name = "mus_configset_request")
@XmlAccessorType(XmlAccessType.FIELD)
public class Configset {

    @XmlPath("mus")
    public Set<Mus> musen;
}
