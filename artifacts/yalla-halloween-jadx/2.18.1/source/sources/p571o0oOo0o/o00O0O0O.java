package p571o0oOo0o;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0OOO0;
import p033OoooO00.o00O0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p145o00Oo0.o000O0Oo;
import p442o0OoOo0.Oooo000;
import p507o0o00oOO.o0000O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00O0O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O0O0O f45564OooO00o = new o00O0O0O();

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f45565Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f45567Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ float f45568Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f45569OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f45570OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, float f, o00OOOO0 o00oooo1, int i, int i2) {
            super(2);
            this.f45567Oooo0oO = z;
            this.f45568Oooo0oo = f;
            this.f45565Oooo = o00oooo1;
            this.f45570OoooO00 = i;
            this.f45569OoooO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00O0O0O.this.OooO00o(this.f45567Oooo0oO, this.f45568Oooo0oo, this.f45565Oooo, ooo00o, this.f45570OoooO00 | 1, this.f45569OoooO0);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(boolean z, float f, @NotNull o00OOOO0 other, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(other, "modifier");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(964400676);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (ooo00oOooOOo.OooO0OO(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= ooo00oOooOOo.OooO0oO(f) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= ooo00oOooOOo.Oooo0oo(other) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            if (i4 != 0) {
                f = 8;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            if (z) {
                Intrinsics.checkNotNullParameter(other, "other");
                o00OOOO0 o00oooo0OooO00o = Oooo000.OooO00o(SizeKt.OooOO0(other, f), o00O0O.f3431OooO00o);
                o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                o0O0OOO0.OooO00o(BackgroundKt.OooO0O0(o00oooo0OooO00o, o0000O0.f41718OooOoo0, o000O0Oo.f32099OooO00o), ooo00oOooOOo, 0);
            }
        }
        float f2 = f;
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(z, f2, other, i, i2));
    }
}
