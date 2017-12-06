package com.dbs.bootcamp.audit.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "logs",path = "logs")
public interface LogRepository extends CrudRepository<Log, Long> {

    List<Log> findByPid(@Param("pid") String pid);

    List<Log> findByLoglevel(@Param("loglevel") String loglevel);

    List<Log> findByThreadname(@Param("threadname") String threadname);

    List<Log> findByLoggername(@Param("loggername") String loggername);

}