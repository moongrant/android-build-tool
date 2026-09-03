package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import p069o0000ooO.o000000;

/* JADX INFO: loaded from: classes2.dex */
public class CreateGrantRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList f9266OooO0oO = new ArrayList();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList f9267OooO0oo = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateGrantRequest)) {
            return false;
        }
        CreateGrantRequest createGrantRequest = (CreateGrantRequest) obj;
        ArrayList arrayList = createGrantRequest.f9266OooO0oO;
        boolean z = arrayList == null;
        ArrayList arrayList2 = this.f9266OooO0oO;
        if (z ^ (arrayList2 == null)) {
            return false;
        }
        if (arrayList != null && !arrayList.equals(arrayList2)) {
            return false;
        }
        ArrayList arrayList3 = createGrantRequest.f9267OooO0oo;
        boolean z2 = arrayList3 == null;
        ArrayList arrayList4 = this.f9267OooO0oo;
        if (z2 ^ (arrayList4 == null)) {
            return false;
        }
        return arrayList3 == null || arrayList3.equals(arrayList4);
    }

    public final int hashCode() {
        ArrayList arrayList = this.f9266OooO0oO;
        int iOooO00o = o000000.OooO00o(arrayList == null ? 0 : arrayList.hashCode(), 923521, 31, 0, 31);
        ArrayList arrayList2 = this.f9267OooO0oo;
        return ((iOooO00o + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31) + 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        ArrayList arrayList = this.f9266OooO0oO;
        if (arrayList != null) {
            sb.append("Operations: " + arrayList + ",");
        }
        ArrayList arrayList2 = this.f9267OooO0oo;
        if (arrayList2 != null) {
            sb.append("GrantTokens: " + arrayList2 + ",");
        }
        sb.append("}");
        return sb.toString();
    }
}
