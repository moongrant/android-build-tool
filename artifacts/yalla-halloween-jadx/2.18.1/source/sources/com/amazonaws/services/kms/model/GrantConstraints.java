package com.amazonaws.services.kms.model;

import OooO00o.OooO00o;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class GrantConstraints implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Map<String, String> f10614Oooo0o = new HashMap();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Map<String, String> f10615Oooo0oO = new HashMap();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GrantConstraints)) {
            return false;
        }
        GrantConstraints grantConstraints = (GrantConstraints) obj;
        Map<String, String> map = grantConstraints.f10614Oooo0o;
        boolean z = map == null;
        Map<String, String> map2 = this.f10614Oooo0o;
        if (z ^ (map2 == null)) {
            return false;
        }
        if (map != null && !map.equals(map2)) {
            return false;
        }
        Map<String, String> map3 = grantConstraints.f10615Oooo0oO;
        boolean z2 = map3 == null;
        Map<String, String> map4 = this.f10615Oooo0oO;
        if (z2 ^ (map4 == null)) {
            return false;
        }
        return map3 == null || map3.equals(map4);
    }

    public final int hashCode() {
        Map<String, String> map = this.f10614Oooo0o;
        int iHashCode = ((map == null ? 0 : map.hashCode()) + 31) * 31;
        Map<String, String> map2 = this.f10615Oooo0oO;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("{");
        if (this.f10614Oooo0o != null) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("EncryptionContextSubset: ");
            sbOooO0o1.append(this.f10614Oooo0o);
            sbOooO0o1.append(",");
            sbOooO0o0.append(sbOooO0o1.toString());
        }
        if (this.f10615Oooo0oO != null) {
            StringBuilder sbOooO0o2 = OooO00o.OooO0o0("EncryptionContextEquals: ");
            sbOooO0o2.append(this.f10615Oooo0oO);
            sbOooO0o0.append(sbOooO0o2.toString());
        }
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
