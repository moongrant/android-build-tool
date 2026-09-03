package net.sqlcipher.database;

import OooO00o.OooO00o;
import android.util.Log;
import p095o000o0Oo.o00oO0o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SQLiteProgram extends SQLiteClosable implements o00oO0o {
    private static final String TAG = "SQLiteProgram";
    public boolean mClosed = false;
    private SQLiteCompiledSql mCompiledSql;

    @Deprecated
    public SQLiteDatabase mDatabase;
    public final String mSql;

    @Deprecated
    public long nHandle;

    @Deprecated
    public long nStatement;

    public SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str) {
        this.nHandle = 0L;
        this.nStatement = 0L;
        this.mDatabase = sQLiteDatabase;
        String strTrim = str.trim();
        this.mSql = strTrim;
        sQLiteDatabase.acquireReference();
        sQLiteDatabase.addSQLiteClosable(this);
        this.nHandle = sQLiteDatabase.mNativeHandle;
        strTrim = strTrim.length() >= 6 ? strTrim.substring(0, 6) : strTrim;
        if (!strTrim.equalsIgnoreCase("INSERT") && !strTrim.equalsIgnoreCase("UPDATE") && !strTrim.equalsIgnoreCase("REPLAC") && !strTrim.equalsIgnoreCase("DELETE") && !strTrim.equalsIgnoreCase("SELECT")) {
            SQLiteCompiledSql sQLiteCompiledSql = new SQLiteCompiledSql(sQLiteDatabase, str);
            this.mCompiledSql = sQLiteCompiledSql;
            this.nStatement = sQLiteCompiledSql.nStatement;
            return;
        }
        SQLiteCompiledSql compiledStatementForSql = sQLiteDatabase.getCompiledStatementForSql(str);
        this.mCompiledSql = compiledStatementForSql;
        if (compiledStatementForSql == null) {
            SQLiteCompiledSql sQLiteCompiledSql2 = new SQLiteCompiledSql(sQLiteDatabase, str);
            this.mCompiledSql = sQLiteCompiledSql2;
            sQLiteCompiledSql2.acquire();
            sQLiteDatabase.addToCompiledQueries(str, this.mCompiledSql);
            if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Created DbObj (id#");
                sbOooO0o0.append(this.mCompiledSql.nStatement);
                sbOooO0o0.append(") for sql: ");
                sbOooO0o0.append(str);
                Log.v(TAG, sbOooO0o0.toString());
            }
        } else if (!compiledStatementForSql.acquire()) {
            long j = this.mCompiledSql.nStatement;
            this.mCompiledSql = new SQLiteCompiledSql(sQLiteDatabase, str);
            if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                StringBuilder sbOooO0o1 = OooO00o.OooO0o0("** possible bug ** Created NEW DbObj (id#");
                sbOooO0o1.append(this.mCompiledSql.nStatement);
                sbOooO0o1.append(") because the previously created DbObj (id#");
                sbOooO0o1.append(j);
                sbOooO0o1.append(") was not released for sql:");
                sbOooO0o1.append(str);
                Log.v(TAG, sbOooO0o1.toString());
            }
        }
        this.nStatement = this.mCompiledSql.nStatement;
    }

    private final native void native_clear_bindings();

    private void releaseCompiledSqlIfNotInCache() {
        if (this.mCompiledSql == null) {
            return;
        }
        synchronized (this.mDatabase.mCompiledQueries) {
            if (this.mDatabase.mCompiledQueries.containsValue(this.mCompiledSql)) {
                this.mCompiledSql.release();
            } else {
                this.mCompiledSql.releaseSqlStatement();
                this.mCompiledSql = null;
                this.nStatement = 0L;
            }
        }
    }

    @Override // p095o000o0Oo.o00oO0o
    public void bindBlob(int i, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException(OooO0O0.OooO00o.OooO00o("the bind value at index ", i, " is null"));
        }
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        }
        if (!this.mDatabase.isOpen()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("database ");
            sbOooO0o0.append(this.mDatabase.getPath());
            sbOooO0o0.append(" already closed");
            throw new IllegalStateException(sbOooO0o0.toString());
        }
        acquireReference();
        try {
            native_bind_blob(i, bArr);
        } finally {
            releaseReference();
        }
    }

    @Override // p095o000o0Oo.o00oO0o
    public void bindDouble(int i, double d) {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        }
        if (!this.mDatabase.isOpen()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("database ");
            sbOooO0o0.append(this.mDatabase.getPath());
            sbOooO0o0.append(" already closed");
            throw new IllegalStateException(sbOooO0o0.toString());
        }
        acquireReference();
        try {
            native_bind_double(i, d);
        } finally {
            releaseReference();
        }
    }

    @Override // p095o000o0Oo.o00oO0o
    public void bindLong(int i, long j) {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        }
        if (!this.mDatabase.isOpen()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("database ");
            sbOooO0o0.append(this.mDatabase.getPath());
            sbOooO0o0.append(" already closed");
            throw new IllegalStateException(sbOooO0o0.toString());
        }
        acquireReference();
        try {
            native_bind_long(i, j);
        } finally {
            releaseReference();
        }
    }

    @Override // p095o000o0Oo.o00oO0o
    public void bindNull(int i) {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        }
        if (!this.mDatabase.isOpen()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("database ");
            sbOooO0o0.append(this.mDatabase.getPath());
            sbOooO0o0.append(" already closed");
            throw new IllegalStateException(sbOooO0o0.toString());
        }
        acquireReference();
        try {
            native_bind_null(i);
        } finally {
            releaseReference();
        }
    }

    @Override // p095o000o0Oo.o00oO0o
    public void bindString(int i, String str) {
        if (str == null) {
            throw new IllegalArgumentException(OooO0O0.OooO00o.OooO00o("the bind value at index ", i, " is null"));
        }
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        }
        if (!this.mDatabase.isOpen()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("database ");
            sbOooO0o0.append(this.mDatabase.getPath());
            sbOooO0o0.append(" already closed");
            throw new IllegalStateException(sbOooO0o0.toString());
        }
        acquireReference();
        try {
            native_bind_string(i, str);
        } finally {
            releaseReference();
        }
    }

    public void clearBindings() {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        }
        if (!this.mDatabase.isOpen()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("database ");
            sbOooO0o0.append(this.mDatabase.getPath());
            sbOooO0o0.append(" already closed");
            throw new IllegalStateException(sbOooO0o0.toString());
        }
        acquireReference();
        try {
            native_clear_bindings();
        } finally {
            releaseReference();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.mClosed && this.mDatabase.isOpen()) {
            this.mDatabase.lock();
            try {
                releaseReference();
                this.mDatabase.unlock();
                this.mClosed = true;
            } catch (Throwable th) {
                this.mDatabase.unlock();
                throw th;
            }
        }
    }

    @Deprecated
    public void compile(String str, boolean z) {
    }

    public String getSqlString() {
        return this.mSql;
    }

    public final long getUniqueId() {
        return this.nStatement;
    }

    public final native void native_bind_blob(int i, byte[] bArr);

    public final native void native_bind_double(int i, double d);

    public final native void native_bind_long(int i, long j);

    public final native void native_bind_null(int i);

    public final native void native_bind_string(int i, String str);

    @Deprecated
    public final native void native_compile(String str);

    @Deprecated
    public final native void native_finalize();

    @Override // net.sqlcipher.database.SQLiteClosable
    public void onAllReferencesReleased() {
        releaseCompiledSqlIfNotInCache();
        this.mDatabase.releaseReference();
        this.mDatabase.removeSQLiteClosable(this);
    }

    @Override // net.sqlcipher.database.SQLiteClosable
    public void onAllReferencesReleasedFromContainer() {
        releaseCompiledSqlIfNotInCache();
        this.mDatabase.releaseReference();
    }
}
