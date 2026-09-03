package o0O0O00;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 {
    @NotNull
    public static final o00O0O.OooOO0O OooO00o(@NotNull Oooo000 oooo000) {
        Intrinsics.checkNotNullParameter(oooo000, "<this>");
        o000000.oo000o oo000oVar = (o000000.oo000o) oooo000;
        Oooo000 oooo000Oooo0oo = oo000oVar.Oooo0oo();
        if (oooo000Oooo0oo != null) {
            return ((o000000.oo000o) oooo000Oooo0oo).Oooo(oo000oVar, true);
        }
        long j = oo000oVar.f35267Oooo0oo;
        return new o00O0O.OooOO0O(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (int) (j >> 32), o0000O0O.o000oOoO.OooO0O0(j));
    }

    @NotNull
    public static final o00O0O.OooOO0O OooO0O0(@NotNull Oooo000 oooo000) {
        Intrinsics.checkNotNullParameter(oooo000, "<this>");
        return OooO0Oo(oooo000).Oooo(oooo000, true);
    }

    @NotNull
    public static final o00O0O.OooOO0O OooO0OO(@NotNull Oooo000 oooo000) {
        Intrinsics.checkNotNullParameter(oooo000, "<this>");
        Oooo000 oooo000OooO0Oo = OooO0Oo(oooo000);
        o00O0O.OooOO0O oooOO0OOooO0O0 = OooO0O0(oooo000);
        long jOooOOoo = oooo000OooO0Oo.OooOOoo(o00O0O.OooOO0.OooO00o(oooOO0OOooO0O0.f30404OooO00o, oooOO0OOooO0O0.f30405OooO0O0));
        long jOooOOoo2 = oooo000OooO0Oo.OooOOoo(o00O0O.OooOO0.OooO00o(oooOO0OOooO0O0.f30406OooO0OO, oooOO0OOooO0O0.f30405OooO0O0));
        long jOooOOoo3 = oooo000OooO0Oo.OooOOoo(o00O0O.OooOO0.OooO00o(oooOO0OOooO0O0.f30406OooO0OO, oooOO0OOooO0O0.f30407OooO0Oo));
        long jOooOOoo4 = oooo000OooO0Oo.OooOOoo(o00O0O.OooOO0.OooO00o(oooOO0OOooO0O0.f30404OooO00o, oooOO0OOooO0O0.f30407OooO0Oo));
        return new o00O0O.OooOO0O(ComparisonsKt.minOf(o00O0O.OooO.OooO0OO(jOooOOoo), o00O0O.OooO.OooO0OO(jOooOOoo2), o00O0O.OooO.OooO0OO(jOooOOoo4), o00O0O.OooO.OooO0OO(jOooOOoo3)), ComparisonsKt.minOf(o00O0O.OooO.OooO0Oo(jOooOOoo), o00O0O.OooO.OooO0Oo(jOooOOoo2), o00O0O.OooO.OooO0Oo(jOooOOoo4), o00O0O.OooO.OooO0Oo(jOooOOoo3)), ComparisonsKt.maxOf(o00O0O.OooO.OooO0OO(jOooOOoo), o00O0O.OooO.OooO0OO(jOooOOoo2), o00O0O.OooO.OooO0OO(jOooOOoo4), o00O0O.OooO.OooO0OO(jOooOOoo3)), ComparisonsKt.maxOf(o00O0O.OooO.OooO0Oo(jOooOOoo), o00O0O.OooO.OooO0Oo(jOooOOoo2), o00O0O.OooO.OooO0Oo(jOooOOoo4), o00O0O.OooO.OooO0Oo(jOooOOoo3)));
    }

    @NotNull
    public static final Oooo000 OooO0Oo(@NotNull Oooo000 oooo000) {
        Oooo000 oooo001;
        Intrinsics.checkNotNullParameter(oooo000, "<this>");
        Oooo000 oooo000Oooo0oo = oooo000.Oooo0oo();
        while (true) {
            Oooo000 oooo002 = oooo000Oooo0oo;
            oooo001 = oooo000;
            oooo000 = oooo002;
            if (oooo000 == null) {
                break;
            }
            oooo000Oooo0oo = oooo000.Oooo0oo();
        }
        o000000.oo000o oo000oVar = oooo001 instanceof o000000.oo000o ? (o000000.oo000o) oooo001 : null;
        if (oo000oVar == null) {
            return oooo001;
        }
        o000000.oo000o oo000oVar2 = oo000oVar.f26701OoooO0;
        while (true) {
            o000000.oo000o oo000oVar3 = oo000oVar2;
            o000000.oo000o oo000oVar4 = oo000oVar;
            oo000oVar = oo000oVar3;
            if (oo000oVar == null) {
                return oo000oVar4;
            }
            oo000oVar2 = oo000oVar.f26701OoooO0;
        }
    }

    public static final long OooO0o(@NotNull Oooo000 oooo000) {
        Intrinsics.checkNotNullParameter(oooo000, "<this>");
        o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
        return oooo000.OooOOoo(o00O0O.OooO.f30392OooO0OO);
    }

    public static final long OooO0o0(@NotNull Oooo000 oooo000) {
        Intrinsics.checkNotNullParameter(oooo000, "<this>");
        o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
        return oooo000.OoooO00(o00O0O.OooO.f30392OooO0OO);
    }
}
