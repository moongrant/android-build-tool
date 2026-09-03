package com.amazonaws.services.kms.model;

import OooO00o.OooO00o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ListGrantsResult implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public List<GrantListEntry> f10620Oooo0o = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListGrantsResult)) {
            return false;
        }
        List<GrantListEntry> list = ((ListGrantsResult) obj).f10620Oooo0o;
        boolean z = list == null;
        List<GrantListEntry> list2 = this.f10620Oooo0o;
        if (z ^ (list2 == null)) {
            return false;
        }
        return list == null || list.equals(list2);
    }

    public final int hashCode() {
        List<GrantListEntry> list = this.f10620Oooo0o;
        return (((((list == null ? 0 : list.hashCode()) + 31) * 31) + 0) * 31) + 0;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("{");
        if (this.f10620Oooo0o != null) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Grants: ");
            sbOooO0o1.append(this.f10620Oooo0o);
            sbOooO0o1.append(",");
            sbOooO0o0.append(sbOooO0o1.toString());
        }
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
