/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.beans;

import com.text.interfaces.IVivienda;
import org.springframework.stereotype.Component;

/**
 *
 * @author Daniel Casado
 */

@Component
public class Chalet implements IVivienda{

    @Override
    public String show() {
        
        return "Chalet";
    }
}
