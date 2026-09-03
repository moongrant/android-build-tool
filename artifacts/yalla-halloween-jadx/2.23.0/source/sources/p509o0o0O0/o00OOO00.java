package p509o0o0O0;

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
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00000O0;
import p464o0Oooo.o000000O;
import p601o0oo0O0.o0000O0O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentSendAnimIcon$CreateIcon$1$1", f = "MomentSendAnimIcon.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o00OOO00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f50932OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(MutableState<Boolean> mutableState, Continuation<? super o00OOO00> continuation) {
        super(2, continuation);
        this.f50932OooO0Oo = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00OOO00(this.f50932OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00OOO00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        int i;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o00000O0 o00000o0OooO = o00Oo0.OooO();
        o00000o0OooO.getClass();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        boolean zOooO0O0 = o00000o0OooO.OooO0O0("sendMomentAnimIconForVideoSendSuccess" + o000000O.OooOOo0().getValue(), false);
        o00000O0 o00000o0OooO2 = o00Oo0.OooO();
        o00000o0OooO2.getClass();
        int iOooO0OO = o00000o0OooO2.OooO0OO("sendMomentAnimIconForDays" + o000000O.OooOOo0().getValue(), 0);
        o00000O0 o00000o0OooO3 = o00Oo0.OooO();
        o00000o0OooO3.getClass();
        long jOooO0Oo = o00000o0OooO3.OooO0Oo("sendMomentAnimIconForEveryDay" + o000000O.OooOOo0().getValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        MutableState<Boolean> mutableState = this.f50932OooO0Oo;
        if (zOooO0O0 || (i = iOooO0OO + 1) > 7 || o0000O0O.OooO00o(jOooO0Oo, jCurrentTimeMillis)) {
            mutableState.setValue(Boolean.FALSE);
        } else {
            mutableState.setValue(Boolean.TRUE);
            o00000O0 o00000o0OooO4 = o00Oo0.OooO();
            o00000o0OooO4.getClass();
            o00000o0OooO4.OooO0oo(jCurrentTimeMillis, "sendMomentAnimIconForEveryDay" + o000000O.OooOOo0().getValue());
            o00000O0 o00000o0OooO5 = o00Oo0.OooO();
            o00000o0OooO5.getClass();
            o00000o0OooO5.OooO0oO(i, "sendMomentAnimIconForDays" + o000000O.OooOOo0().getValue());
        }
        return Unit.INSTANCE;
    }
}
