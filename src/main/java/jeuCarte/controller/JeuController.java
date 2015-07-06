/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuCarte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author damien
 */
@RequestMapping("/jeu")
@Controller
public class JeuController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return "toto";
    }
}
