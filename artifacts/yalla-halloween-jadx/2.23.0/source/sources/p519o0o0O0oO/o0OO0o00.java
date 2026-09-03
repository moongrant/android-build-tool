package p519o0o0O0oO;

import com.yalla.yalla.model.RecommendNewPostModel;
import com.yalla.yalla.ui.composable.common.LoadMoreState;
import com.yalla.yalla.ui.vm.moment.MomentFollowingTopUserVM;
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
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.FollowingMomentTopUserDialogKt$FollowingUserMomentContent$2$3$3$1$2$1", f = "FollowingMomentTopUserDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0OO0o00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentFollowingTopUserVM f52725OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RecommendNewPostModel f52726OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0o00(MomentFollowingTopUserVM momentFollowingTopUserVM, RecommendNewPostModel recommendNewPostModel, Continuation<? super o0OO0o00> continuation) {
        super(2, continuation);
        this.f52725OooO0Oo = momentFollowingTopUserVM;
        this.f52726OooO0o0 = recommendNewPostModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OO0o00(this.f52725OooO0Oo, this.f52726OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0OO0o00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f52725OooO0Oo.getLoadMoreState().getValue() == LoadMoreState.Loading) {
            MomentFollowingTopUserVM.userMomentList$default(this.f52725OooO0Oo, false, this.f52726OooO0o0.getUserId(), 0, 4, null);
        }
        return Unit.INSTANCE;
    }
}
