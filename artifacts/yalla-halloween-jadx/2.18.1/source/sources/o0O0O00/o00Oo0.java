package o0O0O00;

import androidx.compose.runtime.Composable;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.oO00000;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 {

    public static final class OooO00o extends Lambda implements Function1<LayoutNode, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f35289Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutNode layoutNode) {
            LayoutNode init = layoutNode;
            Intrinsics.checkNotNullParameter(init, "$this$init");
            init.f6164o00Oo0 = true;
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f35290Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f35291Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f35292Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o000000 f35293Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f35294OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(o00OOOO0 o00oooo1, Function2<? super oOO00O, ? super Integer, Unit> function2, o000000 o000000Var, int i, int i2) {
            super(2);
            this.f35291Oooo0o = o00oooo1;
            this.f35292Oooo0oO = function2;
            this.f35293Oooo0oo = o000000Var;
            this.f35290Oooo = i;
            this.f35294OoooO00 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00Oo0.OooO00o(this.f35291Oooo0o, this.f35292Oooo0oO, this.f35293Oooo0oo, ooo00o, this.f35290Oooo | 1, this.f35294OoooO00);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f35295Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o00OOOO0 o00oooo1) {
            super(3);
            this.f35295Oooo0o = o00oooo1;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o0OO00o0<o000000.OooO00o> o0oo00o1, oOO00O ooo00o, Integer num) {
            oOO00O composer = o0oo00o1.f29599OooO00o;
            num.intValue();
            Intrinsics.checkNotNullParameter(composer, "$this$null");
            o00OOOO0 o00oooo0OooO0OO = o00OOO0O.OooO0OO(ooo00o, this.f35295Oooo0o);
            composer.OooO0o0(509942095);
            Intrinsics.checkNotNullParameter(composer, "composer");
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            oO00000o.OooO0O0(composer, o00oooo0OooO0OO, o000000.OooO00o.C0279OooO00o.f26578OooO0OO);
            composer.Oooo0o0();
            return Unit.INSTANCE;
        }
    }

    @Deprecated(message = "This API is unsafe for UI performance at scale - using it incorrectly will lead to exponential performance issues. This API should be avoided whenever possible.")
    @Composable
    @UiComposable
    public static final void OooO00o(@Nullable o00OOOO0 o00oooo1, @NotNull Function2<? super oOO00O, ? super Integer, Unit> content, @NotNull o000000 measurePolicy, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        oOO00O composer = ooo00o.OooOOo(1949933075);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composer.Oooo0oo(o00oooo1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composer.Oooo0oo(content) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composer.Oooo0oo(measurePolicy) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            if (i4 != 0) {
                o00oooo1 = o00OOOO0.OooO00o.f4198Oooo0o;
            }
            o00OOOO0 o00oooo0OooO0OO = o00OOO0O.OooO0OO(composer, o00oooo1);
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(androidx.compose.ui.platform.o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(androidx.compose.ui.platform.o000.f6364OooOOOO);
            LayoutNode.OooOO0 oooOO1 = LayoutNode.f6131o000000o;
            Function0<LayoutNode> function0 = LayoutNode.f6133o00000O0;
            int i5 = ((i3 << 3) & 896) | 6;
            composer.OooO0o0(-692256719);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            oO00000o.OooO0O0(composer, o00oooo0OooO0OO, o000000.OooO00o.C0279OooO00o.f26578OooO0OO);
            oO00000o.OooO0O0(composer, measurePolicy, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            oO00000o.OooO0O0(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO);
            OooO00o block = OooO00o.f35289Oooo0o;
            Intrinsics.checkNotNullParameter(block, "block");
            if (composer.OooOOO0()) {
                composer.OooOoOO(Unit.INSTANCE, new oO00000(block));
            }
            composer.OooO0oo();
            content.invoke(composer, Integer.valueOf((i5 >> 6) & 14));
            composer.Oooo0o();
            composer.Oooo0o0();
        }
        o00OOOO0 o00oooo2 = o00oooo1;
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(o00oooo2, content, measurePolicy, i, i2));
    }

    @PublishedApi
    @NotNull
    public static final Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> OooO0O0(@NotNull o00OOOO0 modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        return o00O0000.OooO0O0(-1586257396, true, new OooO0OO(modifier));
    }
}
