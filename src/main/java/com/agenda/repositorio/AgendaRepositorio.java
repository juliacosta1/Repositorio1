package com.agenda.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.AgendaC;

public interface AgendaRepositorio extends JpaRepository<AgendaC, Integer>{

}
