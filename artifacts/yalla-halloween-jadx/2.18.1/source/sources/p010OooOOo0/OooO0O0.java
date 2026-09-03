package p010OooOOo0;

import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OooOOO;
import androidx.activity.OooOOOO;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.platform.o0O0O00;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0o f185Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f186Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooO0o oooO0o, boolean z) {
            super(0);
            this.f185Oooo0o = oooO0o;
            this.f186Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f185Oooo0o.f4327OooO00o = this.f186Oooo0oO;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: OooOOo0.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0003OooO0O0 extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f187Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f188Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ OooO0o f189Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0003OooO0O0(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, OooO0o oooO0o) {
            super(1);
            this.f187Oooo0o = onBackPressedDispatcher;
            this.f188Oooo0oO = lifecycleOwner;
            this.f189Oooo0oo = oooO0o;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
            o00OOOO0 DisposableEffect = o00oooo1;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            this.f187Oooo0o.OooO00o(this.f188Oooo0oO, this.f189Oooo0oo);
            return new p010OooOOo0.OooO0OO(this.f189Oooo0oo);
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f190Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f191Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f192Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f193Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f191Oooo0o = z;
            this.f192Oooo0oO = function0;
            this.f193Oooo0oo = i;
            this.f190Oooo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            OooO0O0.OooO00o(this.f191Oooo0o, this.f192Oooo0oO, ooo00o, this.f193Oooo0oo | 1, this.f190Oooo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends OooOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Function0<Unit>> f194OooO0OO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(boolean z, oO0Oo<? extends Function0<Unit>> oo0oo) {
            super(z);
            this.f194OooO0OO = oo0oo;
        }

        @Override // androidx.activity.OooOOO
        public final void OooO00o() {
            this.f194OooO0OO.getValue().invoke();
        }
    }

    @Composable
    public static final void OooO00o(boolean z, @NotNull Function0<Unit> onBack, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (ooo00oOooOOo.OooO0OO(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= ooo00oOooOOo.Oooo0oo(onBack) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            if (i4 != 0) {
                z = true;
            }
            oO0Oo oo0ooOooO0o = o0OOO00.OooO0o(onBack, ooo00oOooOOo);
            ooo00oOooOOo.OooO0o0(-3687241);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = new OooO0o(z, oo0ooOooO0o);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            OooO0o oooO0o = (OooO0o) objOooO0o;
            Boolean boolValueOf = Boolean.valueOf(z);
            ooo00oOooOOo.OooO0o0(-3686552);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(boolValueOf) | ooo00oOooOOo.Oooo0oo(oooO0o);
            Object objOooO0o2 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = new OooO00o(oooO0o, z);
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            }
            ooo00oOooOOo.Oooo0o0();
            o00Oo00.OooO0oO((Function0) objOooO0o2, ooo00oOooOOo);
            OooOOOO oooOOOOOooO00o = OooO.f182OooO00o.OooO00o(ooo00oOooOOo);
            if (oooOOOOOooO00o == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
            OnBackPressedDispatcher onBackPressedDispatcher = oooOOOOOooO00o.getOnBackPressedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "checkNotNull(LocalOnBack…}.onBackPressedDispatcher");
            LifecycleOwner lifecycleOwner = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
            o00Oo00.OooO00o(lifecycleOwner, onBackPressedDispatcher, new C0003OooO0O0(onBackPressedDispatcher, lifecycleOwner, oooO0o), ooo00oOooOOo);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0OO(z, onBack, i, i2));
    }
}
