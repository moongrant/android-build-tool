package p029Oooo0oO;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o0O0O00.o000Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.o0000O;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o00Oo00 extends SuspendLambda implements Function2<o0000O, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f2410Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f2411Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f2412Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(o00OOOOo o00ooooo2, int i, int i2, Continuation<? super o00Oo00> continuation) {
        super(2, continuation);
        this.f2410Oooo0o = o00ooooo2;
        this.f2411Oooo0oO = i;
        this.f2412Oooo0oo = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00Oo00(this.f2410Oooo0o, this.f2411Oooo0oO, this.f2412Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o0000O o0000o2, Continuation<? super Unit> continuation) {
        return ((o00Oo00) create(o0000o2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o00OOOOo o00ooooo2 = this.f2410Oooo0o;
        int i = this.f2411Oooo0oO;
        int i2 = this.f2412Oooo0oo;
        o00OOO0O o00ooo0o2 = o00ooooo2.f2380OooO00o;
        o00ooo0o2.OooO0OO(i, i2);
        o00ooo0o2.f2361OooO0Oo = null;
        o00O000 o00o001 = (o00O000) o00ooooo2.f2396OooOOo0.getValue();
        if (o00o001 != null) {
            o00o001.OooO0OO();
        }
        o000Oo0 o000oo1 = (o000Oo0) o00ooooo2.f2392OooOOO0.getValue();
        if (o000oo1 != null) {
            o000oo1.OooO0o0();
        }
        return Unit.INSTANCE;
    }
}
