package p093o000o0O0;

import android.database.Cursor;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o00O00o0;
import p091o000o00o.o0000O0;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.room.paging.LimitOffsetPagingSource$initialLoad$2", f = "LimitOffsetPagingSource.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
public final class o000O00 extends SuspendLambda implements Function1<Continuation<? super o00O00o0.OooO0O0<Integer, Object>>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f29276Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000O0<Object> f29277Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00O00o0.OooO00o<Integer> f29278Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(o000O0<Object> o000o0, o00O00o0.OooO00o<Integer> oooO00o, Continuation<? super o000O00> continuation) {
        super(1, continuation);
        this.f29277Oooo0oO = o000o0;
        this.f29278Oooo0oo = oooO00o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new o000O00(this.f29277Oooo0oO, this.f29278Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super o00O00o0.OooO0O0<Integer, Object>> continuation) {
        return ((o000O00) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f29276Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o000O0<Object> o000o0 = this.f29277Oooo0oO;
            Objects.requireNonNull(o000o0);
            o0000O0 o0000o0OooO0o = o0000O0.OooO0o("SELECT COUNT(*) FROM ( " + ((Object) o000o0.f29270OooO0O0.f29164Oooo0o) + " )", o000o0.f29270OooO0O0.f29167OoooO);
            Intrinsics.checkNotNullExpressionValue(o0000o0OooO0o, "acquire(\n            cou…eQuery.argCount\n        )");
            o0000o0OooO0o.OooO0oo(o000o0.f29270OooO0O0);
            Cursor cursorOooOOO = o000o0.f29271OooO0OO.OooOOO(o0000o0OooO0o);
            Intrinsics.checkNotNullExpressionValue(cursorOooOOO, "db.query(sqLiteQuery)");
            try {
                int i2 = cursorOooOOO.moveToFirst() ? cursorOooOOO.getInt(0) : 0;
                cursorOooOOO.close();
                o0000o0OooO0o.release();
                this.f29277Oooo0oO.f29272OooO0Oo.set(i2);
                o000O0<Object> o000o1 = this.f29277Oooo0oO;
                o00O00o0.OooO00o<Integer> oooO00o = this.f29278Oooo0oo;
                this.f29276Oooo0o = 1;
                obj = o000O0.OooO0o0(o000o1, oooO00o, i2);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th) {
                cursorOooOOO.close();
                o0000o0OooO0o.release();
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
