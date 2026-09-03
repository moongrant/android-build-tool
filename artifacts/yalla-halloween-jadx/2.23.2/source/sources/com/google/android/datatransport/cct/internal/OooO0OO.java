package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends NetworkConnectionInfo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NetworkConnectionInfo.NetworkType f13918OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final NetworkConnectionInfo.MobileSubtype f13919OooO0O0;

    public OooO0OO(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.f13918OooO00o = networkType;
        this.f13919OooO0O0 = mobileSubtype;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @Nullable
    public final NetworkConnectionInfo.MobileSubtype OooO00o() {
        return this.f13919OooO0O0;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @Nullable
    public final NetworkConnectionInfo.NetworkType OooO0O0() {
        return this.f13918OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.f13918OooO00o;
        if (networkType != null ? networkType.equals(networkConnectionInfo.OooO0O0()) : networkConnectionInfo.OooO0O0() == null) {
            NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f13919OooO0O0;
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
        NetworkConnectionInfo.NetworkType networkType = this.f13918OooO00o;
        int iHashCode = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f13919OooO0O0;
        return (mobileSubtype != null ? mobileSubtype.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f13918OooO00o + ", mobileSubtype=" + this.f13919OooO0O0 + "}";
    }
}
