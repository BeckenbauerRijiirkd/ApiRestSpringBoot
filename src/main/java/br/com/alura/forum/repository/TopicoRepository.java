package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;


import br.com.alura.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

    Page<Topico> findByCursoNome(String nomeCurso, org.springframework.data.domain.Pageable paginacao);
    
}
