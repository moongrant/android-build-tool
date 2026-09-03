package com.amazonaws.services.s3.model;

import java.io.Serializable;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
public class Owner implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f12508OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f12509OooO0o0;

    public final boolean equals(Object obj) {
        if (!(obj instanceof Owner)) {
            return false;
        }
        Owner owner = (Owner) obj;
        String str = owner.f12509OooO0o0;
        String str2 = owner.f12508OooO0Oo;
        String str3 = this.f12509OooO0o0;
        String str4 = this.f12508OooO0Oo;
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
        String str = this.f12509OooO0o0;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("S3Owner [name=");
        sb.append(this.f12508OooO0Oo);
        sb.append(",id=");
        return o0oOO.OooO0O0(sb, this.f12509OooO0o0, "]");
    }
}
