package p492o0o00OO0;

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
public final class o000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f49130OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ float f49131OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(MomentDetailActivity momentDetailActivity, float f, Continuation<? super o000O> continuation) {
        super(2, continuation);
        this.f49130OooO0Oo = momentDetailActivity;
        this.f49131OooO0o0 = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O(this.f49130OooO0Oo, this.f49131OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = MomentDetailActivity.f25608Oooo0;
        LinearLayout contentLayout = this.f49130OooO0Oo.OooOoO().f44931OooO0o;
        Intrinsics.checkNotNullExpressionValue(contentLayout, "contentLayout");
        com.code.android.util.o000O.OooOO0(contentLayout, o0000O0.OooO00o(this.f49131OooO0o0 + 56));
        return Unit.INSTANCE;
    }
}
