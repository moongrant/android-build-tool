package p110o000ooo0;

import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class oo000o {
    @JvmStatic
    @NotNull
    public static final Flow OooO00o(@NotNull RoomDatabase db, @NotNull String[] tableNames, @NotNull Callable callable) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(callable, "callable");
        return FlowKt.flow(new o00Ooo(false, db, tableNames, callable, null));
    }
}
