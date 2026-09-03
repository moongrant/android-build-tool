package com.amazonaws.services.s3.model;

/* JADX INFO: loaded from: classes2.dex */
public class Grant {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Grantee f12486OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Permission f12487OooO0O0;

    public Grant(Grantee grantee, Permission permission) {
        this.f12486OooO00o = null;
        this.f12487OooO0O0 = null;
        this.f12486OooO00o = grantee;
        this.f12487OooO0O0 = permission;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Grant grant = (Grant) obj;
        Grantee grantee = grant.f12486OooO00o;
        Grantee grantee2 = this.f12486OooO00o;
        if (grantee2 == null) {
            if (grantee != null) {
                return false;
            }
        } else if (!grantee2.equals(grantee)) {
            return false;
        }
        return this.f12487OooO0O0 == grant.f12487OooO0O0;
    }

    public final int hashCode() {
        Grantee grantee = this.f12486OooO00o;
        int iHashCode = ((grantee == null ? 0 : grantee.hashCode()) + 31) * 31;
        Permission permission = this.f12487OooO0O0;
        return iHashCode + (permission != null ? permission.hashCode() : 0);
    }

    public final String toString() {
        return "Grant [grantee=" + this.f12486OooO00o + ", permission=" + this.f12487OooO0O0 + "]";
    }
}
