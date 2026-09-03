package Oooo000;

import com.google.android.gms.internal.cloudmessaging.zzb;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o implements zzb {
    public static o00OOOO0 OooO00o(o00OOOO0 o00oooo1, p023Oooo00O.o0000O0O animationSpec, int i) {
        if ((i & 1) != 0) {
            animationSpec = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 7);
        }
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Function1<androidx.compose.ui.platform.o00O000o, Unit> function1 = androidx.compose.ui.platform.o00oOoo.f6560OooO00o;
        return o00OOO0O.OooO00o(o00oooo1, androidx.compose.ui.platform.o00oOoo.f6560OooO00o, new o0ooOOo(null, animationSpec));
    }
}
