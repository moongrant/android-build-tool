package com.amazonaws.services.cognitoidentity.model;

import OooO00o.OooO00o;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class GetIdResult implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f10588Oooo0o;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetIdResult)) {
            return false;
        }
        String str = ((GetIdResult) obj).f10588Oooo0o;
        boolean z = str == null;
        String str2 = this.f10588Oooo0o;
        if (z ^ (str2 == null)) {
            return false;
        }
        return str == null || str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f10588Oooo0o;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("{");
        if (this.f10588Oooo0o != null) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("IdentityId: ");
            sbOooO0o1.append(this.f10588Oooo0o);
            sbOooO0o0.append(sbOooO0o1.toString());
        }
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
