package p093o000o0O0;

import java.util.Objects;
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
import p089o000o000.o00O00o0;
import p091o000o00o.o00000O0;
import p091o000o00o.o0000oo;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.room.paging.LimitOffsetPagingSource$load$2", f = "LimitOffsetPagingSource.kt", i = {}, l = {77, 80}, m = "invokeSuspend", n = {}, s = {})
public final class o000O00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super o00O00o0.OooO0O0<Integer, Object>>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f29279Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000O0<Object> f29280Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00O00o0.OooO00o<Integer> f29281Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(o000O0<Object> o000o0, o00O00o0.OooO00o<Integer> oooO00o, Continuation<? super o000O00O> continuation) {
        super(2, continuation);
        this.f29280Oooo0oO = o000o0;
        this.f29281Oooo0oo = oooO00o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O00O(this.f29280Oooo0oO, this.f29281Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super o00O00o0.OooO0O0<Integer, Object>> continuation) {
        return ((o000O00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o00O00o0.OooO0O0 oooO0O0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f29279Oooo0o;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return (o00O00o0.OooO0O0) obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            oooO0O0 = (o00O00o0.OooO0O0) obj;
            o00000O0 o00000o1 = this.f29280Oooo0oO.f29271OooO0OO.f9295OooO0o0;
            o00000o1.OooO0oo();
            o00000o1.f29138OooOO0o.run();
            if (this.f29280Oooo0oO.f28941OooO00o.f29112OooO0o0) {
                return o000O0Oo.f29282OooO00o;
            }
            return oooO0O0;
        }
        ResultKt.throwOnFailure(obj);
        o000O0<Object> o000o0 = this.f29280Oooo0oO;
        if (o000o0.f29273OooO0o.compareAndSet(false, true)) {
            o00000O0 o00000o2 = o000o0.f29271OooO0OO.f9295OooO0o0;
            o000O0.OooO00o oooO00o = o000o0.f29274OooO0o0;
            Objects.requireNonNull(o00000o2);
            o00000o2.OooO00o(new o00000O0.OooO(o00000o2, oooO00o));
        }
        int i2 = this.f29280Oooo0oO.f29272OooO0Oo.get();
        if (i2 < 0) {
            o000O0<Object> o000o1 = this.f29280Oooo0oO;
            o00O00o0.OooO00o<Integer> oooO00o2 = this.f29281Oooo0oo;
            this.f29279Oooo0o = 1;
            obj = o0000oo.OooO0O0(o000o1.f29271OooO0OO, new o000O00(o000o1, oooO00o2, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (o00O00o0.OooO0O0) obj;
        }
        o000O0<Object> o000o2 = this.f29280Oooo0oO;
        o00O00o0.OooO00o<Integer> oooO00o3 = this.f29281Oooo0oo;
        this.f29279Oooo0o = 2;
        obj = o000O0.OooO0o0(o000o2, oooO00o3, i2);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        oooO0O0 = (o00O00o0.OooO0O0) obj;
        o00000O0 o00000o3 = this.f29280Oooo0oO.f29271OooO0OO.f9295OooO0o0;
        o00000o3.OooO0oo();
        o00000o3.f29138OooOO0o.run();
        if (this.f29280Oooo0oO.f28941OooO00o.f29112OooO0o0) {
            return o000O0Oo.f29282OooO00o;
        }
        return oooO0O0;
    }
}
