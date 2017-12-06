package com.dbs.bootcamp.audit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Log {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Date timestamp;
    private String loglevel;
    private String pid;
    private String threadname;
    private String loggername;
    private String message;

    protected Log() {}

    public Log(String loglevel, String pid, String threadname, String loggername, String message) {
        this.timestamp = new Date();
        this.loglevel = loglevel;
        this.pid = pid;
        this.threadname = threadname;
        this.loggername = loggername;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getLoglevel() {
        return loglevel;
    }

    public void setLoglevel(String loglevel) {
        this.loglevel = loglevel;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getThreadname() {
        return threadname;
    }

    public void setThreadname(String threadname) {
        this.threadname = threadname;
    }

    public String getLoggername() {
        return loggername;
    }

    public void setLoggername(String loggername) {
        this.loggername = loggername;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format(
                "LogMessage[id=%d, timestamp='%s', loglevel='%s' , pid='%s' , threadname='%s' , loggername='%s' message='%s']",
                id,timestamp.toString(),loglevel,pid,threadname,loggername,message);
    }
}