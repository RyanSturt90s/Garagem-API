/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.eti.ryan.garagem.repositories;

import br.eti.ryan.garagem.entities.Veiculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sesidevb
 */
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    public List<Veiculo> findAll();
    
}
