package p091o000o00o;

import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final CoroutineDispatcher OooO00o(@NotNull RoomDatabase roomDatabase) {
        Intrinsics.checkNotNullParameter(roomDatabase, "<this>");
        Map<String, Object> backingFieldMap = roomDatabase.f9300OooOO0o;
        Intrinsics.checkNotNullExpressionValue(backingFieldMap, "backingFieldMap");
        Object objFrom = backingFieldMap.get("QueryDispatcher");
        if (objFrom == null) {
            Executor queryExecutor = roomDatabase.f9291OooO0O0;
            Intrinsics.checkNotNullExpressionValue(queryExecutor, "queryExecutor");
            objFrom = ExecutorsKt.from(queryExecutor);
            backingFieldMap.put("QueryDispatcher", objFrom);
        }
        Objects.requireNonNull(objFrom, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (CoroutineDispatcher) objFrom;
    }

    @NotNull
    public static final CoroutineDispatcher OooO0O0(@NotNull RoomDatabase roomDatabase) {
        Intrinsics.checkNotNullParameter(roomDatabase, "<this>");
        Map<String, Object> backingFieldMap = roomDatabase.f9300OooOO0o;
        Intrinsics.checkNotNullExpressionValue(backingFieldMap, "backingFieldMap");
        Object objFrom = backingFieldMap.get("TransactionDispatcher");
        if (objFrom == null) {
            o000O000 transactionExecutor = roomDatabase.f9292OooO0OO;
            Intrinsics.checkNotNullExpressionValue(transactionExecutor, "transactionExecutor");
            objFrom = ExecutorsKt.from(transactionExecutor);
            backingFieldMap.put("TransactionDispatcher", objFrom);
        }
        Objects.requireNonNull(objFrom, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (CoroutineDispatcher) objFrom;
    }
}
