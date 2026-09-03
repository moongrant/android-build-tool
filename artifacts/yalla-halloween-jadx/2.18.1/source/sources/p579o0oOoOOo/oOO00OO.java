package p579o0oOoOOo;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.base.Function.OooO0O0;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.o00O0O;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p649o0ooOOoo.pa;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO00OO implements OooO0O0.InterfaceC0074OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ pa f46076OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ooOOO0Oo f46077OooO0O0;

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.ClockDialog$signInSuccess$1$2$onAnimationEnd$1", f = "ClockDialog.kt", i = {}, l = {289}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f46078Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ ooOOO0Oo f46079Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ooOOO0Oo ooooo0oo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f46079Oooo0oO = ooooo0oo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f46079Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f46078Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f46078Oooo0o = 1;
                if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.f46079Oooo0oO.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public oOO00OO(pa paVar, ooOOO0Oo ooooo0oo) {
        this.f46076OooO00o = paVar;
        this.f46077OooO0O0 = ooooo0oo;
    }

    @Override // com.app.base.Function.OooO0O0.InterfaceC0074OooO0O0
    public final void OooO00o() {
        this.f46076OooO00o.f50276OooO0O0.setImageResource(R.drawable.sign_caizhi_00000);
        this.f46076OooO00o.f50276OooO0O0.setBackgroundResource(0);
        ooOOO0Oo ooooo0oo = this.f46077OooO0O0;
        if (ooooo0oo.f46213OoooOoo) {
            ooooo0oo.OooOo00();
            return;
        }
        ConstraintLayout constraintLayout = ooooo0oo.OooOOO0().f50275OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "animBinding.root");
        o00O0O.OooO00o(constraintLayout);
        this.f46077OooO0O0.OooOOO().f50434OooO0O0.removeAllViews();
        this.f46077OooO0O0.OooOOO().f50434OooO0O0.addView(this.f46077OooO0O0.OooOOOO().f50531OooO00o);
        ConstraintLayout constraintLayout2 = this.f46077OooO0O0.OooOOOO().f50531OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "signInBinding.root");
        o00O0O.OooO(constraintLayout2);
        this.f46077OooO0O0.OooOOOO().f50559OooOooO.setText(OooOOO.OooO0OO(R.string.sign_in_today));
        ooOOO0Oo ooooo0oo2 = this.f46077OooO0O0;
        ooooo0oo2.OooOOoo(ooooo0oo2.f46215Ooooo0o + 1);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(this.f46077OooO0O0, null), 3, null);
    }

    @Override // com.app.base.Function.OooO0O0.InterfaceC0074OooO0O0
    public final void OooO0O0() {
        this.f46076OooO00o.f50276OooO0O0.setImageResource(0);
    }

    @Override // com.app.base.Function.OooO0O0.InterfaceC0074OooO0O0
    public final void OooO0OO() {
    }
}
