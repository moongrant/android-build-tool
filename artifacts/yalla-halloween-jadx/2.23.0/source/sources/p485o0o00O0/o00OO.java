package p485o0o00O0;

import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.MomentReplyActivity$sendCommentOrReply$1$1$2$1", f = "MomentReplyActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o00OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f47848OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO(MomentReplyActivity momentReplyActivity, Continuation<? super o00OO> continuation) {
        super(2, continuation);
        this.f47848OooO0Oo = momentReplyActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00OO(this.f47848OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = MomentReplyActivity.f26149OooOoO;
        MomentReplyActivity momentReplyActivity = this.f47848OooO0Oo;
        momentReplyActivity.OooOoO0().f59391OooO0Oo.smoothScrollToPosition(momentReplyActivity.OooOo().OooOOO0() + 0);
        momentReplyActivity.OooOo().notifyDataSetChanged();
        return Unit.INSTANCE;
    }
}
