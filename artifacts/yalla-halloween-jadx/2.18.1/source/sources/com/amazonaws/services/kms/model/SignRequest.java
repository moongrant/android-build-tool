package com.amazonaws.services.kms.model;

import OooO00o.OooO00o;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SignRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public List<String> f10628Oooo = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SignRequest)) {
            return false;
        }
        List<String> list = ((SignRequest) obj).f10628Oooo;
        boolean z = list == null;
        List<String> list2 = this.f10628Oooo;
        if (z ^ (list2 == null)) {
            return false;
        }
        return list == null || list.equals(list2);
    }

    public final int hashCode() {
        List<String> list = this.f10628Oooo;
        return (((list == null ? 0 : list.hashCode()) + 923521) * 31) + 0;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("{");
        if (this.f10628Oooo != null) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("GrantTokens: ");
            sbOooO0o1.append(this.f10628Oooo);
            sbOooO0o1.append(",");
            sbOooO0o0.append(sbOooO0o1.toString());
        }
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
