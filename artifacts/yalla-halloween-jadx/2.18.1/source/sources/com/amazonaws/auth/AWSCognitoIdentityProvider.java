package com.amazonaws.auth;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface AWSCognitoIdentityProvider extends AWSIdentityProvider {
    String getIdentityId();

    String getIdentityPoolId();

    Map<String, String> getLogins();

    void identityChanged(String str);

    boolean isAuthenticated();

    void registerIdentityChangedListener(IdentityChangedListener identityChangedListener);
}
