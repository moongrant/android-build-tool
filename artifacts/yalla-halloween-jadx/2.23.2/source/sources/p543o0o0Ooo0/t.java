package p543o0o0Ooo0;

import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p414o0Oo0oO.oO0OOo0o;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.screen.user.MyUserInfoScreenKt$MyUserInfoScreenContent$1$2$1", f = "MyUserInfoScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f55681OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(MutableState<Boolean> mutableState, Continuation<? super t> continuation) {
        super(2, continuation);
        this.f55681OooO0Oo = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new t(this.f55681OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0o().getValue(), Boxing.boxBoolean(true))) {
            oO0OOo0o oo0ooo0oOooO0o0 = o00Ooo.OooO0o0();
            oo0ooo0oOooO0o0.getClass();
            if (oo0ooo0oOooO0o0.OooO0O0("language" + o0O00oO0.OooOOo0().getValue(), false)) {
                this.f55681OooO0Oo.setValue(Boolean.TRUE);
            }
        }
        return Unit.INSTANCE;
    }
}
