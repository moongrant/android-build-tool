package p519o0o0O0oO;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
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
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.y3;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o implements com.yalla.yalla.util.Function.OooO00o.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ y3 f52668OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00O0OOO f52669OooO0O0;

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.ClockDialog$signInSuccess$1$2$onAnimationEnd$1", f = "ClockDialog.kt", i = {}, l = {310}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f52670OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00O0OOO f52671OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O0OOO o00o0ooo2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f52671OooO0o0 = o00o0ooo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f52671OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f52670OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f52670OooO0Oo = 1;
                if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.f52671OooO0o0.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public o0O0o(y3 y3Var, o00O0OOO o00o0ooo2) {
        this.f52668OooO00o = y3Var;
        this.f52669OooO0O0 = o00o0ooo2;
    }

    @Override // com.yalla.yalla.util.Function.OooO00o.OooO0OO
    public final void OooO00o() {
        y3 y3Var = this.f52668OooO00o;
        y3Var.f59380OooO0O0.setImageResource(oOo00OO0.sign_caizhi_00000);
        y3Var.f59380OooO0O0.setBackgroundResource(0);
        o00O0OOO o00o0ooo2 = this.f52669OooO0O0;
        if (o00o0ooo2.f52572OooOOo) {
            o00o0ooo2.OooOOo0();
            return;
        }
        ConstraintLayout constraintLayout = ((y3) o00o0ooo2.f52573OooOOo0.getValue()).f59379OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "animBinding.root");
        o000OO00.OooO0O0(constraintLayout);
        o00o0ooo2.OooOOO0().f57474OooO0O0.removeAllViews();
        o00o0ooo2.OooOOO0().f57474OooO0O0.addView(o00o0ooo2.OooOOO().f57548OooO00o);
        ConstraintLayout constraintLayout2 = o00o0ooo2.OooOOO().f57548OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "signInBinding.root");
        o000OO00.OooOOOO(constraintLayout2);
        o00o0ooo2.OooOOO().f57576OooOooO.setText(o0000.OooO0OO(oO00OOo0.sign_in_today));
        o00O0OOO.OooOO0O(o00o0ooo2, o00o0ooo2.f52576OooOo00 + 1);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(o00o0ooo2, null), 3, null);
    }

    @Override // com.yalla.yalla.util.Function.OooO00o.OooO0OO
    public final void OooO0O0() {
        this.f52668OooO00o.f59380OooO0O0.setImageResource(0);
    }

    @Override // com.yalla.yalla.util.Function.OooO00o.OooO0OO
    public final void OooO0OO() {
    }
}
