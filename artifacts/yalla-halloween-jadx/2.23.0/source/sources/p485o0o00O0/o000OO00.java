package p485o0o00O0;

import android.widget.LinearLayout;
import com.code.android.util.o0000O0;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.MomentDetailActivity$initView$3$2", f = "MomentDetailActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000OO00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f47822OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ float f47823OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(MomentDetailActivity momentDetailActivity, float f, Continuation<? super o000OO00> continuation) {
        super(2, continuation);
        this.f47822OooO0Oo = momentDetailActivity;
        this.f47823OooO0o0 = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000OO00(this.f47822OooO0Oo, this.f47823OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000OO00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = MomentDetailActivity.f26057Oooo0;
        LinearLayout linearLayout = this.f47822OooO0Oo.OooOoOO().f59052OooO0o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.contentLayout");
        com.code.android.util.o000OO00.OooOO0(linearLayout, o0000O0.OooO00o(this.f47823OooO0o0 + 56));
        return Unit.INSTANCE;
    }
}
