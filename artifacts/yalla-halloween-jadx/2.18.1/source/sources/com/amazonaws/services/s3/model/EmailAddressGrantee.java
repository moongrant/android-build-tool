package com.amazonaws.services.s3.model;

/* JADX INFO: loaded from: classes.dex */
public class EmailAddressGrantee implements Grantee {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f10783Oooo0o = null;

    @Override // com.amazonaws.services.s3.model.Grantee
    public final String OooO00o() {
        return this.f10783Oooo0o;
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public final String OooO0O0() {
        return "emailAddress";
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public final void OooO0Oo(String str) {
        this.f10783Oooo0o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EmailAddressGrantee emailAddressGrantee = (EmailAddressGrantee) obj;
        String str = this.f10783Oooo0o;
        if (str == null) {
            if (emailAddressGrantee.f10783Oooo0o != null) {
                return false;
            }
        } else if (!str.equals(emailAddressGrantee.f10783Oooo0o)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f10783Oooo0o;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return this.f10783Oooo0o;
    }
}
