package p543o0o0Ooo0;

import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.screen.user.UserMomentListScreenKt$InitObservers$3$2", f = "UserMomentListScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class q1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentUserListVM f55663OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f55664OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(MomentUserListVM momentUserListVM, long j, Continuation<? super q1> continuation) {
        super(1, continuation);
        this.f55663OooO0Oo = momentUserListVM;
        this.f55664OooO0o0 = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new q1(this.f55663OooO0Oo, this.f55664OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((q1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f55663OooO0Oo.setTopPostDetailId(Boxing.boxLong(this.f55664OooO0o0));
        return Unit.INSTANCE;
    }
}
