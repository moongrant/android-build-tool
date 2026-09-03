package p091o000o00o;

import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o0Oo0oo {
    @JvmStatic
    @NotNull
    public static final Flow OooO00o(@NotNull RoomDatabase db, @NotNull String[] tableNames, @NotNull Callable callable) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(callable, "callable");
        return FlowKt.flow(new oo000o(false, db, tableNames, callable, null));
    }

    @JvmStatic
    @Nullable
    public static final Object OooO0O0(@NotNull RoomDatabase roomDatabase, @NotNull CancellationSignal cancellationSignal, @NotNull Callable callable, @NotNull Continuation continuation) {
        if (roomDatabase.OooOOO0() && roomDatabase.OooO()) {
            return callable.call();
        }
        o000 o000Var = (o000) continuation.getContext().get(o000.f29113Oooo);
        ContinuationInterceptor continuationInterceptorOooO00o = o000Var == null ? null : o000Var.f29115Oooo0oO;
        if (continuationInterceptorOooO00o == null) {
            continuationInterceptorOooO00o = o0OO00O.OooO00o(roomDatabase);
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new o0ooOOo(cancellationSignal, BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, continuationInterceptorOooO00o, null, new o0OOO0o(callable, cancellableContinuationImpl, null), 2, null)));
        Object result = cancellableContinuationImpl.getResult();
        if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return result;
        }
        DebugProbesKt.probeCoroutineSuspended(continuation);
        return result;
    }

    @JvmStatic
    @Nullable
    public static final Object OooO0OO(@NotNull RoomDatabase roomDatabase, @NotNull Callable callable, @NotNull Continuation continuation) {
        if (roomDatabase.OooOOO0() && roomDatabase.OooO()) {
            return callable.call();
        }
        o000 o000Var = (o000) continuation.getContext().get(o000.f29113Oooo);
        ContinuationInterceptor continuationInterceptorOooO0O0 = o000Var == null ? null : o000Var.f29115Oooo0oO;
        if (continuationInterceptorOooO0O0 == null) {
            continuationInterceptorOooO0O0 = o0OO00O.OooO0O0(roomDatabase);
        }
        return BuildersKt.withContext(continuationInterceptorOooO0O0, new o00oO0o(callable, null), continuation);
    }
}
