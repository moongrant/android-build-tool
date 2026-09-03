package com.amazonaws.auth;

import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AWSAbstractCognitoIdentityProvider implements AWSCognitoIdentityProvider {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AmazonCognitoIdentity f8999OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f9000OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f9001OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f9002OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final HashMap f9003OooO0o = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f9004OooO0o0 = new ArrayList();

    public AWSAbstractCognitoIdentityProvider(String str, AmazonCognitoIdentityClient amazonCognitoIdentityClient) {
        this.f9001OooO0OO = str;
        this.f8999OooO00o = amazonCognitoIdentityClient;
    }

    @Override // com.amazonaws.auth.AWSCognitoIdentityProvider
    public final void OooO00o(String str) {
        String str2 = this.f9000OooO0O0;
        if (str2 == null || !str2.equals(str)) {
            this.f9000OooO0O0 = str;
            Iterator it = this.f9004OooO0o0.iterator();
            while (it.hasNext()) {
                ((IdentityChangedListener) it.next()).OooO00o(this.f9000OooO0O0);
            }
        }
    }

    @Override // com.amazonaws.auth.AWSCognitoIdentityProvider
    public final boolean OooO0OO() {
        HashMap map = this.f9003OooO0o;
        return map != null && map.size() > 0;
    }

    @Override // com.amazonaws.auth.AWSCognitoIdentityProvider
    public final String OooO0Oo() {
        return this.f9001OooO0OO;
    }

    @Override // com.amazonaws.auth.AWSCognitoIdentityProvider
    public final void OooO0o0(IdentityChangedListener identityChangedListener) {
        this.f9004OooO0o0.add(identityChangedListener);
    }

    @Override // com.amazonaws.auth.AWSCognitoIdentityProvider
    public final HashMap OooO0oO() {
        return this.f9003OooO0o;
    }
}
