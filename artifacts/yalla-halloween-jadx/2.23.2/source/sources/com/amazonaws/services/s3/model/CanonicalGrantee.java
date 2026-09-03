package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class CanonicalGrantee implements Grantee, Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f12473OooO0Oo = null;

    @Override // com.amazonaws.services.s3.model.Grantee
    public final String OooO00o() {
        return this.f12473OooO0Oo;
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public final String OooO0O0() {
        return "id";
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public final void OooO0OO(String str) {
        this.f12473OooO0Oo = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CanonicalGrantee) {
            return this.f12473OooO0Oo.equals(((CanonicalGrantee) obj).f12473OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12473OooO0Oo.hashCode();
    }
}
