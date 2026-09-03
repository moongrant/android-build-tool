package p485o0o00O0;

import android.widget.LinearLayout;
import com.code.android.util.o0000O0;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
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
@DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.MomentReplyActivity$initView$3$1", f = "MomentReplyActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o00O0OOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f47846OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ float f47847OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OOO(MomentReplyActivity momentReplyActivity, float f, Continuation<? super o00O0OOO> continuation) {
        super(2, continuation);
        this.f47846OooO0Oo = momentReplyActivity;
        this.f47847OooO0o0 = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O0OOO(this.f47846OooO0Oo, this.f47847OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O0OOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = MomentReplyActivity.f26149OooOoO;
        LinearLayout linearLayout = this.f47846OooO0Oo.OooOoO0().f59390OooO0OO;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.contentLayout");
        o000OO00.OooOO0(linearLayout, o0000O0.OooO00o(this.f47847OooO0o0 + 56));
        return Unit.INSTANCE;
    }
}
