package Oooo0;

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
import p030Oooo0oo.o0O0O0O;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$1", f = "Focusable.kt", i = {0}, l = {144}, m = "invokeSuspend", n = {"pinnedItemsHandle"}, s = {"L$0"})
public final class o000O000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<androidx.compose.foundation.lazy.layout.o00Ooo> f572Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.o00Ooo.OooO00o f573Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f574Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O0O0O f575Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(o0O0O0O o0o0o0o, o0O00OO<androidx.compose.foundation.lazy.layout.o00Ooo> o0o00oo2, Continuation<? super o000O000> continuation) {
        super(2, continuation);
        this.f575Oooo0oo = o0o0o0o;
        this.f572Oooo = o0o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O000(this.f575Oooo0oo, this.f572Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Throwable th;
        androidx.compose.foundation.lazy.layout.o00Ooo.OooO00o OooO00o2;
        androidx.compose.foundation.lazy.layout.o00Ooo.OooO00o oooO00o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f574Oooo0oO;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                androidx.compose.foundation.lazy.layout.o00Ooo value = this.f572Oooo.getValue();
                OooO00o2 = value != null ? value.OooO00o() : null;
                try {
                    o0O0O0O o0o0o0o = this.f575Oooo0oo;
                    this.f573Oooo0o = OooO00o2;
                    this.f574Oooo0oO = 1;
                    if (o0o0o0o.OooO00o(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    oooO00o = OooO00o2;
                } catch (Throwable th2) {
                    th = th2;
                    if (OooO00o2 != null) {
                        OooO00o2.OooO00o();
                    }
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooO00o = this.f573Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            if (oooO00o != null) {
                oooO00o.OooO00o();
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            OooO00o2 = null;
        }
    }
}
