package com.h5c.postserviceintegration;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

/**
 * @author Harsh on 31-03-2017.
 */
@JsonObject
class HttpHeaders {
    @JsonField (name = "message")
    private String message;
    @JsonField (name = "partnerId")
    private String partnerId;
    @JsonField (name = "chngPswd")
    private String chngPswd;
    @JsonField (name = "profUpdate")
    private String profUpdate;
    @JsonField (name = "h5cAuthToken")
    private String h5cAuthToken;
    @JsonField (name = "partnerUserId")
    private String partnerUserId;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getChngPswd() {
        return chngPswd;
    }

    public void setChngPswd(String chngPswd) {
        this.chngPswd = chngPswd;
    }

    public String getProfUpdate() {
        return profUpdate;
    }

    public void setProfUpdate(String profUpdate) {
        this.profUpdate = profUpdate;
    }

    public String getH5cAuthToken() {
        return h5cAuthToken;
    }

    public void setH5cAuthToken(String h5cAuthToken) {
        this.h5cAuthToken = h5cAuthToken;
    }

    public String getPartnerUserId() {
        return partnerUserId;
    }

    public void setPartnerUserId(String partnerUserId) {
        this.partnerUserId = partnerUserId;
    }
}
