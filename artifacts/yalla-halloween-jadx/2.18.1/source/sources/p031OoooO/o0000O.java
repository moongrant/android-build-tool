package p031OoooO;

import android.content.Context;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static Context f2657OooO00o;

    public static final Float OooO00o(Map map, Object obj) {
        Object next;
        Iterator it = map.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((Map.Entry) next).getValue(), obj));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    public static float OooO0O0(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    public static float OooO0OO(float f, float f2, float f3, float f4) {
        float fOooO0O0 = OooO0O0(f, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        float fOooO0O1 = OooO0O0(f, f2, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        float fOooO0O2 = OooO0O0(f, f2, f3, f4);
        float fOooO0O3 = OooO0O0(f, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f4);
        if (fOooO0O0 > fOooO0O1 && fOooO0O0 > fOooO0O2 && fOooO0O0 > fOooO0O3) {
            return fOooO0O0;
        }
        if (fOooO0O1 <= fOooO0O2 || fOooO0O1 <= fOooO0O3) {
            return fOooO0O2 > fOooO0O3 ? fOooO0O2 : fOooO0O3;
        }
        return fOooO0O1;
    }

    public static float OooO0Oo(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }
}
