package com.android.billingclient.api;

import VideoHandle.CmdList;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.LinkedHashMap;
import p468o0OoooO0.o0OO0O0;
import p468o0OoooO0.o0OOOO00;
import p525o0o0OOO.o00OO0OO;
import p525o0o0OOO.o0OoO00O;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0000O {
    public static final void OooO00o(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(731605787);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(731605787, i, -1, "com.yalla.yalla.ui.screen.main.NestScrollScreenContent (NestScrollScreen.kt:37)");
            }
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m1156Scaffold27mzLpw(null, ScaffoldKt.rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3), o00OO0OO.f53531OooO00o, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, o00OO0OO.f53534OooO0Oo, composer2, 384, 12582912, 131065);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OoO00O(i));
    }

    public static final void OooO0O0(CmdList cmdList, LinkedHashMap linkedHashMap) {
        String string;
        String string2;
        Object obj = linkedHashMap.get("video bitrate");
        int i = 0;
        int i2 = (obj == null || (string2 = obj.toString()) == null) ? 0 : Integer.parseInt(string2);
        Object obj2 = linkedHashMap.get("video fps");
        if (obj2 != null && (string = obj2.toString()) != null) {
            i = Integer.parseInt(string);
        }
        o0OO0O0.OooO00o("_VideoCompressUtil", "appendBitrate original videoBitrate: " + i2 + " ,videoFps " + i);
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

    public static final void OooO0OO(CmdList cmdList, LinkedHashMap linkedHashMap) {
        String string;
        Object obj = linkedHashMap.get("video rotation");
        int i = (obj == null || (string = obj.toString()) == null) ? -1 : Integer.parseInt(string);
        o0OO0O0.OooO00o("_VideoCompressUtil", "appendBitrate original width: 0 height: 0 , videoRotation: " + i + "  supportMediaCodecFormat:" + o0OOOO00.f46931OooO0O0);
        String str = o0OOOO00.f46931OooO0O0;
        if (str == null || str.length() == 0) {
            return;
        }
        cmdList.OooO0O0("-c:v h264_mediacodec -vf format=" + o0OOOO00.f46931OooO0O0);
    }

    public static final void OooO0Oo(String str) {
        o0OO0O0.OooO00o("_VideoCompressUtil", str);
    }
}
