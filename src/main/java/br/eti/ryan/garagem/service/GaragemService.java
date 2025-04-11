/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.ryan.garagem.service;

import br.eti.ryan.garagem.entities.Veiculo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.eti.ryan.garagem.repositories.GaragemRepository;

/**
 *
 * @author sesidevb
 */

@Service
public class GaragemService {

    @Autowired
    private GaragemRepository veiculoRepository;
    
    public List<Veiculo> findAll() {
        List<Veiculo> result = veiculoRepository.findAll();
        return result;
    }
    
    public Veiculo findById(long id) {
        
        Veiculo result = veiculoRepository.findById(id);
        return result;
    
    }
    
    public List<Veiculo> findByCor(String cor) {
        
        List<Veiculo> result = veiculoRepository.findByCorIgnoreCase(cor);
        return result;
    
    }
    
    public List<Veiculo> findByAno(String ano) {
        
        List<Veiculo> result = veiculoRepository.findByAno(ano);
        return result;
        
    }
    
}
