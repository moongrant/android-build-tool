package p536o0o0Oo0o;

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
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0O0O00;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.screen.user.MyUserInfoScreenKt$MyUserInfoScreenContent$1$2$1", f = "MyUserInfoScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oOOoOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f55246OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOoOOO0(MutableState<Boolean> mutableState, Continuation<? super oOOoOOO0> continuation) {
        super(2, continuation);
        this.f55246OooO0Oo = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOOoOOO0(this.f55246OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oOOoOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0o().getValue(), Boxing.boxBoolean(true))) {
            o0O0O00 o0o0o00OooO0o0 = o00Oo0.OooO0o0();
            o0o0o00OooO0o0.getClass();
            if (o0o0o00OooO0o0.OooO0O0("language" + o000000O.OooOOo0().getValue(), false)) {
                this.f55246OooO0Oo.setValue(Boolean.TRUE);
            }
        }
        return Unit.INSTANCE;
    }
}
