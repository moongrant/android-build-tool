package p519o0o0O0O;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oo0o0Oo f42218OooO00o = new oo0o0Oo();

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ coil.request.OooO00o.C0072OooO00o f42220Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f42221Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(coil.request.OooO00o.C0072OooO00o c0072OooO00o, int i) {
            super(2);
            this.f42220Oooo0oO = c0072OooO00o;
            this.f42221Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oo0o0Oo.this.OooO00o(this.f42220Oooo0oO, ooo00o, this.f42221Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public final void OooO00o(@NotNull coil.request.OooO00o.C0072OooO00o c0072OooO00o, @Nullable oOO00O ooo00o, int i) {
        Intrinsics.checkNotNullParameter(c0072OooO00o, "<this>");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1479486513);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(c0072OooO00o, i));
    }
}
