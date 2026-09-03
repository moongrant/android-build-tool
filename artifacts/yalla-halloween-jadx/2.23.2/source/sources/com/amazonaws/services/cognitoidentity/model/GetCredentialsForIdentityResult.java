package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class GetCredentialsForIdentityResult implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f12353OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Credentials f12354OooO0o0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetCredentialsForIdentityResult)) {
            return false;
        }
        GetCredentialsForIdentityResult getCredentialsForIdentityResult = (GetCredentialsForIdentityResult) obj;
        String str = getCredentialsForIdentityResult.f12353OooO0Oo;
        boolean z = str == null;
        String str2 = this.f12353OooO0Oo;
        if (z ^ (str2 == null)) {
            return false;
        }
        if (str != null && !str.equals(str2)) {
            return false;
        }
        Credentials credentials = getCredentialsForIdentityResult.f12354OooO0o0;
        boolean z2 = credentials == null;
        Credentials credentials2 = this.f12354OooO0o0;
        if (z2 ^ (credentials2 == null)) {
            return false;
        }
        return credentials == null || credentials.equals(credentials2);
    }

    public final int hashCode() {
        String str = this.f12353OooO0Oo;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        Credentials credentials = this.f12354OooO0o0;
        return iHashCode + (credentials != null ? credentials.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (this.f12353OooO0Oo != null) {
            sb.append("IdentityId: " + this.f12353OooO0Oo + ",");
        }
        if (this.f12354OooO0o0 != null) {
            sb.append("Credentials: " + this.f12354OooO0o0);
        }
        sb.append("}");
        return sb.toString();
    }
}
