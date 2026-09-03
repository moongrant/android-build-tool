package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import p236o00oOoo0.o000O00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends ClientInfo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ClientInfo.ClientType f13916OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O00 f13917OooO0O0;

    public OooO0O0(ClientInfo.ClientType clientType, o000O00 o000o01) {
        this.f13916OooO00o = clientType;
        this.f13917OooO0O0 = o000o01;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @Nullable
    public final o000O00 OooO00o() {
        return this.f13917OooO0O0;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @Nullable
    public final ClientInfo.ClientType OooO0O0() {
        return this.f13916OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f13916OooO00o;
        if (clientType != null ? clientType.equals(clientInfo.OooO0O0()) : clientInfo.OooO0O0() == null) {
            o000O00 o000o01 = this.f13917OooO0O0;
            if (o000o01 == null) {
                if (clientInfo.OooO00o() == null) {
                    return true;
                }
            } else if (o000o01.equals(clientInfo.OooO00o())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ClientInfo.ClientType clientType = this.f13916OooO00o;
        int iHashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        o000O00 o000o01 = this.f13917OooO0O0;
        return (o000o01 != null ? o000o01.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f13916OooO00o + ", androidClientInfo=" + this.f13917OooO0O0 + "}";
    }
}
