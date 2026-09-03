package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class CanonicalGrantee implements Grantee, Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f10747Oooo0o = null;

    @Override // com.amazonaws.services.s3.model.Grantee
    public final String OooO00o() {
        return this.f10747Oooo0o;
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public final String OooO0O0() {
        return "id";
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public final void OooO0Oo(String str) {
        this.f10747Oooo0o = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CanonicalGrantee) {
            return this.f10747Oooo0o.equals(((CanonicalGrantee) obj).f10747Oooo0o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10747Oooo0o.hashCode();
    }
}
