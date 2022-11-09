package br.com.danielduhau.apivisitante.repository;

import br.com.danielduhau.apivisitante.model.Visitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepository extends JpaRepository<Visitante, String> {
}
