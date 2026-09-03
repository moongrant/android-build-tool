package p110o000ooo0;

import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class o0Oo0oo<T> extends o000Oo0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(@NotNull RoomDatabase database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    public final int OooO0o(T t) {
        SupportSQLiteStatement supportSQLiteStatementOooO00o = OooO00o();
        try {
            OooO0o0(supportSQLiteStatementOooO00o, t);
            return supportSQLiteStatementOooO00o.executeUpdateDelete();
        } finally {
            OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    public abstract void OooO0o0(@NotNull SupportSQLiteStatement supportSQLiteStatement, T t);
}
