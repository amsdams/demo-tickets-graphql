package com.amsdams.repository;

import com.amsdams.entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
