package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class Tag implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f12528OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f12529OooO0o0;

    public Tag(String str, String str2) {
        this.f12528OooO0Oo = str;
        this.f12529OooO0o0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tag tag = (Tag) obj;
        String str = tag.f12528OooO0Oo;
        String str2 = this.f12528OooO0Oo;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = tag.f12529OooO0o0;
        String str4 = this.f12529OooO0o0;
        if (str4 != null) {
            return str4.equals(str3);
        }
        return str3 == null;
    }

    public final int hashCode() {
        String str = this.f12528OooO0Oo;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f12529OooO0o0;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
