package androidx.compose.ui.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;
import o0O0O00.o000000O;
import o0O0O00.o000O;
import o0O0O00.o000O0O0;
import o0O0O00.o000OO0O;
import o0O0O00.o0OOO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o00O0OOO;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class SubcomposeLayoutKt {

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f6118Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f6119Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<o000O, o0000O0O.OooO0O0, o000000O> f6120Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f6121Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(o00OOOO0 o00oooo1, Function2<? super o000O, ? super o0000O0O.OooO0O0, ? extends o000000O> function2, int i, int i2) {
            super(2);
            this.f6119Oooo0o = o00oooo1;
            this.f6120Oooo0oO = function2;
            this.f6121Oooo0oo = i;
            this.f6118Oooo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            SubcomposeLayoutKt.OooO00o(this.f6119Oooo0o, this.f6120Oooo0oO, ooo00o, this.f6121Oooo0oo | 1, this.f6118Oooo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O0O0 f6122Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o000O0O0 o000o0o1) {
            super(0);
            this.f6122Oooo0o = o000o0o1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.LinkedHashMap, java.util.Map<androidx.compose.ui.node.LayoutNode, o0O0O00.o0OOO0o$OooO00o>] */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OOO0o o0ooo0oOooO00o = this.f6122Oooo0o.OooO00o();
            Iterator it = o0ooo0oOooO00o.f35305OooO0o0.entrySet().iterator();
            while (it.hasNext()) {
                ((o0OOO0o.OooO00o) ((Map.Entry) it.next()).getValue()).f35314OooO0Oo = true;
            }
            LayoutNode layoutNode = o0ooo0oOooO00o.f35300OooO00o;
            if (!layoutNode.f6161o000OOo) {
                layoutNode.OoooOO0(false);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<p100o000oOoO.o00OOOO0, o0o0Oo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<o000O0O0> f6123Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(oO0Oo<o000O0O0> oo0oo) {
            super(1);
            this.f6123Oooo0o = oo0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0o0Oo invoke(p100o000oOoO.o00OOOO0 o00oooo1) {
            p100o000oOoO.o00OOOO0 DisposableEffect = o00oooo1;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o000OO0O(this.f6123Oooo0o);
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f6124Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O0O0 f6125Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f6126Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function2<o000O, o0000O0O.OooO0O0, o000000O> f6127Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f6128OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(o000O0O0 o000o0o1, o00OOOO0 o00oooo1, Function2<? super o000O, ? super o0000O0O.OooO0O0, ? extends o000000O> function2, int i, int i2) {
            super(2);
            this.f6125Oooo0o = o000o0o1;
            this.f6126Oooo0oO = o00oooo1;
            this.f6127Oooo0oo = function2;
            this.f6124Oooo = i;
            this.f6128OoooO00 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            SubcomposeLayoutKt.OooO0O0(this.f6125Oooo0o, this.f6126Oooo0oO, this.f6127Oooo0oo, ooo00o, this.f6124Oooo | 1, this.f6128OoooO00);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable o00OOOO0 o00oooo1, @NotNull Function2<? super o000O, ? super o0000O0O.OooO0O0, ? extends o000000O> measurePolicy, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (ooo00oOooOOo.Oooo0oo(o00oooo1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= ooo00oOooOOo.Oooo0oo(measurePolicy) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            if (i4 != 0) {
                o00oooo1 = o00OOOO0.OooO00o.f4198Oooo0o;
            }
            ooo00oOooOOo.OooO0o0(-492369756);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new o000O0O0();
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            int i5 = i3 << 3;
            OooO0O0((o000O0O0) objOooO0o, o00oooo1, measurePolicy, ooo00oOooOOo, (i5 & 112) | 8 | (i5 & 896), 0);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(o00oooo1, measurePolicy, i, i2));
    }

    @Composable
    @UiComposable
    public static final void OooO0O0(@NotNull o000O0O0 state, @Nullable o00OOOO0 o00oooo1, @NotNull Function2<? super o000O, ? super o0000O0O.OooO0O0, ? extends o000000O> measurePolicy, @Nullable oOO00O ooo00o, int i, int i2) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        oOO00O composer = ooo00o.OooOOo(-511989831);
        if ((i2 & 2) != 0) {
            o00oooo1 = o00OOOO0.OooO00o.f4198Oooo0o;
        }
        o00OOOO0 o00oooo2 = o00oooo1;
        o00O0OOO o00o0oooOooO0O0 = o00O00O.OooO0O0(composer);
        o00OOOO0 o00oooo0OooO0OO = o00OOO0O.OooO0OO(composer, o00oooo2);
        OooO oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
        LayoutNode.OooOO0 oooOO1 = LayoutNode.f6131o000000o;
        final Function0<LayoutNode> function0 = LayoutNode.f6133o00000O0;
        composer.OooO0o0(1886828752);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOoO();
        if (composer.OooOOO0()) {
            composer.OooOoO0(new Function0<LayoutNode>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$$inlined$ComposeNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final LayoutNode invoke() {
                    return function0.invoke();
                }
            });
        } else {
            composer.Oooo00O();
        }
        Intrinsics.checkNotNullParameter(composer, "composer");
        oO00000o.OooO0O0(composer, state, state.f35277OooO0OO);
        oO00000o.OooO0O0(composer, o00o0oooOooO0O0, state.f35278OooO0Oo);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        oO00000o.OooO0O0(composer, o00oooo0OooO0OO, o000000.OooO00o.C0279OooO00o.f26578OooO0OO);
        oO00000o.OooO0O0(composer, measurePolicy, state.f35279OooO0o0);
        oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
        oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
        oO00000o.OooO0O0(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO);
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.OooO0o0(-607848778);
        if (!composer.OooOo0()) {
            o00Oo00.OooO0oO(new OooO0O0(state), composer);
        }
        composer.Oooo0o0();
        oO0Oo oo0ooOooO0o = o0OOO00.OooO0o(state, composer);
        Unit unit = Unit.INSTANCE;
        composer.OooO0o0(1157296644);
        boolean zOooo0oo = composer.Oooo0oo(oo0ooOooO0o);
        Object objOooO0o = composer.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = new OooO0OO(oo0ooOooO0o);
            composer.Oooo00o(objOooO0o);
        }
        composer.Oooo0o0();
        o00Oo00.OooO0O0(unit, (Function1) objOooO0o, composer);
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0o(state, o00oooo2, measurePolicy, i, i2));
    }
}
