/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.ryan.garagem.controllers;

import br.eti.ryan.garagem.entities.Veiculo;
import br.eti.ryan.garagem.service.VeiculoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sesidevb
 */

@RestController
public class VeiculoController {
    
    @Autowired
    private VeiculoService veiculoService;
    
    /**
     * Endpoint /garagem/veiculo
     * Retorna TODOS os veiculos da base de dados.
     * @return
     */
    
    @GetMapping("/veiculo")
    public List<Veiculo> findAll() {
        List<Veiculo> result = veiculoService.findAll();
        return result;
    }
}
