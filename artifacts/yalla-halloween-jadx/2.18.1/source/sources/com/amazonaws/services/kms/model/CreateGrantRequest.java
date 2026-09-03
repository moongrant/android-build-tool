package com.amazonaws.services.kms.model;

import OooO00o.OooO00o;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CreateGrantRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public List<String> f10594Oooo = new ArrayList();

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public List<String> f10595OoooO00 = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateGrantRequest)) {
            return false;
        }
        CreateGrantRequest createGrantRequest = (CreateGrantRequest) obj;
        List<String> list = createGrantRequest.f10594Oooo;
        boolean z = list == null;
        List<String> list2 = this.f10594Oooo;
        if (z ^ (list2 == null)) {
            return false;
        }
        if (list != null && !list.equals(list2)) {
            return false;
        }
        List<String> list3 = createGrantRequest.f10595OoooO00;
        boolean z2 = list3 == null;
        List<String> list4 = this.f10595OoooO00;
        if (z2 ^ (list4 == null)) {
            return false;
        }
        return list3 == null || list3.equals(list4);
    }

    public final int hashCode() {
        List<String> list = this.f10594Oooo;
        int iHashCode = ((((list == null ? 0 : list.hashCode()) + 923521) * 31) + 0) * 31;
        List<String> list2 = this.f10595OoooO00;
        return ((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31) + 0;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("{");
        if (this.f10594Oooo != null) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Operations: ");
            sbOooO0o1.append(this.f10594Oooo);
            sbOooO0o1.append(",");
            sbOooO0o0.append(sbOooO0o1.toString());
        }
        if (this.f10595OoooO00 != null) {
            StringBuilder sbOooO0o2 = OooO00o.OooO0o0("GrantTokens: ");
            sbOooO0o2.append(this.f10595OoooO00);
            sbOooO0o2.append(",");
            sbOooO0o0.append(sbOooO0o2.toString());
        }
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
