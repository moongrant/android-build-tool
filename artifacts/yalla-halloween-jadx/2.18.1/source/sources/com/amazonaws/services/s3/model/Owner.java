package com.amazonaws.services.s3.model;

import OooO00o.OooO00o;
import java.io.Serializable;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes.dex */
public class Owner implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f10871Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f10872Oooo0oO;

    public final boolean equals(Object obj) {
        if (!(obj instanceof Owner)) {
            return false;
        }
        Owner owner = (Owner) obj;
        String str = owner.f10872Oooo0oO;
        String str2 = owner.f10871Oooo0o;
        String str3 = this.f10872Oooo0oO;
        String str4 = this.f10871Oooo0o;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        return str.equals(str3) && str2.equals(str4);
    }

    public final int hashCode() {
        String str = this.f10872Oooo0oO;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("S3Owner [name=");
        sbOooO0o0.append(this.f10871Oooo0o);
        sbOooO0o0.append(",id=");
        return OooO.OooO00o(sbOooO0o0, this.f10872Oooo0oO, "]");
    }
}
