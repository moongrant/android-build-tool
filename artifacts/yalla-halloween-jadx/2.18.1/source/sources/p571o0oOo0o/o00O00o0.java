package p571o0oOo0o;

import androidx.compose.runtime.Composable;
import androidx.compose.ui.platform.o0O0O00;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00o0 {

    public static final class OooO00o extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<LifecycleOwner> f45543Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Function2<o00OOOO0, Lifecycle.State, Unit>> f45544Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(oO0Oo<? extends LifecycleOwner> oo0oo, oO0Oo<? extends Function2<? super o00OOOO0, ? super Lifecycle.State, Unit>> oo0oo2) {
            super(1);
            this.f45543Oooo0o = oo0oo;
            this.f45544Oooo0oO = oo0oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
            final o00OOOO0 DisposableEffect = o00oooo1;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            Lifecycle lifecycle = this.f45543Oooo0o.getValue().getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "lifecycleOwner.lifecycle");
            final oO0Oo<Function2<o00OOOO0, Lifecycle.State, Unit>> oo0oo = this.f45544Oooo0oO;
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: o0oOo0o.oOO00O
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    o00OOOO0 this_DisposableEffect = DisposableEffect;
                    oO0Oo eventHandler$delegate = oo0oo;
                    Intrinsics.checkNotNullParameter(this_DisposableEffect, "$this_DisposableEffect");
                    Intrinsics.checkNotNullParameter(eventHandler$delegate, "$eventHandler$delegate");
                    Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(event, "event");
                    Function2 function2 = (Function2) eventHandler$delegate.getValue();
                    Lifecycle.State targetState = event.getTargetState();
                    Intrinsics.checkNotNullExpressionValue(targetState, "event.targetState");
                    function2.invoke(this_DisposableEffect, targetState);
                }
            };
            lifecycle.addObserver(lifecycleEventObserver);
            return new o00O00OO(lifecycle, lifecycleEventObserver);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function2<o00OOOO0, Lifecycle.State, Unit> f45545Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f45546Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function2<? super o00OOOO0, ? super Lifecycle.State, Unit> function2, int i) {
            super(2);
            this.f45545Oooo0o = function2;
            this.f45546Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00O00o0.OooO00o(this.f45545Oooo0o, ooo00o, this.f45546Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public static final void OooO00o(@NotNull Function2<? super o00OOOO0, ? super Lifecycle.State, Unit> onEvent, @Nullable oOO00O ooo00o, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(2091605353);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(onEvent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            oO0Oo oo0ooOooO0o = o0OOO00.OooO0o(onEvent, ooo00oOooOOo);
            oO0Oo oo0ooOooO0o2 = o0OOO00.OooO0o(ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo), ooo00oOooOOo);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) oo0ooOooO0o2.getValue();
            ooo00oOooOOo.OooO0o0(511388516);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(oo0ooOooO0o2) | ooo00oOooOOo.Oooo0oo(oo0ooOooO0o);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new OooO00o(oo0ooOooO0o2, oo0ooOooO0o);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o00Oo00.OooO0O0(lifecycleOwner, (Function1) objOooO0o, ooo00oOooOOo);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(onEvent, i));
    }
}
