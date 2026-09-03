package com.amazonaws.services.cognitoidentity.model;

import OooO00o.OooO00o;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class GetOpenIdTokenRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public String f10589Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Map<String, String> f10590OoooO00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetOpenIdTokenRequest)) {
            return false;
        }
        GetOpenIdTokenRequest getOpenIdTokenRequest = (GetOpenIdTokenRequest) obj;
        String str = getOpenIdTokenRequest.f10589Oooo;
        boolean z = str == null;
        String str2 = this.f10589Oooo;
        if (z ^ (str2 == null)) {
            return false;
        }
        if (str != null && !str.equals(str2)) {
            return false;
        }
        Map<String, String> map = getOpenIdTokenRequest.f10590OoooO00;
        boolean z2 = map == null;
        Map<String, String> map2 = this.f10590OoooO00;
        if (z2 ^ (map2 == null)) {
            return false;
        }
        return map == null || map.equals(map2);
    }

    public final int hashCode() {
        String str = this.f10589Oooo;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        Map<String, String> map = this.f10590OoooO00;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("{");
        if (this.f10589Oooo != null) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("IdentityId: ");
            sbOooO0o1.append(this.f10589Oooo);
            sbOooO0o1.append(",");
            sbOooO0o0.append(sbOooO0o1.toString());
        }
        if (this.f10590OoooO00 != null) {
            StringBuilder sbOooO0o2 = OooO00o.OooO0o0("Logins: ");
            sbOooO0o2.append(this.f10590OoooO00);
            sbOooO0o0.append(sbOooO0o2.toString());
        }
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
