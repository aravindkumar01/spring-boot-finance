package com.studycool.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studycool.model.Location;

@Repository
public interface LocationRepo extends JpaRepository<Location, Long>{

}
