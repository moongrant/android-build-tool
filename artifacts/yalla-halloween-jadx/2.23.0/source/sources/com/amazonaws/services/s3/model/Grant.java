package com.amazonaws.services.s3.model;

/* JADX INFO: loaded from: classes2.dex */
public class Grant {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Grantee f9396OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Permission f9397OooO0O0;

    public Grant(Grantee grantee, Permission permission) {
        this.f9396OooO00o = null;
        this.f9397OooO0O0 = null;
        this.f9396OooO00o = grantee;
        this.f9397OooO0O0 = permission;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Grant grant = (Grant) obj;
        Grantee grantee = grant.f9396OooO00o;
        Grantee grantee2 = this.f9396OooO00o;
        if (grantee2 == null) {
            if (grantee != null) {
                return false;
            }
        } else if (!grantee2.equals(grantee)) {
            return false;
        }
        return this.f9397OooO0O0 == grant.f9397OooO0O0;
    }

    public final int hashCode() {
        Grantee grantee = this.f9396OooO00o;
        int iHashCode = ((grantee == null ? 0 : grantee.hashCode()) + 31) * 31;
        Permission permission = this.f9397OooO0O0;
        return iHashCode + (permission != null ? permission.hashCode() : 0);
    }

    public final String toString() {
        return "Grant [grantee=" + this.f9396OooO00o + ", permission=" + this.f9397OooO0O0 + "]";
    }
}
