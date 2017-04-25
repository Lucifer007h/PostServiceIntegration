package com.h5c.postserviceintegration;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

/**
 * @author Harsh on 31-03-2017.
 */

@JsonObject
public class MOdel {
    @JsonField (name = "userName")
    private String userName;
    @JsonField (name = "password")
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
