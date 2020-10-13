package org.sid.security;

import java.util.Date;

public class SecurityParams {
    public final static String PRIVATE_SECRET = "picojazzz@gmail.com";
    public final static String JWT_HEADER = "Authorisation";
    public final static String TOKEN_PREFIX = "pico ";
    public final static Date JWT_EXPIREAT = new Date(System.currentTimeMillis()+10*24*60*60000);

}
