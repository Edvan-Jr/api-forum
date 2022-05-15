package com.eddev.apiforum.repositories;

import com.eddev.apiforum.models.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

//    List<Topico> findByCursoNome(String nomeCurso);

    List<Topico> findByCurso_Nome(String nomeCurso);

//    alternativa customizada:
//    @Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
//    List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);
}
