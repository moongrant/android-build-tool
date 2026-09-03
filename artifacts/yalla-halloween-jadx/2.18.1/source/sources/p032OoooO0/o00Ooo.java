package p032OoooO0;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p034OoooO0O.o0000oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo {

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0000oo f3229Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f3230Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f3231Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(o0000oo o0000ooVar, Function2<? super oOO00O, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f3229Oooo0o = o0000ooVar;
            this.f3230Oooo0oO = function2;
            this.f3231Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00Ooo.OooO00o(this.f3229Oooo0o, this.f3230Oooo0oO, ooo00o, this.f3231Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void OooO00o(@NotNull o0000oo manager, @NotNull Function2<? super oOO00O, ? super Integer, Unit> content, @Nullable oOO00O ooo00o, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(content, "content");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1985516685);
        if ((i & 112) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(content) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            content.invoke(ooo00oOooOOo, Integer.valueOf((i2 >> 3) & 14));
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(manager, content, i));
    }
}
