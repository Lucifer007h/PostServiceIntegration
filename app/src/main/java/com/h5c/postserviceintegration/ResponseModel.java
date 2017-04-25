package com.h5c.postserviceintegration;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

/**
 * @author Harsh on 31-03-2017.
 */
@JsonObject
public class ResponseModel {
    @JsonField (name = "httpHeaders")
    private HttpHeaders httpHeaders;
    @JsonField (name = "metadata")
    private Object metadata;
    @JsonField (name = "results")
    private Object results;
    @JsonField (name = "singleResult")
    private Boolean singleResult;
    @JsonField (name = "status")
    private String status;
    @JsonField (name = "count")
    private Object count;

    public HttpHeaders getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(HttpHeaders httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public Object getResults() {
        return results;
    }

    public void setResults(Object results) {
        this.results = results;
    }

    public Boolean getSingleResult() {
        return singleResult;
    }

    public void setSingleResult(Boolean singleResult) {
        this.singleResult = singleResult;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getCount() {
        return count;
    }

    public void setCount(Object count) {
        this.count = count;
    }
}
