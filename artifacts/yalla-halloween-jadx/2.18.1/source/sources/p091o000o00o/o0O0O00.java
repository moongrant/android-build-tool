package p091o000o00o;

import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class o0O0O00<T> extends o0000OO0 {
    public o0O0O00(RoomDatabase roomDatabase) {
        super(roomDatabase);
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

    public abstract void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, T t);
}
