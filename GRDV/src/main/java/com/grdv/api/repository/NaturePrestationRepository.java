package com.grdv.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.grdv.api.model.NaturePrestation;

@RepositoryRestResource
public interface NaturePrestationRepository extends JpaRepository<NaturePrestation, Long>{

}
