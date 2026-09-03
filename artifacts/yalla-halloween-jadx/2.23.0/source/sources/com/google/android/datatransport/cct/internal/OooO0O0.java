package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends ClientInfo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ClientInfo.ClientType f10868OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final p189o00o0O0.OooO0O0 f10869OooO0O0;

    public OooO0O0(ClientInfo.ClientType clientType, p189o00o0O0.OooO0O0 oooO0O0) {
        this.f10868OooO00o = clientType;
        this.f10869OooO0O0 = oooO0O0;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @Nullable
    public final p189o00o0O0.OooO0O0 OooO00o() {
        return this.f10869OooO0O0;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @Nullable
    public final ClientInfo.ClientType OooO0O0() {
        return this.f10868OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f10868OooO00o;
        if (clientType != null ? clientType.equals(clientInfo.OooO0O0()) : clientInfo.OooO0O0() == null) {
            p189o00o0O0.OooO0O0 oooO0O0 = this.f10869OooO0O0;
            if (oooO0O0 == null) {
                if (clientInfo.OooO00o() == null) {
                    return true;
                }
            } else if (oooO0O0.equals(clientInfo.OooO00o())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ClientInfo.ClientType clientType = this.f10868OooO00o;
        int iHashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        p189o00o0O0.OooO0O0 oooO0O0 = this.f10869OooO0O0;
        return (oooO0O0 != null ? oooO0O0.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f10868OooO00o + ", androidClientInfo=" + this.f10869OooO0O0 + "}";
    }
}
