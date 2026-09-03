package com.amazonaws.services.securitytoken.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class AssumeRoleWithWebIdentityRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public String f9558OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public String f9559OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f9560OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Integer f9561OooOO0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssumeRoleWithWebIdentityRequest)) {
            return false;
        }
        AssumeRoleWithWebIdentityRequest assumeRoleWithWebIdentityRequest = (AssumeRoleWithWebIdentityRequest) obj;
        String str = assumeRoleWithWebIdentityRequest.f9559OooO0oO;
        boolean z = str == null;
        String str2 = this.f9559OooO0oO;
        if (z ^ (str2 == null)) {
            return false;
        }
        if (str != null && !str.equals(str2)) {
            return false;
        }
        String str3 = assumeRoleWithWebIdentityRequest.f9560OooO0oo;
        boolean z2 = str3 == null;
        String str4 = this.f9560OooO0oo;
        if (z2 ^ (str4 == null)) {
            return false;
        }
        if (str3 != null && !str3.equals(str4)) {
            return false;
        }
        String str5 = assumeRoleWithWebIdentityRequest.f9558OooO;
        boolean z3 = str5 == null;
        String str6 = this.f9558OooO;
        if (z3 ^ (str6 == null)) {
            return false;
        }
        if (str5 != null && !str5.equals(str6)) {
            return false;
        }
        Integer num = assumeRoleWithWebIdentityRequest.f9561OooOO0;
        boolean z4 = num == null;
        Integer num2 = this.f9561OooOO0;
        if (z4 ^ (num2 == null)) {
            return false;
        }
        return num == null || num.equals(num2);
    }

    public final int hashCode() {
        String str = this.f9559OooO0oO;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f9560OooO0oo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9558OooO;
        int iHashCode3 = (((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        Integer num = this.f9561OooOO0;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (this.f9559OooO0oO != null) {
            sb.append("RoleArn: " + this.f9559OooO0oO + ",");
        }
        if (this.f9560OooO0oo != null) {
            sb.append("RoleSessionName: " + this.f9560OooO0oo + ",");
        }
        if (this.f9558OooO != null) {
            sb.append("WebIdentityToken: " + this.f9558OooO + ",");
        }
        if (this.f9561OooOO0 != null) {
            sb.append("DurationSeconds: " + this.f9561OooOO0);
        }
        sb.append("}");
        return sb.toString();
    }
}
