package com.amazonaws.services.kms.model;

import OooO00o.OooO00o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class KeyMetadata implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public List<String> f10617Oooo0o = new ArrayList();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public List<String> f10618Oooo0oO = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof KeyMetadata)) {
            return false;
        }
        KeyMetadata keyMetadata = (KeyMetadata) obj;
        List<String> list = keyMetadata.f10617Oooo0o;
        boolean z = list == null;
        List<String> list2 = this.f10617Oooo0o;
        if (z ^ (list2 == null)) {
            return false;
        }
        if (list != null && !list.equals(list2)) {
            return false;
        }
        List<String> list3 = keyMetadata.f10618Oooo0oO;
        boolean z2 = list3 == null;
        List<String> list4 = this.f10618Oooo0oO;
        if (z2 ^ (list4 == null)) {
            return false;
        }
        return list3 == null || list3.equals(list4);
    }

    public final int hashCode() {
        List<String> list = this.f10617Oooo0o;
        int iHashCode = ((list == null ? 0 : list.hashCode()) - 997072353) * 31;
        List<String> list2 = this.f10618Oooo0oO;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("{");
        if (this.f10617Oooo0o != null) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("EncryptionAlgorithms: ");
            sbOooO0o1.append(this.f10617Oooo0o);
            sbOooO0o1.append(",");
            sbOooO0o0.append(sbOooO0o1.toString());
        }
        if (this.f10618Oooo0oO != null) {
            StringBuilder sbOooO0o2 = OooO00o.OooO0o0("SigningAlgorithms: ");
            sbOooO0o2.append(this.f10618Oooo0oO);
            sbOooO0o0.append(sbOooO0o2.toString());
        }
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
