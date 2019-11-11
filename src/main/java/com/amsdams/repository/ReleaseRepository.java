package com.amsdams.repository;

import com.amsdams.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}