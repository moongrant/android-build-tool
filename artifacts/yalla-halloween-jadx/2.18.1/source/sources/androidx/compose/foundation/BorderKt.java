package androidx.compose.foundation;

import Oooo0.Oooo0;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000000.o0000;
import org.jetbrains.annotations.NotNull;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.oOO00O;
import p145o00Oo0.o000OOo0;
import p145o00Oo0.o0O0ooO;
import p145o00Oo0.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class BorderKt {

    public static final class OooO00o extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ float f5534Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000OOo0 f5535Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0Oo0oo f5536Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(float f, o000OOo0 o000ooo1, o0Oo0oo o0oo0oo2) {
            super(3);
            this.f5534Oooo0o = f;
            this.f5535Oooo0oO = o000ooo1;
            this.f5536Oooo0oo = o0oo0oo2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
            o00OOOO0 composed = o00oooo1;
            oOO00O ooo00o2 = ooo00o;
            num.intValue();
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            ooo00o2.OooO0o0(-1498088849);
            ooo00o2.OooO0o0(-492369756);
            Object objOooO0o = ooo00o2.OooO0o();
            if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new o0000();
                ooo00o2.Oooo00o(objOooO0o);
            }
            ooo00o2.Oooo0o0();
            o00OOOO0 o00oooo0OooOOoo = composed.OooOOoo(DrawModifierKt.OooO0O0(new androidx.compose.foundation.OooO00o(this.f5534Oooo0o, this.f5535Oooo0oO, (o0000) objOooO0o, this.f5536Oooo0oo)));
            ooo00o2.Oooo0o0();
            return o00oooo0OooOOoo;
        }
    }

    @NotNull
    public static final o00OOOO0 OooO00o(@NotNull Oooo0 border, @NotNull o000OOo0 shape) {
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return OooO0OO(oooO00o, border.f520OooO00o, border.f521OooO0O0, shape);
    }

    @NotNull
    public static final o00OOOO0 OooO0O0(@NotNull o00OOOO0 border, float f, long j, @NotNull o000OOo0 shape) {
        Intrinsics.checkNotNullParameter(border, "$this$border");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return OooO0OO(border, f, new o0O0ooO(j), shape);
    }

    @NotNull
    public static final o00OOOO0 OooO0OO(@NotNull o00OOOO0 border, float f, @NotNull o0Oo0oo brush, @NotNull o000OOo0 shape) {
        Intrinsics.checkNotNullParameter(border, "$this$border");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        return o00OOO0O.OooO00o(border, o00oOoo.f6560OooO00o, new OooO00o(f, shape, brush));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Oooo0.OooOO0, T] */
    public static final Oooo0.OooOO0 OooO0Oo(o0000<Oooo0.OooOO0> o0000Var) {
        Oooo0.OooOO0 oooOO1 = o0000Var.f26623OooO00o;
        if (oooOO1 != null) {
            return oooOO1;
        }
        ?? oooOO2 = new Oooo0.OooOO0(null, null, null, null, 15, null);
        o0000Var.f26623OooO00o = oooOO2;
        return oooOO2;
    }

    public static final long OooO0o0(long j, float f) {
        return o00O0O.OooO0O0.OooO00o(Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0O.OooO00o.OooO0O0(j) - f), Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0O.OooO00o.OooO0OO(j) - f));
    }
}
