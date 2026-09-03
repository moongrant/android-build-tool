package p492o0o00OO0;

import com.yalla.yalla.ui.composable.common.LoadMoreState;
import com.yalla.yalla.ui.vm.moment.TopicPopularMomentVM;
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
@DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.TopicDetailContentCompKt$TopicDetailContent$2$1$4$2$1$2$1$1", f = "TopicDetailContentComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oO0OOO00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicPopularMomentVM f49447OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Long f49448OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f49449OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOO00(TopicPopularMomentVM topicPopularMomentVM, int i, Long l, Continuation<? super oO0OOO00> continuation) {
        super(2, continuation);
        this.f49447OooO0Oo = topicPopularMomentVM;
        this.f49449OooO0o0 = i;
        this.f49448OooO0o = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO0OOO00(this.f49447OooO0Oo, this.f49449OooO0o0, this.f49448OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO0OOO00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        TopicPopularMomentVM topicPopularMomentVM = this.f49447OooO0Oo;
        if (topicPopularMomentVM.getLoadMoreState().getValue() == LoadMoreState.Loading) {
            topicPopularMomentVM.loadData(false, this.f49449OooO0o0, this.f49448OooO0o.longValue());
        }
        return Unit.INSTANCE;
    }
}
