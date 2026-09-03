package com.amazonaws.services.kms.model;

import OooO00o.OooO00o;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ReEncryptRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public Map<String, String> f10625Oooo = new HashMap();

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Map<String, String> f10627OoooO00 = new HashMap();

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public List<String> f10626OoooO0 = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ReEncryptRequest)) {
            return false;
        }
        ReEncryptRequest reEncryptRequest = (ReEncryptRequest) obj;
        Map<String, String> map = reEncryptRequest.f10625Oooo;
        boolean z = map == null;
        Map<String, String> map2 = this.f10625Oooo;
        if (z ^ (map2 == null)) {
            return false;
        }
        if (map != null && !map.equals(map2)) {
            return false;
        }
        Map<String, String> map3 = reEncryptRequest.f10627OoooO00;
        boolean z2 = map3 == null;
        Map<String, String> map4 = this.f10627OoooO00;
        if (z2 ^ (map4 == null)) {
            return false;
        }
        if (map3 != null && !map3.equals(map4)) {
            return false;
        }
        List<String> list = reEncryptRequest.f10626OoooO0;
        boolean z3 = list == null;
        List<String> list2 = this.f10626OoooO0;
        if (z3 ^ (list2 == null)) {
            return false;
        }
        return list == null || list.equals(list2);
    }

    public final int hashCode() {
        Map<String, String> map = this.f10625Oooo;
        int iHashCode = ((((((map == null ? 0 : map.hashCode()) + 961) * 31) + 0) * 31) + 0) * 31;
        Map<String, String> map2 = this.f10627OoooO00;
        int iHashCode2 = (((((iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31) + 0) * 31) + 0) * 31;
        List<String> list = this.f10626OoooO0;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("{");
        if (this.f10625Oooo != null) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("SourceEncryptionContext: ");
            sbOooO0o1.append(this.f10625Oooo);
            sbOooO0o1.append(",");
            sbOooO0o0.append(sbOooO0o1.toString());
        }
        if (this.f10627OoooO00 != null) {
            StringBuilder sbOooO0o2 = OooO00o.OooO0o0("DestinationEncryptionContext: ");
            sbOooO0o2.append(this.f10627OoooO00);
            sbOooO0o2.append(",");
            sbOooO0o0.append(sbOooO0o2.toString());
        }
        if (this.f10626OoooO0 != null) {
            StringBuilder sbOooO0o3 = OooO00o.OooO0o0("GrantTokens: ");
            sbOooO0o3.append(this.f10626OoooO0);
            sbOooO0o0.append(sbOooO0o3.toString());
        }
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
