package p492o0o00OO0;

import android.view.View;
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
import p423o0OoO0OO.oo0oOO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.MomentDetailActivity$initView$3$1", f = "MomentDetailActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000O0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f49139OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ float f49140OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(MomentDetailActivity momentDetailActivity, float f, Continuation<? super o000O0O0> continuation) {
        super(2, continuation);
        this.f49139OooO0Oo = momentDetailActivity;
        this.f49140OooO0o0 = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O0O0(this.f49139OooO0Oo, this.f49140OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = MomentDetailActivity.f25608Oooo0;
        View composeViewToolBar = this.f49139OooO0Oo.OooOoO().f44932OooO0o0;
        Intrinsics.checkNotNullExpressionValue(composeViewToolBar, "composeViewToolBar");
        oo0oOO0.OooO0O0(composeViewToolBar, o0000O0.OooO00o(this.f49140OooO0o0 + 50));
        return Unit.INSTANCE;
    }
}
