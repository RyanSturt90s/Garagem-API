/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.ryan.garagem.service;

import br.eti.ryan.garagem.entities.Veiculo;
import br.eti.ryan.garagem.repositories.VeiculoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sesidevb
 */

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;
    
    public List<Veiculo> findAll() {
        
        List<Veiculo> result = veiculoRepository.findAll();
        return result;
        
    }
    
}
