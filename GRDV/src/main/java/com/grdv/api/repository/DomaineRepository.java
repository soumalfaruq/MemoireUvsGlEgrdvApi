package com.grdv.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.grdv.api.model.Domaine;

@RepositoryRestResource
public interface DomaineRepository extends JpaRepository<Domaine, Long> {

}
