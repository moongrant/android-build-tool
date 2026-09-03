package com.amazonaws;

import OooO0o.OooO0OO;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class RequestClientOptions {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<Marker, String> f10296OooO00o = new EnumMap(Marker.class);

    public enum Marker {
        USER_AGENT
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.EnumMap, java.util.Map<com.amazonaws.RequestClientOptions$Marker, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.EnumMap, java.util.Map<com.amazonaws.RequestClientOptions$Marker, java.lang.String>] */
    public final void OooO00o(String str) {
        ?? r0 = this.f10296OooO00o;
        Marker marker = Marker.USER_AGENT;
        String strOooO00o = (String) r0.get(marker);
        if (strOooO00o == null) {
            strOooO00o = "";
        }
        if (!strOooO00o.contains(str)) {
            strOooO00o = OooO0OO.OooO00o(strOooO00o, ZegoConstants.ZegoVideoDataAuxPublishingStream, str);
        }
        this.f10296OooO00o.put(marker, strOooO00o);
    }
}
