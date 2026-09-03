package p440o0OoOo0o;

import androidx.lifecycle.MutableLiveData;
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
import p402o0Oo0OOO.o00;
import p402o0Oo0OOO.o000OOo0;
import p420o0OoO0OO.o0ooOOo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.account.ui.screen.AccountScreenKt$AccountScreenContent$2", f = "AccountScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o00000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f46117OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(CoroutineScope coroutineScope, Continuation<? super o00000O> continuation) {
        super(2, continuation);
        this.f46117OooO0Oo = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00000O(this.f46117OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MutableLiveData<Boolean> mutableLiveData = o00.f44461OooO00o;
        CoroutineScope coroutineScope = this.f46117OooO0Oo;
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        o0ooOOo.OooO0O0(coroutineScope, new o000OOo0(null));
        return Unit.INSTANCE;
    }
}
