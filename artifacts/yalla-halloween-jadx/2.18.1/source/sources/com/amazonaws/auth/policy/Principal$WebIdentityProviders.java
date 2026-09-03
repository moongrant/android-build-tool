package com.amazonaws.auth.policy;

/* JADX INFO: loaded from: classes.dex */
public enum Principal$WebIdentityProviders {
    Facebook("graph.facebook.com"),
    Google("accounts.google.com"),
    Amazon("www.amazon.com"),
    AllProviders("*");

    private String webIdentityProvider;

    Principal$WebIdentityProviders(String str) {
        this.webIdentityProvider = str;
    }
}
