package com.amazonaws.services.kms.model;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class GetPublicKeyResult implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f12374OooO0Oo = new ArrayList();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f12375OooO0o0 = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetPublicKeyResult)) {
            return false;
        }
        GetPublicKeyResult getPublicKeyResult = (GetPublicKeyResult) obj;
        ArrayList arrayList = getPublicKeyResult.f12374OooO0Oo;
        boolean z = arrayList == null;
        ArrayList arrayList2 = this.f12374OooO0Oo;
        if (z ^ (arrayList2 == null)) {
            return false;
        }
        if (arrayList != null && !arrayList.equals(arrayList2)) {
            return false;
        }
        ArrayList arrayList3 = getPublicKeyResult.f12375OooO0o0;
        boolean z2 = arrayList3 == null;
        ArrayList arrayList4 = this.f12375OooO0o0;
        if (z2 ^ (arrayList4 == null)) {
            return false;
        }
        return arrayList3 == null || arrayList3.equals(arrayList4);
    }

    public final int hashCode() {
        ArrayList arrayList = this.f12374OooO0Oo;
        int iHashCode = ((arrayList == null ? 0 : arrayList.hashCode()) + 28629151) * 31;
        ArrayList arrayList2 = this.f12375OooO0o0;
        return iHashCode + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        ArrayList arrayList = this.f12374OooO0Oo;
        if (arrayList != null) {
            sb.append("EncryptionAlgorithms: " + arrayList + ",");
        }
        ArrayList arrayList2 = this.f12375OooO0o0;
        if (arrayList2 != null) {
            sb.append("SigningAlgorithms: " + arrayList2);
        }
        sb.append("}");
        return sb.toString();
    }
}
