package p519o0o0O0OO;

import androidx.compose.runtime.MutableState;
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
import p414o0Oo0oO.oO00O0o0;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;
import p606o0oo0O0o.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentSendAnimIcon$CreateIcon$1$1", f = "MomentSendAnimIcon.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0O0o00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f52390OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o00O(MutableState<Boolean> mutableState, Continuation<? super o0O0o00O> continuation) {
        super(2, continuation);
        this.f52390OooO0Oo = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O0o00O(this.f52390OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O0o00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        int i;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        oO00O0o0 oo00o0o0OooO = o00Ooo.OooO();
        oo00o0o0OooO.getClass();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        boolean zOooO0O0 = oo00o0o0OooO.OooO0O0("sendMomentAnimIconForVideoSendSuccess" + o0O00oO0.OooOOo0().getValue(), false);
        oO00O0o0 oo00o0o0OooO2 = o00Ooo.OooO();
        oo00o0o0OooO2.getClass();
        int iOooO0OO = oo00o0o0OooO2.OooO0OO("sendMomentAnimIconForDays" + o0O00oO0.OooOOo0().getValue(), 0);
        oO00O0o0 oo00o0o0OooO3 = o00Ooo.OooO();
        oo00o0o0OooO3.getClass();
        long jOooO0Oo = oo00o0o0OooO3.OooO0Oo("sendMomentAnimIconForEveryDay" + o0O00oO0.OooOOo0().getValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        MutableState<Boolean> mutableState = this.f52390OooO0Oo;
        if (zOooO0O0 || (i = iOooO0OO + 1) > 7 || o0O0OOO0.OooO00o(jOooO0Oo, jCurrentTimeMillis)) {
            mutableState.setValue(Boolean.FALSE);
        } else {
            mutableState.setValue(Boolean.TRUE);
            oO00O0o0 oo00o0o0OooO4 = o00Ooo.OooO();
            oo00o0o0OooO4.getClass();
            oo00o0o0OooO4.OooO0oo(jCurrentTimeMillis, "sendMomentAnimIconForEveryDay" + o0O00oO0.OooOOo0().getValue());
            oO00O0o0 oo00o0o0OooO5 = o00Ooo.OooO();
            oo00o0o0OooO5.getClass();
            oo00o0o0OooO5.OooO0oO(i, "sendMomentAnimIconForDays" + o0O00oO0.OooOOo0().getValue());
        }
        return Unit.INSTANCE;
    }
}
