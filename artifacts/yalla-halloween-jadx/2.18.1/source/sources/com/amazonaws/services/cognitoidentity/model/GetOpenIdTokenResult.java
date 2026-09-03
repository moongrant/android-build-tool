package com.amazonaws.services.cognitoidentity.model;

import OooO00o.OooO00o;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class GetOpenIdTokenResult implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f10591Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f10592Oooo0oO;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetOpenIdTokenResult)) {
            return false;
        }
        GetOpenIdTokenResult getOpenIdTokenResult = (GetOpenIdTokenResult) obj;
        String str = getOpenIdTokenResult.f10591Oooo0o;
        boolean z = str == null;
        String str2 = this.f10591Oooo0o;
        if (z ^ (str2 == null)) {
            return false;
        }
        if (str != null && !str.equals(str2)) {
            return false;
        }
        String str3 = getOpenIdTokenResult.f10592Oooo0oO;
        boolean z2 = str3 == null;
        String str4 = this.f10592Oooo0oO;
        if (z2 ^ (str4 == null)) {
            return false;
        }
        return str3 == null || str3.equals(str4);
    }

    public final int hashCode() {
        String str = this.f10591Oooo0o;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f10592Oooo0oO;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("{");
        if (this.f10591Oooo0o != null) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("IdentityId: ");
            sbOooO0o1.append(this.f10591Oooo0o);
            sbOooO0o1.append(",");
            sbOooO0o0.append(sbOooO0o1.toString());
        }
        if (this.f10592Oooo0oO != null) {
            StringBuilder sbOooO0o2 = OooO00o.OooO0o0("Token: ");
            sbOooO0o2.append(this.f10592Oooo0oO);
            sbOooO0o0.append(sbOooO0o2.toString());
        }
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
