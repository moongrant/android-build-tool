package com.amazonaws.services.s3.model;

import java.io.Serializable;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes2.dex */
public class Owner implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f9418OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f9419OooO0o0;

    public final boolean equals(Object obj) {
        if (!(obj instanceof Owner)) {
            return false;
        }
        Owner owner = (Owner) obj;
        String str = owner.f9419OooO0o0;
        String str2 = owner.f9418OooO0Oo;
        String str3 = this.f9419OooO0o0;
        String str4 = this.f9418OooO0Oo;
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
        String str = this.f9419OooO0o0;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("S3Owner [name=");
        sb.append(this.f9418OooO0Oo);
        sb.append(",id=");
        return o0O00o0.OooO0O0(sb, this.f9419OooO0o0, "]");
    }
}
