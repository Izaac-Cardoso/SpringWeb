package com.exemploweb.resources.exceptions;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;

public class StandardError implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
        
    public StandardError() {}

    public StandardError(Instant timestamp, Integer status, String error, String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "StandardError [timestamp=" + timestamp + ", status=" + status + ", error=" + error + ", message="
                + message + ", path=" + path + "]";
    }

    
}
