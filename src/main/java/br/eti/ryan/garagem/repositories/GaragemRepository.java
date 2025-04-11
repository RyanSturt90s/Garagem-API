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
public interface GaragemRepository extends JpaRepository<Veiculo, Long> {

    public Veiculo findById(long id);
    public List<Veiculo> findByCorIgnoreCase(String cor);
    public List<Veiculo> findByAno(String ano);
    
}
