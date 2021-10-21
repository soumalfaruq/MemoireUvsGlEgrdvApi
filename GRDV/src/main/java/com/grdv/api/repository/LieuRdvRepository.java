package com.grdv.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.grdv.api.model.LieuRdv;

@RepositoryRestResource
public interface LieuRdvRepository extends JpaRepository<LieuRdv, Long> {

}
