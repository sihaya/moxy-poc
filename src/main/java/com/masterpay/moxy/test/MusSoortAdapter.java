/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.masterpay.moxy.test;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 *
 * @author sihaya
 */
public class MusSoortAdapter extends XmlAdapter<Integer, MusSoort> {

    @Override
    public MusSoort unmarshal(Integer v) throws Exception {
        return new MusSoort(v);
    }

    @Override
    public Integer marshal(MusSoort v) throws Exception {
        return v.mussoortId;
    }
    
}
