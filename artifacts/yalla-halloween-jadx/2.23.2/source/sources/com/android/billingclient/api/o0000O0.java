package com.android.billingclient.api;

import VideoHandle.CmdList;
import java.util.LinkedHashMap;
import p460o0Ooo0o.oo0O;
import p460o0Ooo0o.oo0o0O0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static String[] f12817OooO00o;

    public static final void OooO00o(CmdList cmdList, LinkedHashMap linkedHashMap) {
        String string;
        String string2;
        Object obj = linkedHashMap.get("video bitrate");
        int i = 0;
        int i2 = (obj == null || (string2 = obj.toString()) == null) ? 0 : Integer.parseInt(string2);
        Object obj2 = linkedHashMap.get("video fps");
        if (obj2 != null && (string = obj2.toString()) != null) {
            i = Integer.parseInt(string);
        }
        oo0o0O0.OooO00o("_VideoCompressUtil", "appendBitrate original videoBitrate: " + i2 + " ,videoFps " + i);
        if (i2 > 0) {
            if (i2 > 4000000) {
                cmdList.OooO0O0("-b:v 4000000");
            } else {
                cmdList.OooO0O0("-b:v " + i2);
            }
        }
        if (i > 0) {
            if (i > 30) {
                cmdList.OooO0O0("-r 30");
                return;
            }
            cmdList.OooO0O0("-r " + i);
        }
    }

    public static final void OooO0O0(CmdList cmdList, LinkedHashMap linkedHashMap) {
        String string;
        Object obj = linkedHashMap.get("video rotation");
        int i = (obj == null || (string = obj.toString()) == null) ? -1 : Integer.parseInt(string);
        oo0o0O0.OooO00o("_VideoCompressUtil", "appendBitrate original width: 0 height: 0 , videoRotation: " + i + "  supportMediaCodecFormat:" + oo0O.f47808OooO0O0);
        String str = oo0O.f47808OooO0O0;
        if (str == null || str.length() == 0) {
            return;
        }
        cmdList.OooO0O0("-c:v h264_mediacodec -vf format=" + oo0O.f47808OooO0O0);
    }

    public static final void OooO0OO(String str) {
        oo0o0O0.OooO00o("_VideoCompressUtil", str);
    }
}
