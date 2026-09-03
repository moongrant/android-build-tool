package com.amazonaws.services.kms.model;

import OooO00o.OooO00o;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DescribeKeyRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public List<String> f10600Oooo = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeKeyRequest)) {
            return false;
        }
        List<String> list = ((DescribeKeyRequest) obj).f10600Oooo;
        boolean z = list == null;
        List<String> list2 = this.f10600Oooo;
        if (z ^ (list2 == null)) {
            return false;
        }
        return list == null || list.equals(list2);
    }

    public final int hashCode() {
        List<String> list = this.f10600Oooo;
        return (list == null ? 0 : list.hashCode()) + 961;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("{");
        if (this.f10600Oooo != null) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("GrantTokens: ");
            sbOooO0o1.append(this.f10600Oooo);
            sbOooO0o0.append(sbOooO0o1.toString());
        }
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
