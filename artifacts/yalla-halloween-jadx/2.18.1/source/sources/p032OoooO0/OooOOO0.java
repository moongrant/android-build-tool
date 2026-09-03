package p032OoooO0;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.selection.HandleReferencePoint;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0OOO0;
import p034OoooO0O.OooOo00;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final float f2934OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final float f2935OooO0O0;

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f2936Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f2937Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f2938Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function2<? super oOO00O, ? super Integer, Unit> function2, o00OOOO0 o00oooo1, int i) {
            super(2);
            this.f2936Oooo0o = function2;
            this.f2937Oooo0oO = o00oooo1;
            this.f2938Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else if (this.f2936Oooo0o == null) {
                ooo00o2.OooO0o0(1275643833);
                OooOOO0.OooO0O0(this.f2937Oooo0oO, ooo00o2, (this.f2938Oooo0oo >> 3) & 14);
                ooo00o2.Oooo0o0();
            } else {
                ooo00o2.OooO0o0(1275643903);
                this.f2936Oooo0o.invoke(ooo00o2, Integer.valueOf((this.f2938Oooo0oo >> 6) & 14));
                ooo00o2.Oooo0o0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f2939Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ long f2940Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f2941Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f2942Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(long j, o00OOOO0 o00oooo1, Function2<? super oOO00O, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f2940Oooo0o = j;
            this.f2941Oooo0oO = o00oooo1;
            this.f2942Oooo0oo = function2;
            this.f2939Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            OooOOO0.OooO00o(this.f2940Oooo0o, this.f2941Oooo0oO, this.f2942Oooo0oo, ooo00o, this.f2939Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f2943Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f2944Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o00OOOO0 o00oooo1, int i) {
            super(2);
            this.f2943Oooo0o = o00oooo1;
            this.f2944Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            OooOOO0.OooO0O0(this.f2943Oooo0o, ooo00o, this.f2944Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    static {
        float f = 25;
        f2934OooO00o = f;
        f2935OooO0O0 = (f * 2.0f) / 2.4142137f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void OooO00o(long j, @NotNull o00OOOO0 modifier, @Nullable Function2<? super oOO00O, ? super Integer, Unit> function2, @Nullable oOO00O ooo00o, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-5185995);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.OooOO0(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(modifier) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(function2) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            OooOo00.OooO0O0(j, HandleReferencePoint.TopMiddle, o00O0000.OooO00o(ooo00oOooOOo, -1458480226, new OooO00o(function2, modifier, i2)), ooo00oOooOOo, (i2 & 14) | 432);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(j, modifier, function2, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull o00OOOO0 modifier, @Nullable oOO00O ooo00o, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(694251107);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            o00OOOO0 o00oooo0OooOO0O = SizeKt.OooOO0O(modifier, f2935OooO0O0, f2934OooO00o);
            Intrinsics.checkNotNullParameter(o00oooo0OooOO0O, "<this>");
            o0O0OOO0.OooO00o(o00OOO0O.OooO0O0(o00oooo0OooOO0O, OooOo00.f2989Oooo0o), ooo00oOooOOo, 0);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0OO(modifier, i));
    }
}
