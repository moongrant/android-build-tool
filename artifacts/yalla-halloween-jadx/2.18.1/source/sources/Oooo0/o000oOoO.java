package Oooo0;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.draw.DrawModifierKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0OOO0;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO {

    public static final class OooO00o extends Lambda implements Function2<p100o000oOoO.oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ p048OoooooO.o00OOOO0 f606Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<p191o00o0O.o0Oo0oo, Unit> f607Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f608Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(p048OoooooO.o00OOOO0 o00oooo1, Function1<? super p191o00o0O.o0Oo0oo, Unit> function1, int i) {
            super(2);
            this.f606Oooo0o = o00oooo1;
            this.f607Oooo0oO = function1;
            this.f608Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(p100o000oOoO.oOO00O ooo00o, Integer num) {
            num.intValue();
            o000oOoO.OooO00o(this.f606Oooo0o, this.f607Oooo0oO, ooo00o, this.f608Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull p048OoooooO.o00OOOO0 modifier, @NotNull Function1<? super p191o00o0O.o0Oo0oo, Unit> onDraw, @Nullable p100o000oOoO.oOO00O ooo00o, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onDraw, "onDraw");
        p100o000oOoO.oOO00O ooo00oOooOOo = ooo00o.OooOOo(-932836462);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(onDraw) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            o0O0OOO0.OooO00o(DrawModifierKt.OooO00o(modifier, onDraw), ooo00oOooOOo, 0);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(modifier, onDraw, i));
    }
}
