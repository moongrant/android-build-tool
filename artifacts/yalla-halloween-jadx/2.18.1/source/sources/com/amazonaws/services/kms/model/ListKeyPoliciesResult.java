package com.amazonaws.services.kms.model;

import OooO00o.OooO00o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ListKeyPoliciesResult implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public List<String> f10621Oooo0o = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListKeyPoliciesResult)) {
            return false;
        }
        List<String> list = ((ListKeyPoliciesResult) obj).f10621Oooo0o;
        boolean z = list == null;
        List<String> list2 = this.f10621Oooo0o;
        if (z ^ (list2 == null)) {
            return false;
        }
        return list == null || list.equals(list2);
    }

    public final int hashCode() {
        List<String> list = this.f10621Oooo0o;
        return (((((list == null ? 0 : list.hashCode()) + 31) * 31) + 0) * 31) + 0;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("{");
        if (this.f10621Oooo0o != null) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("PolicyNames: ");
            sbOooO0o1.append(this.f10621Oooo0o);
            sbOooO0o1.append(",");
            sbOooO0o0.append(sbOooO0o1.toString());
        }
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
