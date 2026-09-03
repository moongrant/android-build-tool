package com.amazonaws.auth;

import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AWSAbstractCognitoIdentityProvider implements AWSCognitoIdentityProvider {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AmazonCognitoIdentity f12089OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f12090OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f12091OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f12092OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final HashMap f12093OooO0o = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f12094OooO0o0 = new ArrayList();

    public AWSAbstractCognitoIdentityProvider(String str, AmazonCognitoIdentityClient amazonCognitoIdentityClient) {
        this.f12091OooO0OO = str;
        this.f12089OooO00o = amazonCognitoIdentityClient;
    }

    @Override // com.amazonaws.auth.AWSCognitoIdentityProvider
    public final void OooO00o(String str) {
        String str2 = this.f12090OooO0O0;
        if (str2 == null || !str2.equals(str)) {
            this.f12090OooO0O0 = str;
            Iterator it = this.f12094OooO0o0.iterator();
            while (it.hasNext()) {
                ((IdentityChangedListener) it.next()).OooO00o(this.f12090OooO0O0);
            }
        }
    }

    @Override // com.amazonaws.auth.AWSCognitoIdentityProvider
    public final boolean OooO0OO() {
        HashMap map = this.f12093OooO0o;
        return map != null && map.size() > 0;
    }

    @Override // com.amazonaws.auth.AWSCognitoIdentityProvider
    public final String OooO0Oo() {
        return this.f12091OooO0OO;
    }

    @Override // com.amazonaws.auth.AWSCognitoIdentityProvider
    public final void OooO0o0(IdentityChangedListener identityChangedListener) {
        this.f12094OooO0o0.add(identityChangedListener);
    }

    @Override // com.amazonaws.auth.AWSCognitoIdentityProvider
    public final HashMap OooO0oO() {
        return this.f12093OooO0o;
    }
}
