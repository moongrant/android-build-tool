package p097o000o0o0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.List;
import p095o000o0Oo.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO0O implements SupportSQLiteDatabase {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final String[] f29314Oooo0oO = new String[0];

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final SQLiteDatabase f29315Oooo0o;

    public class OooO00o implements SQLiteDatabase.CursorFactory {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ SupportSQLiteQuery f29316OooO00o;

        public OooO00o(SupportSQLiteQuery supportSQLiteQuery) {
            this.f29316OooO00o = supportSQLiteQuery;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f29316OooO00o.OooO00o(new o000OO00(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public o000OO0O(SQLiteDatabase sQLiteDatabase) {
        this.f29315Oooo0o = sQLiteDatabase;
    }

    public final List<Pair<String, String>> OooO00o() {
        return this.f29315Oooo0o.getAttachedDbs();
    }

    public final String OooO0O0() {
        return this.f29315Oooo0o.getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransaction() {
        this.f29315Oooo0o.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransactionNonExclusive() {
        this.f29315Oooo0o.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f29315Oooo0o.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final SupportSQLiteStatement compileStatement(String str) {
        return new o000OOo0(this.f29315Oooo0o.compileStatement(str));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void endTransaction() {
        this.f29315Oooo0o.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void execSQL(String str) throws SQLException {
        this.f29315Oooo0o.execSQL(str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean inTransaction() {
        return this.f29315Oooo0o.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final long insert(String str, int i, ContentValues contentValues) throws SQLException {
        return this.f29315Oooo0o.insertWithOnConflict(str, null, contentValues, i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isOpen() {
        return this.f29315Oooo0o.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public final boolean isWriteAheadLoggingEnabled() {
        return this.f29315Oooo0o.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(String str) {
        return query(new oo000o(str));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void setTransactionSuccessful() {
        this.f29315Oooo0o.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void execSQL(String str, Object[] objArr) throws SQLException {
        this.f29315Oooo0o.execSQL(str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
        return this.f29315Oooo0o.rawQueryWithFactory(new OooO00o(supportSQLiteQuery), supportSQLiteQuery.OooO0Oo(), f29314Oooo0oO, null);
    }
}
