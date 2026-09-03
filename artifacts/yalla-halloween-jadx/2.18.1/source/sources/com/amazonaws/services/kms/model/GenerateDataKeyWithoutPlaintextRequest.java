package com.amazonaws.services.kms.model;

import OooO00o.OooO00o;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class GenerateDataKeyWithoutPlaintextRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public Map<String, String> f10609Oooo = new HashMap();

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public List<String> f10610OoooO00 = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GenerateDataKeyWithoutPlaintextRequest)) {
            return false;
        }
        GenerateDataKeyWithoutPlaintextRequest generateDataKeyWithoutPlaintextRequest = (GenerateDataKeyWithoutPlaintextRequest) obj;
        Map<String, String> map = generateDataKeyWithoutPlaintextRequest.f10609Oooo;
        boolean z = map == null;
        Map<String, String> map2 = this.f10609Oooo;
        if (z ^ (map2 == null)) {
            return false;
        }
        if (map != null && !map.equals(map2)) {
            return false;
        }
        List<String> list = generateDataKeyWithoutPlaintextRequest.f10610OoooO00;
        boolean z2 = list == null;
        List<String> list2 = this.f10610OoooO00;
        if (z2 ^ (list2 == null)) {
            return false;
        }
        return list == null || list.equals(list2);
    }

    public final int hashCode() {
        Map<String, String> map = this.f10609Oooo;
        int iHashCode = ((((((map == null ? 0 : map.hashCode()) + 961) * 31) + 0) * 31) + 0) * 31;
        List<String> list = this.f10610OoooO00;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("{");
        if (this.f10609Oooo != null) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("EncryptionContext: ");
            sbOooO0o1.append(this.f10609Oooo);
            sbOooO0o1.append(",");
            sbOooO0o0.append(sbOooO0o1.toString());
        }
        if (this.f10610OoooO00 != null) {
            StringBuilder sbOooO0o2 = OooO00o.OooO0o0("GrantTokens: ");
            sbOooO0o2.append(this.f10610OoooO00);
            sbOooO0o0.append(sbOooO0o2.toString());
        }
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
