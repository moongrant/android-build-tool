package com.amazonaws.services.cognitoidentity.model;

import OooO00o.OooO00o;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class GetIdRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public String f10585Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Map<String, String> f10586OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public String f10587OoooO00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetIdRequest)) {
            return false;
        }
        GetIdRequest getIdRequest = (GetIdRequest) obj;
        String str = getIdRequest.f10585Oooo;
        boolean z = str == null;
        String str2 = this.f10585Oooo;
        if (z ^ (str2 == null)) {
            return false;
        }
        if (str != null && !str.equals(str2)) {
            return false;
        }
        String str3 = getIdRequest.f10587OoooO00;
        boolean z2 = str3 == null;
        String str4 = this.f10587OoooO00;
        if (z2 ^ (str4 == null)) {
            return false;
        }
        if (str3 != null && !str3.equals(str4)) {
            return false;
        }
        Map<String, String> map = getIdRequest.f10586OoooO0;
        boolean z3 = map == null;
        Map<String, String> map2 = this.f10586OoooO0;
        if (z3 ^ (map2 == null)) {
            return false;
        }
        return map == null || map.equals(map2);
    }

    public final int hashCode() {
        String str = this.f10585Oooo;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f10587OoooO00;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.f10586OoooO0;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("{");
        if (this.f10585Oooo != null) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("AccountId: ");
            sbOooO0o1.append(this.f10585Oooo);
            sbOooO0o1.append(",");
            sbOooO0o0.append(sbOooO0o1.toString());
        }
        if (this.f10587OoooO00 != null) {
            StringBuilder sbOooO0o2 = OooO00o.OooO0o0("IdentityPoolId: ");
            sbOooO0o2.append(this.f10587OoooO00);
            sbOooO0o2.append(",");
            sbOooO0o0.append(sbOooO0o2.toString());
        }
        if (this.f10586OoooO0 != null) {
            StringBuilder sbOooO0o3 = OooO00o.OooO0o0("Logins: ");
            sbOooO0o3.append(this.f10586OoooO0);
            sbOooO0o0.append(sbOooO0o3.toString());
        }
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
