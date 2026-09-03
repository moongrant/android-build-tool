package com.amazonaws.services.cognitoidentity.model;

import OooO00o.OooO00o;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class GetCredentialsForIdentityResult implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f10583Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Credentials f10584Oooo0oO;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetCredentialsForIdentityResult)) {
            return false;
        }
        GetCredentialsForIdentityResult getCredentialsForIdentityResult = (GetCredentialsForIdentityResult) obj;
        String str = getCredentialsForIdentityResult.f10583Oooo0o;
        boolean z = str == null;
        String str2 = this.f10583Oooo0o;
        if (z ^ (str2 == null)) {
            return false;
        }
        if (str != null && !str.equals(str2)) {
            return false;
        }
        Credentials credentials = getCredentialsForIdentityResult.f10584Oooo0oO;
        boolean z2 = credentials == null;
        Credentials credentials2 = this.f10584Oooo0oO;
        if (z2 ^ (credentials2 == null)) {
            return false;
        }
        return credentials == null || credentials.equals(credentials2);
    }

    public final int hashCode() {
        String str = this.f10583Oooo0o;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        Credentials credentials = this.f10584Oooo0oO;
        return iHashCode + (credentials != null ? credentials.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("{");
        if (this.f10583Oooo0o != null) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("IdentityId: ");
            sbOooO0o1.append(this.f10583Oooo0o);
            sbOooO0o1.append(",");
            sbOooO0o0.append(sbOooO0o1.toString());
        }
        if (this.f10584Oooo0oO != null) {
            StringBuilder sbOooO0o2 = OooO00o.OooO0o0("Credentials: ");
            sbOooO0o2.append(this.f10584Oooo0oO);
            sbOooO0o0.append(sbOooO0o2.toString());
        }
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
