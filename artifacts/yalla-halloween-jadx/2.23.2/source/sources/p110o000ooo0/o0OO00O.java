package p110o000ooo0;

import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class o0OO00O<T> extends o000Oo0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(@NotNull RoomDatabase database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    public final void OooO0o(@NotNull Iterable<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement supportSQLiteStatementOooO00o = OooO00o();
        try {
            Iterator<? extends T> it = entities.iterator();
            while (it.hasNext()) {
                OooO0o0(supportSQLiteStatementOooO00o, it.next());
                supportSQLiteStatementOooO00o.executeInsert();
            }
            OooO0Oo(supportSQLiteStatementOooO00o);
        } catch (Throwable th) {
            OooO0Oo(supportSQLiteStatementOooO00o);
            throw th;
        }
    }

    public abstract void OooO0o0(@Nullable SupportSQLiteStatement supportSQLiteStatement, T t);

    public final void OooO0oO(T t) {
        SupportSQLiteStatement supportSQLiteStatementOooO00o = OooO00o();
        try {
            OooO0o0(supportSQLiteStatementOooO00o, t);
            supportSQLiteStatementOooO00o.executeInsert();
        } finally {
            OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    public final long OooO0oo(T t) {
        SupportSQLiteStatement supportSQLiteStatementOooO00o = OooO00o();
        try {
            OooO0o0(supportSQLiteStatementOooO00o, t);
            return supportSQLiteStatementOooO00o.executeInsert();
        } finally {
            OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }
}
