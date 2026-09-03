package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class GenerateDataKeyRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashMap f12369OooO0oO = new HashMap();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList f12370OooO0oo = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GenerateDataKeyRequest)) {
            return false;
        }
        GenerateDataKeyRequest generateDataKeyRequest = (GenerateDataKeyRequest) obj;
        HashMap map = generateDataKeyRequest.f12369OooO0oO;
        boolean z = map == null;
        HashMap map2 = this.f12369OooO0oO;
        if (z ^ (map2 == null)) {
            return false;
        }
        if (map != null && !map.equals(map2)) {
            return false;
        }
        ArrayList arrayList = generateDataKeyRequest.f12370OooO0oo;
        boolean z2 = arrayList == null;
        ArrayList arrayList2 = this.f12370OooO0oo;
        if (z2 ^ (arrayList2 == null)) {
            return false;
        }
        return arrayList == null || arrayList.equals(arrayList2);
    }

    public final int hashCode() {
        HashMap map = this.f12369OooO0oO;
        int iHashCode = ((((((map == null ? 0 : map.hashCode()) + 961) * 31) + 0) * 31) + 0) * 31;
        ArrayList arrayList = this.f12370OooO0oo;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.f12369OooO0oO;
        if (map != null) {
            sb.append("EncryptionContext: " + map + ",");
        }
        ArrayList arrayList = this.f12370OooO0oo;
        if (arrayList != null) {
            sb.append("GrantTokens: " + arrayList);
        }
        sb.append("}");
        return sb.toString();
    }
}
