package p650o0ooo;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
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
import p405o0Oo0OOO.oO0Oo0oo;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00000 implements com.yalla.yalla.util.Function.OooO00o.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oO0Oo0oo f58925OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ oO0O00oO f58926OooO0O0;

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.MainDialogClock$signInSuccess$1$2$onAnimationEnd$1", f = "MainDialogClock.kt", i = {}, l = {310}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f58927OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oO0O00oO f58928OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(oO0O00oO oo0o00oo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f58928OooO0o0 = oo0o00oo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f58928OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f58927OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f58927OooO0Oo = 1;
                if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.f58928OooO0o0.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public oOO00000(oO0Oo0oo oo0oo0oo, oO0O00oO oo0o00oo) {
        this.f58925OooO00o = oo0oo0oo;
        this.f58926OooO0O0 = oo0o00oo;
    }

    @Override // com.yalla.yalla.util.Function.OooO00o.OooO0OO
    public final void OooO00o() {
        oO0Oo0oo oo0oo0oo = this.f58925OooO00o;
        oo0oo0oo.f44937OooO0O0.setImageResource(o0Oo0oo.sign_caizhi_00000);
        oo0oo0oo.f44937OooO0O0.setBackgroundResource(0);
        oO0O00oO oo0o00oo = this.f58926OooO0O0;
        if (oo0o00oo.f58866OooOOo) {
            oo0o00oo.OooOOo0();
            return;
        }
        ConstraintLayout constraintLayout = ((oO0Oo0oo) oo0o00oo.f58867OooOOo0.getValue()).f44936OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        o000O.OooO0O0(constraintLayout);
        oo0o00oo.OooOOO0().f44407OooO0O0.removeAllViews();
        oo0o00oo.OooOOO0().f44407OooO0O0.addView(oo0o00oo.OooOOO().f45308OooO00o);
        ConstraintLayout constraintLayout2 = oo0o00oo.OooOOO().f45308OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        o000O.OooOOOO(constraintLayout2);
        oo0o00oo.OooOOO().f45336OooOooO.setText(o0000.OooO0OO(o000000.sign_in_today));
        oO0O00oO.OooOO0O(oo0o00oo, oo0o00oo.f58870OooOo00 + 1);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(oo0o00oo, null), 3, null);
    }

    @Override // com.yalla.yalla.util.Function.OooO00o.OooO0OO
    public final void OooO0O0() {
        this.f58925OooO00o.f44937OooO0O0.setImageResource(0);
    }

    @Override // com.yalla.yalla.util.Function.OooO00o.OooO0OO
    public final void OooO0OO() {
    }
}
