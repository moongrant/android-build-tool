package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O0o000;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
public final class o0O00000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f6567Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Recomposer f6568Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ View f6569Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00000(Recomposer recomposer, View view, Continuation<? super o0O00000> continuation) {
        super(2, continuation);
        this.f6568Oooo0oO = recomposer;
        this.f6569Oooo0oo = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O00000(this.f6568Oooo0oO, this.f6569Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O00000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6567Oooo0o;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Recomposer recomposer = this.f6568Oooo0oO;
                this.f6567Oooo0o = 1;
                Object objFirst = FlowKt.first(recomposer.f5978OooOOOO, new o0O0o000(null), this);
                if (objFirst != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objFirst = Unit.INSTANCE;
                }
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (o0O000Oo.OooO0O0(this.f6569Oooo0oo) == this.f6568Oooo0oO) {
                o0O000Oo.OooO0OO(this.f6569Oooo0oo, null);
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            if (o0O000Oo.OooO0O0(this.f6569Oooo0oo) == this.f6568Oooo0oO) {
                o0O000Oo.OooO0OO(this.f6569Oooo0oo, null);
            }
            throw th;
        }
    }
}
