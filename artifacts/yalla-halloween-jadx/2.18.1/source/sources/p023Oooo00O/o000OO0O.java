package p023Oooo00O;

import androidx.compose.runtime.Composable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO0O {
    @Composable
    @NotNull
    public static final oO0Oo OooO00o(@NotNull o000Oo0 o000oo1, float f, @NotNull o000O0o animationSpec, @Nullable oOO00O ooo00o) {
        Intrinsics.checkNotNullParameter(o000oo1, "<this>");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        ooo00o.OooO0o0(469472752);
        oO0Oo oo0ooOooO0O0 = OooO0O0(o000oo1, Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE), Float.valueOf(f), oo0O.OooO0O0(FloatCompanionObject.INSTANCE), animationSpec, ooo00o);
        ooo00o.Oooo0o0();
        return oo0ooOooO0O0;
    }

    @Composable
    @NotNull
    public static final oO0Oo OooO0O0(@NotNull o000Oo0 o000oo1, Object obj, Object obj2, @NotNull o00OO0O0 typeConverter, @NotNull o000O0o animationSpec, @Nullable oOO00O ooo00o) {
        Intrinsics.checkNotNullParameter(o000oo1, "<this>");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        ooo00o.OooO0o0(-1695411770);
        ooo00o.OooO0o0(-492369756);
        Object objOooO0o = ooo00o.OooO0o();
        if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = new o000Oo0.OooO00o(o000oo1, obj, obj2, typeConverter, animationSpec);
            ooo00o.Oooo00o(objOooO0o);
        }
        ooo00o.Oooo0o0();
        o000Oo0.OooO00o oooO00o = (o000Oo0.OooO00o) objOooO0o;
        o00Oo00.OooO0oO(new o000O00O(obj, oooO00o, obj2, animationSpec), ooo00o);
        o00Oo00.OooO0O0(oooO00o, new o000O0Oo(o000oo1, oooO00o), ooo00o);
        ooo00o.Oooo0o0();
        return oooO00o;
    }

    @Composable
    @NotNull
    public static final o000Oo0 OooO0OO(@Nullable oOO00O ooo00o) {
        Object objOooO0O0 = o000O00.OooO0O0(ooo00o, -840193660, -492369756);
        if (objOooO0O0 == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0O0 = new o000Oo0();
            ooo00o.Oooo00o(objOooO0O0);
        }
        ooo00o.Oooo0o0();
        o000Oo0 o000oo1 = (o000Oo0) objOooO0O0;
        o000oo1.OooO00o(ooo00o, 8);
        ooo00o.Oooo0o0();
        return o000oo1;
    }
}
