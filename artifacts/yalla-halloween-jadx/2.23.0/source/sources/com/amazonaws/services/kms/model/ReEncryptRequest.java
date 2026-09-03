package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ReEncryptRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashMap f9298OooO0oO = new HashMap();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final HashMap f9299OooO0oo = new HashMap();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList f9297OooO = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ReEncryptRequest)) {
            return false;
        }
        ReEncryptRequest reEncryptRequest = (ReEncryptRequest) obj;
        HashMap map = reEncryptRequest.f9298OooO0oO;
        boolean z = map == null;
        HashMap map2 = this.f9298OooO0oO;
        if (z ^ (map2 == null)) {
            return false;
        }
        if (map != null && !map.equals(map2)) {
            return false;
        }
        HashMap map3 = reEncryptRequest.f9299OooO0oo;
        boolean z2 = map3 == null;
        HashMap map4 = this.f9299OooO0oo;
        if (z2 ^ (map4 == null)) {
            return false;
        }
        if (map3 != null && !map3.equals(map4)) {
            return false;
        }
        ArrayList arrayList = reEncryptRequest.f9297OooO;
        boolean z3 = arrayList == null;
        ArrayList arrayList2 = this.f9297OooO;
        if (z3 ^ (arrayList2 == null)) {
            return false;
        }
        return arrayList == null || arrayList.equals(arrayList2);
    }

    public final int hashCode() {
        HashMap map = this.f9298OooO0oO;
        int iHashCode = ((((((map == null ? 0 : map.hashCode()) + 961) * 31) + 0) * 31) + 0) * 31;
        HashMap map2 = this.f9299OooO0oo;
        int iHashCode2 = (((((iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31) + 0) * 31) + 0) * 31;
        ArrayList arrayList = this.f9297OooO;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.f9298OooO0oO;
        if (map != null) {
            sb.append("SourceEncryptionContext: " + map + ",");
        }
        HashMap map2 = this.f9299OooO0oo;
        if (map2 != null) {
            sb.append("DestinationEncryptionContext: " + map2 + ",");
        }
        ArrayList arrayList = this.f9297OooO;
        if (arrayList != null) {
            sb.append("GrantTokens: " + arrayList);
        }
        sb.append("}");
        return sb.toString();
    }
}
