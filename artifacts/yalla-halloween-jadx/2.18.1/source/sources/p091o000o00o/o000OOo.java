package p091o000o00o;

import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class o000OOo<T> extends o0000OO0 {
    public o000OOo(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    public final void OooO0o(Iterable<? extends T> iterable) {
        SupportSQLiteStatement supportSQLiteStatementOooO00o = OooO00o();
        try {
            Iterator<? extends T> it = iterable.iterator();
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

    public abstract void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, T t);

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
