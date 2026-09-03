package o0000OO0;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Objects;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00;
import p043OooooO0.o000OOo0;
import p043OooooO0.o00O0000;
import p045OooooOo.o00O0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o00O0OOO;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    public static final class OooO extends Lambda implements Function0<UUID> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f27427Oooo0o = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    public static final class OooO00o extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00Ooo f27428Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00Ooo o00ooo2) {
            super(1);
            this.f27428Oooo0o = o00ooo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
            o00OOOO0 DisposableEffect = o00oooo1;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            this.f27428Oooo0o.show();
            return new o0000OO0.OooO0O0(this.f27428Oooo0o);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ LayoutDirection f27429Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00Ooo f27430Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f27431Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00O0O f27432Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00Ooo o00ooo2, Function0<Unit> function0, o00O0O o00o0o2, LayoutDirection layoutDirection) {
            super(0);
            this.f27430Oooo0o = o00ooo2;
            this.f27431Oooo0oO = function0;
            this.f27432Oooo0oo = o00o0o2;
            this.f27429Oooo = layoutDirection;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f27430Oooo0o.OooO0O0(this.f27431Oooo0oO, this.f27432Oooo0oo, this.f27429Oooo);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o0000OO0.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C0290OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f27433Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f27434Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O f27435Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f27436Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f27437OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0290OooO0OO(Function0<Unit> function0, o00O0O o00o0o2, Function2<? super oOO00O, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.f27434Oooo0o = function0;
            this.f27435Oooo0oO = o00o0o2;
            this.f27436Oooo0oo = function2;
            this.f27433Oooo = i;
            this.f27437OoooO00 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            OooO0OO.OooO00o(this.f27434Oooo0o, this.f27435Oooo0oO, this.f27436Oooo0oo, ooo00o, this.f27433Oooo | 1, this.f27437OoooO00);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Function2<oOO00O, Integer, Unit>> f27438Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(oO0Oo<? extends Function2<? super oOO00O, ? super Integer, Unit>> oo0oo) {
            super(2);
            this.f27438Oooo0o = oo0oo;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                OooO0OO.OooO0O0(SemanticsModifierKt.OooO00o(OoooooO.o00OOOO0.OooO00o.f4198Oooo0o, false, o0000OO0.OooO0o.f27439Oooo0o), o00O0000.OooO00o(ooo00o2, -533674951, new o0000OO0.OooO(this.f27438Oooo0o)), ooo00o2, 48, 0);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OooO00o(@NotNull Function0<Unit> onDismissRequest, @Nullable o00O0O o00o0o2, @NotNull Function2<? super oOO00O, ? super Integer, Unit> content, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        o00O0O o00o0o3;
        o00O0O o00o0o4;
        o00O0O o00o0o5;
        o00O0O o00o0o6;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-2032877254);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (ooo00oOooOOo.Oooo0oo(onDismissRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                o00o0o3 = o00o0o2;
                int i4 = ooo00oOooOOo.Oooo0oo(o00o0o3) ? 32 : 16;
                i3 |= i4;
            } else {
                o00o0o3 = o00o0o2;
            }
            i3 |= i4;
        } else {
            o00o0o3 = o00o0o2;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= ooo00oOooOOo.Oooo0oo(content) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
            o00o0o6 = o00o0o3;
        } else {
            ooo00oOooOOo.OooOOo0();
            if ((i & 1) != 0 && !ooo00oOooOOo.Oooo000()) {
                ooo00oOooOOo.OooOoo0();
                if ((i2 & 2) != 0) {
                    o00o0o4 = o00o0o3;
                    o00o0o5 = o00o0o4;
                } else {
                    o00o0o5 = o00o0o3;
                }
            } else if ((i2 & 2) != 0) {
                o00o0o4 = new o00O0O(false, false, null, 7, null);
                o00o0o5 = o00o0o4;
            } else {
                o00o0o5 = o00o0o3;
            }
            ooo00oOooOOo.Oooo0oO();
            View view = (View) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6594OooO0o);
            o0000O0O.OooO oooO = (o0000O0O.OooO) ooo00oOooOOo.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) ooo00oOooOOo.OooOO0o(o000.f6360OooOO0O);
            o00O0OOO parent = o00O00O.OooO0O0(ooo00oOooOOo);
            oO0Oo oo0ooOooO0o = o0OOO00.OooO0o(content, ooo00oOooOOo);
            UUID dialogId = (UUID) o00O0.OooO00o(new Object[0], null, OooO.f27427Oooo0o, ooo00oOooOOo, 6);
            ooo00oOooOOo.OooO0o0(511388516);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(view) | ooo00oOooOOo.Oooo0oo(oooO);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                o00Ooo o00ooo2 = new o00Ooo(onDismissRequest, o00o0o5, view, layoutDirection, oooO, dialogId);
                o000OOo0 content2 = o00O0000.OooO0O0(488261145, true, new OooO0o(oo0ooOooO0o));
                Intrinsics.checkNotNullParameter(parent, "parentComposition");
                Intrinsics.checkNotNullParameter(content2, "children");
                o0OoOo0 o0oooo1 = o00ooo2.f27498Oooo;
                Objects.requireNonNull(o0oooo1);
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(content2, "content");
                o0oooo1.setParentCompositionContext(parent);
                o0oooo1.f27504OoooOO0.setValue(content2);
                o0oooo1.f27505OoooOOO = true;
                o0oooo1.OooO0OO();
                ooo00oOooOOo.Oooo00o(o00ooo2);
                objOooO0o = o00ooo2;
            }
            ooo00oOooOOo.Oooo0o0();
            o00Ooo o00ooo3 = (o00Ooo) objOooO0o;
            o00Oo00.OooO0O0(o00ooo3, new OooO00o(o00ooo3), ooo00oOooOOo);
            o00Oo00.OooO0oO(new OooO0O0(o00ooo3, onDismissRequest, o00o0o5, layoutDirection), ooo00oOooOOo);
            o00o0o6 = o00o0o5;
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new C0290OooO0OO(onDismissRequest, o00o0o6, content, i, i2));
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    public static final void OooO0O0(p048OoooooO.o00OOOO0 o00oooo1, Function2 function2, oOO00O ooo00o, int i, int i2) {
        int i3;
        oOO00O composer = ooo00o.OooOOo(-1177876616);
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
            i3 |= composer.Oooo0oo(function2) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            if (i4 != 0) {
                o00oooo1 = OoooooO.o00OOOO0.OooO00o.f4198Oooo0o;
            }
            OooOO0 oooOO1 = OooOO0.f27440OooO00o;
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo1);
            int i5 = (((((i3 << 3) & 112) | ((i3 >> 3) & 14)) << 9) & 7168) | 6;
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
            oO00000o.OooO0O0(composer, oooOO1, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, Integer.valueOf((i5 >> 3) & 112));
            composer.OooO0o0(2058660585);
            function2.invoke(composer, Integer.valueOf((i5 >> 9) & 14));
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOO0O(o00oooo1, function2, i, i2));
    }
}
