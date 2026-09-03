package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class GetCredentialsForIdentityRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public String f12350OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public String f12351OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Map<String, String> f12352OooO0oo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetCredentialsForIdentityRequest)) {
            return false;
        }
        GetCredentialsForIdentityRequest getCredentialsForIdentityRequest = (GetCredentialsForIdentityRequest) obj;
        String str = getCredentialsForIdentityRequest.f12351OooO0oO;
        boolean z = str == null;
        String str2 = this.f12351OooO0oO;
        if (z ^ (str2 == null)) {
            return false;
        }
        if (str != null && !str.equals(str2)) {
            return false;
        }
        Map<String, String> map = getCredentialsForIdentityRequest.f12352OooO0oo;
        boolean z2 = map == null;
        Map<String, String> map2 = this.f12352OooO0oo;
        if (z2 ^ (map2 == null)) {
            return false;
        }
        if (map != null && !map.equals(map2)) {
            return false;
        }
        String str3 = getCredentialsForIdentityRequest.f12350OooO;
        boolean z3 = str3 == null;
        String str4 = this.f12350OooO;
        if (z3 ^ (str4 == null)) {
            return false;
        }
        return str3 == null || str3.equals(str4);
    }

    public final int hashCode() {
        String str = this.f12351OooO0oO;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        Map<String, String> map = this.f12352OooO0oo;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.f12350OooO;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (this.f12351OooO0oO != null) {
            sb.append("IdentityId: " + this.f12351OooO0oO + ",");
        }
        if (this.f12352OooO0oo != null) {
            sb.append("Logins: " + this.f12352OooO0oo + ",");
        }
        if (this.f12350OooO != null) {
            sb.append("CustomRoleArn: " + this.f12350OooO);
        }
        sb.append("}");
        return sb.toString();
    }
}
