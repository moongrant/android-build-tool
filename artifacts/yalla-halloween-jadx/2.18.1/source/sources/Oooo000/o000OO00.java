package Oooo000;

import androidx.compose.runtime.Composable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o00OO0O0;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final p023Oooo00O.o00O000o<p145o00Oo0.o00000O0> f880OooO00o = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 7);

    @Composable
    @NotNull
    public static final oO0Oo OooO00o(long j, @Nullable p023Oooo00O.oo000o oo000oVar, @Nullable p100o000oOoO.oOO00O ooo00o, int i, int i2) {
        ooo00o.OooO0o0(-1942442407);
        if ((i2 & 2) != 0) {
            oo000oVar = f880OooO00o;
        }
        p023Oooo00O.oo000o oo000oVar2 = oo000oVar;
        p167o00Ooo.OooO oooOOooO0oO = p145o00Oo0.o00000O0.OooO0oO(j);
        ooo00o.OooO0o0(1157296644);
        boolean zOooo0oo = ooo00o.Oooo0oo(oooOOooO0oO);
        Object objOooO0o = ooo00o.OooO0o();
        if (zOooo0oo || objOooO0o == o000oOoO.oOO00O.OooO00o.f29689OooO0O0) {
            o00Oo0.o00000O0.OooO00o oooO00o = p145o00Oo0.o00000O0.f32063OooO0O0;
            Function1<p167o00Ooo.OooO, o00OO0O0<p145o00Oo0.o00000O0, p023Oooo00O.oo0o0Oo>> function1 = o0O0O00.f979OooO00o;
            Intrinsics.checkNotNullParameter(oooO00o, "<this>");
            objOooO0o = (o00OO0O0) o0O0O00.f979OooO00o.invoke(p145o00Oo0.o00000O0.OooO0oO(j));
            ooo00o.Oooo00o(objOooO0o);
        }
        ooo00o.Oooo0o0();
        oO0Oo oo0ooOooO0OO = p023Oooo00O.o0OoOo0.OooO0OO(new p145o00Oo0.o00000O0(j), (o00OO0O0) objOooO0o, oo000oVar2, null, null, ooo00o, (i & 14) | 576 | (57344 & (i << 6)), 8);
        ooo00o.Oooo0o0();
        return oo0ooOooO0OO;
    }
}
