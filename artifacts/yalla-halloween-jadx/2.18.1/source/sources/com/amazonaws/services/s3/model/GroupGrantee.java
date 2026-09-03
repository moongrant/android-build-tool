package com.amazonaws.services.s3.model;

import OooO00o.OooO00o;
import com.facebook.share.internal.ShareConstants;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes.dex */
public enum GroupGrantee implements Grantee {
    AllUsers("http://acs.amazonaws.com/groups/global/AllUsers"),
    AuthenticatedUsers("http://acs.amazonaws.com/groups/global/AuthenticatedUsers"),
    LogDelivery("http://acs.amazonaws.com/groups/s3/LogDelivery");

    private String groupUri;

    GroupGrantee(String str) {
        this.groupUri = str;
    }

    public static GroupGrantee OooO0o0(String str) {
        for (GroupGrantee groupGrantee : values()) {
            if (groupGrantee.groupUri.equals(str)) {
                return groupGrantee;
            }
        }
        return null;
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public final String OooO00o() {
        return this.groupUri;
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public final String OooO0O0() {
        return ShareConstants.MEDIA_URI;
    }

    @Override // com.amazonaws.services.s3.model.Grantee
    public final void OooO0Oo(String str) {
        throw new UnsupportedOperationException("Group grantees have preset identifiers that cannot be modified.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return OooO.OooO00o(OooO00o.OooO0o0("GroupGrantee ["), this.groupUri, "]");
    }
}
