/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.ryan.garagem.controllers;

import br.eti.ryan.garagem.entities.Veiculo;
import br.eti.ryan.garagem.service.GaragemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sesidevb
 */

@RestController
public class GaragemController {
    
    @Autowired
    private GaragemService veiculoService;
    
    /**
     * Endpoint /garagem/veiculo
     * Retorna TODOS os veiculos da base de dados.
     * @return
     */
    
    @GetMapping("/forsale")
    public List<Veiculo> findAll() {
        List<Veiculo> result = veiculoService.findAll();
        return result;
    }    
    
    @GetMapping("/forsale/{id}")
    public Veiculo findById(@PathVariable long id) {
        Veiculo result = veiculoService.findById(id);
        return result;
    }
    
    @GetMapping("/color/{cor}")
    public ResponseEntity<List<Veiculo>> findByColor(@PathVariable String cor) {
        List<Veiculo> result = veiculoService.findByCor(cor);
        
        if(result.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }
    
    }
    
    @GetMapping("/year/{ano}")
    public ResponseEntity<List<Veiculo>> findByAno(@PathVariable String ano) {
        List<Veiculo> result = veiculoService.findByAno(ano);
        if(result.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }
    }
}
