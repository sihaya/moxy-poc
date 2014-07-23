/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.masterpay.moxy.test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.persistence.oxm.annotations.XmlPath;

/**
 *
 * @author sihaya
 */
public class Mus {
    @XmlPath("mus_id/uuid/text()")
    public String id;
    
    @XmlPath("mus_config_attr/mus_naam/text()")
    public String naam;
    
    @XmlPath("mus_config_attr/mus_soort_id/text()")
    @XmlJavaTypeAdapter(MusSoortAdapter.class)
    public MusSoort mussoort;
}
