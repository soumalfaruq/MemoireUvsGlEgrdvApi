package com.grdv.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.grdv.api.model.Rdv;

@RepositoryRestResource
public interface RdvRepository extends JpaRepository<Rdv, Long> {

}
