package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class Credentials implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f9256OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f9257OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f9258OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Date f9259OooO0oO;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Credentials)) {
            return false;
        }
        Credentials credentials = (Credentials) obj;
        String str = credentials.f9256OooO0Oo;
        boolean z = str == null;
        String str2 = this.f9256OooO0Oo;
        if (z ^ (str2 == null)) {
            return false;
        }
        if (str != null && !str.equals(str2)) {
            return false;
        }
        String str3 = credentials.f9258OooO0o0;
        boolean z2 = str3 == null;
        String str4 = this.f9258OooO0o0;
        if (z2 ^ (str4 == null)) {
            return false;
        }
        if (str3 != null && !str3.equals(str4)) {
            return false;
        }
        String str5 = credentials.f9257OooO0o;
        boolean z3 = str5 == null;
        String str6 = this.f9257OooO0o;
        if (z3 ^ (str6 == null)) {
            return false;
        }
        if (str5 != null && !str5.equals(str6)) {
            return false;
        }
        Date date = credentials.f9259OooO0oO;
        boolean z4 = date == null;
        Date date2 = this.f9259OooO0oO;
        if (z4 ^ (date2 == null)) {
            return false;
        }
        return date == null || date.equals(date2);
    }

    public final int hashCode() {
        String str = this.f9256OooO0Oo;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f9258OooO0o0;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9257OooO0o;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Date date = this.f9259OooO0oO;
        return iHashCode3 + (date != null ? date.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (this.f9256OooO0Oo != null) {
            sb.append("AccessKeyId: " + this.f9256OooO0Oo + ",");
        }
        if (this.f9258OooO0o0 != null) {
            sb.append("SecretKey: " + this.f9258OooO0o0 + ",");
        }
        if (this.f9257OooO0o != null) {
            sb.append("SessionToken: " + this.f9257OooO0o + ",");
        }
        if (this.f9259OooO0oO != null) {
            sb.append("Expiration: " + this.f9259OooO0oO);
        }
        sb.append("}");
        return sb.toString();
    }
}
