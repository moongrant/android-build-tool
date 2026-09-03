package com.amazonaws.services.cognitoidentity.model;

import OooO00o.OooO00o;
import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class Credentials implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public Date f10576Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f10577Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f10578Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public String f10579Oooo0oo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Credentials)) {
            return false;
        }
        Credentials credentials = (Credentials) obj;
        String str = credentials.f10577Oooo0o;
        boolean z = str == null;
        String str2 = this.f10577Oooo0o;
        if (z ^ (str2 == null)) {
            return false;
        }
        if (str != null && !str.equals(str2)) {
            return false;
        }
        String str3 = credentials.f10578Oooo0oO;
        boolean z2 = str3 == null;
        String str4 = this.f10578Oooo0oO;
        if (z2 ^ (str4 == null)) {
            return false;
        }
        if (str3 != null && !str3.equals(str4)) {
            return false;
        }
        String str5 = credentials.f10579Oooo0oo;
        boolean z3 = str5 == null;
        String str6 = this.f10579Oooo0oo;
        if (z3 ^ (str6 == null)) {
            return false;
        }
        if (str5 != null && !str5.equals(str6)) {
            return false;
        }
        Date date = credentials.f10576Oooo;
        boolean z4 = date == null;
        Date date2 = this.f10576Oooo;
        if (z4 ^ (date2 == null)) {
            return false;
        }
        return date == null || date.equals(date2);
    }

    public final int hashCode() {
        String str = this.f10577Oooo0o;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f10578Oooo0oO;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10579Oooo0oo;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Date date = this.f10576Oooo;
        return iHashCode3 + (date != null ? date.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("{");
        if (this.f10577Oooo0o != null) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("AccessKeyId: ");
            sbOooO0o1.append(this.f10577Oooo0o);
            sbOooO0o1.append(",");
            sbOooO0o0.append(sbOooO0o1.toString());
        }
        if (this.f10578Oooo0oO != null) {
            StringBuilder sbOooO0o2 = OooO00o.OooO0o0("SecretKey: ");
            sbOooO0o2.append(this.f10578Oooo0oO);
            sbOooO0o2.append(",");
            sbOooO0o0.append(sbOooO0o2.toString());
        }
        if (this.f10579Oooo0oo != null) {
            StringBuilder sbOooO0o3 = OooO00o.OooO0o0("SessionToken: ");
            sbOooO0o3.append(this.f10579Oooo0oo);
            sbOooO0o3.append(",");
            sbOooO0o0.append(sbOooO0o3.toString());
        }
        if (this.f10576Oooo != null) {
            StringBuilder sbOooO0o4 = OooO00o.OooO0o0("Expiration: ");
            sbOooO0o4.append(this.f10576Oooo);
            sbOooO0o0.append(sbOooO0o4.toString());
        }
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
