package com.amazonaws.services.kms.model;

import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class GrantConstraints implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f12376OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap f12377OooO0o0 = new HashMap();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GrantConstraints)) {
            return false;
        }
        GrantConstraints grantConstraints = (GrantConstraints) obj;
        HashMap map = grantConstraints.f12376OooO0Oo;
        boolean z = map == null;
        HashMap map2 = this.f12376OooO0Oo;
        if (z ^ (map2 == null)) {
            return false;
        }
        if (map != null && !map.equals(map2)) {
            return false;
        }
        HashMap map3 = grantConstraints.f12377OooO0o0;
        boolean z2 = map3 == null;
        HashMap map4 = this.f12377OooO0o0;
        if (z2 ^ (map4 == null)) {
            return false;
        }
        return map3 == null || map3.equals(map4);
    }

    public final int hashCode() {
        HashMap map = this.f12376OooO0Oo;
        int iHashCode = ((map == null ? 0 : map.hashCode()) + 31) * 31;
        HashMap map2 = this.f12377OooO0o0;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.f12376OooO0Oo;
        if (map != null) {
            sb.append("EncryptionContextSubset: " + map + ",");
        }
        HashMap map2 = this.f12377OooO0o0;
        if (map2 != null) {
            sb.append("EncryptionContextEquals: " + map2);
        }
        sb.append("}");
        return sb.toString();
    }
}
