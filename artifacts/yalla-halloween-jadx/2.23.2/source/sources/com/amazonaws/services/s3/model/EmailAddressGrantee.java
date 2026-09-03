package com.amazonaws.services.s3.model;

/* JADX INFO: loaded from: classes2.dex */
public class EmailAddressGrantee implements Grantee {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f12478OooO0Oo = null;

    @Override // com.amazonaws.services.s3.model.Grantee
    public final String OooO00o() {
        return this.f12478OooO0Oo;
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public final String OooO0O0() {
        return "emailAddress";
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public final void OooO0OO(String str) {
        this.f12478OooO0Oo = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EmailAddressGrantee emailAddressGrantee = (EmailAddressGrantee) obj;
        String str = this.f12478OooO0Oo;
        if (str == null) {
            if (emailAddressGrantee.f12478OooO0Oo != null) {
                return false;
            }
        } else if (!str.equals(emailAddressGrantee.f12478OooO0Oo)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f12478OooO0Oo;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return this.f12478OooO0Oo;
    }
}
