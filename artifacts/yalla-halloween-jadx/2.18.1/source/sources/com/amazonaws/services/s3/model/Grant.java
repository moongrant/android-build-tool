package com.amazonaws.services.s3.model;

import OooO00o.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class Grant {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Grantee f10814OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Permission f10815OooO0O0;

    public Grant(Grantee grantee, Permission permission) {
        this.f10814OooO00o = grantee;
        this.f10815OooO0O0 = permission;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Grant grant = (Grant) obj;
        Grantee grantee = this.f10814OooO00o;
        if (grantee == null) {
            if (grant.f10814OooO00o != null) {
                return false;
            }
        } else if (!grantee.equals(grant.f10814OooO00o)) {
            return false;
        }
        return this.f10815OooO0O0 == grant.f10815OooO0O0;
    }

    public final int hashCode() {
        Grantee grantee = this.f10814OooO00o;
        int iHashCode = ((grantee == null ? 0 : grantee.hashCode()) + 31) * 31;
        Permission permission = this.f10815OooO0O0;
        return iHashCode + (permission != null ? permission.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Grant [grantee=");
        sbOooO0o0.append(this.f10814OooO00o);
        sbOooO0o0.append(", permission=");
        sbOooO0o0.append(this.f10815OooO0O0);
        sbOooO0o0.append("]");
        return sbOooO0o0.toString();
    }
}
