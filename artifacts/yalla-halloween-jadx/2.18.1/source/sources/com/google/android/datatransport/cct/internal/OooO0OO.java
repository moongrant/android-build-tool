package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends NetworkConnectionInfo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NetworkConnectionInfo.NetworkType f13079OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final NetworkConnectionInfo.MobileSubtype f13080OooO0O0;

    public OooO0OO(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.f13079OooO00o = networkType;
        this.f13080OooO0O0 = mobileSubtype;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @Nullable
    public final NetworkConnectionInfo.MobileSubtype OooO00o() {
        return this.f13080OooO0O0;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @Nullable
    public final NetworkConnectionInfo.NetworkType OooO0O0() {
        return this.f13079OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.f13079OooO00o;
        if (networkType != null ? networkType.equals(networkConnectionInfo.OooO0O0()) : networkConnectionInfo.OooO0O0() == null) {
            NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f13080OooO0O0;
            if (mobileSubtype == null) {
                if (networkConnectionInfo.OooO00o() == null) {
                    return true;
                }
            } else if (mobileSubtype.equals(networkConnectionInfo.OooO00o())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.f13079OooO00o;
        int iHashCode = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f13080OooO0O0;
        return iHashCode ^ (mobileSubtype != null ? mobileSubtype.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("NetworkConnectionInfo{networkType=");
        sbOooO0o0.append(this.f13079OooO00o);
        sbOooO0o0.append(", mobileSubtype=");
        sbOooO0o0.append(this.f13080OooO0O0);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
