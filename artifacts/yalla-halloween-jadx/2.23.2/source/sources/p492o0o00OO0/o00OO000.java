package p492o0o00OO0;

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
@DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.MomentReplyActivity$sendCommentOrReply$1$1$1$1", f = "MomentReplyActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o00OO000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f49171OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO000(MomentReplyActivity momentReplyActivity, Continuation<? super o00OO000> continuation) {
        super(2, continuation);
        this.f49171OooO0Oo = momentReplyActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00OO000(this.f49171OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00OO000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = MomentReplyActivity.f25700OooOoO;
        MomentReplyActivity momentReplyActivity = this.f49171OooO0Oo;
        momentReplyActivity.OooOoO0().f45217OooO0Oo.smoothScrollToPosition(momentReplyActivity.OooOo().OooOOO0() + 0);
        momentReplyActivity.OooOo().notifyDataSetChanged();
        return Unit.INSTANCE;
    }
}
