package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import p285o0O0O0o.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends ClientInfo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ClientInfo.ClientType f13077OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO f13078OooO0O0;

    public OooO0O0(ClientInfo.ClientType clientType, OooOOO oooOOO) {
        this.f13077OooO00o = clientType;
        this.f13078OooO0O0 = oooOOO;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @Nullable
    public final OooOOO OooO00o() {
        return this.f13078OooO0O0;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @Nullable
    public final ClientInfo.ClientType OooO0O0() {
        return this.f13077OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f13077OooO00o;
        if (clientType != null ? clientType.equals(clientInfo.OooO0O0()) : clientInfo.OooO0O0() == null) {
            OooOOO oooOOO = this.f13078OooO0O0;
            if (oooOOO == null) {
                if (clientInfo.OooO00o() == null) {
                    return true;
                }
            } else if (oooOOO.equals(clientInfo.OooO00o())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ClientInfo.ClientType clientType = this.f13077OooO00o;
        int iHashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        OooOOO oooOOO = this.f13078OooO0O0;
        return iHashCode ^ (oooOOO != null ? oooOOO.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ClientInfo{clientType=");
        sbOooO0o0.append(this.f13077OooO00o);
        sbOooO0o0.append(", androidClientInfo=");
        sbOooO0o0.append(this.f13078OooO0O0);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
