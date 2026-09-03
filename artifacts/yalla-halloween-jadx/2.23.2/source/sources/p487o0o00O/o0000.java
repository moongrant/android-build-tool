package p487o0o00O;

import com.yalla.yalla.ui.vm.main.RedemptionCodeVm;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.main.ComposableSingletons$RedemptionCodeScreenKt$lambda-1$1$1", f = "RedemptionCodeScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RedemptionCodeVm f48745OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f48746OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(RedemptionCodeVm redemptionCodeVm, String str, Continuation<? super o0000> continuation) {
        super(2, continuation);
        this.f48745OooO0Oo = redemptionCodeVm;
        this.f48746OooO0o0 = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0000(this.f48745OooO0Oo, this.f48746OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Function1<String, Unit> searchTextSetter = this.f48745OooO0Oo.getSearchTextSetter();
        if (searchTextSetter != null) {
            String codeKey = this.f48746OooO0o0;
            Intrinsics.checkNotNullExpressionValue(codeKey, "$codeKey");
            searchTextSetter.invoke(codeKey);
        }
        return Unit.INSTANCE;
    }
}
