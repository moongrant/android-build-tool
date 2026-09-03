package o000O0O0;

import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final CoroutineDispatcher OooO00o(@NotNull RoomDatabase roomDatabase) {
        Intrinsics.checkNotNullParameter(roomDatabase, "<this>");
        Map<String, Object> map = roomDatabase.f7893OooOO0O;
        Object objFrom = map.get("QueryDispatcher");
        if (objFrom == null) {
            Executor executor = roomDatabase.f7885OooO0O0;
            if (executor == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
                executor = null;
            }
            objFrom = ExecutorsKt.from(executor);
            map.put("QueryDispatcher", objFrom);
        }
        Intrinsics.checkNotNull(objFrom, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (CoroutineDispatcher) objFrom;
    }
}
