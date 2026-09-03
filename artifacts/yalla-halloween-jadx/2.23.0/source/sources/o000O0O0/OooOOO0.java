package o000O0O0;

import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class OooOOO0<T> extends o000000 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(@NotNull RoomDatabase database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    public abstract void OooO0Oo(@Nullable SupportSQLiteStatement supportSQLiteStatement, T t);

    public final void OooO0o(T t) {
        SupportSQLiteStatement supportSQLiteStatementOooO00o = OooO00o();
        try {
            OooO0Oo(supportSQLiteStatementOooO00o, t);
            supportSQLiteStatementOooO00o.executeInsert();
        } finally {
            OooO0OO(supportSQLiteStatementOooO00o);
        }
    }

    public final void OooO0o0(@NotNull Iterable<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementOooO00o = OooO00o();
        try {
            Iterator<? extends T> it = entities.iterator();
            while (it.hasNext()) {
                OooO0Oo(supportSQLiteStatementOooO00o, it.next());
                supportSQLiteStatementOooO00o.executeInsert();
            }
            OooO0OO(supportSQLiteStatementOooO00o);
        } catch (Throwable th) {
            OooO0OO(supportSQLiteStatementOooO00o);
            throw th;
        }
    }

    public final long OooO0oO(T t) {
        SupportSQLiteStatement supportSQLiteStatementOooO00o = OooO00o();
        try {
            OooO0Oo(supportSQLiteStatementOooO00o, t);
            return supportSQLiteStatementOooO00o.executeInsert();
        } finally {
            OooO0OO(supportSQLiteStatementOooO00o);
        }
    }
}
