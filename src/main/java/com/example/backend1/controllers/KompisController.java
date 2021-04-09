package com.example.backend1.controllers;


import com.example.backend1.model.*;
import com.example.backend1.repos.DAO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KompisController {

    DAO db = new DAO();
    List<Kompis> kompisar = db.getAllKompis();

    @RequestMapping( "/kompisar")
    public List<Kompis> kompisar(){
        return kompisar;
    }

    @PostMapping("/kompis/uprest")
    public Message uprestKompis(@RequestBody Kompis k){
        Kompis tempK = null;
        if(tempK == null){
            kompisar.add(k);
            return new Message(true, String.format("%s tillagd.", k.getName()));
        } else {
            kompisar.set(kompisar.indexOf(tempK), k);
            return new Message(true, String.format("%s utbytt till %s", tempK.getName(), k.getName()));
        }
    }
}
