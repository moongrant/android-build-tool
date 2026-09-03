package p097o000o0o0;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo0 extends o000OO00 implements SupportSQLiteStatement {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final SQLiteStatement f29317Oooo0oO;

    public o000OOo0(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f29317Oooo0oO = sQLiteStatement;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final long executeInsert() {
        return this.f29317Oooo0oO.executeInsert();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final int executeUpdateDelete() {
        return this.f29317Oooo0oO.executeUpdateDelete();
    }
}
