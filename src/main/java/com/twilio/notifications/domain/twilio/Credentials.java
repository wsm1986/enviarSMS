package com.twilio.notifications.domain.twilio;

import java.util.Map;

public class Credentials {
    private Map<String, String> env;

    public Credentials() {
        env = System.getenv();
    }

    public String getAccountSid() {
        return "AC18846a6ac51c0d33f2ec46b530a5b7a1";//env.get("TWILIO_ACCOUNT_SID");
    }

    public String getAuthToken() {
        return "79664a24878735c1a903bb2f02bf575d";// env.get("TWILIO_AUTH_TOKEN");
    }

    public String getPhoneNumber() {
        return "+1 469-518-7423";//env.get("TWILIO_PHONE_NUMBER");
    }
}

