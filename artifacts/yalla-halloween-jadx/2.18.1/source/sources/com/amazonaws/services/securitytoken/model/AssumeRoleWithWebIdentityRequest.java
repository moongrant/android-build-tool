package com.amazonaws.services.securitytoken.model;

import OooO00o.OooO00o;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class AssumeRoleWithWebIdentityRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public String f11147Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public String f11148OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public String f11149OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public Integer f11150OoooO0O;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssumeRoleWithWebIdentityRequest)) {
            return false;
        }
        AssumeRoleWithWebIdentityRequest assumeRoleWithWebIdentityRequest = (AssumeRoleWithWebIdentityRequest) obj;
        String str = assumeRoleWithWebIdentityRequest.f11147Oooo;
        boolean z = str == null;
        String str2 = this.f11147Oooo;
        if (z ^ (str2 == null)) {
            return false;
        }
        if (str != null && !str.equals(str2)) {
            return false;
        }
        String str3 = assumeRoleWithWebIdentityRequest.f11149OoooO00;
        boolean z2 = str3 == null;
        String str4 = this.f11149OoooO00;
        if (z2 ^ (str4 == null)) {
            return false;
        }
        if (str3 != null && !str3.equals(str4)) {
            return false;
        }
        String str5 = assumeRoleWithWebIdentityRequest.f11148OoooO0;
        boolean z3 = str5 == null;
        String str6 = this.f11148OoooO0;
        if (z3 ^ (str6 == null)) {
            return false;
        }
        if (str5 != null && !str5.equals(str6)) {
            return false;
        }
        Integer num = assumeRoleWithWebIdentityRequest.f11150OoooO0O;
        boolean z4 = num == null;
        Integer num2 = this.f11150OoooO0O;
        if (z4 ^ (num2 == null)) {
            return false;
        }
        return num == null || num.equals(num2);
    }

    public final int hashCode() {
        String str = this.f11147Oooo;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f11149OoooO00;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11148OoooO0;
        int iHashCode3 = (((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        Integer num = this.f11150OoooO0O;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("{");
        if (this.f11147Oooo != null) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("RoleArn: ");
            sbOooO0o1.append(this.f11147Oooo);
            sbOooO0o1.append(",");
            sbOooO0o0.append(sbOooO0o1.toString());
        }
        if (this.f11149OoooO00 != null) {
            StringBuilder sbOooO0o2 = OooO00o.OooO0o0("RoleSessionName: ");
            sbOooO0o2.append(this.f11149OoooO00);
            sbOooO0o2.append(",");
            sbOooO0o0.append(sbOooO0o2.toString());
        }
        if (this.f11148OoooO0 != null) {
            StringBuilder sbOooO0o3 = OooO00o.OooO0o0("WebIdentityToken: ");
            sbOooO0o3.append(this.f11148OoooO0);
            sbOooO0o3.append(",");
            sbOooO0o0.append(sbOooO0o3.toString());
        }
        if (this.f11150OoooO0O != null) {
            StringBuilder sbOooO0o4 = OooO00o.OooO0o0("DurationSeconds: ");
            sbOooO0o4.append(this.f11150OoooO0O);
            sbOooO0o0.append(sbOooO0o4.toString());
        }
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
