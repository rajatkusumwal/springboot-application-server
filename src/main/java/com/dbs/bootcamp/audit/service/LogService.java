package com.dbs.bootcamp.audit.service;

import com.dbs.bootcamp.audit.domain.Log;
import com.dbs.bootcamp.audit.domain.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {

    @Autowired
    LogRepository logRepository;

    public Log findById(Long id) { return logRepository.findOne(id); }

    public List<Log> findByPid(String pid) {
        return logRepository.findByPid(pid);
    }

    public List<Log> findByLoglevel(String loglevel) {
        return logRepository.findByLoglevel(loglevel);
    }

    public List<Log> findByThreadname(String threadname) {
        return logRepository.findByThreadname(threadname);
    }

    public List<Log> findByLoggername(String loggername) {
        return logRepository.findByLoggername(loggername);
    }

    public Log create(Log log) { return logRepository.save(log); }

    public Log update(Log log) {
        return logRepository.save(log);
    }

    public void delete(Long id) { logRepository.delete(id); }


}
