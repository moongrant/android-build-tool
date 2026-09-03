package p650o0ooo;

import com.yalla.yalla.model.RecommendNewPostModel;
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
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.FollowingMomentTopUserDialogKt$FollowingUserMomentContent$2$3$1", f = "FollowingMomentTopUserDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0OoOoOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentFollowingTopUserVM f58731OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RecommendNewPostModel f58732OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOoOo(MomentFollowingTopUserVM momentFollowingTopUserVM, RecommendNewPostModel recommendNewPostModel, Continuation<? super o0OoOoOo> continuation) {
        super(2, continuation);
        this.f58731OooO0Oo = momentFollowingTopUserVM;
        this.f58732OooO0o0 = recommendNewPostModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OoOoOo(this.f58731OooO0Oo, this.f58732OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0OoOoOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MomentFollowingTopUserVM.userMomentList$default(this.f58731OooO0Oo, true, this.f58732OooO0o0.getUserId(), 0, 4, null);
        return Unit.INSTANCE;
    }
}
