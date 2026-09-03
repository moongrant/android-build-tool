package com.amazonaws;

import com.zego.zegoavkit2.ZegoConstants;
import java.util.EnumMap;
import p031OoooO0.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class RequestClientOptions {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EnumMap f8986OooO00o = new EnumMap(Marker.class);

    public enum Marker {
        USER_AGENT
    }

    public final void OooO00o(String str) {
        EnumMap enumMap = this.f8986OooO00o;
        Marker marker = Marker.USER_AGENT;
        String strOooO00o = (String) enumMap.get(marker);
        if (strOooO00o == null) {
            strOooO00o = "";
        }
        if (!strOooO00o.contains(str)) {
            strOooO00o = o0OoOo0.OooO00o(strOooO00o, ZegoConstants.ZegoVideoDataAuxPublishingStream, str);
        }
        enumMap.put(marker, strOooO00o);
    }
}
