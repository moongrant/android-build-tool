package com.amazonaws;

import com.zego.zegoavkit2.ZegoConstants;
import java.util.EnumMap;
import p031OoooO0.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class RequestClientOptions {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EnumMap f12076OooO00o = new EnumMap(Marker.class);

    public enum Marker {
        USER_AGENT
    }

    public final void OooO00o(String str) {
        EnumMap enumMap = this.f12076OooO00o;
        Marker marker = Marker.USER_AGENT;
        String strOooO0O0 = (String) enumMap.get(marker);
        if (strOooO0O0 == null) {
            strOooO0O0 = "";
        }
        if (!strOooO0O0.contains(str)) {
            strOooO0O0 = o0OoOo0.OooO0O0(strOooO0O0, ZegoConstants.ZegoVideoDataAuxPublishingStream, str);
        }
        enumMap.put(marker, strOooO0O0);
    }
}
