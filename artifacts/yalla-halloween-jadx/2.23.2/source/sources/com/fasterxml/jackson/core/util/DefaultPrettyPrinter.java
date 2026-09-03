package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.OooO0OO;
import com.fasterxml.jackson.core.io.SerializedString;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultPrettyPrinter implements OooO0OO, Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final SerializedString f13792OooO0Oo = new SerializedString(ZegoConstants.ZegoVideoDataAuxPublishingStream);

    public static class FixedSpaceIndenter extends NopIndenter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final /* synthetic */ int f13793OooO0Oo = 0;

        static {
            new FixedSpaceIndenter();
        }
    }

    public static class NopIndenter implements Serializable {
        static {
            new NopIndenter();
        }
    }

    public DefaultPrettyPrinter() {
        int i = FixedSpaceIndenter.f13793OooO0Oo;
        int i2 = DefaultIndenter.f13790OooO0o0;
        char c = OooO0OO.f13786OooO00o.f13794OooO0Oo;
    }
}
